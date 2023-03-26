import java.awt.*;

public class Triangle {

    private double width;
    private double height;
    private double xPosition;
    private double yPosition;
    private Color color;


    public Triangle(double xPosition, double yPosition, double width, double height) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        //In order to get the length of the two long isosceles sides we first split
        //up the triangle in half and find the unknown hypotenuse or side B
        //to that we can find the perimeter with the formula P = 2B + A where B is the hypo
        //and A is the width or short side on the bottom
        double hypo = Math.sqrt((width/2) * (width/2)) + (height * height);
        double perimeter = (2 * hypo) + width;
        return perimeter;
    }


    public double calculateArea() {
        // multiply the width and the height and divide by 2 to get the area
        double area = (this.width * this.height) / 2;
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
