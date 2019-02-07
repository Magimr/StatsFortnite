package com.example.statsfortnite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Controller.ServerResponse{

    ShopAdapter adapter;
    TextView txtDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Controller controller = new Controller(this);
        controller.start();

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        adapter = new ShopAdapter(this,null);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        txtDay = findViewById(R.id.txtDay);

    }

    @Override
    public void onResponse(Shop shop) {
        adapter.setData(shop.getItems());
        txtDay.setText(shop.getDate());
    }
}
