package hu.bme.aut.mobsoft.mobsoftlab.ui.main;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.FavouritesInteractor;
import hu.bme.aut.mobsoft.mobsoftlab.ui.Presenter;


public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    FavouritesInteractor favouritesInteractor;



    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
