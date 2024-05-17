package lab5.mydate;
public class MyDate {
    private int year;
    private int month;
    private int day;
    
    private final String [] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"
             ,"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private final String [] DAYS = {"Sunday", "Monday", "Tueday", "Wednesday"
             ,"Thursday", "Friday", "Saturday"};
    private final int [] DAYINMONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //Hàm kiểm tra năm nhuận
    public boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 & year % 100 != 0)) {
            return true;
        }
        return false;
    }

    //Hàm kiểm tra ngày hợp lệ
    public boolean isValiddate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        if (isLeapYear(year)) {
            if (month == 2) {
                return (day >= 1 && day <= 29);
            }
        }
        return (day >=1 && day <= DAYINMONTHS[month-1]);
    }

    //Hàm trả về chỉ số có trong mảng DAYS để quy đổi sang thứ trong 1 tuần
    public int getDayofWeek(int year, int month,int day) {
        //if (isValiddate(year,month,day)) {
            if (month < 3) {
                month += 12;
                year--;
            }
            int n = day + 2 * month + (3 * (month + 1)) / 5 + year + year / 4 - year / 100 + year / 400;
            return (n + 1) % 7;
        //}
        //return -1;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {

        return month;
    }

    public int getDay() {
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

    public String toString() {
        return "\"" + DAYS[getDayofWeek(year,month,day)] + " " + day
                + " " + MONTHS[month-1] + " " + year + "\"";
    }

    public MyDate nextDay() {
        day += 1;
        if (isLeapYear(year) && month == 2) {
                if (day > 29) {
                    day = 1;
                    month++;
                    if (month > 12) {
                        month = 1;
                        year++;
                    }
                }
            return this;
        }

        if (day > DAYINMONTHS[month-1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        month += 1;
        if (month > 12) {
            month = 1;
            year += 1;
        }
        if (isLeapYear(year)) {
            if (month == 2) {
                if (day > 29) {
                    day = 29;
                }
            }
        }
        if (day > DAYINMONTHS[month-1]) {
            day = DAYINMONTHS[month-1];
        }

        return this;
    }

    public MyDate nextYear() {
        year += 1;
        if (!isLeapYear(year)) {
            if (month ==2) {
                if (day == 29) {
                    day = 28;
                }
            }
        }
        return this;
    }

    public MyDate previousDay() {
        day -= 1;
        if (month == 3 && isLeapYear(year)) {
            if (day < 1) { // vi du 01/03/2012
                day = 29;
                month -= 1;
            }
            return this;
        }

        if (day < 1) {
            month -= 1;
            if (month < 1) {
                month = 12;
                year -= 1;
            }
            day = DAYINMONTHS[month-1];
        }
        return this;
    }

    public MyDate previousMonth() {
        month -= 1;
        if (month < 1) {
            month = 12;
            year -= 1;
        }
        if (isLeapYear(year)) {
            if (month == 2) {
                if (day > 29) {
                    day = 29;
                }
            }
        }
        if (day > DAYINMONTHS[month-1]) {
            day = DAYINMONTHS[month-1];
        }

        return this;
    }

    public MyDate previousYear() {
        year -= 1;
        if (!isLeapYear(year)) {
            if (month == 2) {
                if (day == 29) {
                    day = 28;
                }
            }
        }
        return this;
    }
}