package hu.bme.aut.mobsoft.mobsoftlab;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.mobsoft.mobsoftlab.interactor.InteractorModule;
import hu.bme.aut.mobsoft.mobsoftlab.mock.MockNetworkModule;
import hu.bme.aut.mobsoft.mobsoftlab.repository.TestRepositoryModule;

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, InteractorModule.class, TestRepositoryModule.class})
public interface TestComponent extends MobSoftApplicationComponent {
}
