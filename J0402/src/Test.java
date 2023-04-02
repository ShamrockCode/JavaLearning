/**
 * @Author Shamrock
 * @Date 2023/4/2 15:06
 * @description:
 * @Title: Test
 * @Package PACKAGE_NAME
 */
class Student{
    public String name;
    public int age;

    public Student(){
        System.out.println("sham");
    }
    //一个对象的产生至少有以下两步：
    //1.为对象分配内存
    //2.调用合适的构造方法


    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("调用带两个参数的构造方法");
    }


    public void doClass() {
        System.out.println(this.name + "  上课！");
    }

    public void print(){
        System.out.println("姓名： "+this.name+"年龄： "+this.age);
    }

}
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.age = 10;
        student.doClass();

        System.out.println("=============");
        Student student2 = new Student("里斯",19);
        student2.doClass();
    }
}
