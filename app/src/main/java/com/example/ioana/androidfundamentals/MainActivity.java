package com.example.ioana.androidfundamentals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_MAIN ="MainActivity";
    private EditText mEditTextEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextEmail = findViewById(R.id.edittext_email);
    }

    public void btnClickMeOnClick(View view) {
        String email = mEditTextEmail.getText().toString();
        Log.e(TAG_MAIN, email);
    }
}
