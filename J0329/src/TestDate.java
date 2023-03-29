/**
 * @Author Shamrock
 * @Date 2023/3/29 23:08
 * @description: .
 * @Title: TestDate
 * @Package PACKAGE_NAME
 */
public class TestDate {
    public int year;
    public int month;
    public int day;

    public void setDate(int y,int m,int d){
        year = y;
        month = m;
        day = d;
    }
    public void printDate(){
        System.out.println("year:> "+year+"  month:> "+month+"  day:> "+day);
    }

    public static void main(String[] args) {
        TestDate testDate1 = new TestDate();
        TestDate testDate2 = new TestDate();
        TestDate testDate3 = new TestDate();
        testDate1.setDate(1998,1,9);
        testDate2.setDate(1999,4,9);
        testDate3.setDate(2000,9,9);

        testDate1.printDate();
        testDate2.printDate();
        testDate3.printDate();
    }
}
