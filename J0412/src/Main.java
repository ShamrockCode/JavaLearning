/**
 * @Author Shamrock
 * @Date ${DATE} ${TIME}
 * @description: ${description}
 * @Title: ${NAME}
 * @Package
 */

class Student{
    public String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用了带两个参数的构造方法！");
    }

    {
        System.out.println("构造代码块！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Main {
    //静态方法的内部是不能用非静态的方法的
    //因为静态方法不依赖对象，但是非静态方法依赖对象

    //静态方法内部不能调用this
    public static void main(String[] args) {
        Student student = new Student("lisi",19);
    }

}