package com.example.administrator.myapplication86;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.administrator.myapplication86.R.id.textView3;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private TextView tv;
    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;

    private RadioButton op1;
    private RadioButton op2;
    private RadioButton op3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        tv = (TextView) findViewById(textView3);
        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);

        op1 = (RadioButton) findViewById(R.id.radioButton);
        op2 = (RadioButton) findViewById(R.id.radioButton2);
        op3 = (RadioButton) findViewById(R.id.radioButton3);
        op1.setOnClickListener(optionOnClickListener);
        op2.setOnClickListener(optionOnClickListener);
        op3.setOnClickListener(optionOnClickListener);
        op1.setChecked(true);

    }

    RadioButton.OnClickListener optionOnClickListener
            = new RadioButton.OnClickListener() {

        public void onClick(View v) {
            Toast.makeText(
                    MainActivity.this,
                    "Option 1 : " + op1.isChecked() + "\n"
                            + "Option 2 : " + op2.isChecked() + "\n"
                            + "Option 3 : " + op3.isChecked(),
                    Toast.LENGTH_LONG).show();

        }
    };

    public void one(View vi) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // 체크박스를 클릭해서 상태가 바꾸었을 경우 호출되는 콜백 메서드

        String result = ""; // 문자열 초기화는 빈문자열로 하자

//        if(isChecked) tv.setText("체크했음");
//        else tv.setText("체크안했슴");

        if (cb1.isChecked()) result += cb1.getText().toString() + ", ";
        if (cb2.isChecked()) result += cb2.getText().toString() + ". ";
        if (cb3.isChecked()) result += cb3.getText().toString() + ". ";

        tv.setText("체크 항목: " + result);

    }
}