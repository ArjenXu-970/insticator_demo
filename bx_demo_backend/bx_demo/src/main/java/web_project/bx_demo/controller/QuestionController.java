package web_project.bx_demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web_project.bx_demo.exception.ResourceNotFoundException;
import web_project.bx_demo.model.Question;
import web_project.bx_demo.model.User;
import web_project.bx_demo.repository.QuestionRepository;
import web_project.bx_demo.repository.UserRepository;
import web_project.bx_demo.service.QuestionService;
import web_project.bx_demo.service.impl.QuestionServiceImpl;


@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/questions")
public class QuestionController {
	private QuestionService questionService;
	private QuestionRepository questionRepository; 
	private UserRepository userRepository;

	public QuestionController(QuestionService questionService,UserRepository userRepository,QuestionRepository questionRepository) {
		super();
		this.questionService = questionService;
		this.userRepository = userRepository;
		this.questionRepository= questionRepository;
	}
	
	//build create question API
	@PostMapping
	public ResponseEntity<Question> saveQuestion(@RequestBody Question question){
		
		return new ResponseEntity<Question>(questionService.saveQuestion(question),HttpStatus.CREATED);
	}
	
	//build get question by id
	
	@GetMapping("userid={id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long UserId){
		User user=userRepository.findById(UserId).orElseThrow(()->new ResourceNotFoundException("User","Id",UserId));
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("questionid={id}")
	public ResponseEntity<Question> getQuestionById(@PathVariable("id") long QId){
		Question question=questionRepository.findById(QId).orElseThrow(()->new ResourceNotFoundException("Question","Id",QId));
		return ResponseEntity.ok(question);
	}
//	
	
	@PutMapping("userid={id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User userDetail,Question questionDetail){
		User user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		String question_string=user.get_site_one();
		String[] question_string_list=question_string.split(",");
		List<Integer> blank=new ArrayList<>();
		for(int i=0;i<question_string_list.length;i++) {
			if(question_string_list[i].equals("0")) {
				blank.add(i);
			}
		}
		int blank_length=blank.size();
		Random ran = new Random();
		int question_num=ran.nextInt(blank_length);
		Question question=questionRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		user.set_site_one(userDetail.get_site_one());
		user.set_site_one_num(userDetail.get_site_one_num());
		User updatedUser= userRepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}
//	@GetMapping("{id}")
//	public ResponseEntity<Question> getQuestionById(@PathVariable("id") long questionId){
//		return new ResponseEntity<Question>(questionService.getQuestionById(questionId),HttpStatus.OK);
//	}
}
