package Builder;

public class XiaomiPhoneBuilder extends PhoneBuilder {
    @Override
    void buildId() {
        phone.setId(2);
    }

    @Override
    void buildModel() {
        phone.setModel("y");
    }

    @Override
    void buildCost() {
        phone.setCost(5000);
    }
}
