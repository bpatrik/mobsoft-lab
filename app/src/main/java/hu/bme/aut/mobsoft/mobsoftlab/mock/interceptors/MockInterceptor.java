package hu.bme.aut.mobsoft.mobsoftlab.mock.interceptors;

import android.net.Uri;
import android.util.Log;

import java.io.IOException;

import hu.bme.aut.mobsoft.mobsoftlab.network.NetworkConfig;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import static hu.bme.aut.mobsoft.mobsoftlab.mock.interceptors.MockHelper.makeResponse;

public class MockInterceptor implements Interceptor {

	@Override
	public Response intercept(Chain chain) throws IOException {
		return process(chain.request());
	}

	public Response process(Request request) {

		Uri uri = Uri.parse(request.url().toString());

		Log.d("Test Http Client", "URL call: " + uri.toString());
		Headers headers = request.headers();


		if (uri.getPath().startsWith(NetworkConfig.ENDPOINT_PREFIX + "todo")) {
			return TodoMock.process(request);
		}




		return makeResponse(request, headers, 404, "Unknown");

	}

}
