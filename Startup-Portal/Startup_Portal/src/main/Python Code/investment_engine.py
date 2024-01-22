# import time
# import investmentsuggestions_engine
# import dboperation

# while True:
#     print("Vistied")
#     time.sleep(5)
#     startuprequirement=dboperation.retreiveStartupRequiremntInfo("startup_requirementinfo")
#     investorrequirement=dboperation.retreiveStartupRequiremntInfo("investor_requirementinfo")
    

#     if len(startuprequirement)>0:
#         # print("myresult: ",myresult)
#         x=startuprequirement[0]
#         stockmarket=x[0]
#         factor=x[1]
#         objective=x[2]
#         duration=x[3]
#         investmonitor=x[4]
#         expect=x[5]
        
       
#         investmentsuggestions_engine.initProcess(stockmarket,factor,objective,duration,investmonitor,expect)
#         dboperation.deleteData("startup_requirementinfo")
   
#     if len(investorrequirement)>0:
#        # print("myresult: ",myresult)
#         x=investorrequirement[0]
#         amount=x[0]
#         rtype=x[1]
#         rexpected=x[2]
              
#         investmentsuggestions_engine.initProcess(stockmarket,factor,objective,duration,investmonitor,expect)
#         dboperation.deleteData("investor_requirementinfo")
    
    
    
import time
import investmentsuggestions_engine
import dboperation

while True:
    print("Visited")
    time.sleep(5)
    startuprequirement = dboperation.retreiveStartupRequiremntInfo("startup_requirementinfo")
    investorrequirement = dboperation.retreiveStartupRequiremntInfo("investor_requirementinfo")
    
    if len(startuprequirement) > 0:
        x = startuprequirement[0]
        stockmarket = x[0]
        factor = x[1]
        objective = x[2]
        duration = x[3]
        investmonitor = x[4]
        expect = x[5]
        
        investmentsuggestions_engine.initProcess(stockmarket, factor, objective, duration, investmonitor, expect)
        dboperation.deleteData("startup_requirementinfo")
   
    if len(investorrequirement) > 0:
        x = investorrequirement[0]
        amount = x[0]
        rtype = x[1]
        rexpected = x[2]
              
        investmentsuggestions_engine.initProcess(stockmarket, factor, objective, duration, investmonitor, expect)
        dboperation.deleteData("investor_requirementinfo")
        
        x = investorrequirement[0]
        amount = x[0]
        rtype = x[1]
        rexpected = x[2]
