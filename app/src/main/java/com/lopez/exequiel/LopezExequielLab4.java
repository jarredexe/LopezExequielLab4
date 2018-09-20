package com.lopez.exequiel;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LopezExequielLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lopez_exequiel_lab4);
    }

    public void displayToast(View v){
        Toast.makeText(LopezExequielLab4.this,"Returning",Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle", "BACKBACKBACKBACKBACKBACKBACKBACKBACKBACKBACKBACKBACKBACKBACKBACKBACKBACK");
    }

    public void displaySnackbar(View view) {
        Snackbar snackbar = Snackbar.make(findViewById(R.id.rootLayout), R.string.snackbar_message, Snackbar.LENGTH_LONG);
        snackbar.show();
        Log.d("Lifecycle", "NEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXTNEXT");
    }
}
