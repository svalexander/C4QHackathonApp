package rooksoto.c4q.nyc.c4qhackathonapp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;

/**
 * Created by rook on 2/18/17.
 */

public class NavActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        android.app.Fragment fragment = (android.app.Fragment) Class.forName(fragmentName).newInstance();
        getFragmentManager().beginTransaction().replace(R.id.fl_fragment_host, fragment).commit();
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
    void loadProfile() {
        super.loadProfile();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {

        }
        return true;
    }
}
