package SOLID_PRINCIPLES.OCP.Interface;

/**
 * @author DELLr
 */
public interface Specification<T> {
boolean isSatisfied(T item);
}
