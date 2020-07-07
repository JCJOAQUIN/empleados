package com.example.empleados.ui.terminosycondiciones;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.empleados.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TerminosYCondicionesFragment extends Fragment {

    public TerminosYCondicionesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_terminos_y_condiciones, container, false);
    }
}
