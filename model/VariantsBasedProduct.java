package model;
import java.util.List;

public class VariantsBasedProduct extends Product {
    List<Variant> variants;

    public VariantsBasedProduct(String name, String image, List<Variant> variants) {
        super(name, image);
        this.variants = variants;
    }

    //Overrides toString() method
    @Override
    public String toString() {
        return "VariantsBasedProduct{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", variants=" + variants +
                '}';
    }
}
