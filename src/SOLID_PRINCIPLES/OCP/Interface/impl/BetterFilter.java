package SOLID_PRINCIPLES.OCP.Interface.impl;

import SOLID_PRINCIPLES.OCP.Interface.Filter;
import SOLID_PRINCIPLES.OCP.Interface.Specification;
import SOLID_PRINCIPLES.OCP.Product;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author DELLr
 */
public class BetterFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(x->spec.isSatisfied(x));
    }
}
