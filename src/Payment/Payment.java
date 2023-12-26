package Payment;

public class Payment {
    String payment_id;
    int price;
    String payment_method;

    public Payment(String payment_id, int price, String payment_method) {
        this.payment_id = payment_id;
        this.price = price;
        this.payment_method = payment_method;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payment_id='" + payment_id + '\'' +
                ", price=" + price +
                ", payment_method='" + payment_method + '\'' +
                '}';
    }
}
