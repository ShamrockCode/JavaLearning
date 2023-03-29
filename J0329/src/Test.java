/**
 * @Author Shamrock
 * @Date 2023/3/29 17:58
 * @description: 面向对象
 * @Title: Test
 * @Package PACKAGE_NAME
 */

class WashMachine{
    //字段/属性 成员属性 或者成员变量
    public String brand;
    public String type;
    public double weight;
    public double length;
    public double width;
    public double height;
    public String color;

    //成员方法
    public void washClothes(){ // 洗衣服
        System.out.println("洗衣功能");
    }
    public void dryClothes(){ // 脱水
        System.out.println("脱水功能");
    }
    public void setTime(){ // 定时
        System.out.println("定时功能");
    }
}
public class Test {
    public static void main(String[] args) {
        WashMachine washMachine1 = new WashMachine();
        washMachine1.brand = "小天鹅";
        System.out.println(washMachine1.brand);

        WashMachine washMachine2 = new WashMachine();
        washMachine1.brand = "小狗";
        System.out.println(washMachine1);
        int a = 10;
    }
}
