package com.example.hafizumerbinnasir.gpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public int j;
    EditText paper=(EditText) findViewById(R.id.paperclear);
    Button calcu=(Button) findViewById(R.id.cal);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String i=paper.getText().toString();
                j=Integer.parseInt(i);
                Intent intent=new Intent(MainActivity.this,paper_input.class);
                startActivity(intent);


            }
        });

    }
}
