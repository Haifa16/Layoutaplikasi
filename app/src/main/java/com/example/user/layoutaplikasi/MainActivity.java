package com.example.user.layoutaplikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView fList;
    private TextView cttn;
    private TextView wsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fList = (TextView) findViewById(R.id.txtfl);
        cttn = (TextView) findViewById(R.id.txtcttn);
        wsl = (TextView) findViewById(R.id.txtwl);

        fList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, friends_list.class);
                startActivity(intent);
            }
        });

        cttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, catatan.class);
                startActivity(intent);
            }
        });

        wsl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, wish_list.class);
                startActivity(intent);
            }
        });
    }
}
