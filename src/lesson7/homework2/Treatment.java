package lesson7.homework2;
import java.util.Random;

public class Treatment {
    private int code;
    Random random = new Random();
    public Treatment() {
        this.code = random.nextInt(3);
    }

    public int getCode() {
        return code;
    }
}
