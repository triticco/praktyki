/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package praktyki.zadanie;


import java.io.IOException;
import java.util.List;


/**
 *
 * @author Monika
 */
public class Zadanie1 {
   private static final String plik = "zad1.csv";
   
   public static void main(String[] args) throws IOException {
	   UsersControl usersControl = new UsersControl();
	   
	   usersControl.loadUsers(plik);
	   
	   List<Long> list = usersControl.getAllNips();
	   
	   for(Long nip: list){
		   System.out.println(nip);
	   }
          
   }
   
   
    
}
