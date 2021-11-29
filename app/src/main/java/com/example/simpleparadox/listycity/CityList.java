package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This deletes a city from the list of cities
     * If the city does not exist throws an exception
     * @param city
     *      This is a candidate city to delete from the list
     */
    public void delete(City city) {
        if(!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * This returns the size of the list of cities
     * @return
     *     Return the size of list
     */
    public  int getCitiesSize() {
        return  cities.size();
    }

}
