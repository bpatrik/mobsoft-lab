package hu.bme.aut.mobsoft.mobsoftlab.interactor.todo;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;
import hu.bme.aut.mobsoft.mobsoftlab.MobSoftApplication;
import hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.events.GetFavouritesEvent;
import hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.events.RemoveFavouriteEvent;
import hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.events.SaveFavouriteEvent;
import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;
import hu.bme.aut.mobsoft.mobsoftlab.network.todo.TodoApi;
import hu.bme.aut.mobsoft.mobsoftlab.repository.Repository;


public class FavouritesInteractor {

    @Inject
    Repository repository;

    @Inject
    EventBus bus;

    @Inject
    TodoApi todoApi;


    public FavouritesInteractor() {
        MobSoftApplication.injector.inject(this);
    }

    public void getFavourites() {
        GetFavouritesEvent event = new GetFavouritesEvent();
        try {
            List<Todo> todos = repository.getFavourites();
            event.setTodos(todos);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void saveFavourite(Todo todo) {

        SaveFavouriteEvent event = new SaveFavouriteEvent();
        event.setTodo(todo);
        try {
            todoApi.saveFavourite(todo).execute();
            repository.saveFavourite(todo);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void updateFavourites(List<Todo> todo) {
        try {
            repository.updateFavourites(todo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeFavourites(Todo todos) {
        RemoveFavouriteEvent event = new RemoveFavouriteEvent();
        event.setTodos(todos);
        try {
            repository.removeFavourite(todos);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }
}
