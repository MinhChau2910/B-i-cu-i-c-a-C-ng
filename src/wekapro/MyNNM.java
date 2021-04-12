/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Debug.Random;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author ViettelStore
 */
public class MyNNM extends MyKnowledgeModel{
    MultilayerPerceptron neural;
    
    
    public MyNNM(){
        super();
    }

    public MyNNM(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }

    
    public void buiNeuralNetWorkModel(String filename) throws Exception {
        //Đưa train set vào bộ nhớ 
        setTrainset(filename);
        this.trainset.setClassIndex(this.trainset.numAttributes()-1);
        //Huấn luyện mô hình mạng neural
        this.neural = new MultilayerPerceptron();
        neural.setOptions(this.model_options);
        neural.buildClassifier(this.trainset);
    }
    public void evaluateNeuralNetwork(String filename) throws Exception {
        //Đọc test set vào bộ nhớ
        setTestset(filename);
        this.testset.setClassIndex(this.testset.numAttributes()-1);
        //Đánh giá mô hình bằng 10 fold cross-validation
        Random rnd = new Random(1);
       int fold = 10;
       Evaluation eval = new Evaluation(this.trainset);
       eval.crossValidateModel(neural, this.testset,fold,rnd);
       
       System.out.println(eval.toSummaryString("\nKet qua danh gia ket qua mo hình 10 fold cross-validation\n------\n" , false));
    }
     public void predictClassLabel(String fileIn,String fileOut) throws Exception {
         //Đọc dữ lieeujcaanf dự đoán vào bộ nhớ 
         DataSource ds = new DataSource(fileIn);
         Instances unlabel = ds.getDataSet();
         unlabel.setClassIndex(unlabel.numAttributes()-1);
         //Dự đoán classLable cho từng Instances
         for(int i = 0; i< unlabel.numInstances();i++) {
             double predict = neural.classifyInstance(unlabel.instance(i));
             unlabel.instance(i).setClassValue(predict);
             //Xuất kết quả ra fileOut
             BufferedWriter outWrite = new BufferedWriter(new FileWriter(fileOut));
             outWrite.write(unlabel.toString());
             outWrite.newLine();
             outWrite.flush();
             outWrite.close();
         }
         
         
     }

    @Override
    public String toString() {
        return this.neural.toString();
    }
    
}
