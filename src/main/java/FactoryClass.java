public class FactoryClass {
    public interface Operation {
        int apply(int a, int b);
    }
    public static class Addition implements Operation{

        @Override
        public int apply(int a, int b) {
            return a+b;
        }
    }
    public static class Subtraction implements Operation{

        @Override
        public int apply(int a, int b) {
            return a-b;
        }
    }
    public static class Multiplication implements Operation{

        @Override
        public int apply(int a, int b) {
            return a*b;
        }
    }
    public static class Division implements Operation{

        @Override
        public int apply(int a, int b) {
            return a/b;
        }
    }


}
