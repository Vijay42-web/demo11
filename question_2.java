package lab_2;

import java.util.Scanner;
 
public class question_2 {
	public static void main(String aa[] ) {
		int num, i, tab;
		Scanner scan = new Scanner(System.in);
		      
		System.out.print("Enter a Number : ");
	    num = scan.nextInt();
	
	    System.out.print("Table of " + num + " is\n");
	    
         for(i=1; i<=10; i++) {
        	 if(num<0) {     
            	 System.out.println("enter positive no");
            	 break;
             }
		            tab = num*i;
		            System.out.print(num + " * " + i + " = " + tab + "\n");
		        }
         
	}
}
		    