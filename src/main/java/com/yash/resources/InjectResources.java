package com.yash.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * Created by Yash on 8/16/2015.
 */

@Path("/injectresources")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectResources {

    @GET
    @Path("/annotations")
    public String getMessageData(@BeanParam BeanParams beanParams){
        return "matrixParam "+beanParams.getMatrixParam()+" | HeaderParam "+ beanParams.getCustomHeader()
                + " | CookiesParam "+beanParams.getJsessionId();
    }

    @GET
    @Path("/context")
    public String getContext(@Context UriInfo uriInfo){
        return uriInfo.getAbsolutePath().toString();
    }

}
