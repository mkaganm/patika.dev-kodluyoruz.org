import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        float kdv;
        float priceTax, price;

        System.out.print("PRICE:");
        price = input.nextFloat();

        if (price>= 0 && price <= 1000){
            kdv = 0.18F;
            priceTax = price * kdv;
            System.out.println("PRICE:" + price + "\tTAX:" + priceTax );
            System.out.println("PRICE WITH TAX:" + (price + priceTax));

        } else if (price > 1000) {
            kdv = 0.08F;
            priceTax = price * kdv;
            System.out.println("PRICE:" + price + "\tTAX:" + priceTax );
            System.out.println("PRICE WITH TAX:" + (price + priceTax));

        } else {
            System.out.println("ERROR?!?");
        }
    }
}
