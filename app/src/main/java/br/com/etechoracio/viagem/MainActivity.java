package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText txtTempoGasto;
        EditText txtRendimentoVeiculo;
        EditText txtVelocidadeMedia;
        TextView lblDistancia2;
        TextView lblConsumo2;


        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            txtTempoGasto= findViewById(R.id.txtTempoGasto);
            txtVelocidadeMedia= findViewById(R.id.txtVelocidadeMedia);
            txtRendimentoVeiculo= findViewById(R.id.txtRendimentoVeiculo);
            lblDistancia2 = findViewById(R.id.lblDistancia2);
            lblConsumo2 = findViewById(R.id.lblConsumo2);

        }

        public void onCalcular(View v) {

                double TempoGasto = Double.parseDouble(txtTempoGasto.getText().toString());
                int RendimentoVeiculo =  Integer.parseInt(txtRendimentoVeiculo.getText().toString());
                int VelocidadeMedia =  Integer.parseInt(txtVelocidadeMedia.getText().toString());
                double Distancia  = TempoGasto * VelocidadeMedia;
                lblDistancia2.setText("" + Distancia);
                double Consumo = Distancia / RendimentoVeiculo;
                lblConsumo2.setText("" + Consumo);

            }
        }
