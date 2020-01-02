import lombok.Getter;
import lombok.Setter;

public class FactoryMethod {
    /**
     * constructor là phương thức xây dựng trạng thái ban đầu của một instance
     * constructor nếu không khai báo tường minh thì sẽ được cài đặt mặc định
     * constructor không có kiểu trả về vè tên trùng với tên class
     * constructor được gọi ngầm khi khởi tạo instance với từ khóa "new"
     */

    @Getter @Setter
    private int x;
    @Getter @Setter
    private int y;

    /**
     * constructor thông thường
     */
    public FactoryMethod(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Static Factory Method là phương thức khởi tạo thông qua một static method
     * giống như một static method thông thường
     */
    public static FactoryMethod getFactoryMethod(int x, int y){
        return new FactoryMethod(x,y);
    }
}
