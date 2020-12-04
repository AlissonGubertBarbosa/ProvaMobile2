package com.e.provamobile;

import android.os.Build;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtNome;
    EditText txtNomeDono;
    EditText txtMatricula;
    EditText txtIdade;
    FloatAction buttonAdd;

    private Equino equino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = (EditText)findViewById(txtNome);
        txtNomeDono = (EditText)findViewById(txtNomeDono);
        txtMatricula = (EditText)findViewById(txtMatricula);
        txtIdade = (EditText)findViewById(txtIdade);
        Button button = (Button) findViewById(R.id.bottom);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });



    }

    private Object findViewById(EditText txtIdade) {

        return null;
    }


    private Equino getEquino(){
        this.equino = new Equino();

        if(this.txtNome.getText().toString().isEmpty() == false){
            this.equino.setNome(this.txtNome.getText().toString());
        }else{
            return null;
        }

        if(this.txtNomeDono.getText().toString().isEmpty() == false){
            this.equino.setNomeDono(this.txtNomeDono.getText().toString());
        }else {
            return null;
        }

        if (this.txtMatricula.getText().toString().isEmpty() == false){
            this.equino.setMatricula(Integer.parseInt(this.txtMatricula.getText().toString()));
        }else{
            return null;
        }


        return null;
    }

}
