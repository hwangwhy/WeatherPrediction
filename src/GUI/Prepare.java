/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Control.GetAPI;
import Data.getfromJSON;
import Data.weather;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 
 * @author admin
 */
public class Prepare {
    private GUI weather;
    private getfromJSON result;
    private ArrayList<weather> listResult;
    private int idx = 0;

    public Prepare() {
        weather = new GUI();
        prepare();
    }

    public GUI getWeather() {
        return weather;
    }

    private void prepare() {
        weather.getfindbtn().setActionCommand("find");
        weather.getfindbtn().addActionListener(new ButtonClick());

        weather.getnextbtn().setActionCommand("next");
        weather.getnextbtn().addActionListener(new ButtonClick());

        weather.getprevbtn().setActionCommand("prev");
        weather.getprevbtn().addActionListener(new ButtonClick());
    }

    private void show() {

        String Date = " Ngày: " + result.getList()[idx].getDt_txt();
        String City = " Thành phố: " + result.getCity().getName();
        String Region = " Quốc gia: " + result.getCity().getCountry();
        String Weather = " Thời tiết: " + result.getList()[idx].getWeather()[0].getDescription();
        String Temp = " Nhiệt độ: " + result.getList()[idx].getMain().getTemp() + " độ C";
        String Pressure = " Ap xuất: " + result.getList()[idx].getMain().getPresure();
        String Humid = " Độ ẩm: " + result.getList()[idx].getMain().getHumidity() + "%";
        String Speed = " Tốc độ gió: " + result.getList()[idx].getWind().getSpeed();
        String Cloud = " Mây: " + result.getList()[idx].getClouds().getAll() + "%";
        

        weather.getPressure().setText(Pressure);
        weather.getCity().setText(City);
        weather.getCloud().setText(Cloud);
        weather.getDate().setText(Date);
        weather.getHumid().setText(Humid);
        weather.getRegion().setText(Region);
        weather.getTemp().setText(Temp);
        weather.getWeather().setText(Weather);
        weather.getSpeed().setText(Speed);
    }

    public class ButtonClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.equals("find")) {
                find();
                idx = 0;
            } else if (command.equals("next")) {
                idx = idx == 39 ? idx : idx + 1;
            } else if (command.equals("pre")) {
                idx = idx == 0 ? idx : idx - 1;
            }
            show();
        }

        private void find() {
            result = GetAPI.getJsonData((String) weather.getchangeCity().getSelectedItem());
        }
    }
}
