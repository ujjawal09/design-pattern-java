package SOLID_PRINCIPLES.ISP;

/**
 * @author DELLr
 */
public class OldFahsionedPrinter implements Machine{
    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) {

    }

    @Override
    public void fax(Document d) {

    }
// But this old Fashion printer doesn't have feature of scanning and fax
    //One option is to leave this methods empty. By doing this you are still giving option to scan/fax
    //another option is to throw some specialization exception
 //here we can segregate Machine interface to 3 different interface Printer Scanner and FaxMachine

}
