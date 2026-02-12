package com.example.listycity;

/**
 * This class defines a City with a name and a province.
 * It implements Comparable to support sorting by city name.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructor for the City class.
     * @param city The name of the city
     * @param province The name of the province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     * @return The name of the city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the province name.
     * @return The name of the province
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city with another city for sorting purposes.
     * @param city The other city to compare to
     * @return A negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Checks if two cities are considered equal (same name and province).
     * @param o The object to compare with
     * @return True if objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }

    /**
     * Generates a hash code for the city.
     * @return The hash code
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}