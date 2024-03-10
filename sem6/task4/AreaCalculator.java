package sem6.task4;

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        AreaCalculator areaCalculator = new AreaCalculator();
        double n = areaCalculator.calculateArea(circle);
        double r = areaCalculator.calculateArea(rectangle);

        System.out.println("Площадь окружности: " + n);
        System.out.println("Площадь прямоугольника: " + r);
    }
}


