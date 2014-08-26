/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;


import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;



 

/**
 *
 * @author Monika
 */
public class Zadanie1 {
   private static final String plik = "zad1.csv";
   
   public static void main(String[] args) throws IOException {
	   
	       
	  // CSVReader reader = new CSVReader(new FileReader("zad1.csv"));
	   // List myEntries = reader.readAll();
		
		 CSVReader reader = new CSVReader(new FileReader(plik));
		 
			 
		String [] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			System.out.println("Nazwa: [" + nextLine[0] + "]\nAdres: [" + nextLine[1] + "]\nNIP: [" + nextLine[2] + "]\nAdres WWW: [" + nextLine[3] + "]\ne_mail: [" + nextLine[4] + "]");
		}
        CSVReader reader2 = new CSVReader(new FileReader(plik));
		List<String[]> allElements = reader2.readAll();
		StringWriter sw = new StringWriter();
		CSVWriter writer = new CSVWriter(sw);
		writer.writeAll(allElements);
         
                System.out.println("\n\nGenerated CSV File:\n\n");
                System.out.println(sw.toString()); 
     
          
   }
   
   
    
}
