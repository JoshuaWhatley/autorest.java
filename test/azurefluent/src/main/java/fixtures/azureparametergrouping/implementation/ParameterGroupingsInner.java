/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azureparametergrouping.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * ParameterGroupings.
 */
public class ParameterGroupingsInner {
    /** The RestProxy service to perform REST calls. */
    private ParameterGroupingsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterGroupingTestServiceImpl client;

    /**
     * Initializes an instance of ParameterGroupingsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ParameterGroupingsInner(AutoRestParameterGroupingTestServiceImpl client) {
        this.service = AzureProxy.create(ParameterGroupingsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for ParameterGroupings to be
     * used by RestProxy to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface ParameterGroupingsService {
        @Headers({ "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postRequired" })
        @POST("parameterGrouping/postRequired/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postRequired(@PathParam("path") String path, @HeaderParam("accept-language") String acceptLanguage, @BodyParam("application/json; charset=utf-8") int body, @HeaderParam("customHeader") String customHeader, @QueryParam("query") Integer query);

        @Headers({ "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postOptional" })
        @POST("parameterGrouping/postOptional")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postOptional(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("customHeader") String customHeader, @QueryParam("query") Integer query);

        @Headers({ "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postMultiParamGroups" })
        @POST("parameterGrouping/postMultipleParameterGroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postMultiParamGroups(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("header-one") String headerOne, @QueryParam("query-one") Integer queryOne, @HeaderParam("header-two") String headerTwo, @QueryParam("query-two") Integer queryTwo);

        @Headers({ "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postSharedParameterGroupObject" })
        @POST("parameterGrouping/sharedParameterGroupObject")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postSharedParameterGroupObject(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("header-one") String headerOne, @QueryParam("query-one") Integer queryOne);

    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postRequired(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) {
        postRequiredAsync(parameterGroupingPostRequiredParameters).blockingAwait();
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postRequiredAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postRequiredAsync(parameterGroupingPostRequiredParameters), serviceCallback);
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postRequiredWithRestResponseAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) {
        if (parameterGroupingPostRequiredParameters == null) {
            throw new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null.");
        }
        Validator.validate(parameterGroupingPostRequiredParameters);
        int body = parameterGroupingPostRequiredParameters.body();
        String customHeader = parameterGroupingPostRequiredParameters.customHeader();
        Integer query = parameterGroupingPostRequiredParameters.query();
        String path = parameterGroupingPostRequiredParameters.path();
        return service.postRequired(path, this.client.acceptLanguage(), body, customHeader, query);
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postRequiredAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) {
        return postRequiredWithRestResponseAsync(parameterGroupingPostRequiredParameters)
            .toCompletable();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postOptional() {
        postOptionalAsync().blockingAwait();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postOptionalAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postOptionalAsync(), serviceCallback);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postOptionalWithRestResponseAsync() {
        final ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters = null;
        Validator.validate(parameterGroupingPostOptionalParameters);
        String customHeader = null;
        Integer query = null;
        return service.postOptional(this.client.acceptLanguage(), customHeader, query);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postOptionalAsync() {
        return postOptionalWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postOptional(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) {
        postOptionalAsync(parameterGroupingPostOptionalParameters).blockingAwait();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postOptionalAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postOptionalAsync(parameterGroupingPostOptionalParameters), serviceCallback);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postOptionalWithRestResponseAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) {
        Validator.validate(parameterGroupingPostOptionalParameters);
        String customHeader = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.customHeader();
        }
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            query = parameterGroupingPostOptionalParameters.query();
        }
        return service.postOptional(this.client.acceptLanguage(), customHeader, query);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postOptionalAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) {
        return postOptionalWithRestResponseAsync(parameterGroupingPostOptionalParameters)
            .toCompletable();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postMultiParamGroups() {
        postMultiParamGroupsAsync().blockingAwait();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMultiParamGroupsAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMultiParamGroupsAsync(), serviceCallback);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postMultiParamGroupsWithRestResponseAsync() {
        final FirstParameterGroupInner firstParameterGroup = null;
        final ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup = null;
        Validator.validate(firstParameterGroup);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup);
        String headerOne = null;
        Integer queryOne = null;
        String headerTwo = null;
        Integer queryTwo = null;
        return service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postMultiParamGroupsAsync() {
        return postMultiParamGroupsWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postMultiParamGroups(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        postMultiParamGroupsAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup).blockingAwait();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMultiParamGroupsAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMultiParamGroupsAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup), serviceCallback);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postMultiParamGroupsWithRestResponseAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        Validator.validate(firstParameterGroup);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        String headerTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.headerTwo();
        }
        Integer queryTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            queryTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.queryTwo();
        }
        return service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postMultiParamGroupsAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        return postMultiParamGroupsWithRestResponseAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup)
            .toCompletable();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postSharedParameterGroupObject() {
        postSharedParameterGroupObjectAsync().blockingAwait();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postSharedParameterGroupObjectAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postSharedParameterGroupObjectAsync(), serviceCallback);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postSharedParameterGroupObjectWithRestResponseAsync() {
        final FirstParameterGroupInner firstParameterGroup = null;
        Validator.validate(firstParameterGroup);
        String headerOne = null;
        Integer queryOne = null;
        return service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postSharedParameterGroupObjectAsync() {
        return postSharedParameterGroupObjectWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postSharedParameterGroupObject(FirstParameterGroupInner firstParameterGroup) {
        postSharedParameterGroupObjectAsync(firstParameterGroup).blockingAwait();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postSharedParameterGroupObjectAsync(FirstParameterGroupInner firstParameterGroup, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postSharedParameterGroupObjectAsync(firstParameterGroup), serviceCallback);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postSharedParameterGroupObjectWithRestResponseAsync(FirstParameterGroupInner firstParameterGroup) {
        Validator.validate(firstParameterGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        return service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postSharedParameterGroupObjectAsync(FirstParameterGroupInner firstParameterGroup) {
        return postSharedParameterGroupObjectWithRestResponseAsync(firstParameterGroup)
            .toCompletable();
    }

}
