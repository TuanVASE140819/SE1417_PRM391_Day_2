package com.example.se1417_day02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult=findViewById(R.id.txtResult);
        Intent intent =this.getIntent();
        String result = intent.getStringExtra("info");
        if (result!=null){
            txtResult.setText(result);
        }
    }

    public void clickToCreate(View view) {
        Intent intent = new Intent(this,CreateProductActivity.class);
        startActivity(intent);
    }
}