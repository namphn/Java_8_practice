import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reference {

    /**
     * tham chiếu và tham trị trong java.
     * Mặc định các kiểu dữ liệu nguyên thủy trong java khi được truyền vào method là
     * truyền tham trị (truyền giá trị) biến nguyên thủy được lưu trữ trong stack, khi
     * được truyền vào phương thức, stack tạo ra bản sao và truyền vào. khi thực hiện
     * thay đổi trong phương thức thì dữ liệu trên bản gốc không bị thay đổi.
     *
     * ngược lại với object. object được lưu trong heap, và khi truyền vào method thì nó
     * là truyền tham chiếu chứ không phải truyền giá trị.
     */

    /**
     * truyền bản sao của a chứ không truyền tham chiếu đến a.
     * @param a
     */
    static void modify(int a){
        a = 0;
    }

    /**
     * một wrapper khi được truyền vào method, vì bản thân nó cũng là một object nên sẽ truyền tham
     * chiếu, nhưng đối với mỗi tham chiếu nó tạo ra bản sao trong stack và truyền vào.
     * mỗi thay đổi với object được truyền vào, nó tạo ra object khác trong heap và bản sao tham chiếu
     * kia chiếu đến nó, cho nên đối tượng gốc không bị thay đổi.
     */



    /**
     * đối với object (ngoại trừ wrapper) khi được truyền như một đối số thì nó tạo ra bản sao tham chiếu
     * tham chiếu đến đúng đối tượng được truyền vào, khi thực hiện thay đổi trên tham chiếu này, nó trực
     * tiếp thay đổi đến đối tượng đó và phản ánh qua tham chiếu gốc.
     * @param arr
     */
    public static void objectmodify(List<Integer> arr){
        arr.add(100);
    }

    /**
     * Immutable Object là object không thay đổi được giá trị khi đã khởi tạo, chí có cách là xóa và khởi
     * tạo lại object. ví dụ immutable là String còn mutable là Buffer String và Builder String
     * hoặc có thể tạo ra class immutable bằng cách chỉ có getter method mà không có setter.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * biến a không thay đổi
         */
        int a = 10;
        Integer integer = new Integer(10);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);

        System.out.println("a before modification: " + a);
        Reference.modify(a);
        System.out.println("a after modification: " + a);

        /**
         * Interger là một wrapper và không thay đổi giá trị khi truyền vào method modify
         */

        System.out.println("integer before modification: " + a);
        Reference.modify(integer);
        System.out.println("integer after modification: " + a);

        /**
         * truyền vào một list
         */
        System.out.println("list before modification: " + list);
        Reference.objectmodify(list);
        System.out.println("list after modification: " + list);


    }
}
