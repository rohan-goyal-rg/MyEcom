package model;

import java.util.Objects;

public class Product {
    String name,image;

    //parameterized constructor
    public Product(String name, String image) {
        this.name = name;
        this.image = image;

    }

    //Overrides equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(image, product.image);
    }

    //Overrides hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(name, image);
    }

    //Overrides toString() method
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
