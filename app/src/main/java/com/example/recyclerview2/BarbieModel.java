package com.example.recyclerview2;

public class BarbieModel {

    String name;
    int gambar;
    String overview;

    public BarbieModel (String name, int gambar, String overview) {
        this.name = name;
        this.gambar = gambar;
        this.overview = overview;
    }

    public String getName() {
        return name;
    }

    public int getGambar() {
        return gambar;
    }
    public String getOverview() { return overview;
    }
}
