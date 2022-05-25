package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Margot Robbie","Marot@gmail.com","https://upload.wikimedia.org/wikipedia/commons/4/41/Sunflower_from_Silesia2.jpg"));
        contacts.add(new Contact("Cillian Murphy","Cillian@gmail.com","https://upload.wikimedia.org/wikipedia/commons/8/88/Yellow_Happy.jpg"));
        contacts.add(new Contact("Saoirse Ronan","Saoirse@gmail.com","https://upload.wikimedia.org/wikipedia/commons/b/b4/JPEG_example_JPG_RIP_100.jpg"));
        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);
        contactsRecView.setAdapter(adapter);
//        contactsRecView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        contactsRecView.setLayoutManager(new GridLayoutManager(this,2));
    }
}