package com.example.kakaha.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.Stack;
import java.util.StringTokenizer;


public class MainActivity extends ActionBarActivity{

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String Calc(String str) {
        int cnt = 0;
        Stack<Integer> Stk_Num = new Stack<Integer>();
        StringTokenizer ST_Num = new StringTokenizer(str, "+-/x ");
        StringTokenizer ST_Oper = new StringTokenizer(str, "1234567890 ");

        Stk_Num.push(Integer.parseInt(ST_Num.nextToken()));
        while (ST_Num.hasMoreTokens()){
            char oper = ST_Oper.nextToken().charAt(0);
            String num = ST_Num.nextToken();
            int a;

            if (oper == 'x'){
                a = Stk_Num.pop();
                a *= Integer.parseInt(num);
                Stk_Num.push(a);

            }
            else if (oper == '/'){
                a = Stk_Num.pop();
                a /= Integer.parseInt(num);
                Stk_Num.push(a);
            }
            else if (oper == '+'){
                Stk_Num.push(Integer.parseInt(num));
            }
            else if (oper == '-'){
                Stk_Num.push(-1 * (Integer.parseInt(num)));
            }
        }
        while (!Stk_Num.isEmpty()){
            cnt += Stk_Num.pop();
        }
        return Integer.toString(cnt);
    }

    public void onClick(View v) {
        String id = null;
        String s;
        TextView et = ((TextView)findViewById(R.id.textView));
        if (et.getText().toString().charAt(0) == '0') et.setText("");

        switch (v.getId()){
            case R.id.button0:
                id = "0";
                break;
            case R.id.button1:
                id = "1";
                break;
            case R.id.button2:
                id = "2";
                break;
            case R.id.button3:
                id = "3";
                break;
            case R.id.button4:
                id = "4";
                break;
            case R.id.button5:
                id = "5";
                break;
            case R.id.button6:
                id = "6";
                break;
            case R.id.button7:
                id = "7";
                break;
            case R.id.button8:
                id = "8";
                break;
            case R.id.button9:
                id = "9";
                break;
            case R.id.button_plus:
                id = "+";
                break;
            case R.id.button_minus:
                id = "-";
                break;
            case R.id.button_multiply:
                id = "x";
                break;
            case R.id.button_division:
                id = "/";
                break;
            case R.id.button_equals:
                s = et.getText() + " = " + Calc(et.getText().toString());
                et.setText(s);
                return;
            default:
                break;
        }
        s = et.getText() + id;
        et.setText(s);
    }

    public void onClickClear(View v) {
        TextView et = ((TextView) findViewById(R.id.textView));
        et.setText("0");
    }
}