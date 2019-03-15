package com.example.pdm_labo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  Button mtext;
    private TextView mytext;
    private EditText newText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtext = findViewById(R.id.btn_click);
        mytext = findViewById(R.id.tv_texto);

        mtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newText = findViewById(R.id.et_username);
                mytext.setText(newText.getText());
            }
        });
        mtext.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newText = findViewById(R.id.et_password);
                mytext.setText(newText.getText());
                return false;
            }
        });

    }
}
