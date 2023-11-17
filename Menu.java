package Conta;

import java.util.Scanner;

import Conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op;
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("**********************************************************");
			System.out.println("                                                          ");
			System.out.println("                BANCO DO BRAZIL COM Z                     ");
			System.out.println("                                                          ");
			System.out.println("**********************************************************");
			System.out.println("                                                          ");
			System.out.println("              	1 - Criar conta                           ");
			System.out.println("              	2 - Listar todas as contas                ");
			System.out.println("              	3 - Buscar conta por número               ");
			System.out.println("              	4 - Atualizar dados da conta              ");
			System.out.println("              	5 - Apagar conta                          ");
			System.out.println("              	6 - Sacar                                 ");
			System.out.println("              	7 - Depositar                             ");
			System.out.println("              	8 - Transferir valores entre Contas       ");
			System.out.println("              	9 - Sair                                  ");
			System.out.println("                                                          ");
			System.out.println("**********************************************************");
			System.out.println("Entre com a opção desejada                                ");
			System.out.println("                                                          "+ Cores.TEXT_RESET);
			op = leia.nextInt();
			
			if (op == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD+ "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
				
		switch (op) {
		case 1:
			System.out.println(Cores.TEXT_WHITE_BOLD+ "Criar conta\n\n");
			break;
			
		case 2:
			System.out.println(Cores.TEXT_WHITE_BOLD+ "Listar todas as contas\n\n");
			break;
			
		case 3:
			System.out.println(Cores.TEXT_WHITE_BOLD+ "Buscar conta por número\n\n");
			break;
			
		case 4:
			System.out.println(Cores.TEXT_WHITE_BOLD+ "Atualizar dados da conta\n\n");
			break;
			
		case 5:
			System.out.println(Cores.TEXT_WHITE_BOLD+ "Apagar conta\n\n");
			break;
			
		case 6:
			System.out.println(Cores.TEXT_WHITE_BOLD+ "Sacar\n\n");
			break;
			
		case 7:
			System.out.println(Cores.TEXT_WHITE_BOLD+ "Depositar\n\n");
			break;
			
		case 8:
			System.out.println(Cores.TEXT_WHITE_BOLD+ "Transferir valores entre Contas\n\n");
			break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD+ "\nOpção Inválida!\n" +Cores.TEXT_RESET);
				break;
		}
			}
			
		}

	}

	public static void sobre() {
		System.out.println("\n********************************************************");
		System.out.println("Projeto desenvolvido por: ");
		System.out.println("Vinicius dos Santos Lima - vinicius.slima99@icloud.com");
		System.out.println("https://github.com/vinysl");
		System.out.println("**********************************************************");
	}
}

