package rooksoto.c4q.nyc.c4qhackathonapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

/**
 * Created by rook on 2/18/17.
 */

public class NavActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        try {
            loadFragment();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    private void loadFragment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String fragmentName = getIntent().getExtras().getString("passed_fragment");
        Fragment fragment = (Fragment)(Class.forName(fragmentName).newInstance());
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
