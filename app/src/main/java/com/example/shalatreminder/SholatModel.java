package com.example.shalatreminder;

public class SholatModel {

    String date, shubuh, dhuhur, ashar, maghrib, isya;
    int gambar;


    public SholatModel(String date, String shubuh, String dhuhur, String ashar, String maghrib, String isya, int gambar) {
        this.date = date;
        this.shubuh = shubuh;
        this.dhuhur = dhuhur;
        this.ashar = ashar;
        this.maghrib = maghrib;
        this.isya = isya;
        this.gambar = gambar;
    }


    public String getDate() {
        return date;
    }
    public String getShubuh(){
        return shubuh;
    }
    public String getDhuhur(){
        return dhuhur;
    }
    public String getAshar(){ return ashar; }
    public String getMaghrib(){ return maghrib; }
    public String getIsya(){
        return isya;
    }
   public int getGambar() {
        return gambar;
   }
}
