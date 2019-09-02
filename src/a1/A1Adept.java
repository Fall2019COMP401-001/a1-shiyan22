package a1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemtype = scan.nextInt();
		String[] itemname = new String[itemtype];
		double[] price = new double[itemtype];
		for (int i=0; i<itemtype; i++) {
			itemname[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		int customer = scan.nextInt();
		String[] FirstName = new String[customer];
		String[] LastName = new String[customer];
		double[] costpcus = new double[customer];
		for (int a=0; a<customer; a++) {
			FirstName[a] = scan.next();
			LastName[a] = scan.next();
			int bought = scan.nextInt();
			String[] type = new String[bought];
			int[] typenumber = new int[bought];
			double[] costptype = new double[bought];
			costpcus[a] = 0;
			for (int b=0; b<bought; b++) {
				typenumber[b] = scan.nextInt();
				type[b] = scan.next();
				costptype[b] = typenumber[b] * price[Arrays.asList(itemname).indexOf(type[b])];
				costpcus[a] += costptype[b];
			}
		}
		
		double sum = calculateValueSum(costpcus);
		int min = findValueMin(costpcus);
		int max = findValueMax(costpcus);
		System.out.println("Biggest: " + FirstName[max] + " " + LastName[max] + " (" + String.format("%.2f",costpcus[max]) + ")");
		System.out.println("Smallest: " + FirstName[min] + " " + LastName[min] + " (" + String.format("%.2f",costpcus[min]) + ")" );
		System.out.println("Average: " + String.format("%.2f", ((double) sum) / ((double) customer)));
		
	}

	static double calculateValueSum(double[] vals) {
		double sum = 0;
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
	
	static int findValueMin(double[] vals) {
		int index = 0;
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < vals[index]) {
				index = i;
			}
		}
		return index;
	}


	static int findValueMax(double[] vals) {
		int index = 0;
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > vals[index]) {
				index = i;
			}
		}
		
		return index;
	}
}
