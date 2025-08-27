package C4_design_patterns.creational.Factory;

// ShapeFactory.java
public class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("rectangle")) return new Rectangle();
        return null;
    }
}
