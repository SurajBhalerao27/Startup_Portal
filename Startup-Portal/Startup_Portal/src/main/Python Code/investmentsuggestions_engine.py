import time
import investorlistgenerator
import startuplistgenerator
import dboperation
import preprocessing

while True:
    print("Vistied")
    time.sleep(5)
    startuprequirement=dboperation.retrieve_startup_requirement_info("startup_requirementinfo")
    investorrequirement=dboperation.retrieve_startup_requirement_info("investor_requirementinfo")
    

    if len(startuprequirement)>0:
        x=startuprequirement[0]
        stockmarket=x[0]
        factor=x[1]
        objective=x[2]
        duration=x[3]
        investmonitor=x[4]
        expect=x[5]
        
       
        investorlistgenerator.initProcess(stockmarket,factor,objective,duration,investmonitor,expect)
        dboperation.delete_data("startup_requirementinfo")
   
    if len(investorrequirement)>0:
        x=investorrequirement[0]
        amount=x[0]
        returntype=x[1]
        returnexpected=x[2]
              
        startuplistgenerator.initProcess(amount,returntype,returnexpected)
        dboperation.delete_data("investor_requirementinfo")
    