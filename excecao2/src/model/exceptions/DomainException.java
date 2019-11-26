package model.exceptions;

//RuntimeException é um tipo de excecao q o compilador não obriga vc a tratar
public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		//para permitir q seja possível instancia a excecao personalizada
		super(msg);
	}
	
	
	
	
}
