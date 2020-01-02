import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;

public class CommandPattern {
    /**
     * cách thứ 2 để loại bỏ if else lồng nhau là sử dụng tính trừu tượng trong java
     * từ một interface command có phương thức execute. dùng 4 class implement nó để
     * cài đặt 4 phương thức tính toán + - * /
     * sau đó dùng một method để gọi đến 4 class đó, tùy vào người dùng truyền vào instance
     * của class nào thì sẽ tính theo phương thức tính toán đó
     */
    public interface Command {
        int execute();
    }

    public static class Addition implements Command {
        private int a;
        private int b;

        public Addition(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Constructor
        @Override
        public int execute() {
            return a + b;
        }
    }

    public class Subtraction implements Command {
        private int a;
        private int b;
        @Constructor

        @Override
        public int execute() {
            return a - b;
        }
    }

    public class Multiplication implements Command {
        private int a;
        private int b;
        @Constructor

        @Override
        public int execute() {
            return a * b;
        }
    }

    public class Division implements Command {
        private int a;
        private int b;
        @Constructor
        @Override
        public int execute() {
            return a / b;
        }
    }

    public static class Caculator{
        @Constructor
        public int caculate(Command command){
            return command.execute();
        }
    }


    public static void main(String[] args) {
        System.out.println(new CommandPattern.Caculator().caculate(new Addition(4,5)));
    }
}
