package com.example.spring_boot_app2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	@RequestMapping("/aboutMe")
	public String aboutMe() {
		return "about-me.html";
	}
	@RequestMapping("/education")
	public String education() {
		return "education.html";
	}
	@RequestMapping("/experience")
	public String experience() {
		return "experience.html";
	}
	@RequestMapping("/projects")
	public String projects() {
		return "projects.html";
	}
	@RequestMapping("/skills")
	public String skills() {
		return "skills.html";
	}
	@RequestMapping("/Hobbies")
	public String Hobbies() {
		return "Hobbies.html";
	}
	
}
