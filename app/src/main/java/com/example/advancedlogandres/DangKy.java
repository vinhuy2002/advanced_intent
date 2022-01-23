package com.example.advancedlogandres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class DangKy extends AppCompatActivity {

    EditText etHoDem, etTen, etEmail, etMatKhau, etNgaySinh;
    String gioiTinh;
    TextView tvDangKyTK, tvDangNhapNgay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        etHoDem = findViewById(R.id.etHoDem);
        etTen = findViewById(R.id.etTen);
        etEmail = findViewById(R.id.etEmail);
        etMatKhau = findViewById(R.id.etMatKhau);
        etNgaySinh = findViewById(R.id.etNgaySinh);
        gioiTinh = null;

        tvDangKyTK = findViewById(R.id.tvDangKyTK);
        tvDangNhapNgay = findViewById(R.id.tvDangNhapNgay);

        tvDangKyTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( getApplicationContext(), HienThiDangKy.class);
                intent.putExtra("hodem", etHoDem.getText().toString().trim());
                intent.putExtra("ten", etTen.getText().toString().trim());
                intent.putExtra("email", etEmail.getText().toString().trim());
                intent.putExtra("matkhau", etMatKhau.getText().toString().trim());
                intent.putExtra("ngaysinh", etNgaySinh.getText().toString().trim());
                intent.putExtra("gioitinh", gioiTinh);
                startActivity(intent);
            }
        });

        tvDangNhapNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }

    public void radioGioiTinh(View view){
        boolean kt = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.rbNam:
                if (kt){
                    gioiTinh = "Nam";
                }
                break;
            case R.id.rbNu:
                if (kt){
                    gioiTinh = "Nữ";
                }
                break;
            case R.id.rbKhac:
                if(kt){
                    gioiTinh = "Khác";
                }
                break;
        }
    }
}