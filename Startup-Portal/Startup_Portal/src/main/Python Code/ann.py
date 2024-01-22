import random
import math



def sigmoid_derivative(x):
    sigmoid= 1 / (1 + math.exp(-x)) 
    return sigmoid

def getOutputLayer(hiddenlayer,layer):
    outputlayers=[]
    for i in range(layer):
        bias=1
        outputvalue=0.0
        for r in hiddenlayer:
            w=random.uniform(0,1)
            outputvalue=outputvalue+r*w
            
        outputvalue=outputvalue+bias
        outputlayervalue=sigmoid_derivative(outputvalue)    
        outputlayers.append(outputlayervalue)
    
    t1=0.01;
    t2=0.99;
    
    annprobaval=0.5*math.pow(t1-outputlayers[0],2)+0.5*math.pow(t2-outputlayers[1],2);
    return annprobaval
       

def getHiddenLayer(row,layer):
    hiddenlayers=[]
    
    for i in range(layer):
        bias=1
        hiddenvalue=0.0
        
        j=1
        for j in range(len(row)-1):
            if j!=0:
                #print(row[j])
                w=random.uniform(0,1)
                hiddenvalue=hiddenvalue+row[j]*w
        
        hiddenvalue=hiddenvalue+bias
        hiddenlayervalue=sigmoid_derivative(hiddenvalue)
        hiddenlayers.append(hiddenlayervalue)
    
    annprobabilityvalue=getOutputLayer(hiddenlayers,2)
    return annprobabilityvalue


def sort(annprobabilitylist,index):
    annprobabilitylist.sort(key = lambda x: x[index],reverse=True) 
    return annprobabilitylist

def getANNProbabilityList(anninputlist):  
    annprobabilitylist=[]
    annprobvalue=[]
    layer=7
    index=0
    for row in anninputlist:
        annprobavalue=getHiddenLayer(row, layer)
        annprobavalue=round(annprobavalue,5)
        row.insert(len(row),annprobavalue)
        index=len(row)-1
        annprobabilitylist.append(row)
        annprobvalue.insert(0, annprobavalue)
        
    annprobabilitylist=sort(annprobabilitylist,index)    
    return annprobabilitylist,annprobvalue

