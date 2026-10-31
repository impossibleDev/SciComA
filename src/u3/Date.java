package u3;

public class Date {
    
    //DATABASE
    public enum outputFormat { MMDDYY, STRNYY, DDDYYYY };
    String[] monthData = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int[] monthLengthData = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    
    private int month, day, year;


    // @Override 
    public String toString(outputFormat format){
        switch (format){
            case MMDDYY -> {
                return String.valueOf(month)+"/"+
                String.valueOf(day)+"/"+String.valueOf(year);
            }
            case STRNYY -> {
                return monthData[month]+" "+
                String.valueOf(day)+", "+String.valueOf(year);
            }
            case DDDYYYY -> {
                int dayOfYear = 0;
                for (int i=1; i<month; i++){
                    dayOfYear+=monthLengthData[i];
                }
                dayOfYear+=day;
                return String.valueOf(dayOfYear)+" "+
                String.valueOf(year);
            }
        }
        return "";
    }
    public int getMonth() {return month;}
    public int getDay() {return day;}
    public int getYear() {return year;}

    public void setMonth(String month){
        boolean monthValid = false;
        for (int i=1; i<=12; i++){
            if (month.equals(monthData[i])){
                this.month=i;
                monthValid = true;
                break;
            }
        }

        if (!monthValid)
            throw new IllegalArgumentException("Invalid Month " + month);
    }
    public void setMonth(int month){
        if (month>0 && month<=12)
            this.month = month;
        else
            throw new IllegalArgumentException("Invalid Month " + month);
    }
    public void setDay(int day){
        if (day>0 && day<=monthLengthData[month])
            this.day = day;
        else
            throw new IllegalArgumentException("Invalid Day " + day);
    }

    public void setYear(int year){
        if (year>=0)
            this.year = year;
        else
            throw new IllegalArgumentException("Invalid Year " + year);
    }

    public Date(){
        this(1,1,2000);
    }

    public Date(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public Date(String month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public Date(int dayInYear, int year){
        if (dayInYear>365)
            throw new IllegalArgumentException("Invalid DayInYear " + dayInYear);

        int month = 1;
        while (dayInYear>monthLengthData[month]){
            dayInYear-=monthLengthData[month];
            month++;
        }
        setMonth(month);
        setDay(dayInYear);
        setYear(year);
    }
    
}
