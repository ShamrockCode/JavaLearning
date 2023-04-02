/**
 * @Author Shamrock
 * @Date ${DATE} ${TIME}
 * @description: ${description}
 * @Title: ${NAME}
 * @Package
 */
public class Main {
    //构造方法：方法名（参数列表） {方法体;}
    //没有返回值的方法，并且方法名必须和类名保持一致

    public int year;
    public int month;
    public int day;

    public Main(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("调用构造方法!");
    }

    public void printDate(){
        System.out.println(year + "-" + month + "-" + day);
    }

    public static void main(String[] args) {
        Main data = new Main(2022,11,13);
        data.printDate();
    }
}