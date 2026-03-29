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

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private RadioButton rg1, rg2, rg3, rg4;
    private Switch sW;
    private RadioGroup radioGroup;
    private ConstraintLayout main;

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

    // Helper method to just change the color based on radio group selection
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


    public void click(View view) {
        if (sW.isChecked()) {
            applyColor();
        } else {
            main.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        }
    }

    public void clicked(View view) {
        applyColor();
    }
}
