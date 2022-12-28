package Builder;

public class BuildPhoneRunner {
    public static void main(String[] args) {
    Director director = new Director();
    director.setPhoneBuilder(new IphoneBuilder());

    Phone phone = director.buildPhone();

        System.out.println(phone);
    }
}
