package src.data_structure.generic;


import src.data_structure.generic.shape.Circle;
import src.data_structure.generic.shape.ShapeContainer;

public class GenericDemo {
    public static void main(String[] args) {
        ShapeContainer<Circle> container = new ShapeContainer<>();
        container.add(new Circle(2.0));
        container.add(new Circle(3.0));
        container.add(new Circle(1.0));
        System.out.println(container.totalArea());

        container.printAll();
        container.sort();
        System.out.println("---");
        container.printAll();
    }
}
