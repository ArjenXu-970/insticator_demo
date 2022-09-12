This is full stack project
first there's a main page, which user need to input their ID to get their info, in order to start the questionnaire.  

also there's a database for record the users information  

here's the database structure  

![image](https://user-images.githubusercontent.com/60025864/189706026-1cecb0c3-88e9-4480-9f04-422baf374fc1.png)


after the user enter the id, we redirct to the api/questions/userid=?  

which randomly return a question from the unanswer question list, after the user answer the question,   

the user should click the next button, it will save the record and use put method to update the database,  
then it will redirct to another unanswered question.
