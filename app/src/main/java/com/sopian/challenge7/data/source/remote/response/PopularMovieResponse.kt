package com.sopian.challenge7.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class PopularMovieResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: List<MovieResponse> = emptyList()
)