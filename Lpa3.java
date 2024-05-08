package lpa;

import java.util.Scanner;

public class Lpa3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int veta[] = new int [5];
		int vetb[] = new int [5];
		int vetc[] = new int [10];

		for (int i=0;i<5;i++) {

			System.out.println("Informe os Valores do Vetor A: "+i);
			veta[i]=ler.nextInt();
		}
		
		for (int i=0;i<5;i++) {
			System.out.println("informe os Valores do Vetor B:" +i);
			vetb[i]=ler.nextInt();
		}
		
		for (int i=0;i<5;i++) {
			
			vetc[i]=veta[i];
			vetc[i+5]=vetb[i];
		}
		
		for (int i=0;i<10;i++) {
			
			System.out.println(vetc[i]);
		}

		ler.close();
	}

}