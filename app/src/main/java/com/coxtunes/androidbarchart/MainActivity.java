package com.coxtunes.androidbarchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainActivity extends AppCompatActivity {

    PieChartView pieChartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChartView = findViewById(R.id.chart);

        List pieData = new ArrayList<>();
        pieData.add(new SliceValue(15, Color.BLUE).setLabel("ANDROID"));
        pieData.add(new SliceValue(25, Color.GRAY).setLabel("IOS"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("WEB"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("GRAPHIC"));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true);
        pieChartData.setValueLabelTextSize(5);
        pieChartData.setHasCenterCircle(true);
        pieChartData.setCenterText1("COXTUNES SKILLS");
        pieChartData.setCenterText1FontSize(10);
        pieChartData.setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView.setPieChartData(pieChartData);

    }
}
