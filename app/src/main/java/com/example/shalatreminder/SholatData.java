package com.example.shalatreminder;


import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class SholatData {
    Context context;
    List<SholatModel> sholatModels = new ArrayList<>();
    MainView view;
    public SholatData (MainView view,Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        SholatModel sholat;

        sholat = new SholatModel( "1 April 2019",
                "Fajr : 04:33 (WIB)",
                "Dhuhr : 11:43 (WIB)",
                "Asr : 15:00 (WIB)",
                "Maghrib : 17:58 (WIB)",
                "Isha : 18:37 (WIB)", R.drawable.shalat);
        sholatModels.add(sholat);

        sholat = new SholatModel( "2 April 2019",
                "Fajr : 04:33 (WIB)",
                "Dhuhr : 11:42 (WIB)",
                "Asr : 15:00 (WIB)",
                "Maghrib : 17:58 (WIB)",
                "Isha : 18:36 (WIB)", R.drawable.shalat );
        sholatModels.add(sholat);

        sholat = new SholatModel( "3 April 2019",
                "Fajr : 04:33 (WIB)",
                "Dhuhr : 11:42 (WIB)",
                "Asr : 15:00 (WIB)",
                "Maghrib : 17:57 (WIB)",
                "Isha : 18:36 (WIB)",R.drawable.shalat );
        sholatModels.add(sholat);

        sholat = new SholatModel( "4 April 2019",
                "Fajr : 04:33 (WIB)",
                "Dhuhr : 11:42 (WIB)",
                "Asr : 15:00 (WIB)",
                "Maghrib : 17:57 (WIB)",
                "Isha : 18:35 (WIB)", R.drawable.shalat);
        sholatModels.add(sholat);

        sholat = new SholatModel( "5 April 2019",
                "Fajr : 04:33 (WIB)",
                "Dhuhr : 11:41 (WIB)",
                "Asr : 15:00 (WIB)",
                "Maghrib : 17:56 (WIB)",
                "Isha : 18:35 (WIB)",R.drawable.shalat);
        sholatModels.add(sholat);

        sholat = new SholatModel( "6 April 2019",
                "Fajr : 04:33 (WIB)",
                "Dhuhr : 11:41 (WIB)",
                "Asr : 15:00 (WIB)",
                "Maghrib : 17:56 (WIB)",
                "Isha : 18:34 (WIB)",R.drawable.shalat);

        sholatModels.add(sholat);
        sholat = new SholatModel( "7 April 2019",
                "Fajr : 04:33 (WIB)",
                "Dhuhr : 11:41 (WIB)",
                "Asr : 15:00 (WIB)",
                "Maghrib : 17:55 (WIB)",
                "Isha : 18:34 (WIB)",R.drawable.shalat);

        sholatModels.add(sholat);







        view.onSuccess(sholatModels);

    }
}
