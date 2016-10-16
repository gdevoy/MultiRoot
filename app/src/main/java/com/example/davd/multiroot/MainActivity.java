package com.example.davd.multiroot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.text.DecimalFormat;

import static android.R.attr.order;

public class MainActivity extends AppCompatActivity {

    Button square, cube;
    EditText ipt, opt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        square=(Button)findViewById(R.id.button_blueInvisible);
        cube=(Button)findViewById(R.id.button_pinkPanther);
        ipt = (EditText)findViewById(R.id.input);
        opt = (EditText)findViewById(R.id.output);
    }

    public void toDo (View v){

        Root ans = new Root();    // create a new root object called ans
        int order,co_nt=0,order1=0;
        double est=0.0;
        double num = Double.valueOf(ipt.getText().toString());
        DecimalFormat formatVal = new DecimalFormat("##.##");

        // check button action


        if (v.equals(square)) {
            //create a square root object

            order = 2;
            ans.setOrder(order);      // set the root order
            ans.setNum(num);          // set the number to be evaluated

            if (num < 0) {
                opt.setText("No negs");
            }
        else
            {
                est = ans.eval();           // evaluate the root

                order1 = ans.getOrder();
                co_nt = ans.getCount();

                opt.setText(formatVal.format(est));
                System.out.println("The " + order1 + " root of " + num + " = " + est);
                System.out.println("This was determined by " + co_nt + " itterations ");
            }
        }

        if (v.equals(cube)){
               // create a cube root object
               order = 3;
               ans.setOrder(order);      // set the root order
               ans.setNum(num);          // set the number to be evaluated


               est = ans.eval();           // evaluate the root

               order1 = ans.getOrder();
               co_nt = ans.getCount();

               opt.setText(formatVal.format(est));

//            System.out.println("The " + order1 + " root of " + num + " = " + est);
//            System.out.println("This was determined by " + co_nt + " itterations ");
        }

    }

}


