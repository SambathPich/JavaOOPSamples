class InterfaceSample {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        shape1.draw();
        shape2.draw();
        
    }
}

interface Shape {
    public void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle");
    }
}