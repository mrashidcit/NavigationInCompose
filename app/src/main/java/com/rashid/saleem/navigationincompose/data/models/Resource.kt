package com.rashid.saleem.navigationincompose.data.models

/**
 * A generic sealed class that represents the state of a resource (network call).
 *
 * @param T The type of data contained in the Success state.
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {

    /**
     * Represents a successful operation with data.
     * @param data The non-null data returned by the operation.
     */
    class Success<T>(data: T) : Resource<T>(data)

    /**
     * Represents a failed operation with an optional error message.
     * @param message The error message describing the failure.
     * @param data Optional data to display even in case of an error (e.g., cached data).
     */
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)


    val isSuccessful: Boolean
        get() = this is Success


}