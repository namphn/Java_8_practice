import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorFactory {
    /**
     * Java 8 bổ sung thêm optional giúp tối ưu code hơn với một số phương thức của nó
     * ta không cần dùng đến if else nữa. trong code dưới đây sử dụng ofNullable trả vể giá trị
     * nếu không null. so với thông thường sử dụng if(operation!= null)
     */
    static Map<String, FactoryClass.Operation> operationMap = new HashMap<>();

    static {
        operationMap.put("add", new FactoryClass.Addition());
        operationMap.put("divide", new FactoryClass.Subtraction());
        operationMap.put("multiply", new FactoryClass.Multiplication());
        operationMap.put("subtract", new FactoryClass.Division());
    }
    public static Optional<FactoryClass.Operation> getOperation(String operation){
        return Optional.ofNullable(operationMap.get(operation));
    }

    /**
     * với cùng một phương thức apply trong interface, ta cài đặt được 4 phương thức tính toán
     * thay vì phải làm ra cái hàm tính toán với 3 đối số truyền vào là a,b, và phép tính "add",
     * "divide", "multiply", "subtract" rồi thực hiện 4 lệnh if else thi đơn giản hơn đưa cả 4
     * phép toán vào map, đặt key cho nó. (mỗi một phép toán là 1 class với một method tính toán) sau đó
     * sử dụng get() của map để lấy ra class tương ứng với phép tính truyền vào
     * Cuối cùng chỉ cần call method của nó ra là xong
     * @param a
     * @param b
     * @param operator
     * @return
     */
    public static int calculateUsingFactory(int a, int b, String operator) {
        FactoryClass.Operation targetOperation = OperatorFactory
                .getOperation(operator)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a, b);
    }
    public static void main(String[] args) {
        System.out.println(calculateUsingFactory(5,5,"add"));
    }
}
