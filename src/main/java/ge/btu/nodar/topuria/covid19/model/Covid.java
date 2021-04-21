package ge.btu.nodar.topuria.covid19.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Covid {

    Map<String,Covid> countries = new HashMap<>();
    List<Covid> stats = new ArrayList<>();
    private String country;
    private int confirmed;
    private static int deaths;
    private static int recovered;
    public Covid(){
        countries.put("georgia",new Covid("Georgia",10000,0,10000));
        countries.put("usa",new Covid("USA",10000,0,10000));
        countries.put("england",new Covid("England",10000,0,10000));
        countries.put("china",new Covid("China",10000,0,10000));
        countries.put("japan",new Covid("Japan",10000,0,10000));
        countries.put("russia",new Covid("Russia",10000,0,10000));
        stats.add(new Covid("Georgia",10000,0,10000));
        stats.add(new Covid("USA",10000,0,10000));
        stats.add(new Covid("England",10000,0,10000));
        stats.add(new Covid("China",10000,0,10000));
        stats.add(new Covid("Japan",10000,0,10000));
    }
    public Covid(String country, int confirmed, int deaths, int recovered) {
        this.country = country;
        this.confirmed = confirmed;
        Covid.deaths = deaths;
        Covid.recovered = recovered;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public Covid findCountry(String country){
        return countries.get(country);
    }
    public String totalDeathAndRecovery(){
        return "Deaths: "+deaths+", Recovered: "+recovered;
    }
    public List<Covid> getStatistic(){
        return stats;
    }
}
