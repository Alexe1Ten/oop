package sem6.task4;

class Circle implements Shape {
    private double radius;
    
    public Circle(double rad) {
        this.radius = rad;
    }
    
    public double getRadius() {
        return radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
