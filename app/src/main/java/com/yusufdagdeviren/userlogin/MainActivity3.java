package com.yusufdagdeviren.userlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    EditText editText3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        UserInformation.userName ="";
        UserInformation.password = "";

        editText = findViewById(R.id.editTextTextPersonName3);
        editText2 = findViewById(R.id.editTextTextPersonName4);
        editText3 = findViewById(R.id.editTextTextPersonName6);


    }

    public void enter(View view){

        String password = editText2.getText().toString();
        String rePassword = editText3.getText().toString();
        String userName = editText.getText().toString();

        if(!(userName.isEmpty()) && !(password.isEmpty()) && !(rePassword.isEmpty())){
            if(password.equals(rePassword)){

                UserInformation.password = password;
                UserInformation.userName = userName;
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(getApplicationContext(),"please enter the password correctly",Toast.LENGTH_LONG).show();
            }

        }
        else{

            Toast.makeText(getApplicationContext(),"Please fill in the box",Toast.LENGTH_LONG).show();

        }






    }



}