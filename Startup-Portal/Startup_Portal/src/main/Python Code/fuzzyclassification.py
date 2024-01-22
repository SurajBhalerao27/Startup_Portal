import math
def getFuzzyBoundaries(small, big):
    
    r1=0
    r2=0
    diff=big-small;
    addup=diff/5
    range=[]
    i=0
    while(i<5):
        r1=small
        r2=r1+addup   
        r1=round(r1,5)
        r2=round(r2,5)
        small=r2
        temp=[r1,r2]
        range.append(temp)
        i+=1
        
    return range


def getFuzzyList(fuzzyinputlist,fuzzyrange):
    
    fuzzylist=[]
    
    for record in fuzzyrange:
        r1=record[0]
        r2=record[1]
        for row in fuzzyinputlist:
            val=row[len(row)-1]
            val=round(val,5)
            if val>=r1 and val<=r2:
                #del row[len(row)-1]
                fuzzylist.append(row)
                #print(row)
        
        
    return fuzzylist    
        

def getfuzzyResult(fuzzyinputlist,annprobvalue):
    small=min(annprobvalue)
    big=max(annprobvalue)
    print("small: ",small)
    print("big: ",big)
    fuzzyrange=getFuzzyBoundaries(small,big) 
    highrange=[]
   # highrange.append(fuzzyrange[2])
    highrange.append(fuzzyrange[3])
    highrange.append(fuzzyrange[4])
    print("\n")
    print("****************************Fuzzy Index**************************")
    print("\n")
    print("fuzzyindex: ",fuzzyrange)
    
    fuzzylist=getFuzzyList(fuzzyinputlist, highrange)
    
        
    return fuzzylist