/**
  Represent a date
 */
public class Date{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }
    
    public int compareTo (Date otherDate) {;
        int thisValue = this.y *365 + this.m * 30 + this.d;
        int otherValue = otherDate.y * 365 + otherDate.m * 30 + otherDate.d;
        if (thisValue > otherValue) {
            return 1;
        }
        else if (otherValue > thisValue) {
            return -1;
        }
        return 0;
    }

}