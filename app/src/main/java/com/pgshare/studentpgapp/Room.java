package com.pgshare.studentpgapp;// Room.java
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "rooms")
public class Room {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String roomName;
    private String location;
    private String description;
    private double price;
    private List<String> images;

    public Room() {
        // Default constructor required by Room
    }

    public Room(String roomName, String location, String description, double price, List<String> images) {
        this.roomName = roomName;
        this.location = location;
        this.description = description;
        this.price = price;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
