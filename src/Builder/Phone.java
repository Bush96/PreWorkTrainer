package Builder;

public class Phone {
    private int id;
    private String model;
    private int cost;


    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
