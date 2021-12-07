package com.learnlity.learnity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.learnlity.learnity.Registro.PerfilUsuario;

public class MainActivity extends AppCompatActivity {

    private String ciudad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==event.KEYCODE_BACK){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);

            builder.setMessage("Desea salir de Learnity?")
                    .setPositiveButton("si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent  intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        }
                    }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.show();

        }
        return super.onKeyDown(keyCode, event);
    }
//Actividades del menu

   /* public void Siguiente1(View view){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);

    }*/

    public void Siguiente2(View view){
        Intent cursos = new Intent(this, ActivityCursos.class);
        startActivity(cursos);
        Toast.makeText(this, "Cursos", Toast.LENGTH_SHORT).show();

    }
    public void Siguiente3(View view){
        Intent perfil = new Intent(this, PerfilUsuario.class);
        startActivity(perfil);
        Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();
    }

}