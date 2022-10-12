package SOLID_PRINCIPLES.OCP.Interface.impl;

import SOLID_PRINCIPLES.OCP.Enums.Size;
import SOLID_PRINCIPLES.OCP.Interface.Specification;
import SOLID_PRINCIPLES.OCP.Product;

/**
 * @author DELLr
 */
public class SizeSpecification implements Specification<Product> {

    public Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
      if(item.size==size)
          return true;
      return false;
    }
}
