API URL : http://localhost:8080/motor/webapi/contracts (POST/GET) 
An error will appear at index.jsp file , just ignore it

NEED TO FIX/UPDATE:

 - Change type of InceptionDate and Expiry from String to Date 
 - Catch Error (null CoverNote, null inceptiondate,...)
 - Improve sql query to get last record of WSContractDetail table (Consider to remove this)