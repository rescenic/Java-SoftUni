package Shapes;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        return height * 2 + width * 2;
    }

    @Override
    public Double calculateArea() {
        return width * height;
    }

    public final Double getHeight() {
        return height;
    }

    public final Double getWidth() {
        return width;
    }
}
