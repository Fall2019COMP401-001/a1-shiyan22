package a1;

import java.util.Scanner;

import java.text.DecimalFormat;

public class A1Novice {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		int customer = scan.nextInt();
		String FirstName = "";
		char F = 0;
		String LastName = "";
		int item = 0;
		int quantity = 0;
		String itemname = "";
		double price = 0;
		double total = 0;
		double sum = 0;
		DecimalFormat df = new DecimalFormat("#0.00");

		for(int i=0; i < customer; i++) {

			FirstName = scan.next();

			F = FirstName.charAt(0);

			LastName = scan.next();

			item = scan.nextInt();

			for (int a =0; a < item; a++) {

				quantity = scan.nextInt();

				itemname = scan.next();

				price = scan.nextDouble();

				total = quantity * price;
				
				sum += total;



			}
			
			System.out.println(F + ". " + LastName + ": " + df.format(sum));
			
			sum = 0;
		

		


		}



	}
}
