package rooksoto.c4q.nyc.c4qhackathonapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;

/**
 * Created by rook on 2/18/17.
 */

public class NavActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

    }

    @Override
    void loadEstimateCost() {
        super.loadEstimateCost();
    }

    @Override
    void loadFavorites() {
        super.loadFavorites();
    }

    @Override
    void loadEmergencyUrgent() {
        super.loadEmergencyUrgent();
    }

    @Override
    void loadFindServices() {
        super.loadFindServices();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {

        }
        return true;
    }
}
