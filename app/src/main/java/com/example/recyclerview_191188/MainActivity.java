package com.example.recyclerview_191188;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Student> Person = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_data);

        Person.add(new Student("Ali","191101",R.drawable.image3));
        Person.add(new Student("Usman","191102",R.drawable.image4));
        Person.add(new Student("Ahmed","191103",R.drawable.image2));
        Person.add(new Student("Saqib","191104",R.drawable.image1));
        Person.add(new Student("Nasir","191105",R.drawable.image3));
        Person.add(new Student("Muhamamd Ahsan","191106",R.drawable.image2));
        Person.add(new Student("Ahmed Hassan","191107",R.drawable.image3));
        Person.add(new Student("Saqib Usman","191108",R.drawable.image1));
        Person.add(new Student("Muhammad Dawood","191109",R.drawable.image4));
        Person.add(new Student("Talha","191110",R.drawable.image1));
        Person.add(new Student("Abdul Rehman","191111",R.drawable.image4));
        Person.add(new Student("Abdul Rahim","191112",R.drawable.image1));
        Person.add(new Student("Muhammad Abdullah","191113",R.drawable.image2));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter=new RecyclerAdapter(this,Person);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerAdapter);
    }
}