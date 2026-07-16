package Classes;

public class Encapsulation {
    private int id; // Restricted -> Sensitive Data must not be accessible to users

    // Setter -> We should only access them via Encapsulation (Setters and Getters)
    public void setId(int id) {
        this.id = id;
    }

    // Getter
    public int getId() {
        return id;
    }

}
