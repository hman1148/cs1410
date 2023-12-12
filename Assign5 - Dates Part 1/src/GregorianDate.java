import java.util.GregorianCalendar;

public class GregorianDate {

    private int year;
    private int month;
    private int day;
    public GregorianDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public GregorianDate() {

//        Calendar c = new GregorianCalendar(); hack
        this.day = 1;
        this.month = 1;
        this.year = 1970;

        long currentTime = System.currentTimeMillis();

        long offSetDays = java.util.TimeZone.getDefault().getRawOffset();

        long totalMilliseconds = (currentTime + offSetDays);

        int totalDays = (int) (totalMilliseconds / (60 * 60 * 24 * 1000));

        this.addDays(totalDays);

    }

    //Adds a specified number of days to the calendar date
    public void addDays(int days) {
        for (int i = 0; i < days; i++) {

            this.day += 1;

           if (this.day > this.getNumberOfDaysInMonth(this.year, this.month)) {

               this.setDay(1);
               this.setMonth(this.month + 1);

               if (this.month == 13) {
                   this.setMonth(1);
                   this.setYear(this.year + 1);
               }
           }
        }
    }


    //Subtract a specified number of days to the calendar date
    public void subtractDays(int days) {

        for (int i = 0; i < days; i++) {
            this.day -= 1;

            if (this.day == 0) {

                this.setMonth(this.month - 1);

                if (this.month == 0) {
                    this.setMonth(12);
                    this.setYear(this.year - 1);
                }
                this.setDay(this.getNumberOfDaysInMonth(this.year, this.month));
            }
        }
    }
    //Return true/false if the calendar date is part of a leap year
    public boolean isLeapYear() {
        return isLeapYear(this.getYear());
    }

    //A method that prints the calendar date(without a carraige return) in mm/dd/yyyy format
    public void printShortDate() {
        System.out.printf("%d/%d/%d", this.month, this.day, this.year);
    }

    //A method that prints the calendar date(without carraige return) in Month name dd, yyyy format
    public void printLongDate() {
        System.out.printf("%s %d, %d", this.getMonthName(this.month), this.day, this.year);
    }

    public String getMonthName() {
        return getMonthName(this.month);
    }

    // A method that returns true/false if a specified year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // A method that returns the number of days in a month(for a year)
    private int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }
    //A method that returns the number of days in a year
    private int getNumberOfDaysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        } else {
            return 365;
        }
    }

    //A method tha returns the name of a month; first letter capitalized, remainder lowercase;
    private String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
