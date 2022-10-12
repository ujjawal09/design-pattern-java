package SOLID_PRINCIPLES.OCP.Interface.impl;

import SOLID_PRINCIPLES.OCP.Interface.Specification;

/**
 * @author DELLr
 */
public class AndSpecification <T> implements Specification<T> {
private Specification spec1,spec2;

    public AndSpecification(Specification spec1, Specification spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    @Override
    public boolean isSatisfied(T item) {
        return spec1.isSatisfied(item) && spec2.isSatisfied(item);
    }
}
