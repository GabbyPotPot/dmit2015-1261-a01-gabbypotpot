package dmit2015.model;

public class Rectangle {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0) {
            throw new IllegalArgumentException("Width must be a positive non-zero number");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0) {
            throw new IllegalArgumentException("Length must be a positive non-zero number");
        }
        this.length = length;
    }

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public double area() {
        return length * width;
    }

    static void main (String [] args) {

        Rectangle currentRectangle = new Rectangle();

        currentRectangle .setLength(5.7);
        currentRectangle .setWidth(5);

        System.out.printf("Length: %.2f, Width: %.2f, Area: %.2f\n",
                currentRectangle.getLength(),
                currentRectangle.getWidth(),
                currentRectangle.area());

    }
}
