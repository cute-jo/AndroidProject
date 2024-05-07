package kr.ac.yuhan.cs.andriodproject_cute_jo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kr.ac.yuhan.cs.andriodproject_cute_jo.Btn1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // button2 클릭 시 화면 전환
        Button developer_info_btn = (Button) findViewById(R.id.button1);
        developer_info_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Btn1.class);
                startActivity(intent);
            }
        });


        // button2 클릭 시 화면 전환
        Button name_rule_btn = (Button) findViewById(R.id.hiragana_a);
        name_rule_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Btn2.class);
                startActivity(intent);
            }
        });
    }
}