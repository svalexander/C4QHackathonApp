package rooksoto.c4q.nyc.c4qhackathonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by rook on 2/18/17.
 */

public class BaseActivity extends AppCompatActivity {

    void loadEstimateCost() {
        Intent intent = new Intent(this, NavActivity.class);
        intent.putExtra("passed_fragment", "EstimateCostFragment");
        Toast.makeText(this, "Clicked: Load Estimated Cost", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    void loadFavorites() {
        Intent intent = new Intent(this, NavActivity.class);
        intent.putExtra("passed_fragment", "EstimateCostFragment");
        Toast.makeText(this, "Clicked: Load Favorites", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    void loadEmergencyUrgent() {
        Intent intent = new Intent(this, NavActivity.class);
        intent.putExtra("passed_fragment", "EstimateCostFragment");
        Toast.makeText(this, "Clicked: Emergency/Urgent", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    void loadFindServices() {
        Intent intent = new Intent(this, NavActivity.class);
        intent.putExtra("passed_fragment", "EstimateCostFragment");
        Toast.makeText(this, "Clicked: Find Services", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
