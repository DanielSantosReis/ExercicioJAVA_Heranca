package exercicio_08;

public class Cachorro extends Animal implements Acoes {
	

	@Override
	public void acao() {
		
		System.out.println("O cachorro está correndo atrás do Carteiro");
	}

	@Override
	public void som() {
		
		System.out.println("AU AU AU AU AU AU HUHUHUHU");

	}
}
