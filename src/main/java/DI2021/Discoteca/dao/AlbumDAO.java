package DI2021.Discoteca.dao;

import java.util.List;

public interface AlbumDAO<T> extends DAO<T>{
	T getLocalOrdersMockData(long id);
    
    List<T> getAllAlbums();
    
    void saveAlbums(T t);
    
    void update(T t, String[] params);
    
    void delete(T t);
}