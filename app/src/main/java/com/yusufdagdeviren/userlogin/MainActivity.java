package com.yusufdagdeviren.userlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPersonName2);


    }
    public void login(View view){


        String userName = editText.getText().toString();
        String password = editText2.getText().toString();

     if(!(userName.isEmpty()) || !(password.isEmpty())){

         if(UserInformation.userName.equals("") && UserInformation.password.equals("")){
             Toast.makeText(getApplicationContext(),"Please register",Toast.LENGTH_LONG).show();
         }

         else{
             if(UserInformation.userName.equals(editText.getText().toString()) && UserInformation.password.equals(editText2.getText().toString())  ){

                 Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                 startActivity(intent);


             }
             else{
                 Toast.makeText(getApplicationContext(),"username or password is incorrect",Toast.LENGTH_LONG).show();
             }

         }



     }

     else{

         Toast.makeText(getApplicationContext(),"please fill in the box",Toast.LENGTH_LONG).show();
     }




    }
    public void register(View view){

    Intent intent2 = new Intent(getApplicationContext(),MainActivity3.class);
    startActivity(intent2);



    }








}