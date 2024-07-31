package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Prorgarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		if(resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double intialDeposit = sc.nextDouble();
			acc = new Account(number, holder, intialDeposit);
			
		}else {
			acc = new Account(number, holder);
		}
		
		System.out.println("Account data: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		acc.Deposit(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		acc.Withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		sc.close();
	}

}
