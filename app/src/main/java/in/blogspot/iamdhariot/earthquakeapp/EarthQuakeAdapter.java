package in.blogspot.iamdhariot.earthquakeapp;

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
 * Created by Dhariot on 16-May-18.
 */

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {
    public EarthQuakeAdapter(Context context,List<EarthQuake> earthQuakes) {
        super(context,0, earthQuakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items_quake,parent,false);
        }
        EarthQuake currentEarthQuake = getItem(position);

        //find the textview with view id magnitude and display the data
        TextView magnitudeView = (TextView)listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthQuake.getmMegnitude());
        //find the textview with view id location and display the data
        TextView locationView  = (TextView)listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthQuake.getmLocation());
        //find the textview with view id date and display the data
        TextView dateView = (TextView)listItemView.findViewById(R.id.dateTime);
        dateView.setText(currentEarthQuake.getmDate());



        return listItemView;
    }
}
