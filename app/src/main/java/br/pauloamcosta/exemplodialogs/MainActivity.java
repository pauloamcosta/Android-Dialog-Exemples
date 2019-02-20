package br.pauloamcosta.exemplodialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//método para abrir dialog padrao
    public void openDialog(View view) {
        MyDialogFragment dialog = new MyDialogFragment();
        dialog.show(getSupportFragmentManager(), "dialog");
    }

//método para abrir dialog Simples
    public void openSimple(View view) {
        SimpleDialogFragment simpleDialog = new SimpleDialogFragment();
        simpleDialog.show(getSupportFragmentManager(), "simpleDialog");
    }

//método para abrir dialog com Radio Button
    public void openRadio(View view) {
        RadioDialogFragment radioDialogFragment = new RadioDialogFragment();
        radioDialogFragment.show(getSupportFragmentManager(), "radioDialogFragment");
    }

//método para abrir dialog com seleções multiplas
    public void openMultiplo(View view) {
        MultipleDialogFragment multipleDialogFragment = new MultipleDialogFragment();
        multipleDialogFragment.show(getSupportFragmentManager(), "multipleDialogFragment");
    }

    public void openDialogEdit(View view) {
        MyEditDialog.show(getSupportFragmentManager(), new MyEditDialog.OnTextListener() {
            @Override
            public void onSetText(String text) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
