package rooksoto.c4q.nyc.c4qhackathonapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import rooksoto.c4q.nyc.c4qhackathonapp.R;

/**
 * Created by rook on 2/18/17.
 */

public class FindServicesFragment extends Fragment implements View.OnClickListener{

    private Spinner servicesSpinner;
    private Spinner boroughSpinner;
    private Button searchBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       servicesSpinner = (Spinner) view.findViewById(R.id.services_spinner);
        boroughSpinner = (Spinner) view.findViewById(R.id.borough_spinner);

        servicesSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) getActivity());
        boroughSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) getActivity());

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(view.getContext(),
                R.array.medical_services, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        servicesSpinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {

    }

}
