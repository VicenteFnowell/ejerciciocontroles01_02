package com.example.ejerciciocontroles01_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnverpedido;
    CheckBox cbensalada,cbtwister,cbboxmaster,cbtiras,cbalitas,cbrocks;
    RadioGroup rgbebida;
    Spinner sprefrescos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Identificación de vistas
        btnverpedido = (Button)findViewById(R.id.btnpedido);
        cbensalada = (CheckBox) findViewById(R.id.cb_ensalada);
        cbtwister = (CheckBox) findViewById(R.id.cb_twister);
        cbboxmaster = (CheckBox) findViewById(R.id.cb_boxmaster);
        cbtiras = (CheckBox) findViewById(R.id.cb_tiras);
        cbalitas = (CheckBox) findViewById(R.id.cb_alitas);
        cbrocks = (CheckBox) findViewById(R.id.cb_rocks);
        rgbebida = (RadioGroup) findViewById(R.id.rg_bebida);
        sprefrescos = (Spinner)findViewById(R.id.sp_refrescos);

        String [] refrescos = {"Coca Cola","Coca Cola Light", "Coca Cola Zero", "Fanta Naranja","Fanta Limón", "Nestea"};

        ArrayAdapter<String> adaptarefrescos = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,refrescos);

        sprefrescos.setAdapter(adaptarefrescos);





    }//FIN ONCREATE

//EVENTO BOTON PEDIDO

    public void pulsarverpedido (View view){

        //Comprobar elementos chequeados

        String pedido = "";

        if (cbensalada.isChecked()){
            pedido+= "Ensalada ";

        }

        if (cbtwister.isChecked()){
            pedido+= "Twister ";

        }

        if (cbtiras.isChecked()){
            pedido+= "Tiras de Pechuga ";

        }

        if (cbalitas.isChecked()){
            pedido+= "Alitas ";

        }

        if (cbrocks.isChecked()){
            pedido+= "Chicken Rocks ";

        }

        Toast.makeText(getApplicationContext(),"Ha seleccionado: "+pedido,Toast.LENGTH_LONG).show();


        //Elementos RadioButtons

        int id=rgbebida.getCheckedRadioButtonId();
        RadioButton rbSeleccionado = (RadioButton)findViewById(id);
        String textoRbSeleccionado = rbSeleccionado.getText().toString();

        Toast.makeText(getApplicationContext(),"Bebida: "+textoRbSeleccionado,
                Toast.LENGTH_LONG).show();


        //Elementos Spinner
        String refrescoseleccionado = sprefrescos.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(),"Tu refresco es "+refrescoseleccionado, Toast.LENGTH_LONG).show();





    }




}
