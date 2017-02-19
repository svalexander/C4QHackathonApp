package rooksoto.c4q.nyc.c4qhackathonapp;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import rooksoto.c4q.nyc.c4qhackathonapp.model.UrgentCareLocation;

/**
 * Created by akashaarcher on 2/18/17.
 */

public class UrgentCareAdapter extends RecyclerView.Adapter  {

    private List<UrgentCareLocation> urgLocations  = Arrays.asList(
            new UrgentCareLocation("NYU Free Clinic", "Manhattan", R.string.nyu_clinic_address, "212.999-9999"),
            new UrgentCareLocation("Weill Cornell", "Manhattan", R.string.nyu_clinic_address, "212.999-9999")
    );




    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UrgentCareViewHolder(parent);


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        UrgentCareViewHolder viewHolder = (UrgentCareViewHolder) holder;

    }



    @Override
    public int getItemCount() {
        return urgLocations.size();
    }


}
