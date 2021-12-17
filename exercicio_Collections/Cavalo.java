package exercicio_08;

public class Cavalo extends Animal implements Acoes {
	
	@Override
	public void acao() {
	
		System.out.println("O cavalo está na sela esperando o Cavaleiro");
	}

	@Override
	public void som() {
		
		System.out.println("IIIIRRIIII Buuuushhhhhhh");

	}
}