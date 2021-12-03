package ie.app.models;

import java.util.ArrayList;
import java.util.List;

public class Donation {
    public int id;
    public int amount;
    public String method;
    public List<Donation> donations = new ArrayList<Donation>();

    public Donation (int amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    public Donation () {
        this.amount = 0;
        this.method = "";
    }

    public String toString() {
        return id + ", " + amount + ", " + method;
    }
}
