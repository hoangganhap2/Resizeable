public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double side){
        this.width = width ;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double side){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public  double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + "and height = "
                + getHeight()
                +" , which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        this.height = height * 0.05;
        this.width = width * 0.05;
    }
}
