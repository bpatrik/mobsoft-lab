package hu.bme.aut.mobsoft.mobsoftlab;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.mobsoft.mobsoftlab.interactor.InteractorModule;
import hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.FavouritesInteractor;
import hu.bme.aut.mobsoft.mobsoftlab.network.NetworkModule;
import hu.bme.aut.mobsoft.mobsoftlab.repository.RepositoryModule;
import hu.bme.aut.mobsoft.mobsoftlab.ui.UIModule;
import hu.bme.aut.mobsoft.mobsoftlab.ui.main.MainActivity;
import hu.bme.aut.mobsoft.mobsoftlab.ui.main.MainPresenter;

@Singleton
@Component(modules = {UIModule.class, RepositoryModule.class, InteractorModule.class, NetworkModule.class})
public interface MobSoftApplicationComponent {
	void inject(MainActivity mainActivity);

    void inject(FavouritesInteractor favouritesInteractor);

    void inject(MobSoftApplication mobSoftApplication);

    void inject(MainPresenter mainPresenter);
}
