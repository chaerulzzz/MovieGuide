package com.chaerul.movieguide.api

import retrofit2.http.GET
import retrofit2.http.QueryMap
import rx.Observable

interface MovieApi {

    @GET("/3/discover/movie")
    fun getMovies(@QueryMap map: Map<String, String>): Observable<PopularMovieResponse>
}