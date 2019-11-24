package application;

public class Program {
	public static void main(String[] args) {
		// unboxing
		int x = 20;

		Object obj = x;

		System.out.println(obj);

		// guardando numa variavel compativel
		int y = (int) obj;// tem q ser feito o cast

		System.out.println(y);
	}
}
