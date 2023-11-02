/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author admin
 */
import Data.getfromJSON;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
public class GetAPI {
    public static getfromJSON getJsonData(String city) {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        getfromJSON data = null;
        Request res = new Request.Builder().url("http://api.openweathermap.org/data/2.5/forecast?q="+city+"&APPID=bffca17bcb552b8c8e4f3b82f64cccd2&units=metric").build();
        try {
            Response response = client.newCall(res).execute();
            ResponseBody body = response.body();
            data = gson.fromJson(body.string(), getfromJSON.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
