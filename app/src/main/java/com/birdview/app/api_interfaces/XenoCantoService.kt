package com.birdview.app.api_interfaces

import com.birdview.app.models.XenoCantoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface XenoCantoService {
    @GET("recordings")
    fun getRecordings(@Query("query") query: String): Call<XenoCantoResponse>
}