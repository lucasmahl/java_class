package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.spi.CalendarNameProvider;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date y1 = sdf1.parse("24/10/2019");
		Date y2 = sdf2.parse("24/10/2019 21:20:00");

		System.out.println(y1);
		System.out.println(y2);

		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));

		System.out.println();

		Date agora = new Date();

		System.out.println(sdf2.format(agora));

		System.out.println();
		Date sisMili = new Date(System.currentTimeMillis());// pega o instante do sistema e converte pra milisegundos
		System.out.println(sisMili);

		sisMili = new Date(0L);// passando 0 milisegundos

		System.out.println(sisMili);

		sisMili = new Date(1000L * 60L * 60L * 5L);// MULTIPLICANDO

		System.out.println(sisMili);

		System.out.println();
		Date Y3 = Date.from(Instant.parse("2019-10-24T21:34:19Z"));// padrão//horário UTC
		System.out.println("UTC: " + Y3);

		sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));// padrão GMT
		System.out.println("GMT: " + sdf2.format(Y3));

		System.out.println("------------------CALENDÁRIO------------------------");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2019-10-24T21:48:07Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();

		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);// adiciona 4 horas
		d = cal.getTime();

		System.out.println(d);

		System.out.println("------------------pegar unidade de tempo------------------------");

		int minutes = cal.get(Calendar.MINUTE);

		System.out.println("Minutos: " + minutes);

		int month = 1 + cal.get(Calendar.MONTH);

		System.out.println("Mês: " + month);// 1 mês a menos, por ser como array
	}

}
