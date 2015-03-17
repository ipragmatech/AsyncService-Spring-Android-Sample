package com.ipragmatech.asyncservice;

import android.content.Context;
import android.widget.Toast;

import com.ipragmatech.asyncservice.model.response.User;
import com.ipragmatech.asyncservice.model.response.UserResponse;
import com.joanzapata.android.asyncservice.api.annotation.ApplicationContext;
import com.joanzapata.android.asyncservice.api.annotation.AsyncService;
import com.joanzapata.android.asyncservice.api.annotation.CacheThenCall;
import com.joanzapata.android.asyncservice.api.annotation.ErrorManagement;
import com.joanzapata.android.asyncservice.api.annotation.Init;
import com.joanzapata.android.asyncservice.api.annotation.Mapping;
import com.joanzapata.android.asyncservice.api.annotation.Ui;

import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neha on 16/3/15.
 */
@AsyncService
  public class GithubService {

    /*
        If you need a context you can inject
        the application context here.
    */
    @ApplicationContext
    static Context applicationContext;


    @Init
    static void initStatic() {
        // Executed once for all services
    }

    @Init
    static void init() {
        // Executed once for this service
    }

    /*
        By default, methods are executed in a background thread.
        No caching is involved.
    */

    @ErrorManagement(@Mapping(on = 200, send = DummyErrorMessage.class))
    public UserResponse getUserAsync(long id) {
        return getUserListResponse();

    }

    private UserResponse getUserListResponse() {
        String url ="https://api.github.com/legacy/user/search/ipragmatech";
        RestTemplate restTemplate = createRestTemplate();
        return restTemplate.getForObject(url,UserResponse.class);
    }

    private RestTemplate createRestTemplate() {
        // web services support json responses
        MappingJacksonHttpMessageConverter jsonConverter = new MappingJacksonHttpMessageConverter();
        FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();

        List listHttpMessageConverters  = new ArrayList<HttpMessageConverter>();
        listHttpMessageConverters.add( jsonConverter );
        listHttpMessageConverters.add( formHttpMessageConverter );
        listHttpMessageConverters.add( stringHttpMessageConverter );


        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(listHttpMessageConverters);
        return restTemplate;
    }

    /*
        If you use @Cached, the result is cached before being sent to the receiver(s).
        On next call, receivers will immediately receive the previous cached event, then
        this method is called. Its new result replaces the previous cache, then is sent
        to the receivers.

        The default cache key is <class_name>.<method_name>(<arg1.toString>, <arg2.toString>, ...)
    */
    @CacheThenCall(validity = 10000)
    public UserResponse getUserAsyncWithCache() {
        displayMessage("Displaying the github users");
        return getUserListResponse();
    }

    @Ui
    protected void displayMessage(String message) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show();
    }



}


