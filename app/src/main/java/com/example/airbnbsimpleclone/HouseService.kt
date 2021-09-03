package com.example.airbnbsimpleclone

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/a447a941-62c6-4386-98c5-15c8f51a0439")
    fun getHouseList(): Call<HouseDto>
}