package web_project.bx_demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;


@Data
@Entity
@Table(name="question_0")
public class Question_0 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="text")
	public String text;
	
	@Column(name="isCorrect")
	public int isCorrect;

	@Column(name="num")
	public int num;
}
