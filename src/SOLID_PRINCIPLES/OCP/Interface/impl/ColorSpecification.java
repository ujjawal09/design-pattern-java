package SOLID_PRINCIPLES.OCP.Interface.impl;

import SOLID_PRINCIPLES.OCP.Enums.Color;
import SOLID_PRINCIPLES.OCP.Interface.Specification;
import SOLID_PRINCIPLES.OCP.Product;

/**
 * @author DELLr
 */
public class ColorSpecification implements Specification<Product> {
    Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color==color;
    }
}
