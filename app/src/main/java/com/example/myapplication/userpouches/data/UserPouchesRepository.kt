package com.example.myapplication.userpouches.data

import com.example.myapplication.createpouch.data.entity.PostNewPouchResult
import com.example.myapplication.userpouches.data.entity.Advice
import com.example.myapplication.userpouches.data.entity.Pouch
import io.reactivex.Single

interface UserPouchesRepository {
    fun getUserPouches(): Single<List<Pouch>>
    fun getMoreUserPouches(anchor: Int): Single<List<Pouch>>
    fun getRandomAdviceFromPouch(pouchId: Int): Single<Advice>
    fun postNewPouch(pouch: Pouch): Single<PostNewPouchResult>
}