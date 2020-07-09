package com.example.empleados.ui.empleados;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.empleados.R;

public class EmpleadosFragment extends Fragment {

    private EmpleadosViewModel empleadosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        empleadosViewModel =
                ViewModelProviders.of(this).get(EmpleadosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_empleados, container, false);
       // final TextView textView = root.findViewById(R.id.text_gallery);
        empleadosViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            //    textView.setText(s);
            }
        });
        return root;
    }
}
