package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kristaps.jeskins on 4/28/2017.
 */

public class EQAdapter extends ArrayAdapter<Earthquake> {

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_earthquake,parent,false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magView = (TextView) listItemView.findViewById(R.id.magnitude);
        magView.setText(Double.toString(currentEarthquake.getMag()));
        TextView locView = (TextView) listItemView.findViewById(R.id.location);
        locView.setText(currentEarthquake.getLoc());
        TextView dayView = (TextView) listItemView.findViewById(R.id.date);
        dayView.setText(currentEarthquake.getDay());
        return listItemView;
    }

    public EQAdapter (Context context, List<Earthquake> earthquakes){
        super(context, 0, earthquakes);


    }
}
