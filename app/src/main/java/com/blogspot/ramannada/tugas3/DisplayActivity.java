package com.blogspot.ramannada.tugas3;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView tvName;
    TextView tvUsername;
    TextView tvEmail;
    TextView tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tvName = (TextView) findViewById(R.id.tv_name);
        tvUsername = (TextView) findViewById(R.id.tv_username);
        tvEmail = (TextView) findViewById(R.id.tv_email);
        tvPhone = (TextView) findViewById(R.id.tv_phone);

        Person person = getIntent().getParcelableExtra(MainActivity.PERSON_KEY);


        tvName.setText(person.getName());
        tvUsername.setText(person.getUsername());
        tvEmail.setText(person.getEmail());
        tvPhone.setText(person.getPhoneNumber());

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
