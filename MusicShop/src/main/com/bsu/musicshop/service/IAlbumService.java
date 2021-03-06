package main.com.bsu.musicshop.service;

import main.com.bsu.musicshop.entity.Album;

import java.util.List;

public interface IAlbumService {

    List<Album> getAlbums();

    Album getAlbumById(int albumId);

    void addAlbum(String title, String imageUrl, int artistId);

    void deleteAlbum(int albumId);

}
