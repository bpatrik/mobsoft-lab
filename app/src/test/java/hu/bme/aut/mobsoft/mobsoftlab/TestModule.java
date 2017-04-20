package hu.bme.aut.mobsoft.mobsoftlab;

import android.content.Context;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.EventBus;

import hu.bme.aut.mobsoft.mobsoftlab.ui.UIModule;
import hu.bme.aut.mobsoft.mobsoftlab.ui.main.MainPresenter;
import hu.bme.aut.mobsoft.mobsoftlab.utils.UiExecutor;

@Module
public class TestModule {

	private final UIModule UIModule;

	public TestModule(Context context) {
		this.UIModule = new UIModule(context);
	}

	@Provides
	public Context provideContext() {
		return UIModule.provideContext();
	}


	@Provides
	public MainPresenter provideMainPresenter() {
		return UIModule.provideMainPresenter();
	}


	@Provides
	@Singleton
	public EventBus provideEventBus() {
		return EventBus.getDefault();
	}

	@Provides
	@Singleton
	public Executor provideNetworkExecutor() {
		return new UiExecutor();
	}


}
