package rooksoto.c4q.nyc.c4qhackathonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import rooksoto.c4q.nyc.c4qhackathonapp.adapters.PlannedParenthoodAdapter;
import rooksoto.c4q.nyc.c4qhackathonapp.adapters.StdAdapter;
import rooksoto.c4q.nyc.c4qhackathonapp.adapters.UrgentCareAdapter;
import rooksoto.c4q.nyc.c4qhackathonapp.adapters.WomensHealthAdapter;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.FindServicesFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.model.FacilityLocation;

/**
 * Created by akashaarcher on 2/19/17.
 */

public class LocationActivity extends AppCompatActivity {

    private RecyclerView facilityRv;
    private UrgentCareAdapter urgAdapter;
    private WomensHealthAdapter whAdapter;

    private ArrayList<FacilityLocation> urgCareLocations;

    private String PAP_SERVICE = "Pap Smear";
    private String BIRTH_CONTROL = "Birth Control";
    private String EMERGENCY_ROOM = "Emergency Room";
    private String PEDIATRICIAN = "Pediatrician";
    private String URGENT_CARE = "Urgent Care";
    private String STD_TESTING = "STD Testing";
    private String PPNYC = "Planned Parenthood";

    private String BROOKLYN = "Brooklyn";
    private String QUEENS = "Queens";
    private String BRONX = "Bronx";
    private String MANHATTAN = "Manhattan";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        facilityRv = (RecyclerView) findViewById(R.id.facility_rv);
        facilityRv.setLayoutManager(new LinearLayoutManager(this));

        String service = getIntent().getStringExtra(FindServicesFragment.SERVICE_KEY);
        String borough = getIntent().getStringExtra(FindServicesFragment.BOROUGH_KEY);


         if (service.equals(PAP_SERVICE) || service.equals(BIRTH_CONTROL)) {
            facilityRv.setAdapter(new WomensHealthAdapter());
        } else if (service.equals(URGENT_CARE)) {
            facilityRv.setAdapter(new UrgentCareAdapter());
        } else if (service.equals(STD_TESTING)) {
             facilityRv.setAdapter(new StdAdapter());
         } else if (service.equals(PPNYC)) {
             facilityRv.setAdapter(new PlannedParenthoodAdapter());
         }



    }





}
