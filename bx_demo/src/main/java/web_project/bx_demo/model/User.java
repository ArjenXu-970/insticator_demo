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
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	public String first_name;
	
	@Column(name="last_name")
	public String last_name;
	
	@Column(name="email")
	public String email;
	
	@Column(name="site_one")
	public String site_one;
	
	@Column(name="site_one_num")
	public int site_one_num;
	
	public String get_site_one() {
		return this.site_one;
	}
	
	public void set_site_one(String new_site) {
		this.site_one=new_site;
	}
	
	public int get_site_one_num() {
		return this.site_one_num;
	}
	
	public void set_site_one_num(int number) {
		this.site_one_num=number;
	}
	
}
