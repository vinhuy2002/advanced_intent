package com.example.advancedlogandres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dangKyNgay, tvDangNhap1;
    EditText editEmail, editMatKhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.editEmail);
        editMatKhau = findViewById(R.id.editMatKhau);

        dangKyNgay = findViewById(R.id.dangKyNgay);
        dangKyNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DangKy.class);
                startActivity(intent);
            }
        });

        tvDangNhap1 = findViewById(R.id.tvDangNhap1);
        tvDangNhap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HienThiDangNhap.class);
                intent.putExtra("email", editEmail.getText().toString().trim());
                intent.putExtra("pass", editMatKhau.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}