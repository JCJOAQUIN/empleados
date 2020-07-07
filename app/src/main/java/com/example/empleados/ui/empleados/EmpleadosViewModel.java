package com.example.empleados.ui.empleados;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EmpleadosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EmpleadosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Control de empleados");
    }

    public LiveData<String> getText() {
        return mText;
    }
}