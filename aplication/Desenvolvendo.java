package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Desenvolvendo {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 Produto produto = new Produto();
		 System.out.print("Nome: ");
		 produto.nome = sc.nextLine();
		 System.out.print("Preço: ");
		 produto.preco = sc.nextDouble();
		 System.out.print("Quantidade: ");
		 produto.quantidade = sc.nextDouble();
		 System.out.print(produto);
		 System.out.println();
		 System.out.print("Por favor adiconar a quantidade no estoque: ");
		 int quantidade =sc.nextInt();
		 produto.addTotal(quantidade);
		 System.out.println(produto);
		 System.out.print("Por favor retirar a quantidade no estoque: ");
		 quantidade = sc.nextInt();
		 produto.removeTotal(quantidade);
		 System.out.println(produto);
		 
		 
		 
		 
		 sc.close();
	}

}
