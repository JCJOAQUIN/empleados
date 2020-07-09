package com.example.empleados;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.example.empleados.ui.login.LoginFragment;
import com.example.empleados.ui.registro.RegistroFragment;

public class MainActivity extends AppCompatActivity implements LoginFragment.onFragmentInteractionListener,
        RegistroFragment.onFragmentInteractionListener{

    LoginFragment fragmentlogin;
    RegistroFragment fragmentregistro;
    Button btnbacklog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbacklog=findViewById(R.id.btnbacklogin);
        fragmentlogin=new LoginFragment();
        fragmentregistro=new RegistroFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor,fragmentlogin).commit();


    }
    public void onClick(View view)
    {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contenedor, fragmentregistro);
        transaction.addToBackStack(null);
        transaction.commit();
    }

       public void Login(View view)
    {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contenedor, fragmentlogin);
        transaction.commit();
    }



    public void Menu(View view)
    {
        Intent menu=new Intent(this, MenuActivity.class);
        startActivity(menu);
    }
}
