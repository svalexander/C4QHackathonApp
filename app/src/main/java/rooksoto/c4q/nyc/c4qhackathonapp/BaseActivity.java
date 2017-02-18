package rooksoto.c4q.nyc.c4qhackathonapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by rook on 2/18/17.
 */

public class BaseActivity extends AppCompatActivity {

    Intent intent = new Intent(this, NavActivity.class);
    Bundle bundle = new Bundle();

    void loadEstimateCost() {
        Toast.makeText(this, "Clicked: Load Estimated Cost", Toast.LENGTH_SHORT).show();
        bundle.putString("passed_fragment", "Fragment Name");
        startActivity(intent);
    }

    void loadFavorites() {
        Toast.makeText(this, "Clicked: Load Favorites", Toast.LENGTH_SHORT).show();
        bundle.putString("passed_fragment", "Fragment Name");
        startActivity(intent);
    }

    void loadEmergencyUrgent() {
        Toast.makeText(this, "Clicked: Emergency/Urgent", Toast.LENGTH_SHORT).show();
        bundle.putString("passed_fragment", "Fragment Name");
        startActivity(intent);
    }

    void loadFindServices() {
        Toast.makeText(this, "Clicked: Find Services", Toast.LENGTH_SHORT).show();
        bundle.putString("passed_fragment", "Fragment Name");
        startActivity(intent);
    }
}
