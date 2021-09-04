package com.example.airbnbsimpleclone

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/1c803677-5eb4-4796-9025-9506e291bf50")
    fun getHouseList(): Call<HouseDto>
}