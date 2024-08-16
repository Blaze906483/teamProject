package com.example.teamproject

import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface UserService {
    @GET
    fun getAllUsers()
    @POST
    fun createUsers()
    @DELETE
    fun delete()
    @PUT
    fun updateUsers(    )
}