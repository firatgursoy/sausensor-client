package edu.sau.sausensor.client.service;

import android.util.Log;
import edu.sau.sausensor.client.domain.Mts400Results;
import edu.sau.sausensor.client.service.AcceptHeaderHttpRequestInterceptor;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

/**
 * Created by root on 12/25/13.
 */
public class WebServiceProvider {

    private RestTemplate restTemplate;
    private ClientHttpRequestInterceptor clientHttpRequestInterceptor;

    public WebServiceProvider(String userName,String password) {

        HttpAuthentication authHeader = new HttpBasicAuthentication(userName, password);
        //8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918
        restTemplate = new RestTemplate();
        clientHttpRequestInterceptor = new AcceptHeaderHttpRequestInterceptor(
                MediaType.APPLICATION_JSON, authHeader, Charset.defaultCharset());
        restTemplate.setInterceptors(Collections.singletonList(clientHttpRequestInterceptor));
        //restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
        restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
    }
    public void setAuthWithUserNameandPassword(String userName,String password){
        AcceptHeaderHttpRequestInterceptor acceptHeaderHttpRequestInterceptor=(AcceptHeaderHttpRequestInterceptor)clientHttpRequestInterceptor;
        HttpAuthentication authHeader = new HttpBasicAuthentication(userName, password);
        acceptHeaderHttpRequestInterceptor.setHttpAuthentication(authHeader);
        restTemplate.setInterceptors(Collections.singletonList((ClientHttpRequestInterceptor)acceptHeaderHttpRequestInterceptor));
    }
    public Object getResult(String URL, Map<String, String> params,Class type) {
        Object  result = null;
        try {

           // ResponseEntity<Object> response = restTemplate.exchange(URL + "" + params, HttpMethod.GET, new HttpEntity<Object>(requestHeaders), Object.class);
           //URL="http://192.168.1.116:8080/sausensor/mts400resultses/";

            ResponseEntity<Object> response = restTemplate.getForEntity(
                    URL,
                    type,params);
            result = response.getBody();


        //    result=restTemplate.getForObject(URL, Object.class, params);

            //result = response.getBody().toString();
        } catch (HttpClientErrorException ex) {
            if (ex.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                result = null;
            }
        } catch (Exception ex) {
            Log.e("", ex.getMessage());
        }
        return result;
    }

}
