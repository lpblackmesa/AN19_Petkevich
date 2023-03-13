package lesson7.l2;

public class Fconverter extends BaseConverter {
    @Override
    double convert(float temp) {
        return temp * 1.8 + 32;
    }
}
