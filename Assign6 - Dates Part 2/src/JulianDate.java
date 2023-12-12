public class JulianDate extends Date{

    public JulianDate(int year, int month, int day) {
        super(day, month, year);
    }

    public JulianDate() {
        super(1, 1, 1);

        this.addDays(719164);

        long currentTime = System.currentTimeMillis();
        long offSetDays = java.util.TimeZone.getDefault().getRawOffset();

        long totalMilliseconds = currentTime + offSetDays;

        int totalDays = (int) (totalMilliseconds / (1000 * 60 * 60 * 24));

        this.addDays(totalDays);
    }

    @Override
    public boolean isLeapYear(int year) {
            return year % 4 == 0;
        }
    }
