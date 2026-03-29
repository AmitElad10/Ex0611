package com.example.ex0611;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

/**
 * MainActivity handles background color changes based on user selection.
 * It supports both automatic updates (via Switch) and manual updates (via Button).
 *
 * @author Amit Elad
 * @version 1.0
 * @since 2024-06-11
 */
public class MainActivity extends AppCompatActivity {
    private Button btn;
    private RadioButton rg1, rg2, rg3, rg4;
    private Switch sW;
    private RadioGroup radioGroup;
    private ConstraintLayout main;

    /**
     * Called when the activity is starting. This is where most initialization should go.
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        sW = findViewById(R.id.sW);
        radioGroup = findViewById(R.id.radioGroup);
        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg4 = findViewById(R.id.rg4);
        btn = findViewById(R.id.btn);
    }

    /**
     * Applies the selected background color based on the checked RadioButton in the RadioGroup.
     */
    private void applyColor() {
        int id = radioGroup.getCheckedRadioButtonId();
        if (id == R.id.rg1) {
            main.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        } else if (id == R.id.rg2) {
            main.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        } else if (id == R.id.rg3) {
            main.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
        } else if (id == R.id.rg4) {
            main.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        }
    }

    /**
     * Handles clicks on the Switch or RadioButtons.
     * Changes the background color automatically if the Switch is checked.
     * @param view The view that was clicked.
     */
    public void click(View view) {
        if (sW.isChecked()) {
            applyColor();
        } else {
            main.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        }
    }

    /**
     * Handles the click event for the 'Change' button.
     * Always applies the selected color, regardless of the Switch state.
     * @param view The view that was clicked.
     */
    public void clicked(View view) {
        applyColor();
    }
}
