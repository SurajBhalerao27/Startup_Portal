import math

#===========================Code to find eucledian distance====================
# def euclidean_distance(row1, row2):
#     distance=0.0
#     for i in range(len(row1)-1):
#         distance += math.pow(row1[i]-row2[i],2)
        
#     return math.sqrt(distance)  

def euclidean_distance(row1, row2):
    distance = 0.0
    for i in range(len(row1)-1):
        if row1[i] is None or row2[i] is None:
            continue  # Skip calculation for None values
        distance += math.pow(row1[i]-row2[i], 2)
        
    return math.sqrt(distance)


#===========================Code to sort Knn_list+++===========================

def sort(knn_list, index):

    knn_list.sort(key = lambda x: x[index]) 
    return knn_list     


def getKNNClassifiers(knn_list,k):
    knnlist=[]
    x=1
    for row in knn_list:
        value=row[len(row)-1]
        if(x<=k):
            knnlist.append(row)
            x+=1
        
    return knnlist
    
def knnInit(dataset, userdata,username):
       
    knn_list=[] 
    index=0
    distance=0.0
    for row in dataset:
        #print("row: ",row)
        
        if username=="userinvestor":
            temp=[row[4],row[5],row[6]]
            distance=euclidean_distance(userdata,temp)
            distance=round(distance,2)
            row.insert(len(row),distance)
            knn_list.append(row)
            index=len(row)-1
            
        else:
            temp=[row[10],row[11],row[12],row[14],row[15],row[16]]
            distance=euclidean_distance(userdata,temp)
            distance=round(distance,2)
            row.insert(len(row),distance)
            knn_list.append(row)
            index=len(row)-1
        
        
    knn_list=sort(knn_list,index)
    size=len(knn_list)
    k=90
    k=k*size/100
    print(k)
    finalknnlist=getKNNClassifiers(knn_list,k)
    
    return finalknnlist
    