from sklearn.preprocessing import LabelEncoder
import pandas as pd
class Preprocessing:
    
    def __init__(self, dataset):
        self.dataset=dataset
        
    
    def getPreprocessData(self):
        
        print("\n")
        print('Shape of the file')
        print('************************************************************************')
        print(self.dataset.shape)#Number of Rows and Columns

        print("\n")
        print('Number of Missing Values per Column')
        print('************************************************************************')
        print("\n")
        print(self.dataset.isnull().sum())
        
        self.dataset=self.featureExtraction(self.dataset)
        self.dataset,labeldict=self.labelling(self.dataset)
        
                
        return self.dataset,labeldict
        
    def featureExtraction(self,dataset):
                 
         self.dataset=self.dataset.drop(['What are your savings objectives?','Reason_Equity',
                                         'Reason_Mutual','Reason_Bonds','Reason_FD',
                                         'Source'],axis=1)
                
         return self.dataset        
        
   
            
    def labelling(self, dataset):
        le=LabelEncoder()
        self.dataset.gender = le.fit_transform(self.dataset.gender)        
        self.dataset.Investment_Avenues = le.fit_transform(self.dataset.Investment_Avenues)       
        self.dataset.Stock_Marktet = le.fit_transform(self.dataset.Stock_Marktet)      
        self.dataset.Factor = le.fit_transform(self.dataset.Factor)
        self.dataset.Objective = le.fit_transform(self.dataset.Objective)
        self.dataset.Purpose = le.fit_transform(self.dataset.Purpose)
        self.dataset.Duration = le.fit_transform(self.dataset.Duration)        
        self.dataset.Invest_Monitor = le.fit_transform(self.dataset.Invest_Monitor)
        self.dataset.Expect = le.fit_transform(self.dataset.Expect)
        self.dataset.Avenue = le.fit_transform(self.dataset.Avenue)
        
        labeldict={"Female" :0,"Male": 1,"Yes": 1,"No":0,"Returns": 1,"Locking Period":0,
                   "Risk": 2,"Capital Appreciation": 0,"Growth": 1,"Income": 2,"1-3 years":0,
                   "3-5 years":1,"Less than 1 year":2,"More than 5 years":3,"Daily":0,
                   "Monthly":1,"Weekly":2, "10%-20%":0,"20%-30%":1,"30%-40%":2}
        print(labeldict)
        
        
       
        
        return self.dataset,labeldict 
        
        
        
    

