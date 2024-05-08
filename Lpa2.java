package lpa;

import java.util.Scanner;

public class Lpa2 {

	public static void main(String[] args) {

		int a[] = new int [5];
		int soma=0;

		Scanner ler = new Scanner (System.in);

		for (int i=0; i<5; i++) {

			System.out.println("Informe os Valores "+i);
			a[i]=ler.nextInt();
		}
		for (int i=0; i<5; i++) {
			soma=soma+(a[i]);
			System.out.println(soma);
		}
		System.out.println ((soma<15) ? "O resultado da soma é menor que 15" : "O resultado da soma é maior ou igual que 15");
		
		ler.close();
	}
}