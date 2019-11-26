package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	// static pra q ñ seja instanciado mais
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Data de chekout deve ser maior do que a de checkin.");
		} else {
			this.roomNumber = roomNumber;
			this.checkIn = checkIn;
			this.checkOut = checkOut;

		}
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		// calcula por milisegundos
		long diff = checkOut.getTime() - checkIn.getTime();

		// converte milisegundos para dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			// argumentos inválidos
			throw new DomainException("Reservas devem ser feitas para datas futuras.");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Data de chekout deve ser maior do que a de checkin.");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room: " + +roomNumber + ", CheckIn: " + sdf.format(checkIn) + ", CheckOut: " + sdf.format(checkOut)
				+ ", " + duration() + " noites.\n";
	}
}
