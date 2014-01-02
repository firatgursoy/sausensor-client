package edu.sau.sausensor.client.service;

import org.springframework.http.HttpAuthentication;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;

/**
 * Created by Vostro on 26.12.2013.
 */
class AcceptHeaderHttpRequestInterceptor implements ClientHttpRequestInterceptor {
    private final MediaType mediaType;
    private  HttpAuthentication httpAuthentication;
    private final Charset charset;

    public AcceptHeaderHttpRequestInterceptor(MediaType mediaType,HttpAuthentication httpAuthentication,Charset charset
    ) {
        this.mediaType = mediaType;
        this.httpAuthentication = httpAuthentication;
        this.charset = charset;
    }
    public void setHttpAuthentication(HttpAuthentication httpAuthentication){
        this.httpAuthentication=httpAuthentication;
    }
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body,
                                        ClientHttpRequestExecution execution) throws IOException {

        HttpRequestWrapper requestWrapper = new HttpRequestWrapper(request);
        requestWrapper.getHeaders().setAccept(Collections.singletonList(mediaType));
        requestWrapper.getHeaders().setAuthorization(httpAuthentication);
        requestWrapper.getHeaders().setAcceptCharset(Collections.singletonList(charset));


        return execution.execute(requestWrapper, body);
    }
}