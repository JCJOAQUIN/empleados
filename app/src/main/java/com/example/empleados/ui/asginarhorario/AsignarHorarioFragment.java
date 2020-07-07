package com.example.empleados.ui.asginarhorario;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.empleados.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AsignarHorarioFragment extends Fragment {

    public AsignarHorarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_asignar_horario, container, false);
    }
}
