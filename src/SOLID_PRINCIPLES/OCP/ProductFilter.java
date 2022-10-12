package SOLID_PRINCIPLES.OCP;

import SOLID_PRINCIPLES.OCP.Enums.Color;
import SOLID_PRINCIPLES.OCP.Enums.Size;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author DELLr
 */
public class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color){
       return  products.stream().filter(p->{
            return p.color==color;
        });
    }
    public Stream<Product> filterBySize(List<Product> products, Size size){
        return  products.stream().filter(p->{
            return p.size==size;
        });
    }
    public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color){
        return  products.stream().filter(p->{
            return (p.size==size && p.color==color);
        });
    }

}
