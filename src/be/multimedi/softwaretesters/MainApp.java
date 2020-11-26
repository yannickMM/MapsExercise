package be.multimedi.softwaretesters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yannick Van Ham
 * created on Thursday, 26/11/2020
 */
public class MainApp {
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant("Thai Wok Express", "Thai"));
        restaurants.add(new Restaurant("Mykonos Grill", "Greek"));
        restaurants.add(new Restaurant("Jai ho", "Indian"));
        restaurants.add(new Restaurant("La Pizza è Bella", "Italian"));

        String nameToSearch = "Jai ho";

        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equals(nameToSearch)){
                System.out.println(restaurant.getCuisine());
            }
        }
    }
}
