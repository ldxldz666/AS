package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.edit_text);
        EditText editText1 = (EditText) findViewById(R.id.edit_text2) ;
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button1:
                        if(TextUtils.isEmpty(editText.getText())||TextUtils.isEmpty(editText1.getText())){
                            Toast.makeText(MainActivity.this,"输入不能为空",Toast.LENGTH_SHORT).show();
                        }
                    default:
                        break;
                }
            }
        });
    }

}