package com.example.projectx.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("../projectx/fetch")
public interface FetchService extends RemoteService {
	List<String> getBlobUrlList();
}
