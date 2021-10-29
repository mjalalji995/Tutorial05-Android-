package com.example.tutorial5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edfnm,edlnm,edemail,edpass;
    Switch sw;
    RadioGroup rg1;
    RadioButton rbtn;
    Spinner spnr;
    CheckBox chk1;
    Button btnregister;
    TextView txtswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(getResources().getString(R.string.title));
        edfnm=findViewById(R.id.edtfnm);
        edlnm=findViewById(R.id.edtlnm);
        edemail=findViewById(R.id.edtemail);
        edpass=findViewById(R.id.edtpass);
        sw=findViewById(R.id.swich);
        rg1=findViewById(R.id.radiogrp);
        chk1=findViewById(R.id.chk);
        String check="Active";
        String uncheck="Inactive";
        spnr=findViewById(R.id.spin);
        btnregister=findViewById(R.id.btn);
        String SwitchOn = "IT";
        String SwitchOff = "CE";
        txtswitch=findViewById(R.id.txtswitch);


        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname=edfnm.getText().toString();
                String lname=edlnm.getText().toString();
                String email=edemail.getText().toString();
                String pass=edpass.getText().toString();
                String s = txtswitch.getText().toString();
                int select=rg1.getCheckedRadioButtonId();
                rbtn=(RadioButton)findViewById(select);
                String gender=rbtn.getText().toString();
                String spn=spnr.getSelectedItem().toString();
                String chkb=chk1.getText().toString();

                chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(isChecked){
                            chk1.setText(check);
                        }
                        else{
                            chk1.setText(uncheck);
                        }
                    }
                });
                if(chk1.isChecked()){
                    chkb="Active";
                }
                else{
                    chkb="Inactive";
                }
                sw.setChecked(true);
                sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(isChecked){
                            txtswitch.setText(SwitchOn);
                        }
                        else {
                            txtswitch.setText(SwitchOff);
                        }
                    }
                });
                if(sw.isChecked()){
                    s="IT";
                }
                else {
                    s="CE";
                }

                Intent i=new Intent(MainActivity.this,Home.class);
                i.putExtra("fname",fname);
                i.putExtra("lname",lname);
                i.putExtra("email",email);
                i.putExtra("pass",pass);
                i.putExtra("swc",s);
                i.putExtra("spn",spn);
                i.putExtra("rbtn",gender);
                i.putExtra("chkb",chkb);
                startActivity(i);


            }
        });
    }


}