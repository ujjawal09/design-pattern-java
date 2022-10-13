package SOLID_PRINCIPLES.LSP;

import javax.swing.*;

/**
 * @author DELLr
 */
public class Demo {

    public static void useIt(Rectangle rt){
        int width=rt.getWidth();
        rt.setHeight(10);
        System.out.println("Expected Area: "+width*10 +" | calculated : "+rt.getArea());
    }
    public static void main(String[] args) {
    Rectangle rc=new Rectangle(2,3);
    useIt(rc);// Expected and calclated  matches
    Rectangle sq= new Square();
    sq.setWidth(5);
    useIt(sq); //Expected and calculated doesn't match
        //Here it violates the Lskon Principle



    }
}
