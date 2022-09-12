package web_project.bx_demo.service;

import java.util.List;

import web_project.bx_demo.model.Question;
import web_project.bx_demo.model.Question_0;
import web_project.bx_demo.model.Question_1;
import web_project.bx_demo.model.Question_2;
import web_project.bx_demo.model.Question_3;
import web_project.bx_demo.model.User;

public interface QuestionService {
	Question getQuestionById(Long id);
	Question saveQuestion(Question question);
	User getUserById(Long id);
	User saveUser(User user);
	List<Question_0> getAllQuestion_0();
	Question_0 saveQuestion_0(Question_0 question_0);
	List<Question_1> getAllQuestion_1();
	Question_1 saveQuestion_1(Question_1 question_1);
	List<Question_2> getAllQuestion_2();
	Question_2 saveQuestion_2(Question_2 question_2);
	List<Question_3> getAllQuestion_3();
	Question_3 saveQuestion_3(Question_3 question_3);
	
}




