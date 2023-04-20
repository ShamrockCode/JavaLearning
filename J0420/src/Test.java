/**
 * @Author Shamrock
 * @Date 2023/4/20 21:44
 * @description:
 * @Title: Test
 * @Package PACKAGE_NAME
 */

class Shape{
    public void draw(){
        System.out.println("画图形！！");
    }
}

class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀！");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("矩形！");
    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("⚪!");
    }
}

public class Test {

    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Flower flower = new Flower();
        drawMap(flower);

        Rect rect = new Rect();
        drawMap(rect);

        drawMap(new Cycle());
    }
}
