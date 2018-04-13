package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuProdutos {
	static Integer valorMenu = 0;
	static Scanner entrada = new Scanner(System.in);
	static List<CadastroProdutos> cadastroprodutos = new ArrayList<CadastroProdutos>();
			
	public static void main(String[] args) {
		while (valorMenu != 3) {
			if (valorMenu == 1) {
				informarValores();
				chamarMenu();
			} else if (valorMenu == 2) {
				imprimir();
				chamarMenu();
			} else if (valorMenu == 3) {
				System.exit(0);
			} else {
				chamarMenu();
			}
		}
	}

	private static void imprimir() {
		for (CadastroProdutos CadastroProdutos : cadastroprodutos) {
			System.out.println(CadastroProdutos);
		}
		
	}

	private static void informarValores() {
		System.out.println("\nInforme o nome do Produto");
		String name = entrada.next();
		System.out.println("Quantidade dos Produto");
		Integer quantidade = entrada.nextInt();
		System.out.println("Valor do Produto");
		Float valor = entrada.nextFloat();
		
		CadastroProdutos novoProduto = new CadastroProdutos(name, quantidade, valor);
		cadastroprodutos.add(novoProduto);
	}

	private static void chamarMenu() {
		System.out.println("MENU");
		System.out.println("1:CADASTRAR PRODUTOS");
		System.out.println("2:IMPRIMIR");
		System.out.println("3:SAIR");
		
		valorMenu = entrada.nextInt();
	
	}
}

