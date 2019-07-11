package com.chaerul.movieguide.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(@SerializedName("poster_path") val posterPath: String,
    val id: String, val overview: String, val title: String, val backdropPath: String, val voteAverage: Double): Parcelable