import java.util.Scanner;

/**
 * @Author Shamrock
 * @Date ${DATE} ${TIME}
 * @description: ${description}
 * @Title: ${NAME}
 * @Package
 */

//class B{
//    public B(){
//        func();
//    }
//    public void func(){
//        System.out.println("B。func()");
//    }
//}
//
//class D extends B{
//    private int num = 1;
//
//    @Override
//    public void func() {
//        System.out.println("D.func()" + num);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        D d = new D();
//    }
//}
//===============================================
//class Person{
//    private int age;
//        public void setAge(int age){
//            this.age = age;
//        }
//        public int getAge(){
//            if(this.age < 0){
//                return 0;
//            }else if(this.age > 200){
//                return 200;
//            }
//            return this.age;
//        }
//}
//public class Main {
//    public static void main(String[] args) {
//        Person p = new Person();
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()){
//            int age = scanner.nextInt();
//            p.setAge(age);
//            System.out.println(p.getAge());
//        }
//    }
//}
//===============================================

class Shape{
    public void draw()
    {
        System.out.println("画图形！");
    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

public class Main {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        drawMap(new Rect());
        drawMap(new Cycle());
    }
}
//===============================================


