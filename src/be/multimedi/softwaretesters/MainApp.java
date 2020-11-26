package be.multimedi.softwaretesters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


        Map<String, Restaurant> restaurantMap = new HashMap<>();

        restaurantMap.put("Le Marmiton", new Restaurant("Le Marmiton", "French"));
        restaurantMap.put("Yummy Bowl", new Restaurant("Yummy Bowl", "Korean"));
        restaurantMap.put("Los Ponchos", new Restaurant("Los Ponchos", "Mexican"));
        restaurantMap.put("Chana", new Restaurant("Chana", "Israeli"));

        nameToSearch = "Los Ponchos";

        Restaurant foundRestaurant = restaurantMap.get(nameToSearch);

        System.out.println(foundRestaurant.getCuisine());
    }
}
