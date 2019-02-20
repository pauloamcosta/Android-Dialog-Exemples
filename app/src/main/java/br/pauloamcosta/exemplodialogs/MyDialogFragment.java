package br.pauloamcosta.exemplodialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Pergunta")
                .setMessage("Voce entendeu como funciona um dialog?")
                .setPositiveButton("Sim", this)
                .setNegativeButton("Não", this);
        return builder.create();

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

        //Descobrindo em qual clicou e exibindo um toast
        String msg = null;
        if(which == DialogInterface.BUTTON_POSITIVE){
            msg = "Voce Escolheu Sim";
        }else if(which == DialogInterface.BUTTON_NEGATIVE){
            msg = "Voce Escolheu Não";
        }

        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
