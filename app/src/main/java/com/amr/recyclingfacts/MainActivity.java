package com.amr.recyclingfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button  factButton;
    private TextView  factTextView;
   RecyclingFactGenerator recyclingFactGenerator;
   public static final String TAG= "MainActivity TAg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factButton = findViewById(R.id.factButton);
        factTextView = findViewById(R.id.factTextView);
        recyclingFactGenerator = new RecyclingFactGenerator(this);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                factTextView.setText(recyclingFactGenerator.generateFact());
                Toast.makeText(MainActivity.this,getResources().getString(R.string.Button_Pressed), Toast.LENGTH_SHORT).show();
                Log.e(TAG,getResources().getString(R.string.Button_Run));
            }
        };

        factButton.setOnClickListener(onClickListener);
    }
}
