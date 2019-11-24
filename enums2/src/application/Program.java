package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Departamento? ");
		String departmentName = sc.nextLine();

		System.out.println("Dados de trabalho");
		System.out.print("Nome? ");
		String workerName = sc.nextLine();
		System.out.print("Level? ");
		String workerLevel = sc.nextLine();
		System.out.print("Salário? ");
		double baseSalary = sc.nextDouble();

		// workerlevel na forma de string
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("Quantos contratos pra este trabalho? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Contrato" + i + " data: ");
			System.out.print("Date: ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração: ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			
			//associando o contrato com o trabalhador
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Entre com MM/YYYY, para calcular salário: ");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0,2));//pegando os 2 primeiros caracteres e convertendo para integer
		int year = Integer.parseInt(monthYear.substring(3));
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println( "Income for:"+monthYear+": "+ String.format("%.2f", worker.income(year, month)) );

		sc.close();
	}
}
