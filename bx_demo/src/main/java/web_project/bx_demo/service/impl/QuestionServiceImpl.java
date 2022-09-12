package web_project.bx_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import web_project.bx_demo.exception.ResourceNotFoundException;
import web_project.bx_demo.model.Question;
import web_project.bx_demo.model.Question_0;
import web_project.bx_demo.model.Question_1;
import web_project.bx_demo.model.Question_2;
import web_project.bx_demo.model.Question_3;
import web_project.bx_demo.model.User;
import web_project.bx_demo.repository.QuestionRepository;
import web_project.bx_demo.repository.Question_0_Repository;
import web_project.bx_demo.repository.Question_1_Repository;
import web_project.bx_demo.repository.Question_2_Repository;
import web_project.bx_demo.repository.Question_3_Repository;
import web_project.bx_demo.repository.UserRepository;
import web_project.bx_demo.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	private QuestionRepository questionRepository;
	private UserRepository userRepository;
	private Question_0_Repository question_0_Repository;
	private Question_1_Repository question_1_Repository;
	private Question_2_Repository question_2_Repository;
	private Question_3_Repository question_3_Repository;
	
	public QuestionServiceImpl(QuestionRepository questionRepository,UserRepository userRepository, Question_0_Repository question_0_Repository,
			Question_1_Repository question_1_Repository,Question_2_Repository question_2_Repository, Question_3_Repository question_3_Repository) {
		super();
		this.questionRepository = questionRepository;
		this.userRepository=userRepository;
		this.question_0_Repository=question_0_Repository;
		this.question_1_Repository=question_1_Repository;
		this.question_2_Repository=question_2_Repository;
		this.question_3_Repository=question_3_Repository;
	}

	

	@Override
	public Question getQuestionById(Long id) {
		
		return questionRepository.findById(id).orElseThrow(()-> 
			new ResourceNotFoundException("Question","Id",id) );
	}
	
	
	@Override
	public Question saveQuestion(Question question) {
		
		return questionRepository.save(question);
	}
	
	
	



	@Override
	public User getUserById(Long id) {

		return userRepository.findById(id).orElseThrow(()-> 
		new ResourceNotFoundException("User","Id",id) );
	}



	@Override
	public List<Question_0> getAllQuestion_0() {
		return question_0_Repository.findAll();

	}



	@Override
	public List<Question_1> getAllQuestion_1() {
		return question_1_Repository.findAll();
	}



	@Override
	public List<Question_2> getAllQuestion_2() {
		return question_2_Repository.findAll();
	}



	@Override
	public List<Question_3> getAllQuestion_3() {
		return question_3_Repository.findAll();
	}



	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}



	@Override
	public Question_0 saveQuestion_0(Question_0 question_0) {
		return question_0_Repository.save(question_0);
	}



	@Override
	public Question_1 saveQuestion_1(Question_1 question_1) {
		return question_1_Repository.save(question_1);
	}



	@Override
	public Question_2 saveQuestion_2(Question_2 question_2) {
		return question_2_Repository.save(question_2);
	}



	@Override
	public Question_3 saveQuestion_3(Question_3 question_3) {
		return question_3_Repository.save(question_3);
	}
	
	
	
}
