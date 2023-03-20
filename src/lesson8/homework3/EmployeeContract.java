package lesson8.homework3;

import java.util.Date;

public class EmployeeContract extends Document {
    private String name;
    private Date endDate = new Date();

    public EmployeeContract() {
        Date endDate = new Date();
        name = "Vasya";
    }

    public EmployeeContract(int number, Date data_doc, String name, Date endDate) {
        super(number, data_doc);
        this.name = name;
        this.endDate = endDate;
    }

    public void Show() {
        System.out.printf("Name of Employee: %s \n Date of ending: %s \n", name, endDate);
        System.out.println(super.GetDocInfo());
    }
}
