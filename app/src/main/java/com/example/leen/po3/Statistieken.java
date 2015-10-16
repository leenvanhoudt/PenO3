package com.example.leen.po3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Statistieken extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistieken);

        BarChart chart = (BarChart) findViewById(R.id.chart1);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("Aantal km per maand");
        chart.animateXY(2000, 2000);
        chart.invalidate();

    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(100f, 0); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(50f, 1); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(90f, 2); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(30f, 3); // Apr
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(120f, 4); // May
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(50f, 5); // Jun
        valueSet1.add(v1e6);

        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "#km");
        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        return xAxis;
    }


}
