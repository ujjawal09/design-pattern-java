package SOLID_PRINCIPLES.OCP;

import SOLID_PRINCIPLES.OCP.Enums.Color;
import SOLID_PRINCIPLES.OCP.Enums.Size;

/**
 * @author DELLr
 */
public class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
