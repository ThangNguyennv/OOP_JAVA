package lab5.mytime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if( (this.hour >= 0 && this.hour <= 23) && (this.minute >= 0 && this.minute <= 59)
                && (this.second >= 0 && this.second <= 59) ){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else{
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    public MyTime nextSecond() {
        if(hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
            return this;
        }
        if(minute == 59 && second == 59) {
            minute = 0;
            second = 0;
            hour++;
            return this;
        }
        if(second == 59) {
            second = 0;
            minute++;
            return this;
        }
        second++;
        return this;
    }

    public MyTime nextMinute() {
        if(hour == 23 && minute == 59) {
            hour = 0;
            minute = 0;
            return this;
        }
        if(minute == 59) {
            minute = 0;
            hour++;
            return this;
        }
        minute++;
        return this;
    }

    public MyTime nextHour() {
        if(hour == 23) {
            hour = 0;
            return this;
        }
        hour++;
        return this;
    }

    public MyTime previousSecond() {
        if(hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return this;
        }
        if(minute == 0 && second == 0) {
            minute = 59;
            second = 59;
            hour--;
            return this;
        }
        if(second == 0) {
            minute--;
            second = 59;
            return this;
        }
        second--;
        return this;

    }

    public MyTime previousMinute() {
        if(hour == 0 && minute == 0){
            hour = 23;
            minute = 59;
            return this;
        }
        if(minute == 0){
            minute = 59;
            hour--;
            return this;
        }
        minute--;
        return this;
    }

    public MyTime previousHour() {
        if(hour == 0) {
            hour = 23;
            return this;
        }
        hour--;
        return this;
    }

    public String toString() {
        // Sử dụng Toán tử 3 ngôi + String.valueOf() để chuyển 1 giá trị thành chuỗi
        String hourStr = (hour < 10) ? "0" + hour : String.valueOf(hour);
        String minuteStr = (minute < 10) ? "0" + minute : String.valueOf(minute);
        String secondStr = (second < 10) ? "0" + second : String.valueOf(second);
        return hourStr + ":" + minuteStr + ":" + secondStr;
    }
}
