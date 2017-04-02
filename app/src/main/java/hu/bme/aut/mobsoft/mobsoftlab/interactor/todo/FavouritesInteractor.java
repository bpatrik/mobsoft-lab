package hu.bme.aut.mobsoft.mobsoftlab.interactor.todo;

import java.util.List;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.mobsoftlab.MobSoftApplication;
import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;
import hu.bme.aut.mobsoft.mobsoftlab.repository.Repository;


public class FavouritesInteractor {

	@Inject
	Repository repository;

	public FavouritesInteractor() {
		MobSoftApplication.injector.inject(this);
	}

	public void getFavourites() {

		List<Todo> flights = repository.getFavourites();
	}

	public void saveFavourites(Todo flight) {

		repository.saveFavourite(flight);
	}

	public void updateFavourites(List<Todo> todo) {
		try {
			repository.updateFavourites(todo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeFavourites(Todo flight) {

		repository.removeFavourite(flight);
	}
}
