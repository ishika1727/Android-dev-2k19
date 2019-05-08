package com.ishikadubey.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button one, two, three, four, five, six, seven, eight, nine, add, sub, mul, div, zero, clr, eq;
    public TextView result;
    int var1,var2;
    boolean ad,sb,ml,dv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero= (Button) findViewById(R.id.button0);
        one=(Button) findViewById(R.id.button1);
        two=(Button) findViewById(R.id.button2);
        three=(Button) findViewById(R.id.button3);
        four=(Button) findViewById(R.id.button4);
        five=(Button) findViewById(R.id.button5);
        six=(Button) findViewById(R.id.button6);
        seven=(Button) findViewById(R.id.button7);
        eight=(Button) findViewById(R.id.button8);
        nine=(Button) findViewById(R.id.button9);
        add=(Button) findViewById(R.id.buttonadd);
        sub=(Button) findViewById(R.id.buttonsub);
        mul=(Button) findViewById(R.id.buttonmul);
        div=(Button) findViewById(R.id.buttondiv);
        eq=(Button) findViewById(R.id.buttoneq);
        clr=(Button) findViewById(R.id.buttonclr);
        result=(TextView) findViewById(R.id.result);

        result.setText("0");
        ad=false;
        sb=false;
        ml=false;
        dv=false;

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("0");
                ad=false;
                sb=false;
                ml=false;
                dv=false;
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                var1=Integer.parseInt(result.getText()+"");
                ad=true;
                result.setText(null);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                var1=Integer.parseInt(result.getText()+"");
                sb=true;
                result.setText(null);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                var1=Integer.parseInt(result.getText()+"");
                ml=true;
                result.setText(null);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                var1=Integer.parseInt(result.getText()+"");
                dv=true;
                result.setText(null);

            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                var2=Integer.parseInt(result.getText()+"");
                if(ad==true)
                {
                    result.setText(var1+var2+"");
                    ad=false;
                }
                if(sb==true)
                {
                    result.setText(var1-var2+"");
                    sb=false;
                }
                if(ml==true)
                {
                    result.setText(var1*var2+"");
                    ml=false;
                }
                if(dv==true)
                {
                    result.setText(var1/var2+"");
                    dv=false;
                }

            }
        });


    }
}
