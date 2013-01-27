package com.example.projectx.server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.projectx.client.FetchService;
import com.google.appengine.api.blobstore.BlobInfo;
import com.google.appengine.api.blobstore.BlobInfoFactory;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class FetchServiceImpl extends RemoteServiceServlet implements
		FetchService {
	
	public List<String> getBlobUrlList(){
		 
		BlobInfoFactory info = new BlobInfoFactory();
		ImagesService imgsrc = ImagesServiceFactory.getImagesService();
		Iterator<BlobInfo> blobList = (Iterator<BlobInfo>) info.queryBlobInfos();
		List<String> imglist = new ArrayList<String>();
		while (blobList.hasNext()){
			BlobInfo blob = blobList.next();
			String url = imgsrc.getServingUrl(blob.getBlobKey());
			imglist.add(url);
			
		}
		
		return imglist;
	}

}
