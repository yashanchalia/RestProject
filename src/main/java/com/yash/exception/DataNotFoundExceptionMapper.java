package com.yash.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by Yash on 8/16/2015.
 */


@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

    @Override
    public Response toResponse(DataNotFoundException ex) {
        ErrorMessage errorMessage = new ErrorMessage( 404,ex.getMessage(), "http://javabrains.koushik.org");
        return Response.status(Status.NOT_FOUND)
                .entity(errorMessage)
                .build();
    }

}
