package SOLID_PRINCIPLES.LSP;

/**
 * @author DELLr
 */
public class Square extends Rectangle{
    public Square(){}
    public Square(int size){
        height= width =size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
