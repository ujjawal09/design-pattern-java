package SOLID_PRINCIPLES.SRP;
/**
 * @author DELLr
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries= new ArrayList<>();
    private static int count=0;
    public void addEntry(String text){
        entries.add(""+(++count)+":"+text);
    }
    public void removeEntry(int index){
      entries.remove(index);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "entries=" + entries +
                '}';
    }
    //adding few more functionality
    //as save jounal in a file
    //loadig a journal
    public void save(String filename)throws FileNotFoundException {
        try(PrintStream out= new PrintStream(filename)){
            out.println(toString());
        }
    }
    public void load(String fileName){}
    public void load(URL url){};
    // So this the violation SRP
    //instead of implementing this persistence functionality here, we can create a persistence class
    // and move this functionality to that class


}
