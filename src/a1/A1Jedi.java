package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int itemtype = scan.nextInt();
		String[] itemname = new String[itemtype];
		double[] price = new double[itemtype];
		int[] customerpitem = new int[itemtype];
		int[] itemtotal = new int[itemtype];
		boolean[] s = new boolean[itemtype];
		for (int i=0; i<itemtype; i++) {
			itemname[i] = scan.next();
			price[i] = scan.nextDouble();
			customerpitem[i] = 0;
			itemtotal[i] = 0;
			s[i] = false;
		}

		int customer = scan.nextInt();
		String[] FirstName = new String[customer];
		String[] LastName = new String[customer];
		double[] costpcus = new double[customer];
		int in = 0;
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
				in = Arrays.asList(itemname).indexOf(type[b]);
				costptype[b] = typenumber[b] * price[in];
				costpcus[a] += costptype[b];
				if(!s[in]) {
					customerpitem[in] ++;
					s[in] = true;
				}
				itemtotal[in] += typenumber[b];
			}
			for (int i=0; i<itemtype; i++) {
				s[i] = false;
			}
		}
		for (int i=0; i<itemtype; i++) {
			if (customerpitem[i] == 0) {
				System.out.println("No customers bought " + itemname[i]);
			}
			else {
				System.out.println(customerpitem[i] + " customers bought " + itemtotal[i] + " " +itemname[i]);
			}
		}
	}
}
