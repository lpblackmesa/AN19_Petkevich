package lesson7.homework1;

public class Homework1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(1234567, "Samsung");
        Phone phone3 = new Phone(7654321, 155, "Xiaomi");
        phone1.show();
        phone2.show();
        phone3.show();
        phone1.receiveCall("Lesha");
        phone1.receiveCall("Pasha", 1231231234);
        System.out.println(phone1.getNumber());
        phone1.sendMessage(1234567, 22222222, 444444444, 55555555, 666666666);

    }
}
