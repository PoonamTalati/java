package fr.eni.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import fr.eni.demo.bll.FormateurService;
import fr.eni.demo.bll.FormateurServiceImpl;
import fr.eni.demo.bll.mock.FormateurServiceBouchon;
import fr.eni.demo.dal.FormateurDAO;
import fr.eni.demo.dal.mock.FormateurDAOBouchon;

@Configuration
public class AppConfiguration {
		@Bean
		FormateurDAO getFormateurDAO()
		{
			return new FormateurDAOBouchon();
		}
		
		@Bean
		@Profile("default")
		FormateurService getFormateurService()
		{
			return new FormateurServiceImpl(getFormateurDAO());
		}
		@Bean
		@Profile("dev")
		FormateurService getFormateurServiceBouchon()
		{
			return new FormateurServiceBouchon();
		}
}
