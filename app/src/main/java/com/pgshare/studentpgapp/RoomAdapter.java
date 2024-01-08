package com.pgshare.studentpgapp;// RoomAdapter.java
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {

    private List<Room> roomList;
    private Context context;

    public RoomAdapter(Context context, List<Room> roomList) {
        this.context = context;
        this.roomList = roomList;
    }

    @NonNull
    @Override
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.roomlist, parent, false);
        return new RoomViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RoomViewHolder holder, int position) {
        Room room = roomList.get(position);

        // Bind data to the views
        holder.textViewRoomName.setText(room.getRoomName());
        holder.textViewLocation.setText(room.getLocation());
        holder.textViewDescription.setText(room.getDescription());
        holder.textViewPrice.setText(String.format("$ %.2f", room.getPrice()));
    }

    @Override
    public int getItemCount() {
        return roomList.size();
    }

    public static class RoomViewHolder extends RecyclerView.ViewHolder {
        TextView textViewRoomName;
        TextView textViewLocation;
        TextView textViewDescription;
        TextView textViewPrice;

        public RoomViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewRoomName = itemView.findViewById(R.id.textViewRoomName);
            textViewLocation = itemView.findViewById(R.id.textViewLocation);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
