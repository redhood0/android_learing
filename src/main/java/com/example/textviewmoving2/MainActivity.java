package com.example.textviewmoving2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    boolean flag = true;
    boolean flag2 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.deathBtn);
        Button button1 = findViewById(R.id.bt3);

        button.setOnClickListener((v) -> {
            System.out.println("ok");
            Toast.makeText(this, "time~", LENGTH_SHORT).show();
            if(flag){
                button.setBackgroundResource(R.drawable.jobs);
                flag = false;
            }else{
                button.setBackgroundResource(R.drawable.jobalive);
                flag = true;
            }
        });

        button1.setOnClickListener(v -> {
            if(flag2){
                Drawable cookie = getDrawable(R.drawable.cookie);
                button1.setCompoundDrawablesWithIntrinsicBounds(cookie,null,null,null);
                button1.setText("曲奇");
                flag2 = false;
            }else{
                Drawable suxi = getDrawable(R.drawable.suxi);
                button1.setCompoundDrawablesWithIntrinsicBounds(suxi,null,null,null);
                button1.setText("寿司");
                flag2 = true;
            }
        });
    }
}
