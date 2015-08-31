package com.example.docente05.example02_g2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalculadoraActivity extends ActionBarActivity {

    private Button btn7,btn8,btn9,btnmas,btnigual;
    private EditText edtvalor;
    double result=0,result1=0;
    boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        btn7 = (Button) findViewById(R.id.Btn7);
        btn8 = (Button) findViewById(R.id.Btn8);
        btn9 = (Button) findViewById(R.id.Btn9);
        btnmas = (Button) findViewById(R.id.BtnMas);
        btnigual = (Button) findViewById(R.id.BtnIgual);
        edtvalor = (EditText) findViewById(R.id.EdtValor);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn7.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn8.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn8.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn9.getText().toString());
                        edtvalor.setText(edtvalor.getText().toString() + btn9.getText().toString());
            }
        });
        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result+result1;
                edtvalor.setText(edtvalor.getText().toString()+btnmas.getText().toString());
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result+result1;
                edtvalor.setText(result+"");
                result1=0;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
