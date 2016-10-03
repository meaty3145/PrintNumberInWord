/* ==========================================================================
 *
 *	PROGRAM NAME :	NumberPrint.java
 *
 *	Compilation : javac NumberPrint.java
 *	Execution: java NumberPrint
 *
 *	Programmer: Jason Campos 
 *
 *	Objects imported: None 
 *
 *  Parameters In: None
 *
 *  Returned Values: None 
 *
 *	Date Modified: 9/28/16
 *
 *	Purpose: Ask user to input a number and prints out the number in words
 *	This uses a DO WHILE loop rather than a FOR or WHILE loops from the previous
 * 	assignments (NumberPrint.java)
 *
 *  Modification History: 
 *
 *  Date: 9/28/16
 *  Programmer: JS
 *  Requirement: Create Program 
 *
 *  Date: 8/28/16
 *  Programmer: JS
 *  Requirement: Added header so programmer wouldn't get fired! 
 *
 * ===========================================================================
 */
import java.util.Scanner;

public class PrintNumberInWord {   // saved as "PrintNumberInWord.java"
   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a Number from 0 to 9");
      int number = keyboard.nextInt();

      // Using nested-if
      if (number == 1) {
         System.out.println("ONE");
      } else if (number == 2) {
         System.out.println("TWO");
      } else if (number == 3) {
         System.out.println("THREE");
      } else if (number == 4) {
         System.out.println("FOUR");
      } else if (number == 5) {
         System.out.println("FIVE"); 
      } else if (number == 6) {
         System.out.println("SIX");
      } else if (number == 7) {
         System.out.println("SEVEN");
      } else if (number == 8) {
         System.out.println("EIGHT");
      } else if (number == 9) {
         System.out.println("NINE");
      } else if (number == 0) {
         System.out.println("ZERO");
      } else {
         System.out.println("OTHER");
      }
   }
}
