package web_project.bx_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web_project.bx_demo.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
