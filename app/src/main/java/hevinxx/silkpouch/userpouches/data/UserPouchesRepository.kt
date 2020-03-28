package hevinxx.silkpouch.userpouches.data

import hevinxx.silkpouch.createpouch.data.entity.PostNewPouchResult
import hevinxx.silkpouch.userpouches.data.entity.Advice
import hevinxx.silkpouch.userpouches.data.entity.Pouch
import io.reactivex.Single

interface UserPouchesRepository {
    fun getUserPouches(): Single<List<Pouch>>
    fun getMoreUserPouches(anchor: Int): Single<List<Pouch>>
    fun getRandomAdviceFromPouch(pouchId: Int): Single<Advice>
    fun postNewPouch(pouch: Pouch): Single<PostNewPouchResult>
}