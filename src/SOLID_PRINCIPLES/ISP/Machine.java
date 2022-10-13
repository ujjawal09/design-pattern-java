package SOLID_PRINCIPLES.ISP;

import SOLID_PRINCIPLES.ISP.Document;

/**
 * @author DELLr
 */
public interface Machine {
    public  void print(Document  d);
    public  void scan(Document  d);
    public  void fax(Document  d);
}
