package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String ortaMetin = "İlginizi çekebilir";

        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun<dolarDun)

        {
            okYonu = "down.svg";

            System.out.println(okYonu);

        } else if (dolarDun<dolarBugun)

        {
            okYonu = "up.svg";

            System.out.println(okYonu);

        }

        else

        {   okYonu = "equal.svg";

            System.out.println(okYonu);

        }

        String kredi1 = "Hızlı Kredi";
        String kredi2 = "Kredi X";
        String kredi3 = "Kredi Y";

        String[] krediler = {"Hızlı Kredi", "Kredi X", "Kredi Y"};

        for (int i=0;i<krediler.length;i++) {

            System.out.println(krediler[i]);

        }

        Product product1 = new Product();

        product1.setName("Delonghi Kahve Makinesi");

        product1.setDiscount(7);

        product1.setUnitPrice(7500);

        product1.setUnitsInStock(3);

        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();

        product2.setName("Smeg Kahve Makinesi");

        product2.setDiscount(7);

        product2.setUnitPrice(7500);

        product2.setUnitsInStock(3);

        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();

        product3.setName("Kitchen Aid Kahve Makinesi");

        product3.setDiscount(7);

        product3.setUnitPrice(7500);

        product3.setUnitsInStock(3);

        product3.setImageUrl("image3.jpg");

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");

        for (Product product: products) {

            System.out.println("<li>" + product.getName() + "</li>");
        }

        System.out.println("<ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();

        individualCustomer.setId(1);

        individualCustomer.setPhone("05222222222");

        individualCustomer.setCustomerNumber("12345");

        individualCustomer.setFirstName("Engin");

        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer  corporateCustomer = new CorporateCustomer();

        corporateCustomer.setId(2);

        corporateCustomer.setCompanyName("kodlama.io");

        corporateCustomer.setPhone("05333333333");

        corporateCustomer.setTaxNumber("1111111111");

        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}