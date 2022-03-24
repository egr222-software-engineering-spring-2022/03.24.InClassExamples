package comparable;

//Make this code implement Comparable interface
public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;
    
    public CalendarDate(int year, int month, int day) {
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
    
    public String toString() {
        return year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);
    }
    
// YOUR CODE GOES HERE
    @Override
    public int compareTo(CalendarDate other) {
        if (this.year == other.year) {
            // years are the same
            if (this.month == other.month) {
                // year and month are the same
                return this.day - other.day;
            }
            return this.month - other.month;
        }
        return this.year - other.year;
    }
}