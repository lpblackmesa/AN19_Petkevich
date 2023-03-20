package lesson8.homework3;

import java.util.Date;

public abstract class Document {
    private static int count = 0;
    private int number;
    private Date data_doc = new Date();

    public Document() {
        number = count;
        count++;
    }

    public Document(int number, Date data_doc) {
        this.number = number;
        this.data_doc = data_doc;
    }

    public abstract void Show();

    public String GetDocInfo() {
        return "Document number - " + number + "\n Document Date - " + data_doc + "\n";
    }

    public int getNumber() {
        return number;
    }
}

