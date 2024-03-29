package com.IsaacFigueroa.NJFTRUS;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainData extends AppCompatActivity {

    EditText name, contact, dob;

    Button insert, update, delete, view;

    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        name = findViewById(R.id.name);
        contact = findViewById(R.id.contact);
        dob = findViewById(R.id.dob);
        insert = findViewById(R.id.btnInsert);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnUpdateDelete);
        view = findViewById(R.id.btnView);

        DB = new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String dobTXT = dob.getText().toString();

                Boolean checkinsertData = DB.insertuserdata(nameTXT, contactTXT, dobTXT);

                if(checkinsertData==true){
                    Toast.makeText(MainData.this,
                            "New Entry Inserted",
                            Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(MainData.this,
                            "New Entry Not Inserted",
                            Toast.LENGTH_SHORT).show();

                }

            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String dobTXT = dob.getText().toString();

                Boolean checkupdateData = DB.updateuserdata(nameTXT, contactTXT, dobTXT);

                if(checkupdateData==true){
                    Toast.makeText(MainData.this,
                            "Entry Updated",
                            Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(MainData.this,
                            "Entry Not Updated",
                            Toast.LENGTH_SHORT).show();

                }

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameTXT = name.getText().toString();


                Boolean checkdeleteData = DB.deleteuserdata(nameTXT);

                if(checkdeleteData==true){
                    Toast.makeText(MainData.this,
                            "Entry Deleted",
                            Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(MainData.this,
                            "Entry Not Deleted",
                            Toast.LENGTH_SHORT).show();

                }

            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if (res.getCount() == 0){
                    Toast.makeText(MainData.this,
                            "No entry exists",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name" + res.getString(0)+ "\n");
                    buffer.append("Contact" + res.getString(1)+ "\n");
                    buffer.append("DOB" + res.getString(2)+ "\n");

                }

                AlertDialog.Builder builder = new AlertDialog.Builder(MainData.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();

            }
        });



    }

}
