package com.yash.resources;

import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;

/**
 * Created by Yash on 8/16/2015.
 */
public class BeanParams {
    private @MatrixParam("title") String matrixParam;
    private @HeaderParam("customHeader") String customHeader;
    private @CookieParam("JSESSIONID") String jsessionId;

    public String getMatrixParam() {
        return matrixParam;
    }

    public void setMatrixParam(String matrixParam) {
        this.matrixParam = matrixParam;
    }

    public String getCustomHeader() {
        return customHeader;
    }

    public void setCustomHeader(String customHeader) {
        this.customHeader = customHeader;
    }

    public String getJsessionId() {
        return jsessionId;
    }

    public void setJsessionId(String jsessionId) {
        this.jsessionId = jsessionId;
    }
}
