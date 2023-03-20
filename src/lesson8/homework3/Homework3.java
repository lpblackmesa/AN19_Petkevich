package lesson8.homework3;

import java.util.Date;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Register register = new Register();
        EmployeeContract e_contract = new EmployeeContract();
        register.Save(e_contract);
        FinancialContract f_contract = new FinancialContract();
        register.Save(f_contract);
        GoodsContract g_contract = new GoodsContract();
        register.Save(g_contract);
        EmployeeContract e_contract2 = new EmployeeContract(3, new Date(65434565434l), "Vova", new Date(998786555654l));
        register.Save(e_contract2);
        FinancialContract f_contract2 = new FinancialContract(4, new Date(85634565434l), 88, "MAIN");
        register.Save(f_contract2);
        GoodsContract g_contract2 = new GoodsContract(5, new Date(75634565434l), "WWW", 4);
        register.Save(g_contract2);
        System.out.println("Please, write number of document");
        Scanner scanner = new Scanner(System.in);
        if (register.print(scanner.nextInt()) == -1) {
            System.out.printf("not found");
        }
        ;

    }
}
