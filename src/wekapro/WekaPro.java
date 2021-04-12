/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekapro;
import weka.classifiers.trees.J48;
/**
 *
 * @author FPT
 */
public class WekaPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        MyKnowledgeModel model = new MyKnowledgeModel ("C:\\Program Files\\Weka-3-9\\data\\iris.arff");
//        System.out.println(model);
//        model.saveData( "C:\Program Files\Weka-3-8-5\data");
//        model.saveData2CSV ("F:\\Data\\iris_CSV.csv");
        
//        MyAprioriModel model = new MyAprioriModel("C:\\Program Files\\Weka-3-8-5\\data\\weather.numeric.arff",
//               "-N 10 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1", 
//               "-R 2-3");
//        model.mineAssociationRules();
//        System.out.println(model);
        
//        MyFPGrowthModel model = new MyFPGrowthModel(
//                "C:\\Program Files\\Weka-3-8-5\\data\\weather.nominal.arff", 
//                "-P 2 -I -1 -N 10 -T 0 -C 0.7 -D 0.05 -U 1.0 -M 0.2",
//                " -N-R first-last");
//        model.mineAssociationRules();
//        System.out.println(model);
//        
//        MyKnowledgeModel model = new MyKnowledgeModel( "C:\Program Files\Weka-3-8-5\data\\iris.arff",null,null);
//        model.trainset = model.divideTrainTestR(model.dataset,80,false);
//        model.testset = model.divideTrainTestR(model.dataset,80,true);
//        System.out.println(model);
//        System.out.println(model.trainset.toSummaryString());
//        System.out.println(model.testset.toSummaryString());
//    }

// Bài Tree
//    MyDecisionTreeModel model = new MyDecisionTreeModel(
//            "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris.arff",    
//            "-C 0.25 -M 2", null);
////    model.buildDecisionTree();
//    model.evaluateDecisionTree();
//    System.out.println(model);
//    model.saveModel("C:\\Users\\ViettelStore\\Desktop\\data\\decisiontree.model", model.tree);
//    model.tree = (J48)model.loadModel("D:\\Data\\decisiontree");
//    model.predictClassLabel(model.testset);
//    
//    MyNaiveBayesModel model = new MyNaiveBayesModel();
//    model.buiNaiveBayes("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-train.arff");
//    model.evaluateNaivebayes("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-test.arff");
//    model.predicClassLablel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-unlabel.arff", 
//            "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-predict-nb.arff");

//    MyNNM model = new MyNNM("","-L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a",null);
//    model.buiNeuralNetWorkModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-train.arff");
//    model.evaluateNeuralNetwork("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-test.arff");
//    model.predictClassLabel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-unlabel.arff", 
//            "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-predict-nb.arff");
//    System.out.println(model);


//    MySVMModel model = new MySVMModel("",
//                "-C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"weka.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007\" -calibrator \"weka.classifiers.functions.Logistic -R 1.0E-8 -M -1 -num-decimal-places 4\""
//                        ,null);
//        model.buildSVM("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-train.arff");
//        model.evaluateSVM("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-unlabel.arff", 
//               "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-predict-svm.arff");
//        System.out.println(model);
//        
//       MyKNNModel model = new MyKNNModel ("",
//           "-K 5 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\"",null);
//        model.buildKNN("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-train.arff");
//        model.evaluateKNN("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-unlabel.arff", 
//           "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-predic-knn.arff");
//        System.out.println(model);

                //MyBaggingModel
//        MyBaggingModel model = new MyBaggingModel("",null
//                        ,null);
//        model.buildMyBaggingModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-train.arff");
//        model.evaluateBaggingModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-unlabel.arff", 
//               "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-predict-bag.arff");
//        System.out.println("Finished");
                
                //MyBlendingModel
//        MyBlendingModel model = new MyBlendingModel("",null
//                        ,null);
//        model.buildMyBlendingModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-train.arff");
//        model.evaluateBlendingModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-unlabel.arff", 
//               "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-predict-blending.arff");
//        System.out.println("Finished");

                //MyBoostingModel
//        MyBoostingModel model = new MyBoostingModel("",null
//                        ,null);
//        model.buildMyBoostingModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-train.arff");
//        model.evaluateBoostingModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-unlabel.arff", 
//               "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-predict-boost.arff");
//        System.out.println("Finished");

                //MyVotingModel
        
//        MyVotingModel model = new MyVotingModel("",null
//                        ,null);
//        model.buildMyVotingModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-train.arff");
//        model.evaluateVotingModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-test.arff");
//        model.predictClassLabel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-unlabel.arff", 
//               "C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-predict-vote .arff");
//        System.out.println("Finished");

                //MyKMeansModel
                
//        MyKMeansModel model = new  MyKMeansModel("", null, null);
//        model.buildKMeansModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-cluster-train.arff");
//        model.predictCluster("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-cluster-unlabel.arff");
//        System.out.println("Finished");

                //MyEMModel
                
         MyEMModel model = new MyEMModel("", null, null);
         model.buildEMModel("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-cluster-train.arff");
         model.predictCluster("C:\\Users\\ViettelStore\\Desktop\\data-exp\\iris-cluster-unlabel.arff");
         System.out.println("Finished");

    }  
}
