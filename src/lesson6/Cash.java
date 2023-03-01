package lesson6;

public class Cash {
    int cash_20 = 10, cash_50 = 10, cash_100 = 10;

    Cash(){

    }

    Cash(int cash_20, int cash_50, int cash_100) {
        this.cash_20 = cash_20;
        this.cash_50 = cash_50;
        this.cash_100 = cash_100;
    }

    void addMoney(int cash_20, int cash_50, int cash_100) {
        this.cash_20 += cash_20;
        this.cash_50 += cash_50;
        this.cash_100 += cash_100;
    }

    boolean getMoney(int summ) {
        CheckCash check = new CheckCash();

        if (summ % 20 != 0) {
            System.out.println("Summ is not valid");
            return false;
        } else if (summ % 100 == 0) {
            check.CheckCashInit(cash_20,cash_50,cash_100,summ);
            System.out.println(check.c20);
        }
        return true;
    }

}

class CheckCash {
    int remain, c20, c50, c100;


    boolean CheckCashInit(int cash20, int cash50, int cash100, int summ) {
        if ( summ / 100<= cash100 ) {
            System.out.println(summ / 100 + " 100 bills");
            c20= summ / 100;
            return true;
        } else {
            remain = summ - cash100 * 100;
            System.out.println(cash100 + " 100 bills");

            if (remain / 50 <= cash50) {
                System.out.println(remain / 50 + " 50 bills");
                return true;
            } else {
                remain -= cash50 * 50;
                System.out.println(cash50 + " 50 bills");
                if (remain / 20 <= cash20) {
                    System.out.println(remain / 20 + " 20 bills");
                    return true;
                } else {
                    System.out.println("Not enought cash, sorry");
                    return false;
                }

            }

        }
    }
}


