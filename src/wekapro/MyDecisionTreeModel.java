/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;

import java.util.Random;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Debug;
import weka.core.Instances;

/**
 *
 * @author ViettelStore
 */
public class MyDecisionTreeModel extends MyKnowledgeModel{
    J48 tree;

    public MyDecisionTreeModel(String filename, String m_opts, String d_opts) throws Exception {
        super(filename, m_opts, d_opts);
    }
     public void buidDecisionTree() throws Exception {
         //Tạo tập dữ liệu train tets
         this.trainset = divideTrainTestR(this.dataset, 80, false);
         this.testset = divideTrainTestR(this.dataset, 80, true);
         this.trainset.setClassIndex(this.trainset.numAttributes() -1);
         this.testset.setClassIndex(this.testset.numAttributes() -1);
         //Thiết lập thông số cho mô hình cây quyết định 
         tree = new J48();
         tree.setOptions(this.model_options);
         // Huận luyện mô hình cây quyết định với tập sữ liệu train
         tree.buildClassifier(this.trainset);
     }
     
     public void evaluateDecisionTree() throws Exception {
         Random rnd = new Debug.Random(1);
         int folds = 10;
         
         Evaluation eval = new Evaluation(this.trainset);
         eval.crossValidateModel(tree, this.testset, folds, rnd);
         System.out.println(eval.toSummaryString("\nKet qua danh gia mo hinh10-flod cross-validattion\n-----\n", false));    
     }
     
      public void predictClassLabel(Instances input) throws Exception{
        for(int i=0;i<input.numInstances();i++){
            double predict=tree.classifyInstance(input.instance(i));
            double actual =input.instance(i).classValue();
            System.out.println("Instance" + i + ": predict = " +
                    input.classAttribute().value((int)predict) + "; actual = "+
                    input.classAttribute().value((int)actual));
            input.instance(i).setClassValue(predict);
        }
      }

    @Override
    public String toString() {
        return tree.toSummaryString();
    }
     

//    private Instances setClassIndex(int i) {
//        return null;
//        
//    }
//
//    private int numAttributes() {
//        return 0;
//        
//    }
//
//    void buildDecisionTree() {
//        
//    }

//   void buildDecisionTree() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//   }
}

