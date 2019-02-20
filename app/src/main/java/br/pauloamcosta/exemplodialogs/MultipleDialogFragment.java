package br.pauloamcosta.exemplodialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class MultipleDialogFragment extends DialogFragment implements DialogInterface.OnMultiChoiceClickListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        boolean[] checkeds = {false, true, false, true, false};
        return new AlertDialog.Builder(getActivity())
                .setTitle("Escolha uma ou mais linguagens")
                .setMultiChoiceItems(R.array.linguagens, checkeds, this)
                .create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
        String[] linguagens = getActivity().getResources().getStringArray(R.array.linguagens);
        String linguagem = linguagens[which];

        if(isChecked) {
            Toast.makeText(getActivity(), "Você escolheu a linguagem  " + linguagem, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getActivity(), "Você não escolheu a linguagem  "+ linguagem, Toast.LENGTH_SHORT).show();
        }
    }
}
