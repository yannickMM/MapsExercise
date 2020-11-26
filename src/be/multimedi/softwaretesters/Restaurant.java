package be.multimedi.softwaretesters;

/**
 * @author Yannick Van Ham
 * created on Thursday, 26/11/2020
 */
public class Restaurant {
    private String name;
    private String cuisine;

    public Restaurant(String name, String cuisine) {
        this.name = name;
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
