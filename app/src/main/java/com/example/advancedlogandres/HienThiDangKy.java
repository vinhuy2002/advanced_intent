package com.example.advancedlogandres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HienThiDangKy extends AppCompatActivity {

    TextView tvHoDem, tvTen, tvEmailDK, tvMatKhau, tvNgaySinh, tvGioiTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_dang_ky);

        tvHoDem = findViewById(R.id.tvHoDem);
        tvTen = findViewById(R.id.tvTen);
        tvEmailDK = findViewById(R.id.tvEmailDK);
        tvMatKhau = findViewById(R.id.tvMatKhau);
        tvNgaySinh = findViewById(R.id.tvNgaySinh);
        tvGioiTinh = findViewById(R.id.tvGioiTinh);

        Bundle bundle = getIntent().getExtras();

        tvHoDem.setText(bundle.getString("hodem"));
        tvTen.setText(bundle.getString("ten"));
        tvEmailDK.setText(bundle.getString("email"));
        tvMatKhau.setText(bundle.getString("matkhau"));
        tvNgaySinh.setText(bundle.getString("ngaysinh"));
        tvGioiTinh.setText(bundle.getString("gioitinh"));
    }
}