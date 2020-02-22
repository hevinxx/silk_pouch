package com.example.myapplication.UserPouches.Data

import com.example.myapplication.UserPouches.Data.Entity.Advice
import com.example.myapplication.UserPouches.Data.Entity.Pouch
import io.reactivex.Single

interface UserPouchesRepository {
    fun getUserPouches(userId: Int): Single<List<Pouch>>
    fun getMoreUserPouches(userId: Int): Single<List<Pouch>>
    fun getRandomAdviceFromPouch(pouchId: Int): Single<Advice>
}