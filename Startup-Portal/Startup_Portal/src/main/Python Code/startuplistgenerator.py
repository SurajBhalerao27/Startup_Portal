# import pandas as pd
# from preprocessing import LabelEncoder
# import knn
# import linearregression 
# import ann
# import fuzzyclassification
# import dboperation


# def initProcess(amount,returntype,returnexpected):
    
#     rtype=0
#     if returntype=="Monthly":
#         rtype=0
#     elif returntype=="Quarterly":
#         rtype=1          
#     elif returntype=="Yearly":
#         rtype=2
        
#     #=======================Data Reading=========================================== 
#     print('************************************************************************')
#     print("\n")
#     dataset=pd.read_csv("dataset/startup_data.csv")  
#     print(dataset.head(10))
    
        
#     #=======================Data cleaning and Preprocessing=================================== 
#     print("\n")
#     print('************************************************************************')
#     print("\n")
    
#     predataset=dataset.drop(['Startup_Name'],axis=1)
    
#     le=LabelEncoder()
#     predataset.ReturnType= le.fit_transform(predataset.ReturnType)
#     print(predataset.head())
    
    
#    # =======================Code For KNN Clustering============================
    
#     userlist=[float (amount),rtype,float (returnexpected)]
    
#     print(userlist)
#     prepro_list=predataset.values.tolist()
    
#     knnlist=knn.knnInit(prepro_list,userlist,"userinvestor")
    
#     print("\n")
#     print("****************************KNN Classifier Results**************************")
#     print("\n")
    
#     for row in knnlist:
#         print(row)
    
#     #####################Code for Linear Regression##############################
#     print("\n")
#     print("****************************Linear Regression List**************************")
#     print("\n")
#     y=userlist
#     linearcluster=[]
    
#     for i in range(len(knnlist)):
#         row=knnlist[i]
#         del row[len(row)-1]
#         x=[row[4],row[5],row[6]]
#         interceptval=linearregression.initRegression(x, y)
#         #print("interceptvalue: ",interceptval)
#         row.insert(len(row),interceptval)
#         linearcluster.append(row)
    
#     def sort(datalist, index):
#         datalist.sort(key = lambda x: x[index],reverse=True) 
#         return datalist 
    
#     record=linearcluster[0]
#     index=len(record)
#     linearcluster=sort(linearcluster,index-1)    
    
    
#     for row in linearcluster:
#         print(row)
        
#     print("\n")
#     print("****************************ANN Probability List**************************")
#     print("\n")   
    
#     size= int (len(linearcluster)*90/100)
#     anninputlist=[]
    
#     for i in range(size):
#         row= linearcluster[i]
#         del row[len(row)-1]
#         anninputlist.append(row)
        
        
    
#     annprobilitylist,annprobvalue=ann.getANNProbabilityList(anninputlist) 
    
#     for row in annprobilitylist:
#         print(row)  
        
#     ################################Code for Fuzzy Result########################################
#     fuzzyinputlist=[]
#     index= int (len(annprobilitylist)*10/100)
#     for i in range(index):
#         row=annprobilitylist[i]
#         fuzzyinputlist.append(row) 
    
    
#     fuzzylist=fuzzyclassification.getfuzzyResult(fuzzyinputlist,annprobvalue) 
    
    
#     print("\n")
#     print("****************************Fuzzy Result**************************")
#     print("\n")
#     startuplist=[]
#     orgdataset=dataset.values.tolist()
#     for row1 in fuzzylist:
#         rowid1=row1[0]
#         for row2 in orgdataset:
#             rowid2=row2[0]
#             if rowid1==rowid2:
#                 del row2[0]
#                 startuplist.append(row2)
                
            
#     for row in startuplist:
#         print(row)
        
#     dboperation.insertStartupData(startuplist)

# if __name__ == '__main__':
#     initProcess('amount', 'returntype','returnexpected')

import pandas as pd
from preprocessing import LabelEncoder
import knn
import linearregression 
import ann
import fuzzyclassification
import dboperation

def initProcess(amount, returntype, returnexpected):
    rtype = 0
    if returntype == "Monthly":
        rtype = 0
    elif returntype == "Quarterly":
        rtype = 1          
    elif returntype == "Yearly":
        rtype = 2
        
    # Data Reading
    print('************************************************************************')
    print("\n")
    dataset = pd.read_csv("dataset/startup_data.csv")  
    print(dataset.head(10))
        
    # Data cleaning and Preprocessing
    print("\n")
    print('************************************************************************')
    print("\n")
    
    predataset = dataset.drop(['Startup_Name'], axis=1)
    
    le = LabelEncoder()
    predataset.ReturnType = le.fit_transform(predataset.ReturnType)
    print(predataset.head())
    
    # Code For KNN Clustering
    userlist = [float(amount), rtype, float(returnexpected)]
    
    print(userlist)
    prepro_list = predataset.values.tolist()
    
    knnlist = knn.knnInit(prepro_list, userlist, "userinvestor")
    
    print("\n")
    print("****************************KNN Classifier Results**************************")
    print("\n")
    
    for row in knnlist:
        print(row)
    
    # Code for Linear Regression
    print("\n")
    print("****************************Linear Regression List**************************")
    print("\n")
    
    y = userlist
    linearcluster = []
    
    for i in range(len(knnlist)):
        row = knnlist[i]
        del row[len(row)-1]
        x = [row[4], row[5], row[6]]
        interceptval = linearregression.initRegression(x, y)
        row.insert(len(row), interceptval)
        linearcluster.append(row)
    
    def sort(datalist, index):
        datalist.sort(key=lambda x: x[index], reverse=True) 
        return datalist 
    
    record = linearcluster[0]
    index = len(record)
    linearcluster = sort(linearcluster, index-1)    
    
    for row in linearcluster:
        print(row)
        
    print("\n")
    print("****************************ANN Probability List**************************")
    print("\n")   
    
    size = int(len(linearcluster) * 90 / 100)
    anninputlist = []
    
    for i in range(size):
        row = linearcluster[i]
        del row[len(row) - 1]
        anninputlist.append(row)
        
    annprobilitylist, annprobvalue = ann.getANNProbabilityList(anninputlist) 
    
    for row in annprobilitylist:
        print(row)  
        
    # Code for Fuzzy Result
    fuzzyinputlist = []
    index = int(len(annprobilitylist) * 10 / 100)
    
    for i in range(index):
        row = annprobilitylist[i]
        fuzzyinputlist.append(row) 
    
    fuzzylist = fuzzyclassification.getfuzzyResult(fuzzyinputlist, annprobvalue) 
    
    print("\n")
    print("****************************Fuzzy Result**************************")
    print("\n")
    startuplist = []
    orgdataset = dataset.values.tolist()
    
    for row1 in fuzzylist:
        rowid1 = row1[0]
        
        for row2 in orgdataset:
            rowid2 = row2[0]
            
            if rowid1 == rowid2:
                del row2[0]
                startuplist.append(row2)
            
    for row in startuplist:
        print(row)
        
    dboperation.insert_startup_data(startuplist)

if __name__ == '__main__':
    amount = 1000  # Replace 'your_amount_value' with the actual amount value
    returntype = 'your_return_type_value'
    returnexpected = 10.5  # Replace 'your_return_expected_value' with the actual return expected value
    
    initProcess(amount, returntype, returnexpected)
