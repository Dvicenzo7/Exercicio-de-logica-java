package faccat;

import java.util.Scanner;

public class DoWhileman9 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um número : ");
		int numero = sc.nextInt();
		
		int acumuladora = numero ;
		int acumuladora2 = 0;
		
		do {
			acumuladora2=numero;
		System.out.println(numero);
		
		
		} while (numero <=-1);
		System.out.println("O numero maior é : "+acumuladora);
	System.out.println("O numero menor é : "+acumuladora2);
	}
	
}
/*Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
usuário.*/