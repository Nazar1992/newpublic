package buncomat;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int balance = 1000;
		int user 
		System.out.println("enter 1 for check balance");
		System.out.println("enter 2 for a credit");
		System.out.println("enter 3 for add into a balance");
		
		String choise = scanner.next();
		
		switch (choise){
		case "1":{
			System.out.println("your current balance="+balance);
			break;
		}case "2":{
			System.out.println("how much money you want to get");
			int credit = scanner.nextInt();
		}
			break;
		}case "3":{
				break;
				
		}
		default:{
		}
	}

}
