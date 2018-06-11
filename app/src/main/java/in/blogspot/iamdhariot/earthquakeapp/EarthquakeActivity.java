package in.blogspot.iamdhariot.earthquakeapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    // declaration
    private ListView listView;
    private ArrayList<EarthQuake> earthQuakes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        if(Build.VERSION.SDK_INT>=19 ){

            getWindow().addFlags(WindowManager
                    .LayoutParams
                    .FLAG_TRANSLUCENT_STATUS);

        }else{
            getWindow().clearFlags(WindowManager
                    .LayoutParams
                    .FLAG_TRANSLUCENT_STATUS);

        }
*/
        setContentView(R.layout.activity_earthquake);


        // initilization
        /*
        earthQuakes  = new ArrayList<>();
        earthQuakes.add(new EarthQuake("5.1","San Fransisco","Feb 21, 2018"));
        earthQuakes.add(new EarthQuake("5.4","London","Feb 12, 2018"));
        earthQuakes.add(new EarthQuake("4.0","Manila","Feb 5, 2018"));
        earthQuakes.add(new EarthQuake("3.1","New York","Dec 29, 2017"));
        earthQuakes.add(new EarthQuake("3.8","Tokyo","Dec 8 , 2017"));
        earthQuakes.add(new EarthQuake("5.5","Mexico City","Nov 23, 2017"));
        earthQuakes.add(new EarthQuake("5.1","Moscow","Oct 21, 2017"));
        earthQuakes.add(new EarthQuake("7.1","Paris","Sept 2, 2017"));


*/

        // get the list of the earthQuakes from {@Link QueryUtils }
        ArrayList<EarthQuake> earthQuakes = QueryUtils.extractEarthquakes();

        // finding the listView from earthQuake Activity.xml
        listView = (ListView)findViewById(R.id.listView);

        EarthQuakeAdapter earthQuakeAdapter = new EarthQuakeAdapter(this,earthQuakes);
        //set the adapter on the listView
        listView.setAdapter(earthQuakeAdapter);
    }

}
