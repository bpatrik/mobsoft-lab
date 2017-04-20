package hu.bme.aut.mobsoft.mobsoftlab.mock;

import hu.bme.aut.mobsoft.mobsoftlab.mock.interceptors.MockInterceptor;
import okhttp3.Request;
import okhttp3.Response;

public class MockHttpServer {

	public static Response call(Request request) {
		MockInterceptor mockInterceptor = new MockInterceptor();
		return mockInterceptor.process(request);
	}
}