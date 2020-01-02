import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {
    public static void main(String[] args) {
        /**
         * với flat() khi ta cố gắng trải phẳng một stream gồm nhiều array thì ta chỉ nhận lại một
         * stream gồm các array, nhưng nếu sử dụng flatmap() thì ta sẽ nhận được một stream gồm các
         * phần tử trong array
         */

        List<String> arrayOfWords = new ArrayList<>();
        arrayOfWords.add("hello");
        arrayOfWords.add("world");
        System.out.println(arrayOfWords);
        Stream<String> streamOfWorld = arrayOfWords.stream();
//        streamOfWorld.map(s -> s.split(""))
//                .map(Arrays::stream).distinct()
//                .collect(Collectors.toList())
//                .forEach(p-> System.out.println(p));

        streamOfWorld.map(s -> s.split(""))
                .flatMap(Arrays::stream).distinct()
                .collect(Collectors.toList())
                .forEach(p-> System.out.println(p));
    }
}
