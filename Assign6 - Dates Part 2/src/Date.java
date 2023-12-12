public abstract class Date {

    private int year;
    private int month;
    private int day;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

//    public Date() {}

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

    public String getMonthName() {
        return getMonthName(this.month);
    }


    public void printShortDate() {
        System.out.printf("%d/%d/%d", this.getMonth(), this.getDayOfMonth(), this.getYear());
    }

    //A method that prints the calendar date(without carraige return) in Month name dd, yyyy format
    public void printLongDate() {
        System.out.printf("%s %d, %d", this.getMonthName(), this.getDayOfMonth(), this.getYear());
    }

    public boolean isLeapYear() {
        return isLeapYear(this.getYear());
    }

    public abstract boolean isLeapYear(int year);


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


    private int getNumberOfDaysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        } else {
            return 365;
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
