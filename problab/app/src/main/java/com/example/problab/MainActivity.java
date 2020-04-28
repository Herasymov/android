package com.example.problab;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DataModel> dataModelList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate the recyclerView
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setFocusable(false);
        setData();
        setDataToRecyclerView();
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this, recyclerView, new RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                String firstName = dataModelList.get(position).getFirstName();
                String lastName = dataModelList.get(position).getLastName();
                int id = dataModelList.get(position).getId();
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("firstName", firstName);
                intent.putExtra("lastName", lastName);
                intent.putExtra("id", id);
                MainActivity.this.startActivity(intent);
            }
        }));

    }

    private void setData() {
        dataModelList = new ArrayList<>();
        dataModelList.add(new DataModel(1, "Slava", "Herasymov"));
        dataModelList.add(new DataModel(2, "Roma", "Herasymov"));
        dataModelList.add(new DataModel(3, "Alexa", "Morsun"));
        dataModelList.add(new DataModel(4, "Ksuna", "Wewe"));
        dataModelList.add(new DataModel(5, "Maksim", "Lipitsjiy"));
        dataModelList.add(new DataModel(6, "Sereha", "Werana"));
        dataModelList.add(new DataModel(7, "Jhone", "English"));
        dataModelList.add(new DataModel(8, "Mandele", "Beauty"));
        dataModelList.add(new DataModel(9, "Slava", "Herasymov"));
        dataModelList.add(new DataModel(10, "Roma", "Herasymov"));
        dataModelList.add(new DataModel(11, "Alexa", "Morsun"));
        dataModelList.add(new DataModel(12, "Ksuna", "Wewe"));
        dataModelList.add(new DataModel(13, "Maksim", "Lipitsjiy"));
        dataModelList.add(new DataModel(14, "Sereha", "Werana"));
        dataModelList.add(new DataModel(15, "Jhone", "English"));
        dataModelList.add(new DataModel(16, "Mandele", "Beauty"));
    }

    private void setDataToRecyclerView() {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(dataModelList);
        recyclerView.setAdapter(adapter);
    }
}