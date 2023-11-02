/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author admin
 */
public class city {
    private long id;
    private String name;
    private coord coord;
    private String country;
    private long population;
    private int timezone;
    private long sinrise;
    private long sunset;

    public city() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public coord getCoord() {
        return coord;
    }

    public String getCountry() {
        return country;
    }

    public long getPopulation() {
        return population;
    }

    public int getTimezone() {
        return timezone;
    }

    public long getSinrise() {
        return sinrise;
    }

    public long getSunset() {
        return sunset;
    }
}
