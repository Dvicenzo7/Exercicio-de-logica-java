package faccat;

import java.util.Scanner;

public class WhileMan11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um n�mero : ");
		int numero = sc.nextInt();
		
		int acumuladora = numero ;
		int acumuladora2 = 0;
		
		while (numero >= -1) {
			
			acumuladora2=numero;
			System.out.println(numero);
			numero --;
			
		}
		System.out.println("O numero maior � : "+acumuladora);
		System.out.println("O numero menor � : "+acumuladora2);
	}

}

/*Elaborar um programa que efetue a leitura de valores positivos inteiros at� que um valor negativo
seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
usu�rio*/