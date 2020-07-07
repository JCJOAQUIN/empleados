package com.example.empleados.ui.horarios;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HorariosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HorariosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Control de horarios");
    }

    public LiveData<String> getText() {
        return mText;
    }
}