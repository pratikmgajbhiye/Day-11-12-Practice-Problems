package com.BridgeLabz.Day11and12PracticeProblem;

import java.util.Scanner;

public class ModifyAccount {
	static float accountBalance = 25000.00f;

	static void accountcheck() {
		System.out.println("Your Account Balance is : " + accountBalance + " Rupees ");
	}

	static void accounttest() {
		int i = 0;
		while (i < 3) {
			System.out.println("Please Enter Amount You Want to Withdraw");
			Scanner input = new Scanner(System.in);
			float debit = input.nextFloat();
			if (debit <= accountBalance) {
				accountBalance -= debit;
				System.out.println("Your Account Balance is : " + accountBalance + " Rupees ");
				i++;
			} else {
				System.out.println("Debit Amount Exceeded Account Balance,");
				System.out.println("Please Enter Valid Amount");
			}

		}
		System.out.println(" Daily transction exceed ");
	}

	public static void main(String[] args) {
		accountcheck();
		accounttest();

	}

}
