package com.example.pc08.lolliapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity {

    Spinner dia;
    Spinner mes;
    Spinner anio;

    EditText Text;
    TextView View;
    ,
    String[] dias = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    String[] anios = {"1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995"};


    public void OnClick(View view){
        Text = (EditText) findViewById(R.id.Text);
        View = (TextView) findViewById(R.id.View1);
        Mes = (Spinner) findViewById(R.id.)
        //String s = Text.getText().toString();
        String mes =
        textView.setText("Hola "+s);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dia = (Spinner) findViewById(R.id.Dia);
        ArrayAdapter<String> adDia = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,dias);
        dia.setAdapter(adDia);

        mes = (Spinner)findViewById(R.id.Mes);
        ArrayAdapter<String> adMes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,meses);
        mes.setAdapter(adMes);

        anio = (Spinner)findViewById(R.id.Anio);
        ArrayAdapter<String> adAnio = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,anios);
        anio.setAdapter(adAnio);

        mes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String mes = getString(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        }

    }
