package com.ronicode.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View view){

        Intent i = new Intent(this, MapsActivity.class);

        switch (view.getId()){

            case R.id.imgMuseo:
                i.putExtra("LUGAR", "Museo de Arte Moderno");
                i.putExtra("LATITUD", 11.001602472519629);
                i.putExtra("LONGITUD", -74.80143747497443);
                i.putExtra("PUNTERO", R.drawable.puntero_museo);
                break;

            case R.id.imgEstadio:
                i.putExtra("LUGAR", "Estadio Metropolitano Roberto Meléndez");
                i.putExtra("LATITUD", 10.926715512435507);
                i.putExtra("LONGITUD", -74.79998774100189);
                i.putExtra("PUNTERO", R.drawable.puntero_estadio);
                break;

            case R.id.imgPlaza:
                i.putExtra("LUGAR", "Plaza De La Aduana");
                i.putExtra("LATITUD", 10.988797341632976);
                i.putExtra("LONGITUD", -74.77813276667241);
                i.putExtra("PUNTERO", R.drawable.puntero_plaza);
                break;

            case R.id.imgAvenida:
                i.putExtra("LUGAR", "Avenida del Rio");
                i.putExtra("LATITUD", 10.995219559309808);
                i.putExtra("LONGITUD", -74.76959462482576);
                i.putExtra("PUNTERO", R.drawable.puntero_avenida);
                break;

        }

        startActivity(i);
    }
}
