package jdk8910Features;

/*
 * LocalDate is a predefined class introduced in jdk 8 . this class is used to manipulate dates in a much simplet way 
 */
import java.time.*;

public class LocalDateEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime curruntTime = LocalTime.now();

		System.out.println(today);
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());

		LocalDate todayUS = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println("Time in Us Chicago: " + todayUS);

		LocalTime todayTime = LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println(todayTime);

		LocalDate birthdate = LocalDate.of(1999, 8, 27);
		Period surajAge = Period.between(birthdate, today);

		System.out.println(surajAge);
		System.out.println(birthdate.getDayOfWeek());

		Duration timeDiff = Duration.between(todayUS, curruntTime);
		System.out.println("Time Difference in india and america" + timeDiff);
	}
}