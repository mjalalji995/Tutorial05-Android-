package com.example.tutorial5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView txtfnm,txtlnm,txtunm,txtpass,txtbranch,txtcity,txtgen,txtst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txtfnm=findViewById(R.id.txtfnm);
        txtlnm=findViewById(R.id.txtlnm);
        txtunm=findViewById(R.id.txtunm);
        txtpass=findViewById(R.id.txtpass);
        txtbranch=findViewById(R.id.txtbranch);
        txtcity=findViewById(R.id.txtcity);
        txtgen=findViewById(R.id.txtgen);
        txtst=findViewById(R.id.txtst);

        String fname=getIntent().getStringExtra("fname");
        String lname=getIntent().getStringExtra("lname");
        String email=getIntent().getStringExtra("email");
        String pass=getIntent().getStringExtra("pass");
        String sw=getIntent().getStringExtra("swc");
        String spnr=getIntent().getStringExtra("spn");
        String rbtn=getIntent().getStringExtra("rbtn");
        String chk=getIntent().getStringExtra("chkb");

        String t1=txtfnm.getText().toString();
        String t2=txtlnm.getText().toString();
        String t3=txtunm.getText().toString();
        String t4=txtpass.getText().toString();
        String t5=txtbranch.getText().toString();
        String t6=txtcity.getText().toString();
        String t7=txtgen.getText().toString();
        String t8=txtst.getText().toString();

        t1+=fname;
        t2+=lname;
        t3+=email;
        t4+=pass;
        t5+=sw;
        t6+=spnr;
        t7+=rbtn;
        t8+=chk;

        txtfnm.setText(t1);
        txtlnm.setText(t2);
        txtunm.setText(t3);
        txtpass.setText(t4);
        txtbranch.setText(t5);
        txtcity.setText(t6);
        txtgen.setText(t7);
        txtst.setText(t8);
    }


}