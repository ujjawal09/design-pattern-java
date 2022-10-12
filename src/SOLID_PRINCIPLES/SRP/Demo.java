package SOLID_PRINCIPLES.SRP;

/**
 * @author DELLr
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        Journal j=new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);
        Persistence persistence= new Persistence();
        String fileName="E:\\temp";
        persistence.save(j, fileName,true);
        Runtime.getRuntime().exec("notepad.exe "+fileName);


    }
}
