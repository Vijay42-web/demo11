package lab_2;

import java.util.Scanner;

public class question_1 {
	public static void main(String aa[] ) {
		int num1,num2,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("sum from");
		num1=sc.nextInt();
		System.out.println(" sum upto ");
		num2=sc.nextInt();
		
		while(num1<=num2) {
			sum=sum+num1;
			num1++;
			
		}
		System.out.println("sum of given natural number= " +sum);
		sc.close();
	}

}
