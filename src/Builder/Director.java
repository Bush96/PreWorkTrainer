package Builder;

public class Director {
    PhoneBuilder phoneBuilder;

    public void setPhoneBuilder (PhoneBuilder phoneBuilder){
        this.phoneBuilder = phoneBuilder;
    }

    Phone buildPhone (){
        phoneBuilder.createPhone();
        phoneBuilder.buildId();
        phoneBuilder.buildModel();
        phoneBuilder.buildCost();

        Phone phone = phoneBuilder.getPhone();
        return phone;
    }
}
