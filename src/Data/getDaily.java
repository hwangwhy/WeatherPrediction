/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author admin
 */
public class getDaily {
    private long dt;
    private main main;
    private weather[] weather;
    private cloud clouds;
    private wind wind;
    private int visibility;
    private double pop;
    private rain rain;
    private sys sys;
    private String dt_txt;

    public getDaily() {
    }

    public long getDt() {
        return dt;
    }

    public main getMain() {
        return main;
    }

    public weather[] getWeather() {
        return weather;
    }

    public cloud getClouds() {
        return clouds;
    }

    public wind getWind() {
        return wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public double getPop() {
        return pop;
    }

    public rain getRain() {
        return rain;
    }

    public sys getSys() {
        return sys;
    }

    public String getDt_txt() {
        return dt_txt;
    }
}
