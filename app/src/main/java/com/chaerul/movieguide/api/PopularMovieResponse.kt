package com.chaerul.movieguide.api

import com.chaerul.movieguide.models.Movie
import com.google.gson.annotations.SerializedName

class PopularMovieResponse{

    @SerializedName("results")
    lateinit var movies: List<Movie>
}