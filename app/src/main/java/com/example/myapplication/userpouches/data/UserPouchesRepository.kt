package com.example.myapplication.userpouches.data

import com.example.myapplication.userpouches.data.entity.Advice
import com.example.myapplication.userpouches.data.entity.Pouch
import io.reactivex.Single

interface UserPouchesRepository {
    fun getUserPouches(userId: Int): Single<List<Pouch>>
    fun getMoreUserPouches(userId: Int): Single<List<Pouch>>
    fun getRandomAdviceFromPouch(pouchId: Int): Single<Advice>
}