package br.pauloamcosta.exemplodialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class RadioDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
       return new AlertDialog.Builder(getActivity())
               .setTitle("Escolha uma linguagem")
               .setSingleChoiceItems(R.array.linguagens, 2, this).create();

    }


    @Override
    public void onClick(DialogInterface dialog, int which) {
        String[] linguagens = getActivity().getResources().getStringArray(R.array.linguagens);
        String linguagem = linguagens[which];

        Toast.makeText(getActivity(), linguagem, Toast.LENGTH_SHORT).show();
    }
}
