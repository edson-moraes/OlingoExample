package com.wallpaperhub.service;

import org.apache.olingo.commons.api.format.ContentType;
import org.apache.olingo.server.api.*;
import org.apache.olingo.server.api.processor.EntityCollectionProcessor;
import org.apache.olingo.server.api.uri.UriInfo;

public class WallpaperCollectionProcessor implements EntityCollectionProcessor {

    public void readEntityCollection(ODataRequest oDataRequest, ODataResponse oDataResponse, UriInfo uriInfo, ContentType contentType) throws ODataApplicationException, ODataLibraryException {

    }

    public void init(OData oData, ServiceMetadata serviceMetadata) {

    }
}
