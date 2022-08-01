import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        Iterable<String> name = List.of("Novin", "Ardian", "Yulianto");
        Iterator<String> iterator = name.iterator();

        while(iterator.hasNext()){
            String names = iterator.next();
            System.out.println(names);
        }



    }
}