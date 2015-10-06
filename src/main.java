/*
 * @author Duchene Francois && Tascon Gutierrez Luis
 * @version 1.0
 * 
 * To ameliorate:
 * 
 * put a dico
 * show the wrong letters each time
 * 
 * in the options:
 * to suggest a 2players mode
 */

import java.util.*;
import java.lang.*;

public class Main
{
<<<<<<< HEAD
	public static void main (String [] args)
	{
		/* 	
		 * Déclaration des variables
		 */
		
		/*	
		 * ==========================
		 * 			LE PENDU
		 * ==========================
		 * 
		 * jeu destiné à faire un pendu. Ici il s'agit de la classa mère où
		 * tout se déroulera 
		 * 
		 * Le programme se sépare actuellement en 3 fonctions
		 * 
		 * 1) main
		 * 2) jeu où se déroule le jeu
		 * 3) menu
		 */
				menu();				
		
	}
	public static void jeu()
	{
		// Differentes variables utilisées
		String MotSecret = "fromage";	
		String MotUser = "un";
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 	Texte dédié Interface utilisateur
		 */
		System.out.println("Trouvez le mot secret !");
		
		for(byte coup = 0; coup != 10; coup++ )
		{
			System.out.println("Il vous reste : " + (10-coup) + " coups pour trouver la solution");
			MotUser = sc.nextLine();
			
			if(MotUser.equals(MotSecret))
			{
				System.out.println("Félicitation, vous avez trouvé le mot " + MotSecret + " en " + coup + " coups !!!");	
				coup = 10;
				break;
			}		
		
		}
		
		
		System.out.println("Program ended correctly");
		
	}
	public static void menu()
	{
		byte choix = 0;
		Scanner scr = new Scanner(System.in);		
		
		System.out.println("==========================\n\t LE PENDU \n==========================");
		System.out.println("1.Jouer \n2.Options \n3.Crédits \n4.Quitter");
		System.out.println("bonjour");
		choix = scr.nextByte();
		
		do
		{
		switch(choix)
		{
			case 1 : 
					System.out.println("\n C'est partit !");
					jeu();
				break;
			case 2 :
					System.out.println("\nMenu des Options");
				break;
			case 3 :
					System.out.println("Dev : f.Duchene");
				break;
			case 4 :
				break;
			default :
					System.out.println("Veuillez indiquer 1,2,3 ou 4 !");
				break;
		}
		
		}while(choix <= 0 || choix >= 4);
	}
	
	
=======
 public static void main (String [] args)
 {
  /*  
   * Declaration of the variable
   */
  
  /* 
   * ==========================
   *    LE PENDU
   * ==========================
   * 
   * game to play "le pendu". Here is the main class were all the
   * program is executed
   * 
   *There is actually 3 functions:
   * 
   * 1) main
   * 2) jeu ou se deroule le jeu
   * 3) menu
   */
  
    menu();    
  
 }
 public static void jeu(byte vies)
 {
  // all the variables used
  String MotSecret = "lettre";
  String MotUser = "";
  char LettreUser = 'A'; 
  int LongueurMot = MotSecret.length();
  boolean condi = false;
  
  for (byte o = 0; o < LongueurMot; o++) // loop to have the same number of * than the letters in the "MotSecret"
  {
    MotUser = MotUser + "*";
  }
  
  
  System.out.println("Trouvez le mot secret !"); 
  
  while( vies != 0)
  {
   int re = 1;
   System.out.println(String.format("Il reste : %d vie(s)",(vies)));
   System.out.println(MotUser);
      
   System.out.println("Ecrivez une lettre : ");
   
   LettreUser = TextIO.getChar();
   
   for (int i=0; i< LongueurMot;i++) // loop to test all the string
   {
       if(LettreUser == MotSecret.charAt(i)){ // if it s ok => fonction to replace the chain
       MotUser = replaceCharAt(MotUser, LettreUser, i);
       re = 0;
       }
   }
    
    if(MotUser.equals(MotSecret))
    {
     System.out.println("Félicitation, vous avez trouvé le mot " + MotSecret + " avec encore " + (vies) + " vie(s) !!!"); 
     break;
    }    
    
    if (re == 1)// if the letters was wrong, minus 1 life
    {vies--;}
   }  
  
}
 
public static String replaceCharAt(String s, char c,int pos) {
    
    return s.substring(0,pos) + c + s.substring(pos+1);
}
  
public static void menu()
 {
  byte choix = 0;
  byte vies = 7;
  
  
  do
  {
  System.out.println("==========================\n\t LE PENDU \n==========================");
  System.out.println("1.Jouer \n2.Options \n3.Crédits \n4.Quitter");  
  
   choix = TextIO.getByte();
  switch(choix)
  {
   case 1 : 
     System.out.println("\n C'est parti !");
     jeu(vies);
    break;
   case 2 :
     System.out.println("\nMenu des Options"); //to developp
     vies = option1();
    break;
   case 3 :
     System.out.println("Developpement : F.Duchene && L.Tascon Gutierrez \nVersion du pendu 1.0");     
    break;
   case 4 :
     System.out.println("Program ended correctly");
    break;
   default :
     System.out.println("Veuillez indiquer 1,2,3 ou 4 !");
    break;
  }
  
  }while(choix != 4);
}
 
public static byte option1(){// subroutines in the options to choose the number of life
     byte vies = 7;
     System.out.println("Combien voulez vous de vies?");
     vies = TextIO.getByte();
     return vies;
>>>>>>> d0bad613a85b754d31f19c348bc61a32611ab7d3
}
 
}