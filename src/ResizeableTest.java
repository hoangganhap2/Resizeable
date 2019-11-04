public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5, "indigo", false);
        shapes[1] = new Rectangle(2.5, 3.8, "orange", true);
        shapes[2] = new Square(5.8, "yellow", true);
        System.out.println(((Circle) shapes[0]).toString());
        ((Circle) shapes[0]).resize((double) Math.random());
        System.out.println(((Circle) shapes[0]).toString());
        System.out.println(((Rectangle) shapes[1]).toString());
        ((Rectangle) shapes[1]).resize((double) Math.random());
        System.out.println(((Rectangle) shapes[1]).toString());
        System.out.println(((Square) shapes[2]).toString());
        ((Square) shapes[2]).resize((double) Math.random());
        System.out.println(((Square) shapes[2]).toString());
    }
}
