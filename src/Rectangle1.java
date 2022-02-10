public class Rectangle1 {
    double width, height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return (this.height + this.width)*2;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
