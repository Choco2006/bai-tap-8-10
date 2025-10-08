import java.util.ArrayList;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

abstract class Shape {
    protected Point centerPoint;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public abstract String getInfo();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point centerPoint, double width, double height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getInfo() {
        return "Rectangle - Tâm: " + centerPoint + ", Rộng: " + width + ", Cao: " + height;
    }
}

class Square extends Shape {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint);
        this.side = side;
    }

    @Override
    public String getInfo() {
        return "Square - Tâm: " + centerPoint + ", Cạnh: " + side;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    @Override
    public String getInfo() {
        return "Circle - Tâm: " + centerPoint + ", Bán kính: " + radius;
    }
}

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Khởi tạo các hình
        shapes.add(new Rectangle(new Point(2, 3), 4, 6));
        shapes.add(new Square(new Point(0, 0), 5));
        shapes.add(new Circle(new Point(1, 1), 3));

        // 1. Số lượng hình
        System.out.println("Số lượng hình đã khởi tạo: " + shapes.size());

        // 2. Danh sách chi tiết
        System.out.println("\nDanh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(s.getInfo());
        }

        // 3. Danh sách tâm điểm
        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}
