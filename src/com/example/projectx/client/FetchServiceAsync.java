package com.example.projectx.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface FetchServiceAsync {

	void getBlobUrlList(AsyncCallback<List<String>> callback);

	
}
