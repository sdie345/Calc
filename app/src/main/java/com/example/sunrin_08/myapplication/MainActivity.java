package com.example.sunrin_08.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button point;
    Button equal;
    Button plus;
    Button minus;
    Button mul;
    Button div;
    Button backspace;
    Button c;
    Button ce;

    TextView subtv;
    TextView maintv;

    String temp;

    int first;
    int second;
    int how;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subtv = findViewById(R.id.subTv);
        maintv = findViewById(R.id.mainTv);
        num0 = findViewById(R.id.num_0);
        num1 = findViewById(R.id.num_1);
        num2 = findViewById(R.id.num_2);
        num3 = findViewById(R.id.num_3);
        num4 = findViewById(R.id.num_4);
        num5 = findViewById(R.id.num_5);
        num6 = findViewById(R.id.num_6);
        num7 = findViewById(R.id.num_7);
        num8 = findViewById(R.id.num_8);
        num9 = findViewById(R.id.num_9);
        point = findViewById(R.id.point);
        equal = findViewById(R.id.btn_equal);
        plus = findViewById(R.id.btn_plus);
        minus = findViewById(R.id.btn_minus);
        mul = findViewById(R.id.btn_mul);
        div = findViewById(R.id.btn_div);
        backspace = findViewById(R.id.btn_del);
        c = findViewById(R.id.btn_c);
        ce = findViewById(R.id.btn_ce);
        //findViewByID를통해 xml과 자바 파일을 이어줌

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        point.setOnClickListener(this);
        equal.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        backspace.setOnClickListener(this);
        c.setOnClickListener(this);
        ce.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.num_0:
                if (maintv.length() != 0) {
                    temp = maintv.getText().toString();
                    maintv.setText(temp + "0");
                }
                break;
            case R.id.num_1:
                temp = maintv.getText().toString();
                maintv.setText(temp + "1");
                break;
            case R.id.num_2:
                temp = maintv.getText().toString();
                maintv.setText(temp + "2");
                break;
            case R.id.num_3:
                temp = maintv.getText().toString();
                maintv.setText(temp + "3");
                break;
            case R.id.num_4:
                temp = maintv.getText().toString();
                maintv.setText(temp + "4");
                break;
            case R.id.num_5:
                temp = maintv.getText().toString();
                maintv.setText(temp + "5");
                break;
            case R.id.num_6:
                temp = maintv.getText().toString();
                maintv.setText(temp + "6");
                break;
            case R.id.num_7:
                temp = maintv.getText().toString();
                maintv.setText(temp + "7");
                break;
            case R.id.num_8:
                temp = maintv.getText().toString();
                maintv.setText(temp + "8");
                break;
            case R.id.num_9:
                temp = maintv.getText().toString();
                maintv.setText(temp + "9");
                break;
            case R.id.btn_plus:
                temp = maintv.getText().toString();
                first = Integer.parseInt(temp);
                subtv.setText(temp + "+");
                maintv.setText("");
                how = 1;
                break;
            case R.id.btn_minus:
                temp = maintv.getText().toString();
                first = Integer.parseInt(temp);
                subtv.setText(temp + "-");
                maintv.setText("");
                how = 2;
                break;
            case R.id.btn_mul:
                temp = maintv.getText().toString();
                first = Integer.parseInt(temp);
                subtv.setText(temp + "*");
                maintv.setText("");
                how = 3;
                break;
            case R.id.btn_div:
                temp = maintv.getText().toString();
                first = Integer.parseInt(temp);
                subtv.setText(temp + "/");
                maintv.setText("");
                how = 4;
                break;
            case R.id.btn_c:
                maintv.setText("");
                subtv.setText("");
                how = 0;
                break;
            case R.id.btn_ce:
                maintv.setText("");
                break;
            case R.id.btn_del:
                if (maintv.length() != 0) {
                    temp = maintv.getText().toString();
                    maintv.setText(temp.substring(0, temp.length() - 1));
                }
                break;
            case R.id.btn_equal:
                if (maintv.length() != 0) {
                    switch (how) {
                        case 1:
                            second=Integer.parseInt(maintv.getText().toString());
                            result=first+second;
                            subtv.setText("");
                            maintv.setText(String.valueOf(result));

                            break;
                        case 2:
                            second=Integer.parseInt(maintv.getText().toString());
                            result=first-second;
                            subtv.setText("");
                            maintv.setText(String.valueOf(result));
                            break;
                        case 3:
                            second=Integer.parseInt(maintv.getText().toString());
                            result=first*second;
                            subtv.setText("");
                            maintv.setText(String.valueOf(result));
                            break;
                        case 4:
                            second=Integer.parseInt(maintv.getText().toString());
                            result=first/second;
                            subtv.setText("");
                            maintv.setText(String.valueOf(result));
                            break;
                    }
                }
                break;


        }
    }
}
