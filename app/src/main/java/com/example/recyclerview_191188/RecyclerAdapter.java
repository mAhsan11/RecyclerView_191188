package com.example.recyclerview_191188;


import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>  {

    Context context;
    List<Student> Person;
    public void onItemDelete(int position)
    {

    }

    public RecyclerAdapter(Context context, List<Student> person) {
        this.context = context;
        Person = person;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        Student Person1 = Person.get(position);
        holder.tvName.setText(Person1.getStudentName());
        holder.tvrollNo.setText(Person1.getRollNo());
        holder.ivProile.setImageResource(Person1.getStudentImage());
        holder.iv_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Deleted Item is : "+ Person1.StudentName, Toast.LENGTH_SHORT).show();
                removeItem(Person1);
            }
        });

        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on Item: "+ position, Toast.LENGTH_SHORT).show();
            }
        });

        holder.tvrollNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on Item: "+ position, Toast.LENGTH_SHORT).show();
            }
        });

        holder.ivProile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on Item: "+ position, Toast.LENGTH_SHORT).show();
            }
        });

    }



    @Override
    public int getItemCount() {
        return Person.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvName,tvrollNo;
        ImageView ivProile;
        ImageView iv_del;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName= itemView.findViewById(R.id.tv_Name);
            tvrollNo= itemView.findViewById(R.id.tv_rollNo);
            ivProile=itemView.findViewById(R.id.iv_profile);
            iv_del=itemView.findViewById(R.id.iv_del);
            iv_del.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }
    }

    private  void removeItem(Student obj)
    {
        int currPos = Person.indexOf(obj);
        Person.remove(currPos);
        notifyItemRemoved(currPos);
    }



}
