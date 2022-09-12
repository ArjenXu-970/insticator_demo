package web_project.bx_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web_project.bx_demo.model.Question;

public interface QuestionRepository extends JpaRepository<Question,Long>{

}
