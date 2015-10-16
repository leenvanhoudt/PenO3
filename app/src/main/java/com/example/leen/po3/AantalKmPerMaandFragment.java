package com.example.leen.po3;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.ChartData;

import java.util.ArrayList;


public class AantalKmPerMaandFragment extends Fragment {

    public static Fragment newInstance() {
        return new AantalKmPerMaandFragment();
    }

    private BarChart chart;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.aantal_km_per_maand, container, false);
        setupBarChart(view);
        setData();

        // chart toevoegen aan view
        RelativeLayout parent = (RelativeLayout) view.findViewById(R.id.parentLayout);
        parent.addView(chart);

        return view;
    }


    private void setupBarChart(View view) {
        chart = (BarChart) view.findViewById(R.id.chart);
        chart.setDescription("Aantal km per maand");
    }


    private void setData() {

        // data aantal km ingeven
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(100f, 0));
        entries.add(new BarEntry(50f, 1));
        entries.add(new BarEntry(90f, 2));
        entries.add(new BarEntry(30f, 3));
        entries.add(new BarEntry(120f, 4));
        entries.add(new BarEntry(50f, 5));

        // dataset maken
        BarDataSet dataset = new BarDataSet(entries, "#km");

        // x-as labels
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Januari");
        labels.add("Februari");
        labels.add("Maart");
        labels.add("April");
        labels.add("Mei");
        labels.add("Juni");

        // data in grafiek
        BarData data = new BarData(labels, dataset);
        chart.setData(data);
        chart.invalidate();
    }

}
