package kr.ac.yuhan.cs.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button developer_info_btn = (Button) findViewById(R.id.button1);
        developer_info_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Btn1.class);
                startActivity(intent);
            }
        });

        Button name_rule_btn = (Button) findViewById(R.id.button2);
        name_rule_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Btn2.class);
                startActivity(intent);
            }
        });
    }
}