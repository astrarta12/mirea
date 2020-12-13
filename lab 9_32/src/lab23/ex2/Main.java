package lab23.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<lab23.ex2.City> cities = List.of(
                new lab23.ex2.City("Moscow", "Russia"),
                new lab23.ex2.City("Osaka", "Japan"),
                new lab23.ex2.City("Berlin", "German"),
                new lab23.ex2.City("Mayapur", "India"),
                new lab23.ex2.City("Cologne", "German"),
                new lab23.ex2.City("Melbourne", "Australia"),
                new lab23.ex2.City("Shanghai", "China"),
                new lab23.ex2.City("Seoul", "South Korea")
        );

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();
        for (lab23.ex2.City city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }
        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}