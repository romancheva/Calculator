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

    // private TextView cifra;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        cifra=(TextView)findViewById(R.id.textView);
//
//        Button mybutton7 = (Button)findViewById(R.id.button7);
//        mybutton7.setOnClickListener(new View.OnClickListener(){
//            @Override
//        public void onClick(View view){
//                cifra.setText(R.string.button7);
//            }
//        });
        // cifra = (TextView)findViewById(R.id.textView);
//        final Button button0 = (Button)findViewById(R.id.button0);
//        final Button button1 = (Button)findViewById(R.id.button1);
//        final Button button2 = (Button)findViewById(R.id.button2);
//        final Button button3 = (Button)findViewById(R.id.button3);
//        final Button button4 = (Button)findViewById(R.id.button4);
//        final Button button5 = (Button)findViewById(R.id.button5);
//        final Button button6 = (Button)findViewById(R.id.button6);
//        final Button button7 = (Button)findViewById(R.id.button7);
//        final Button button8 = (Button)findViewById(R.id.button8);
//        final Button button9 = (Button)findViewById(R.id.button9);
//        final Button button_dot = (Button)findViewById(R.id.button_dot);
//        final Button button_equals = (Button)findViewById(R.id.button_equals);
//        final Button button_c = (Button)findViewById(R.id.button_C);
//        final Button button_division = (Button)findViewById(R.id.button_division);
//        final Button button_plus = (Button)findViewById(R.id.button_plus);
//        final Button button_minus = (Button)findViewById(R.id.button_minus);
//
//
//    button0.setOnClickListener(this);
//    button1.setOnClickListener(this);
//    button2.setOnClickListener(this);
//    button3.setOnClickListener(this);
//    button4.setOnClickListener(this);
//    button5.setOnClickListener(this);
//    button6.setOnClickListener(this);
//    button7.setOnClickListener(this);
//    button8.setOnClickListener(this);
//    button9.setOnClickListener(this);
//    button_dot.setOnClickListener(this);
//    button_equals.setOnClickListener(this);
//    button_c.setOnClickListener(this);
//    button_division.setOnClickListener(this);
//    button_plus.setOnClickListener(this);
//    button_minus.setOnClickListener(this);
//        ((Button)findViewById(R.id.button1)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button2)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button3)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button4)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button5)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button6)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button7)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button8)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button9)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button0)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button_plus)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button_minus)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button_multiply)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button_division)).setOnClickListener(on_Click);
//        ((Button)findViewById(R.id.button_equals)).setOnClickListener(on_Click);
        //((Button)findViewById(R.id.button_dot)).setOnClickListener(on_Click);


//        ((Button) findViewById(R.id.button_C)).setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                TextView et = ((TextView) findViewById(R.id.textView));
//                et.setText("0");
//            }
//        });
    }


//    private View.OnClickListener on_Click = new View.OnClickListener() {
//
//        public void onClick(View v) {
//            String id = null;
//            String s;
//            TextView et = ((TextView)findViewById(R.id.textView));
//            if (et.getText().toString().charAt(0) == '0') et.setText("");
//
//            switch (v.getId()){
//                case R.id.button0:
//                    id = "0";
//                    break;
//                case R.id.button1:
//                    id = "1";
//                    break;
//                case R.id.button2:
//                    id = "2";
//                    break;
//                case R.id.button3:
//                    id = "3";
//                    break;
//                case R.id.button4:
//                    id = "4";
//                    break;
//                case R.id.button5:
//                    id = "5";
//                    break;
//                case R.id.button6:
//                    id = "6";
//                    break;
//                case R.id.button7:
//                    id = "7";
//                    break;
//                case R.id.button8:
//                    id = "8";
//                    break;
//                case R.id.button9:
//                    id = "9";
//                    break;
//                case R.id.button_plus:
//                    id = "+";
//                    break;
//                case R.id.button_minus:
//                    id = "-";
//                    break;
//                case R.id.button_multiply:
//                    id = "x";
//                    break;
//                case R.id.button_division:
//                    id = "/";
//                    break;
//                case R.id.button_equals:
//                    s = et.getText() + " = " + Calc(et.getText().toString());
//                    et.setText(s);
//                    return;
//                default:
//                    break;
//            }
//            s = et.getText() + id;
//            et.setText(s);
//        }
//    };


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

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