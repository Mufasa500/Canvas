import java.awt.Color;

public class Circle {
    private double xPosition;
    private double yPosition;
    private double radius;
    private Color color;

    public Circle(double  xPosition, double yPosition, double radius ) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.radius = radius;
    }

    public double calculatePerimeter() {
        //multiply the radius with 2 and pie to get the perimeter of the circle
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    public double calculateArea() {
        //square the radius and multiply by pie to get the area of the circle
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    public void setPos(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;

    }

    public void setColor(Color c) {
        color = c;
    }

    public void setRadius(double Radius) {
        this.radius = Radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getXPos() {
        return this.xPosition;
    }

    public double getYPos() {
        return this.yPosition;
    }

    public Color getColor() {
        return color;
    }



}
