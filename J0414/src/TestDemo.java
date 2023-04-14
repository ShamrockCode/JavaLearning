/**
 * @Author Shamrock
 * @Date 2023/4/14 21:04
 * @description:
 * @Title: TestDemo
 * @Package PACKAGE_NAME
 */

class Animal{
    public String name;
    public int age;

    public void eat(){
        System.out.println(this.name + "正在吃饭！");
    }
}
class Dog extends Animal{
    //public String name;
    //public int age;
    //
    //public void eat(){
    //    System.out.println(this.name + "正在吃饭！");
    //}
    public void bark(){
        System.out.println(this.name + "正在汪汪汪！");
    }
}

class Cat extends Animal{
    //public String name;
    //public int age;
    //
    //public void eat(){
    //    System.out.println(this.name + "正在吃饭！");
    //}
    public void mimi(){
        System.out.println(this.name + "正在喵喵喵！");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 10;
        dog.name = "小灰灰";
        dog.eat();
        dog.bark();
        System.out.println("===============");
        Cat cat = new Cat();
        cat.age = 11;
        cat.name = "小白";
        cat.eat();
        cat.mimi();
    }
}
