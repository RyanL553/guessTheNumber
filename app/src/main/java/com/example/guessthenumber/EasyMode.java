package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EasyMode extends AppCompatActivity {
    private Button btnEasyBack;
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> ae718a51f766048a36fbc5842ddcb3ea1865fc41
=======
>>>>>>> ae718a51f766048a36fbc5842ddcb3ea1865fc41

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mode);

        btnEasyBack = findViewById(R.id.btnEasyBack);
        btnEasyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openModeSelection();
            }
        });
    }

    public void openModeSelection() {
        Intent intent = new Intent(this, ModeSelection.class);
        startActivity(intent);
    }
}