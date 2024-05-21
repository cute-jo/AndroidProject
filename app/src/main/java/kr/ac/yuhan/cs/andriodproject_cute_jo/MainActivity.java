package kr.ac.yuhan.cs.andriodproject_cute_jo;

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


        // 히라가나 클릭 시 화면 전환
        Button main_hiragana = (Button) findViewById(R.id.hiragana);
        main_hiragana.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), HiraganaActivity.class);
                startActivity(intent);
            }
        });


        // 가타카나 클릭 시 화면 전환
        Button main_katakana = (Button) findViewById(R.id.katakana);
        main_katakana.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), KatakanaActivity.class);
                startActivity(intent);
            }
        });
    }
}