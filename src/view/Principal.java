package view;
import java.util.Scanner;
import controller.HistoricoController;
import model.PilhaString;

public class Principal {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		HistoricoController hc = new HistoricoController();
		PilhaString ps = new PilhaString();
		
		String menu = "Historico de Endereco \n1)Insira novo endereco \n" +
		"2) Remova ultimo endereco \n3) Mostre novo endereco\n9)Encerre";
		
		int opção;
		
		do {
			System.out.print(menu);
			opção = sc.nextInt();
			sc.nextLine();
			
			switch(opção) {
			case 1:
				hc.insereEndereco(ps);
				break;
			case 2:
				hc.removeEndereço(ps);
				break;
			case 3:
				hc.mostraEndereço(ps);
				break;
			case 9:
				System.out.println("Programa Encerrado");
				break;
				
			default:
				System.out.println("Opção Inválida");
				break;
			}
				
		}while(opção!=9);
			sc.close();
	}

}
