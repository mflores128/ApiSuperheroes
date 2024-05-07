package campalans.m8.superheroapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("api/c1e903d90034c899705e354cb8a7da96/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String):Response<SuperHeroDataResponse>

    @GET("api/c1e903d90034c899705e354cb8a7da96/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String):Response<SuperHeroDetailResponse>
}