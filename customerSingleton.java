
package DressRental;


public class customerSingleton {
    private static final customerSingleton customer = new customerSingleton();
    
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private String DressType;
    private String DressColor;
    private String DressPrice;
    private String paymentType;

    private customerSingleton(){};
    
    public static customerSingleton getInstance(){
        return customer;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDressType(String dressType) {
        this.DressType = dressType;
    }

    public void setDressColor(String DressColor) {
        this.DressColor = DressColor;
    }

    public void setDressPrice(String dressPrice) {
        this.DressPrice = dressPrice;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public static customerSingleton getCustomer() {
        return customer;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getDressType() {
        return DressType;
    }

    public String getDressColor() {
        return DressColor;
    }

    public String getDressPrice() {
        return DressPrice;
    }

    public String getPaymentType() {
        return paymentType;
    }
     
    
}
