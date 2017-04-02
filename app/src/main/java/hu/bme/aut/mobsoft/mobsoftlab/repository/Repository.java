package hu.bme.aut.mobsoft.mobsoftlab.repository;

import android.content.Context;

import java.util.List;

import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;

public interface Repository {

    void open(Context context);

    void close();

    List<Todo> getFavourites();

    void saveFavourite(Todo todo);

    void updateFavourites(List<Todo> todos);

    void removeFavourite(Todo todo);

    boolean isInDB(Todo todo);
}
