package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		//POLIMORFISMO
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		//foi criada lista Employee, mas a instancia pode ser Employee ou OutsourceEmployee
		List<Employee> lista = new ArrayList<Employee>();

		System.out.print("Quanto funcionários: ");
		Integer qtd = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Dados do funcionário " + (i+1) + ": ");

			System.out.print("Externo (y/n)? ");
			char externo = sc.next().charAt(0);

			System.out.print("Nome: ");
			String nomefuncionario = sc.next();

			System.out.print("Horas: ");
			int horas = sc.nextInt();
			sc.nextLine();// quebra de linha

			System.out.print("Valor por hora: ");
			double valorhora = sc.nextDouble();

			double despesa = 0.0;
			if (externo == 'y') {
				System.out.print("Despesa adicional: ");
				despesa = sc.nextDouble();

				// refatorada para o código mais curto abaixo
				// Employee outemp = new OutsourceEmployee(nomefuncionario, horas, valorhora, despesa);
				// lista.add(outemp);

				lista.add(new OutsourceEmployee(nomefuncionario, horas, valorhora, despesa));
			} else if (externo == 'n') {
				// Employee emp = new Employee(nomefuncionario, horas, valorhora);
				// lista.add(emp);

				lista.add(new Employee(nomefuncionario, horas, valorhora));

			}

		}

		for (Employee employee : lista) {
			System.out.println();
			System.out.println("Pagamentos");
			System.out.println("Nome: " + employee.getNameEmployees());
			System.out.println("Horas: " + employee.getHours());
			System.out.println( "Valor por hora: " + String.format("%.2f",employee.getValuePerHour()) );
			System.out.println( "Pagamento total: " + String.format("%.2f", employee.payment()) );
			System.out.println();
		}

		sc.close();
	}

}
