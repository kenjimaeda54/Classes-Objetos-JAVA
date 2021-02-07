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
		 System.out.print("Estoque: ");
		 produto.estoque = sc.nextDouble();
		 System.out.print(produto);
		 
		 sc.close();
	}

}
