package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText txtTempoGasto;
        EditText txtVelocidadeMedia;
        EditText txtRedimentoVeiculo;
        EditText txtDistancia;
        TextView lblDistancia;
        TextView lblConsumo;


        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            txtTempoGasto= findViewById(R.id.txtTempoGasto);
            txtVelocidadeMedia= findViewById(R.id.txtVelocidadeMedia);
            txtRedimentoVeiculo= findViewById(R.id.txtRedimentoVeiculo);
            lblDistancia = findViewById(R.id.lblDistancia);
            lblConsumo = findViewById(R.id.lblConsumo);
        }

        public void onCalcular(View v) {

                int TempoGasto = Integer.parseInt(txtTempoGasto.getText().toString());
                int VelocidadeMedia = Integer.parseInt(txtVelocidadeMedia.getText().toString());
                int Distancia = Integer.parseInt(txtDistancia.getText().toString());
                Distancia = TempoGasto * VelocidadeMedia;
                txtDistancia.setText(Distancia);

            }
        }
    }