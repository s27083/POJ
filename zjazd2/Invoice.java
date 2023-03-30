package zjazd2;

// Autor: Kamil Bogdański

// Zadanie 6 (3 punkty)
// Zaimplementuj klasę Invoice reprezentującą fakturę dla sklepu. 
// Klasa przechowuje następujące informacje: product_number (typ String), prodcut_description (typ String), quantity(typ int) i pricePerItem`(typ double). 
// Klasa powinna mieć konstruktor, który umożliwi podanie wszystkich 4 parametrów. Zaimplementuj metody set i get dla każdej zmiennej. Dodaj metodę:
// Amount, które zwraca iloczyn quantity i pricePerItem. 
// Jeżeli pricePerItem nie jest dodatnia, Amount powinien zwrócić 0. Jeżeli quantity nie jest dodatnie, Amount powinna zwrócić 0. Przetestuj zaimplementowany program.

public class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        setProductNumber(product_number);
        setProductDescription(product_description);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getProductNumber() {
        return product_number;
    }

    public void setProductNumber(String product_number) {
        this.product_number = product_number;
    }

    public String getProductDescription() {
        return product_description;
    }

    public void setProductDescription(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0;
        }
    }

    public double amount() {
        if (quantity <= 0 || pricePerItem <= 0) {
            return 0;
        } else {
            return quantity * pricePerItem;
        }
    }
}
