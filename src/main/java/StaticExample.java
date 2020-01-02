import lombok.Getter;
import lombok.Setter;

public class StaticExample {

    /**
     * Từ khóa static cho phép định nghĩa một biến, phương thức tĩnh.
     *     Những biến, phương thức này không phụ thuộc vào instance mà đi theo
     *     class luôn. khi gọi biến, phương thức này chỉ cần gọi tên class và
     *     chấm đến biến, phương thức mà thôi.
     * biến static thì được lưu một lần.
     */



    @Getter
    @Setter
    private int a;
    public static double PI = 3.14;

    /**
     * một static method không được sử dụng đến biến thông thường
     * phụ thuộc vào instance
     */
//    public static double exampleStaticMethod(){
//        return this.PI*this.a;
//    }


    /**
     * khối static được thực thi trước khi hàm main chạy
     * thường được dùng để khởi tạo biến static
     */
    static {
        StaticExample.PI = 3.1456;
        System.out.println("Static block");
    }

    /**
     * ví dụ về một static method
     */
    public static void logOutPi(){
        System.out.println(PI);
    }
    public static void main(String[] args) {

        /**
         *  gọi một biến static
         */
        System.out.println(StaticExample.PI);


        /**
         * gọi một static method
         */
        StaticExample.logOutPi();
    }
}
