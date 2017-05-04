package hu.bme.aut.mobsoft.mobsoftlab;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import io.fabric.sdk.android.Fabric;
import javax.inject.Inject;

import hu.bme.aut.mobsoft.mobsoftlab.repository.Repository;
import hu.bme.aut.mobsoft.mobsoftlab.ui.UIModule;

public class MobSoftApplication extends Application {


	@Inject
	Repository repository;

	private Tracker mTracker;
	public static MobSoftApplicationComponent injector;


	public void setInjector(MobSoftApplicationComponent appComponent) {
		injector = appComponent;
		injector.inject(this);
		repository.open(getApplicationContext());
	}

    @Override
	public void onCreate() {
		super.onCreate();
		Fabric.with(this, new Crashlytics());

		injector =
				DaggerMobSoftApplicationComponent.builder().
						uIModule(
								new UIModule(this)
						).build();


		injector.inject(this);
		repository.open(getApplicationContext());
	}


	/**
	 * Gets the default {@link Tracker} for this {@link Application}.
	 * @return tracker
	 */
	synchronized public Tracker getDefaultTracker() {
		if (mTracker == null) {
			GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
			// To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
			mTracker = analytics.newTracker(R.xml.global_tracker);
		}
		return mTracker;
	}
}
