package lesson7.l2;

public class l2 {
    public static void main(String[] args) {
        BaseConverter conv = new BaseConverter();
        BaseConverter convK = new Kconverter();
        BaseConverter convF = new Fconverter();
        int temp = 55;
        System.out.println(temp + "°C convert to " + conv.convert(temp) + "°C");
        System.out.println(temp + "°C convert to " + convK.convert(temp) + "K");
        System.out.println(temp + "°C convert to " + convF.convert(temp) + "F");
    }
}
