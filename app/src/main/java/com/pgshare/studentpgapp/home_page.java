package com.pgshare.studentpgapp;// HomeActivity.java
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class home_page extends AppCompatActivity {

    private List<Room> roomList;
    private RoomAdapter roomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        roomList = new ArrayList<>(); // Load your room data here

        RecyclerView recyclerViewRooms = findViewById(R.id.roomListRecyclerView);
        recyclerViewRooms.setLayoutManager(new LinearLayoutManager(this));
        roomAdapter = new RoomAdapter(this, roomList);
        recyclerViewRooms.setAdapter(roomAdapter);
    }
}
