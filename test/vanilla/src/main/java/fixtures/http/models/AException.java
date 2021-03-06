/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.models;

import com.microsoft.rest.RestException;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Exception thrown for an invalid response with A information.
 */
public class AException extends RestException {
    /**
     * Initializes a new instance of the AException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     */
    public AException(final String message, final Response<ResponseBody> response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the AException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param response the HTTP response
     * @param body the deserialized response body
     */
    public AException(final String message, final Response<ResponseBody> response, final A body) {
        super(message, response, body);
    }

    @Override
    public A body() {
        return (A) super.body();
    }
}
