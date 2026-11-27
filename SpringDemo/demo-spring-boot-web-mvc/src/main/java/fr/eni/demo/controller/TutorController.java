package fr.eni.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TutorController {
	@GetMapping("/tutors")
	public String displayTutors()
	{
		System.out.println("We will load the list of trainers in another demonstration.");
		return "view-tutors";
	}
}
