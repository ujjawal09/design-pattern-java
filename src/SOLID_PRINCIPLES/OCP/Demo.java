package SOLID_PRINCIPLES.OCP;

import SOLID_PRINCIPLES.OCP.Enums.Color;
import SOLID_PRINCIPLES.OCP.Enums.Size;
import SOLID_PRINCIPLES.OCP.Interface.Specification;
import SOLID_PRINCIPLES.OCP.Interface.impl.AndSpecification;
import SOLID_PRINCIPLES.OCP.Interface.impl.BetterFilter;
import SOLID_PRINCIPLES.OCP.Interface.impl.ColorSpecification;
import SOLID_PRINCIPLES.OCP.Interface.impl.SizeSpecification;

import java.util.List;

/**
 * @author DELLr
 */
public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree",Color.GREEN,Size.MEDIUM);
        Product house = new Product("House",Color.BLUE,Size.LARGE);
        List<Product> products=List.of(apple,tree,house);
        ProductFilter pf=new ProductFilter();
        pf.filterByColor(products,Color.GREEN).forEach(x->System.out.println(x.name+" is green"));

        BetterFilter filter=new BetterFilter();
        System.out.println("Green Filter(new): ");
        filter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(x->System.out.println(x.name+" is green"));


        System.out.println("Large blue items: ");
        filter.filter(products, new  AndSpecification<Product>(new ColorSpecification(Color.BLUE) ,  new SizeSpecification(Size.LARGE)))
                .forEach(x->System.out.println(x.name+" is Blue and Large"));
    }
}
