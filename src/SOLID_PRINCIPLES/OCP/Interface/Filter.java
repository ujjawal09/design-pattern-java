package SOLID_PRINCIPLES.OCP.Interface;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author DELLr
 */
public interface Filter<T> {
Stream<T> filter(List<T> items, Specification<T> spec);
}
