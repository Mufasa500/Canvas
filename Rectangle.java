import java.awt.*;

public class Rectangle {
    private double height;
    private double width;
    private double yPosition;
    private double xPosition;
    private Color color;


    public Rectangle(double xPosition, double yPosition, double width, double height) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        //adding up all the widths and heights to get the perimeter of the rectangle
        double perimeter = (2 * this.width) + (2 * this.height);
        return perimeter;
    }

    public double calculateArea() {
        //multiply the width and height to get the area of the rectangle
        double area = this.width * this.height;
        return area;
    }

    public void setPos(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void setColor(Color c) {
        color = c;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getXPos() {
        return this.xPosition;
    }

    public double getYPos() {
        return this.yPosition;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public Color getColor() {
        return color;
    }
}
