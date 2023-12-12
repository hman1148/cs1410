
public class GregorianDate extends Date{


    public GregorianDate(int year, int month, int day) {
        super(day,month,year);
    }

    public GregorianDate() {
         super(1, 1, 1970);

        long currentTime = System.currentTimeMillis();

        long offSetDays = java.util.TimeZone.getDefault().getRawOffset();

        long totalMilliseconds = (currentTime + offSetDays);

        int totalDays = (int) (totalMilliseconds / (60 * 60 * 24 * 1000));

        this.addDays(totalDays);

    }
    @Override
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
