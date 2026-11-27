package fr.eni.testdata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import fr.eni.classexample.Patient;

public class PatientTest {
	public static void main(String args[])
	{
        Patient hillary = new Patient();
       
        Patient Adhemar = new Patient("Adhemar","Pamamobe","0753428619",'M',192112192020142l,LocalDate.of(1992, 11, 21),null);
        
        hillary.display();
        Adhemar.display();
	}
}
	