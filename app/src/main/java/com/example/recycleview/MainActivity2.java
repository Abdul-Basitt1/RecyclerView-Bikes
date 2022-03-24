package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<contactmodel> contact_array = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rv = findViewById(R.id.recycle);
        rv.setLayoutManager(new LinearLayoutManager(this));

        contact_array.add(new contactmodel(R.drawable.yybr, "Yamaha YBR-G", "2022"));
        contact_array.add(new contactmodel(R.drawable.cbr, "Honda CBR-R", "2008"));
        contact_array.add(new contactmodel(R.drawable.tntben, "Benelli TNT 300", "2020"));
        contact_array.add(new contactmodel(R.drawable.ninjak3, "Kawasaki Ninja 300", "2015"));
        contact_array.add(new contactmodel(R.drawable.yzfr1, "Yamaha YZF-R1", "2022"));
        contact_array.add(new contactmodel(R.drawable.r15, "Yamaha R15-V3", "2022"));
        contact_array.add(new contactmodel(R.drawable.rc200, "KTM RC 200", "2021"));
        contact_array.add(new contactmodel(R.drawable.duke200, "KTM Duke 200", "2019"));
        contact_array.add(new contactmodel(R.drawable.kh2r, "Kawasaki Ninja H2R", "2021"));
        contact_array.add(new contactmodel(R.drawable.panigale, "Ducati Panigale V4", "2018"));
        contact_array.add(new contactmodel(R.drawable.diavel, "Ducati Diavel X", "2020"));
        contact_array.add(new contactmodel(R.drawable.brutale, "MV Agusta Brutale 1000RR", "2022"));
        contact_array.add(new contactmodel(R.drawable.mt09, "Yamaha MT-09", "2022"));
        contact_array.add(new contactmodel(R.drawable.cbr1000, "Honda CBR1000RR-R", "2022"));
        contact_array.add(new contactmodel(R.drawable.dragster, "MV Agusta Dragster 800RR", "2022"));
        contact_array.add(new contactmodel(R.drawable.gixx, "Suzuki Gixxer SF", "2019"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, contact_array);
        rv.setAdapter(adapter);
    }
}