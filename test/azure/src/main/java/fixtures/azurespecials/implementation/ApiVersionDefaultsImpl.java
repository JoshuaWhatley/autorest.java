/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azurespecials.ApiVersionDefaults;
import fixtures.azurespecials.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * ApiVersionDefaults.
 */
public class ApiVersionDefaultsImpl implements ApiVersionDefaults {
    /** The RestProxy service to perform REST calls. */
    private ApiVersionDefaultsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of ApiVersionDefaultsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ApiVersionDefaultsImpl(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(ApiVersionDefaultsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiVersionDefaults to be
     * used by RestProxy to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface ApiVersionDefaultsService {
        @Headers({ "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getMethodGlobalValid" })
        @GET("azurespecials/apiVersion/method/string/none/query/global/2015-07-01-preview")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getMethodGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getMethodGlobalNotProvidedValid" })
        @GET("azurespecials/apiVersion/method/string/none/query/globalNotProvided/2015-07-01-preview")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getMethodGlobalNotProvidedValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getPathGlobalValid" })
        @GET("azurespecials/apiVersion/path/string/none/query/global/2015-07-01-preview")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getPathGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getSwaggerGlobalValid" })
        @GET("azurespecials/apiVersion/swagger/string/none/query/global/2015-07-01-preview")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getSwaggerGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getMethodGlobalValid() {
        getMethodGlobalValidAsync().blockingAwait();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodGlobalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getMethodGlobalValidWithRestResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getMethodGlobalValid(this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable getMethodGlobalValidAsync() {
        return getMethodGlobalValidWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getMethodGlobalNotProvidedValid() {
        getMethodGlobalNotProvidedValidAsync().blockingAwait();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodGlobalNotProvidedValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodGlobalNotProvidedValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getMethodGlobalNotProvidedValidWithRestResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getMethodGlobalNotProvidedValid(this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable getMethodGlobalNotProvidedValidAsync() {
        return getMethodGlobalNotProvidedValidWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getPathGlobalValid() {
        getPathGlobalValidAsync().blockingAwait();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getPathGlobalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getPathGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getPathGlobalValidWithRestResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getPathGlobalValid(this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable getPathGlobalValidAsync() {
        return getPathGlobalValidWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void getSwaggerGlobalValid() {
        getSwaggerGlobalValidAsync().blockingAwait();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getSwaggerGlobalValidAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getSwaggerGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> getSwaggerGlobalValidWithRestResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getSwaggerGlobalValid(this.client.apiVersion(), this.client.acceptLanguage());
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable getSwaggerGlobalValidAsync() {
        return getSwaggerGlobalValidWithRestResponseAsync()
            .toCompletable();
    }

}
