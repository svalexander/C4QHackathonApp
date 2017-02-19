package rooksoto.c4q.nyc.c4qhackathonapp.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rooksoto.c4q.nyc.c4qhackathonapp.HhcData.api.HhcClient;
import rooksoto.c4q.nyc.c4qhackathonapp.HhcData.model.HhcData;
import rooksoto.c4q.nyc.c4qhackathonapp.R;

/**
 * Created by rook on 2/18/17.
 */
public class MedicalCostsFragment extends android.support.v4.app.Fragment {

    View view;
    HhcClient hhcClient;
    List<HhcData> hhcData;
    int feeLevel;
    private static final String TAG = "MedicalCostsFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_medical_costs, container, false);
        feeLevel = getArguments().getInt("fee_level");
        loadHHCData();
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    private void loadHHCData() {

        hhcClient = HhcClient.getInstance();
        Call<List<HhcData>> call = hhcClient.getData();

        call.enqueue(new Callback<List<HhcData>>() {

            @Override
            public void onResponse(Call<List<HhcData>> call, Response<List<HhcData>> response) {
                hhcData = response.body();
                Log.d(TAG, "onResponse: " + hhcData.get(0).getFee());
            }

            @Override
            public void onFailure(Call<List<HhcData>> call, Throwable t) {
                Log.d(TAG, "onFailure: " + "Error getting response from HHC API");
            }
        });
    }
}
