package com.example.slavicshop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {

    private Button button, InsertData;
    private EditText email, phone;
    private String nameProduct;

    private DatabaseReference order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        InsertData = findViewById(R.id.go);
        email = findViewById(R.id.editTextTextEmailAddress);
        phone = findViewById(R.id.editTextPhone);
        nameProduct = "Валькнут 5000р";

        order = FirebaseDatabase.getInstance().getReference().child("Orders");

        InsertData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (email.getText().toString().isEmpty() || phone.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Все поля должны быть заполнены", Toast.LENGTH_SHORT).show();
                }else {
                    insertOrders();
                    openActivity();
                }
            }
        });

        button = (Button) findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    private void insertOrders() {

        String eml = email.getText().toString();
        String tel = phone.getText().toString();
        String nameP = nameProduct;

        Orders orders = new Orders(eml, tel, nameP);

        order.push().setValue(orders);
        Toast.makeText(MainActivity2.this, "Заказ отправлен", Toast.LENGTH_SHORT).show();

    }

    private void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}