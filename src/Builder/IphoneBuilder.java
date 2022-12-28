package Builder;

public class IphoneBuilder extends PhoneBuilder {


    @Override
    void buildId() {
        phone.setId(1);
    }

    @Override
    void buildModel() {
        phone.setModel("x");
    }

    @Override
    void buildCost() {
        phone.setCost(1000);
    }
}
