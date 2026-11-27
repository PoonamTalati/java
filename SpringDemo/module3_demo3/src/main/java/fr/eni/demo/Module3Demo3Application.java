package fr.eni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.eni.demo.controller.FormateurController;

@SpringBootApplication
public class Module3Demo3Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Module3Demo3Application.class, args);
		FormateurController formateurCtrler = ctx.getBean(FormateurController.class);
		formateurCtrler.afficherFormateurs();
	}

}
