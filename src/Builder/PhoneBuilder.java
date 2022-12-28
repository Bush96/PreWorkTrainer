package Builder;

public abstract class PhoneBuilder {

    Phone phone;

    void createPhone() {
        phone = new Phone();
    }

    abstract void buildId();

    abstract void buildModel();

    abstract void buildCost();

    Phone getPhone() {
        return phone;
    }
}
