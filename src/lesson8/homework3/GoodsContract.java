package lesson8.homework3;

import java.util.Date;

public class GoodsContract extends Document {
    private String productType;
    private int countProduct;

    public GoodsContract() {
        this.countProduct = (int) (Math.random() * 10);
        this.productType = "Standart";
    }

    public GoodsContract(int number, Date data_doc, String productType, int countProduct) {
        super(number, data_doc);
        this.productType = productType;
        this.countProduct = countProduct;
    }

    public void Show() {
        System.out.printf("productType: %s \n countProduct: %d \n", productType, countProduct);
        System.out.println(super.GetDocInfo());
    }
}
