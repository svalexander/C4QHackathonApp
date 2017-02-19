package rooksoto.c4q.nyc.c4qhackathonapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by akashaarcher on 2/18/17.
 */

public class TabActivity extends AppCompatActivity {

    FragmentPagerAdapter fragmentPagerAdapter;
    TabLayout tabLayout;


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
    }


}
