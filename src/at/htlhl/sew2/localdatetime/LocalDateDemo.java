package at.htlhl.sew2.localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo {
    void main() {
        LocalDate now = LocalDate.now();
        IO.println(now);

        IO.println(now.getMonthValue());
        IO.println(now.lengthOfMonth());

        LocalDate leapDate = LocalDate.of(2028, 3, 31);
        IO.println(leapDate);
        LocalDate monthBeforeLeapDate = leapDate.minusMonths(1);
        IO.println(monthBeforeLeapDate);

        LocalDate newYear = LocalDate.parse("2027-01-01");
        IO.println(newYear);

        LocalDate davidM = LocalDate.of(2011, 5, 31);
        LocalDate emilianT = LocalDate.of(2011, 5, 29);

        if (davidM.isAfter(emilianT)) {
            IO.println("David ist Jünger");
        } else {
            IO.println("Emilian ist Jünger");
        }

        Period periode = Period.between(davidM, emilianT);
        IO.println(periode.getDays());

        LocalDate birthday = LocalDate.of(2009, 11, 13);
        Period birthdayPeriod = Period.between(LocalDate.now(), birthday);
        IO.println(birthdayPeriod.getYears());
    }
}
