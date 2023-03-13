package lesson7.l2;

public class Kconverter extends BaseConverter{

    @Override
    double convert(float temp) {
        return temp + 273.15;
    }
}
