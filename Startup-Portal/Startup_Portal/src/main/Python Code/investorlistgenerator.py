# import pandas as pd
# import preprocessing
# import knn
# import linearregression 
# import ann
# import fuzzyclassification
# import dboperation


# def initProcess(stockmarket,factor,objective,duration,investmonitor,expect):
       
    
#     #=======================Data Reading=========================================== 
#     print('************************************************************************')
#     print("\n")
#     dataset=pd.read_csv("dataset/Investor Dataset.csv")  
#     print(dataset.head(10))
    
#     #=======================Data cleaning and Preprocessing=================================== 
#     print("\n")
#     print('************************************************************************')
#     print("\n")
    
#     preprodataset,labeldict=preprocessing.Preprocessing(dataset).getPreprocessData()
#     #print(preprodataset.dtypes)
    
#     #=======================Code For KNN Clustering============================
    
#     userlist=[labeldict.get(stockmarket),labeldict.get(factor),
#               labeldict.get(objective),labeldict.get(duration),labeldict.get(investmonitor),
#               labeldict.get(expect)]
#     print(userlist)
#     prepro_list=preprodataset.values.tolist()
    
#     knnlist=knn.knnInit(prepro_list,userlist,"userstartup")
    
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
#         x=[row[10],row[11],row[12],row[14],row[15],row[16]]
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
    
#     size= int (len(linearcluster)*50/100)
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
#     index= int (len(annprobilitylist)*50/100)
#     for i in range(index):
#         row=annprobilitylist[i]
#         fuzzyinputlist.append(row) 
    
    
#     fuzzylist=fuzzyclassification.getfuzzyResult(fuzzyinputlist,annprobvalue)   
#     print("\n")
#     print("****************************Fuzzy Result**************************")
#     print("\n")
#     orginvestorlist=[]
#     orgdataset=dataset.values.tolist()
#     for row1 in fuzzylist:
#         rowid1=row1[0]
#         for row2 in orgdataset:
#             rowid2=row2[0]
#             if rowid1==rowid2:
#                 del row2[0]
#                 temp=[row2[0],row2[1],row2[2],row2[10],row2[11],row2[12],row2[13],row2[14],row2[15],row2[16]]
#                 orginvestorlist.append(temp)
                
            
#     for row in orginvestorlist:
#         print(row)
        
#     dboperation.insertInvestorData(orginvestorlist)

# if __name__ == '__main__':
#     initProcess('stockmarket', 'factor', 'objective', 'duration', 'investmonitor', 'expect')
    
    
    
import pandas as pd
import preprocessing
import knn
import linearregression
import ann
import fuzzyclassification
import dboperation

def initProcess(stockmarket, factor, objective, duration, investmonitor, expect):
    # =======================Data Reading===========================================
    print('************************************************************************')
    print("\n")
    dataset = pd.read_csv("E:\Python Code\dataset\Investor Dataset.csv")
 
    print(dataset.head(10))

    # =======================Data cleaning and Preprocessing===================================
    print("\n")
    print('************************************************************************')
    print("\n")

    preprodataset, labeldict = preprocessing.Preprocessing(dataset).getPreprocessData()
    # print(preprodataset.dtypes)

    # =======================Code For KNN Clustering============================

    userlist = [labeldict.get(stockmarket), labeldict.get(factor),
                labeldict.get(objective), labeldict.get(duration), labeldict.get(investmonitor),
                labeldict.get(expect)]
    print(userlist)
    prepro_list = preprodataset.values.tolist()

    knnlist = knn.knnInit(prepro_list, userlist, "userstartup")

    print("\n")
    print("****************************KNN Classifier Results**************************")
    print("\n")

    for row in knnlist:
        print(row)

    #####################Code for Linear Regression##############################
    print("\n")
    print("****************************Linear Regression List**************************")
    print("\n")
    y = userlist
    linearcluster = []

    for i in range(len(knnlist)):
        row = knnlist[i]
        del row[len(row) - 1]
        x = [row[10], row[11], row[12], row[14], row[15], row[16]]
        interceptval = linearregression.initRegression(x, y)
        # print("interceptvalue: ",interceptval)
        row.insert(len(row), interceptval)
        linearcluster.append(row)

    def sort(datalist, index):
        datalist.sort(key=lambda x: x[index], reverse=True)
        return datalist

    record = linearcluster[0]
    index = len(record)
    linearcluster = sort(linearcluster, index - 1)

    for row in linearcluster:
        print(row)

    print("\n")
    print("****************************ANN Probability List**************************")
    print("\n")

    size = int(len(linearcluster) * 50 / 100)
    anninputlist = []

    for i in range(size):
        row = linearcluster[i]
        del row[len(row) - 1]
        anninputlist.append(row)

    annprobilitylist, annprobvalue = ann.getANNProbabilityList(anninputlist)

    for row in annprobilitylist:
        print(row)

    ################################Code for Fuzzy Result########################################
    fuzzyinputlist = []
    index = int(len(annprobilitylist) * 50 / 100)
    for i in range(index):
        row = annprobilitylist[i]
        fuzzyinputlist.append(row)

    fuzzylist = fuzzyclassification.getfuzzyResult(fuzzyinputlist, annprobvalue)
    print("\n")
    print("****************************Fuzzy Result**************************")
    print("\n")
    orginvestorlist = []
    orgdataset = dataset.values.tolist()
    for row1 in fuzzylist:
        rowid1 = row1[0]
        for row2 in orgdataset:
            rowid2 = row2[0]
            if rowid1 == rowid2:
                del row2[0]
                temp = [row2[0], row2[1], row2[2], row2[10], row2[11], row2[12], row2[13], row2[14], row2[15], row2[16]]
                orginvestorlist.append(temp)

    for row in orginvestorlist:
        print(row)

    dboperation.insert_investor_data(orginvestorlist)


if __name__ == '__main__':
    initProcess('stockmarket', 'factor', 'objective', 'duration', 'investmonitor', 'expect')
