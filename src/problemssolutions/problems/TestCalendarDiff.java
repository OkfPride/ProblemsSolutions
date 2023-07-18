package problemssolutions.problems;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class TestCalendarDiff {

    public static void main(String[] args) {
        LocalDate of = LocalDate.of(2023, 1, 1);
        LocalDate of2 = LocalDate.of(2023, 1, 1);
        of.with(DayOfWeek.MONDAY);


        long between1 = ChronoUnit.WEEKS.between(of2.with(DayOfWeek.MONDAY), of.with(DayOfWeek.MONDAY));

        Calendar start = Calendar.getInstance();
        start.set(Calendar.YEAR, 2023);
        start.set(Calendar.MONTH, 0);
        start.set(Calendar.DAY_OF_MONTH, 01);
        start.setFirstDayOfWeek(Calendar.MONDAY);
        start.setMinimalDaysInFirstWeek(1);
        Calendar end = Calendar.getInstance();
        end.set(Calendar.YEAR, 2023);
        end.set(Calendar.MONTH, 0);
        end.set(Calendar.DAY_OF_MONTH, 03);
        end.setFirstDayOfWeek(Calendar.MONDAY);
        end.setMinimalDaysInFirstWeek(1);
        System.out.println(start.get(Calendar.WEEK_OF_YEAR));
        System.out.println(end.get(Calendar.WEEK_OF_YEAR));
        System.out.println(start);
    }
}
