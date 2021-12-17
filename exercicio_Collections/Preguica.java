package exercicio_08;

public class Preguica extends Animal implements Acoes {
	
	@Override
	public void acao() {
		
		System.out.println("Andando nos galhos");
	}

	@Override
	public void som() {
		
		System.out.println("ZZZZZZZZZZZZZZZZZZZZ Ahh");

	}
}
