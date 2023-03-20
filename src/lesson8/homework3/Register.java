package lesson8.homework3;

public class Register {
    Document arr_register[] = new Document[10];
    private int count = 0;

    public void Save(Document contract) {
        if (count < 10) {
            arr_register[count] = contract;
            count++;
        } else System.out.println("No room for new document!");
    }

    public int print(int number) {
        for (int i = 0; i < 10; i++) {
            if (arr_register[i] == null) {
                continue;
            } else if (arr_register[i].getNumber() == number) {
                arr_register[i].Show();
                return i;
            }
        }
        return -1;
    }
}


