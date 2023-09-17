package controller;
import model.PilhaString;
import view.Principal;
public class HistoricoController {

	public HistoricoController() {
		super();
	}
	
	PilhaString ps = new PilhaString();
	public void insereEndereco(PilhaString ps){
		System.out.println("Informe o endereço web: ");
		String endereço = Principal.sc.nextLine();
		
		if (endereço.contains("http://www.")) {
			ps.push(endereço);
			
		} else {
			System.out.println("Endereço inválido");
		}
		
	}
	public void removeEndereço(PilhaString palavra) {
		try {
			ps.pop();
		} catch (Exception errpilha) {
			System.out.println("Histórico vazio");
		}
	}
	
	public void mostraEndereço(PilhaString palavra) {
		if (!ps.isEmpty()) {
			try {
				System.out.println("==>" +ps.top());
			} catch (Exception errpilha){
				System.err.println(errpilha);
			}
		} else {
			System.out.println("Histórico vazio");
		}
	}
}
