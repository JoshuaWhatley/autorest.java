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
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azurespecials.SubscriptionInMethods;
import fixtures.azurespecials.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * SubscriptionInMethods.
 */
public class SubscriptionInMethodsImpl implements SubscriptionInMethods {
    /** The RestProxy service to perform REST calls. */
    private SubscriptionInMethodsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of SubscriptionInMethodsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionInMethodsImpl(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(SubscriptionInMethodsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionInMethods to be
     * used by RestProxy to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface SubscriptionInMethodsService {
        @Headers({ "x-ms-logging-context: fixtures.azurespecials.SubscriptionInMethods postMethodLocalValid" })
        @POST("azurespecials/subscriptionId/method/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postMethodLocalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.SubscriptionInMethods postMethodLocalNull" })
        @POST("azurespecials/subscriptionId/method/string/none/path/local/null/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postMethodLocalNull(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.SubscriptionInMethods postPathLocalValid" })
        @POST("azurespecials/subscriptionId/path/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postPathLocalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.SubscriptionInMethods postSwaggerLocalValid" })
        @POST("azurespecials/subscriptionId/swagger/string/none/path/local/1234-5678-9012-3456/{subscriptionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> postSwaggerLocalValid(@PathParam("subscriptionId") String subscriptionId, @HeaderParam("accept-language") String acceptLanguage);

    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postMethodLocalValid(String subscriptionId) {
        postMethodLocalValidAsync(subscriptionId).blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMethodLocalValidAsync(String subscriptionId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodLocalValidAsync(subscriptionId), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postMethodLocalValidWithRestResponseAsync(String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        return service.postMethodLocalValid(subscriptionId, this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId This should appear as a method parameter, use value '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postMethodLocalValidAsync(String subscriptionId) {
        return postMethodLocalValidWithRestResponseAsync(subscriptionId)
            .toCompletable();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postMethodLocalNull(String subscriptionId) {
        postMethodLocalNullAsync(subscriptionId).blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMethodLocalNullAsync(String subscriptionId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMethodLocalNullAsync(subscriptionId), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postMethodLocalNullWithRestResponseAsync(String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        return service.postMethodLocalNull(subscriptionId, this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = null, client-side validation should prevent you from making this call.
     *
     * @param subscriptionId This should appear as a method parameter, use value null, client-side validation should prvenet the call
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postMethodLocalNullAsync(String subscriptionId) {
        return postMethodLocalNullWithRestResponseAsync(subscriptionId)
            .toCompletable();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postPathLocalValid(String subscriptionId) {
        postPathLocalValidAsync(subscriptionId).blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postPathLocalValidAsync(String subscriptionId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postPathLocalValidAsync(subscriptionId), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postPathLocalValidWithRestResponseAsync(String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        return service.postPathLocalValid(subscriptionId, this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId Should appear as a method parameter -use value '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postPathLocalValidAsync(String subscriptionId) {
        return postPathLocalValidWithRestResponseAsync(subscriptionId)
            .toCompletable();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void postSwaggerLocalValid(String subscriptionId) {
        postSwaggerLocalValidAsync(subscriptionId).blockingAwait();
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postSwaggerLocalValidAsync(String subscriptionId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postSwaggerLocalValidAsync(subscriptionId), serviceCallback);
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> postSwaggerLocalValidWithRestResponseAsync(String subscriptionId) {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        return service.postSwaggerLocalValid(subscriptionId, this.client.acceptLanguage());
    }

    /**
     * POST method with subscriptionId modeled in the method.  pass in subscription id = '1234-5678-9012-3456' to succeed.
     *
     * @param subscriptionId The subscriptionId, which appears in the path, the value is always '1234-5678-9012-3456'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable postSwaggerLocalValidAsync(String subscriptionId) {
        return postSwaggerLocalValidWithRestResponseAsync(subscriptionId)
            .toCompletable();
    }

}
