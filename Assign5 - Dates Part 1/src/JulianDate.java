public class JulianDate {

    private int year;
    private int month;
    private int day;

    public JulianDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public JulianDate() {
        this.day = 1;
        this.month = 1;
        this.year = 1;

        this.addDays(719164);

        long currentTime = System.currentTimeMillis();
        long offSetDays = java.util.TimeZone.getDefault().getRawOffset();

        long totalMilliseconds = currentTime + offSetDays;

//        int totalDays = (int) ((int) totalMilliseconds * 8.64 * Math.pow(10, 7)); // check formula or 60 * 60 * 24
        int totalDays = (int) (totalMilliseconds / (1000 * 60 * 60 * 24));

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
        return isLearYear(this.year);
    }


    //A method that prints the calendar date(without a carraige return) in mm/dd/yyyy format
    public void printShortDate() {
        System.out.printf("%d/%d/%d", this.month, this.day, this.year);
    }

    //A method that prints the calendar date(without carraige return) in Monthname dd, yyyy format
    public void printLongDate() {
        System.out.printf("%s %d, %d", this.getMonthName(this.month), this.day, this.year);
    }

    public String getMonthName() {
        return getMonthName(this.month);
    }
    private boolean isLearYear(int year) {
        return year % 4 == 0;
    }

    // A method that returns the number of days in a month(for a year)
    private int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLearYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }
    //A method that returns the number of days in a year
    private int getNumberOfDaysInYear(int year) {
        if (year % 4 == 0) {
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

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
