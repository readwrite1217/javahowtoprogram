package Chapter8;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int length, int breadth) {
        this.setLength(length);
        this.setBreadth(breadth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0.0 || length >= 20.0)
            throw new IllegalArgumentException("length must be 0-20");

        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        if (breadth <= 0.0 || breadth >= 20.0)
            throw new IllegalArgumentException("width must be 0-20");

        this.breadth = breadth;
    }
}

class RecTangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);
//        rectangle.setLength(20);
//        rectangle.setBreadth(10);
//        rectangle.setBreadth(30);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreadth());
    }


}
