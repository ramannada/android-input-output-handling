package com.blogspot.ramannada.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private EditText etUsername;
    private EditText etEmail;
    private EditText etTelp;
    private Button btn;
    private Person person;
    public static final String PERSON_KEY = "personObj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.btn_save);
        etName = (EditText) findViewById(R.id.et_name);
        etUsername = (EditText) findViewById(R.id.et_username);
        etEmail = (EditText) findViewById(R.id.et_email);
        etTelp = (EditText) findViewById(R.id.et_no_telp);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                person = new Person(etName.getText().toString(), etUsername.getText().toString(),
                                etEmail.getText().toString(), etTelp.getText().toString());
                Intent i = new Intent(MainActivity.this, DisplayActivity.class);

                Log.d("person objek", person.toString());
                i.putExtra(PERSON_KEY, person);

                startActivity(i);
            }
        });
    }


}
