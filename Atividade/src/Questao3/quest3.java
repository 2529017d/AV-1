package Questao3;

import java.util.Scanner;

public class quest3 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		int[] vetor = new int[10];
		int item, op, c1,c2,c3,c4,c5, Titem, cont=0;
	
		for(int i=0;i<10;i++) {
		System.out.println("Informe o valor os itens pedidos, caso queira finalizar digite s");
		vetor[i]=ler.nextInt();
		cont=i++;
		}
		System.out.println("Cadastrar item Pedido");
		System.out.println("Buscar item");
		System.out.println("Sair");
		op=ler.nextInt();
	
		
		switch (op){
		case 1:
			System.out.println("Item");
			System.out.println("Autor");
			System.out.println("Local");
			System.out.println("Data");
			System.out.println("Descrição");
			c1=ler.nextInt();
			c2=ler.nextInt();
			c3=ler.nextInt();
			c4=ler.nextInt();
			c5=ler.nextInt();
			break;
		case 2:
			
			break;
		default:
			
			System.out.println("Total de item cadastrados" + cont);
			break;
			
		}

	}

}
