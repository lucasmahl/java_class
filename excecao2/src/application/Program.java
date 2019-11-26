package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Número do quarto: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Checkin (dd/mm/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("CheckOut (dd/mm/yyyy): ");
			Date checkout = sdf.parse(sc.next());
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);

			System.out.println("Atualize os dados de reserva: ");
			System.out.print("Checkin (dd/mm/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("CheckOut (dd/mm/yyyy): ");
			checkout = sdf.parse(sc.next());
			reservation = new Reservation(number, checkin, checkout);
			reservation.updateDates(checkin, checkout);

			System.out.println("Reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Formato de data inválido.");
		}
		catch (DomainException e) {
			System.out.println("Erro na reserva. " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inexperado!");
		}
		finally {
			sc.close();
		}
		



	}

}
