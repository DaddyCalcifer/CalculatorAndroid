package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public Double num1, num2, result;
    boolean calculated = false, entered1 = false;
    TextView labelView = findViewById(R.id.labelSHow);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void clearAll()
    {
        num1 = num2 = result = 0.;
        calculated = entered1 = false;
    }
    @SuppressLint("SetTextI18n")
    void enterNum(Integer num)
    {
        if(calculated)
        {
            clearAll();
        }
        if(!entered1)
        {
            num1 = Double.parseDouble(num1.toString() + num.toString());
            labelView.setText(num1.toString());
        }
        else
        {
            num2 = Double.parseDouble(num2.toString() + num.toString());
            labelView.setText(num2.toString());
        }
    }
    public void clickOne(View view)
    {
        enterNum(1);
    }
    public void clickTwo(View view)
    {
        enterNum(2);
    }
    public void clickThree(View view)
    {
        enterNum(3);
    }
    public void clickFour(View view)
    {
        enterNum(4);
    }
    public void clickFive(View view)
    {
        enterNum(5);
    }
    public void clickSix(View view)
    {
        enterNum(6);
    }
    public void clickSeven(View view)
    {
        enterNum(7);
    }
    public void clickEight(View view)
    {
        enterNum(8);
    }
    public void clickNine(View view)
    {
        enterNum(9);
    }
    public void clickZero(View view)
    {
        enterNum(0);
    }
    @SuppressLint("SetTextI18n")
    public void clickPlus(View view)
    {
        if(entered1 && num2 != null)
        {
            Double res = num1 + num2;
            Toast.makeText(this, Double.toString(res),Toast.LENGTH_SHORT).show();
            labelView.setText(res.toString());
            calculated = true;
        }
        else {
            entered1 = true;
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickMinus(View view)
    {
        if(entered1 && num2 != null)
        {
            Double res = num1 - num2;
            Toast.makeText(this, res.toString() ,Toast.LENGTH_SHORT).show();
            labelView.setText(res.toString());
            calculated = true;
        }
        else {
            entered1 = true;
        }
    }
}