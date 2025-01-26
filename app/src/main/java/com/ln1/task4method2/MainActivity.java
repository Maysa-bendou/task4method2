package com.ln1.task4method2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare buttons
    private Button moreOptionsButton, searchButton, editButton, afficherToutButton;
    private boolean areOptionsVisible = false;  // Track the visibility state of extra options

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        moreOptionsButton = findViewById(R.id.moreOptionsButton);
        searchButton = findViewById(R.id.searchButton);
        editButton = findViewById(R.id.editButton);
        afficherToutButton = findViewById(R.id.afficherToutButton);

        // Set up listener for "More Options" button to toggle the visibility of additional options
        moreOptionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleOptionsVisibility();
            }
        });

        // Set placeholders for other buttons - right now they do nothing
        searchButton.setOnClickListener(v -> {
            // Placeholder for future search functionality
        });

        editButton.setOnClickListener(v -> {
            // Placeholder for future edit functionality
        });

        afficherToutButton.setOnClickListener(v -> {
            // Placeholder for future "Afficher Tout" functionality
        });
    }

    // Toggle visibility of extra options when More Options button is clicked
    private void toggleOptionsVisibility() {
        // Toggle the state of visibility for extra options (search, edit, etc.)
        if (areOptionsVisible) {
            searchButton.setVisibility(View.GONE); // Hide search button
            editButton.setVisibility(View.GONE);   // Hide edit button
            afficherToutButton.setVisibility(View.GONE);  // Hide "Afficher Tout" button
            moreOptionsButton.setText("More Options");  // Change text back to "More Options"
        } else {
            searchButton.setVisibility(View.VISIBLE); // Show search button
            editButton.setVisibility(View.VISIBLE);   // Show edit button
            afficherToutButton.setVisibility(View.VISIBLE);  // Show "Afficher Tout" button
            moreOptionsButton.setText("Less Options"); // Change text to "Less Options"
        }

        // Update the toggle state
        areOptionsVisible = !areOptionsVisible;
    }
}


