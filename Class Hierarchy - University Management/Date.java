public class Date {

    private int intDate;
    private int intMonth;
    private int intYear;    

    Date(int d, int m, int y) {
        this.intDate = d;
        this.intMonth = m;
        this.intYear = y;
    }

    public String getDate() {
        return this.intDate + "-" + this.intMonth + "-" + this.intYear;
    }


}
