package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Your number: ");
		int n = in.nextInt();
		int[] array = new int [n];
		for(int i = 0; i < n; i++) {
			array[i] = i+1;
			System.out.println(array[i]);
		}//for
		for(int j = 2; j<n; j++) {
			for(int i = 3; i<n; i++) {
				if(array[i]%j==0 && (array[i] != j)) {
					array[i]=0;
				}//if
			}//inside for
		}//outside for

		System.out.println();
		System.out.println("The prime numbers: ");
		for(int i = 0; i<n; i++) {
			if(array[i] != 0) {
				System.out.println(array[i]);
			}//if
		}//for






	}
}