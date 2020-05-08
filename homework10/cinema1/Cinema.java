package homework10.cinema1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cinema {
    private String name;
    private Map<String, Seat> seats = new HashMap<String, Seat>();

    public Cinema(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Seat> getSeats() {
        return seats;
    }


}
