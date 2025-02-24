package dev.jajoria.storagepath;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetaData {
    @SerializedName("path")
    @Expose
    String data;
    @SerializedName("displayName")
    @Expose
    String displayName;
    @SerializedName("album")
    @Expose
    String album;
    @SerializedName("artist")
    @Expose
    String artist;
    @SerializedName("title")
    @Expose
    String title;
    @SerializedName("dateAdded")
    @Expose
    String dateAdded;
    @SerializedName("size")
    @Expose
    String size;
    @SerializedName("duration")
    @Expose
    String duration;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}