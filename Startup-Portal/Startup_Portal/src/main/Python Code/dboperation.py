# import mysql.connector

# def getConnection():
#     mydb = mysql.connector.connect(
#   host="localhost",
#   user="root",
#   password="root",
#   charset='utf8',
#   database="investmentsuggestions"
# )
    
#     return mydb
    
# def insertInvestorData(orginvestorlist):
    
#     mydb=getConnection()
#     mycursor = mydb.cursor()
#    # sql1 = "DELETE FROM investorlist";
#    # mycursor.execute(sql1) 
   
#     for row in orginvestorlist:
        
#         sql = "INSERT INTO investorlist (gender, age,investment_avenues, stock_marktet, factor,objective,purpose,duration,invest_monitor,expect) VALUES (%s, %s , %s , %s , %s , %s , %s , %s , %s , %s)"
#         val = (row[0],row[1],row[2],row[3],row[4],row[5],row[6],row[7],row[8],row[9])
#         mycursor.execute(sql, val)
    
#         mydb.commit()
        
# def insertStartupData(startuplist):
    
#     mydb=getConnection()
#     mycursor = mydb.cursor()
#    # sql1 = "DELETE FROM investorlist";
#    # mycursor.execute(sql1) 
   
#     for row in startuplist:
        
#         sql = "INSERT INTO startuplist (startupname,startupage,totalpartners, annualturnover, requiredinvestment,rtype,rpercentage) VALUES (%s, %s , %s , %s , %s , %s , %s)"
#         val = (row[0],row[1],row[2],row[3],row[4],row[5],row[6])
#         mycursor.execute(sql, val)
    
#         mydb.commit()
        
# def retreiveStartupRequiremntInfo(tablename):
    
#     mydb=getConnection()
#     mycursor = mydb.cursor()
#     query="SELECT * FROM"+" "+tablename
#     mycursor.execute(query)
    
#     myresult = mycursor.fetchall()

#     return myresult
    
    
# def deleteData(tablename):
    
#     mydb=getConnection()
#     mycursor = mydb.cursor()
#     sql1 = "DELETE FROM"+" "+tablename;
#     mycursor.execute(sql1) 
#     mydb.commit()      




import mysql.connector

def get_connection():
    mydb = mysql.connector.connect(
        host="localhost",
        user="root",
        password="root",
        charset='utf8',
        database="investmentsuggestions"
    )
    return mydb

def insert_investor_data(orginvestorlist):
    mydb = get_connection()
    mycursor = mydb.cursor()
    
    for row in orginvestorlist:
        sql = "INSERT INTO investorlist (gender, age, investment_avenues, stock_market, factor, objective, purpose, duration, invest_monitor, expect) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)"
        val = tuple(row[:10])
        mycursor.execute(sql, val)
    
    mydb.commit()
    mycursor.close()
    mydb.close()

def insert_startup_data(startuplist):
    mydb = get_connection()
    mycursor = mydb.cursor()
    
    for row in startuplist:
        sql = "INSERT INTO startuplist (startupname, startupage, totalpartners, annualturnover, requiredinvestment, rtype, rpercentage) VALUES (%s, %s, %s, %s, %s, %s, %s)"
        val = tuple(row[:7])
        mycursor.execute(sql, val)
    
    mydb.commit()
    mycursor.close()
    mydb.close()

def retrieve_startup_requirement_info(tablename):
    mydb = get_connection()
    mycursor = mydb.cursor()
    query = "SELECT * FROM {}".format(tablename)
    mycursor.execute(query)
    myresult = mycursor.fetchall()
    
    mycursor.close()
    mydb.close()
    
    return myresult

def delete_data(tablename):
    mydb = get_connection()
    mycursor = mydb.cursor()
    sql = "DELETE FROM {}".format(tablename)
    mycursor.execute(sql)
    mydb.commit()
    
    mycursor.close()
    mydb.close()
