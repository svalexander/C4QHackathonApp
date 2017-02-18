package rooksoto.c4q.nyc.c4qhackathonapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends BaseActivity implements View.OnClickListener{

    TextView tvFindServices;
    TextView tvEmergencyUrgent;
    TextView tvFreeResources;
    TextView tvFavorites;
    TextView tvEstimateCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setListeners();
    }

    private void initViews() {
        tvFindServices = (TextView) findViewById(R.id.tv_find_svc);
        tvEmergencyUrgent = (TextView) findViewById(R.id.tv_emergency_urgent);
        tvFreeResources = (TextView) findViewById(R.id.tv_free_resources);
        tvFavorites = (TextView) findViewById(R.id.tv_favorites);
        tvEstimateCost = (TextView) findViewById(R.id.tv_estimate_cost);
    }

    private void setListeners() {
        tvFindServices.setOnClickListener(this);
        tvEmergencyUrgent.setOnClickListener(this);
        tvFreeResources.setOnClickListener(this);
        tvFavorites.setOnClickListener(this);
        tvEstimateCost.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_find_svc:
                loadFindServices();
                break;
            case R.id.tv_emergency_urgent:
                loadEmergencyUrgent();
                break;
            case R.id.tv_favorites:
                loadFavorites();
                break;
            case R.id.tv_estimate_cost:
                loadEstimateCost();
                break;
            default:
                break;
        }
    }
}