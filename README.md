This is full stack project
first there's a main page, which user need to input their ID to get their info, in order to start the questionnaire. 
I use spring boot to design the backend, and use Node Js react to design the frontend.

also there's a database for record the users information  

here's the database structure, design a database for every question

![image](https://user-images.githubusercontent.com/60025864/189706026-1cecb0c3-88e9-4480-9f04-422baf374fc1.png)


after the user enter the id, we redirct to the api/questions/userid=?  

which we first find the user data from the database, then use the unanswered_question_list to randomly get a question_id which is unanswered before,  
then we get the question from the table, also we get the specific question table.  
we use that table to display the question in the front end side.
  
then user should click the next button, it will save the record and use put method to update the database,  
then it will redirct to another unanswered question.

if we save Json data into database, it would create less database.  

However, I meet problem with Hiberante dealing with Json object, still trying to solve it.  

