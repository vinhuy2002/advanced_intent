package com.example.advancedlogandres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HienThiDangNhap extends AppCompatActivity {

    TextView thongTinEmail, thongTinPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_dang_nhap);

        thongTinEmail = findViewById(R.id.thongTinEmail);
        thongTinPass = findViewById(R.id.thongTinPass);

        Bundle bundle = getIntent().getExtras();

        thongTinEmail.setText(bundle.getString("email"));
        thongTinPass.setText(bundle.getString("pass"));
    }
}