package exercicio_08;

public class Cachorro extends Animal implements Acoes {
	

	@Override
	public void acao() {
		
		System.out.println("O cachorro est� correndo atr�s do Carteiro");
	}

	@Override
	public void som() {
		
		System.out.println("AU AU AU AU AU AU HUHUHUHU");

	}
}
