package hu.bme.aut.mobsoft.mobsoftlab.repository;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;

public class MemoryRepository implements Repository {

	private static final long MINUTE = 60 * 1000;

	public static List<Todo> todos;

	@Override
	public void open(Context context) {
		Todo flight1 = new Todo(1L,"todo one");
		Todo flight2 = new Todo(3L,"todo two");

		todos = new ArrayList<>();
		todos.add(flight1);
		todos.add(flight2);
	}

	@Override
	public void close() {

	}

	@Override
	public List<Todo> getFavourites() {
		return todos;
	}

	@Override
	public void saveFavourite(Todo todo) {
		todos.add(todo);

	}

	@Override
	public void updateFavourites(List<Todo> todos) {
		for (int i = 0; i < this.todos.size(); i++) {
			Todo favourite = this.todos.get(i);
			for (Todo todo : todos) {
				if (todo.getId().equals(favourite.getId())) {
					this.todos.set(i, todo);
				}
			}
		}
	}

	@Override
	public void removeFavourite(Todo flight) {
		todos.remove(flight);
	}

	@Override
	public boolean isInDB(Todo flight) {
		return todos.contains(flight);
	}

}

