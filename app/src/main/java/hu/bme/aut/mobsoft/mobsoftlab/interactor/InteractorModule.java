package hu.bme.aut.mobsoft.mobsoftlab.interactor;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.FavouritesInteractor;

@Module
public class InteractorModule {


	@Provides
	public FavouritesInteractor provideFavourites() {
		return new FavouritesInteractor();
	}


}
