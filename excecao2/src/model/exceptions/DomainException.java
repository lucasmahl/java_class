package model.exceptions;

//RuntimeException � um tipo de excecao q o compilador n�o obriga vc a tratar
public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		//para permitir q seja poss�vel instancia a excecao personalizada
		super(msg);
	}
	
	
	
	
}
