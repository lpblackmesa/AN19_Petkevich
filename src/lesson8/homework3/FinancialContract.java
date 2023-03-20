package lesson8.homework3;

import java.util.Date;

public class FinancialContract extends Document {
    private int sum;
    private String departmentCode;

    public FinancialContract() {
        this.sum = (int) (Math.random() * 100);
        this.departmentCode = "Standart";
    }

    public FinancialContract(int number, Date data_doc, int sum, String departmentCode) {
        super(number, data_doc);
        this.sum = sum;
        this.departmentCode = departmentCode;
    }

    public void Show() {
        System.out.printf("Department: %s \n Final summ: %s \n", departmentCode, sum);
        System.out.println(super.GetDocInfo());
    }
}
