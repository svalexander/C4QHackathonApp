package rooksoto.c4q.nyc.c4qhackathonapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import rooksoto.c4q.nyc.c4qhackathonapp.adapters.ViewPagerAdapter;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.EmergencyRoomFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.EstimateCostFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.FavoritesFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.FindServicesFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.FreeResourcesFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.MedicaidMedicareFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.NearMeFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.PlannedParenthoodFragment;
import rooksoto.c4q.nyc.c4qhackathonapp.fragments.ProfileFragment;

/**
 * Created by akashaarcher on 2/18/17.
 */

public class TabActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    FragmentPagerAdapter fragmentPagerAdapter;
    TabLayout tabLayout;

    ProfileFragment profileFragment = new ProfileFragment();
    FindServicesFragment findServicesFragment = new FindServicesFragment();
    EmergencyRoomFragment erFragment = new EmergencyRoomFragment();
    FavoritesFragment favsFragment = new FavoritesFragment();
    EstimateCostFragment estimateCostFragment = new EstimateCostFragment();
    FreeResourcesFragment freeResourcesFragment = new FreeResourcesFragment();
    PlannedParenthoodFragment plannedParenthoodFragment = new PlannedParenthoodFragment();
    MedicaidMedicareFragment medicaidMedicareFragment = new MedicaidMedicareFragment();
    NearMeFragment nearMeFragment = new NearMeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        viewPager.setCurrentItem(0);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.nav_profile:
                FragmentTransaction profileFragTransaction = getSupportFragmentManager().beginTransaction();
                profileFragTransaction.replace(R.id.fl_fragment_host, profileFragment);
                profileFragTransaction.commit();
                break;
            case R.id.nav_find_svc:
                FragmentTransaction serviceFragTransaction = getSupportFragmentManager().beginTransaction();
                serviceFragTransaction.replace(R.id.fl_fragment_host, findServicesFragment);
                serviceFragTransaction.commit();
                break;
            case R.id.nav_emrgency_urgent:
                Intent intent = new Intent(this, TabActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_favorite:
                FragmentTransaction favFragTransaction = getSupportFragmentManager().beginTransaction();
                favFragTransaction.replace(R.id.fl_fragment_host, favsFragment);
                favFragTransaction.commit();
                break;
            case R.id.nav_estimated_cost:
                FragmentTransaction estimatedFragTransaction = getSupportFragmentManager().beginTransaction();
                estimatedFragTransaction.replace(R.id.fl_fragment_host, estimateCostFragment);
                estimatedFragTransaction.commit();
                break;
            case R.id.nav_free:
                FragmentTransaction freeFragTransaction = getSupportFragmentManager().beginTransaction();
                freeFragTransaction.replace(R.id.fl_fragment_host, freeResourcesFragment);
                freeFragTransaction.commit();
                break;
            case R.id.nav_planned_parent:
                FragmentTransaction ppTransaction = getSupportFragmentManager().beginTransaction();
                ppTransaction.replace(R.id.fl_fragment_host, plannedParenthoodFragment);
                ppTransaction.commit();
                break;
            case R.id.nav_medicaid:
                FragmentTransaction medFragTransaction = getSupportFragmentManager().beginTransaction();
                medFragTransaction.replace(R.id.fl_fragment_host, medicaidMedicareFragment);
                medFragTransaction.commit();
                break;
            case R.id.nav_near:
                FragmentTransaction nearMeFragTransaction = getSupportFragmentManager().beginTransaction();
                nearMeFragTransaction.replace(R.id.fl_fragment_host, nearMeFragment);
                nearMeFragTransaction.commit();
                break;


        }
        return true;
    }
}
