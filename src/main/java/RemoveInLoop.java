import java.util.ArrayList;
import java.util.Iterator;

public class RemoveInLoop {
    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList<String>();
        listName.add("Example1");
        listName.add("Example2");
        listName.add("Example3");

        /**
         * không thể dùng remove trong vòng lặp với collector
         */
//        for(String name : listName){
//            System.out.println(name);
//            listName.remove(name);
//        }

        /**
         * Thay vào đó sẽ dùng Iterator
         * Iterator cũng là một collector
         */
        Iterator<String> i = listName.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
            i.remove();
        }
    }
}
