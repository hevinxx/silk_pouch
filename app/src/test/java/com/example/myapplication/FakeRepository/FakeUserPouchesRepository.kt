package com.example.myapplication.FakeRepository

import com.example.myapplication.createpouch.data.entity.PostNewPouchResult
import com.example.myapplication.userpouches.data.entity.Advice
import com.example.myapplication.userpouches.data.entity.Pouch
import com.example.myapplication.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class FakeUserPouchesRepository : UserPouchesRepository {
    private val fakeUserId = 100
    private val fakeUserPouches = listOf(
        Pouch(id = 1, name = "first pouch", advices = getFakeAdvices(1), creatorId = fakeUserId),
        Pouch(id = 2, name = "second pouch", advices = getFakeAdvices(2), creatorId = fakeUserId),
        Pouch(id = 3, name = "third pouch", advices = getFakeAdvices(3), creatorId = fakeUserId),
        Pouch(id = 4, name = "forth pouch", advices = getFakeAdvices(4), creatorId = fakeUserId),
        Pouch(id = 5, name = "fifth pouch", advices = getFakeAdvices(5), creatorId = fakeUserId),
        Pouch(id = 6, name = "sixth pouch", advices = getFakeAdvices(6), creatorId = fakeUserId),
        Pouch(id = 7, name = "seventh pouch", advices = getFakeAdvices(7), creatorId = fakeUserId),
        Pouch(id = 8, name = "eighth pouch", advices = getFakeAdvices(8), creatorId = fakeUserId),
        Pouch(id = 9, name = "ninth pouch", advices = getFakeAdvices(9), creatorId = fakeUserId),
        Pouch(id = 10, name = "tenth pouch", advices = getFakeAdvices(10), creatorId = fakeUserId)
    )

    private fun getFakeAdvices(pouchId: Int): List<Advice> {
        return listOf(
            Advice(id = pouchId * 100 + 1, content = "first advice", creatorId = fakeUserId, pouchId = pouchId),
            Advice(id = pouchId * 100 + 2, content = "second advice", creatorId = fakeUserId, pouchId = pouchId),
            Advice(id = pouchId * 100 + 3, content = "third advice", creatorId = fakeUserId, pouchId = pouchId),
            Advice(id = pouchId * 100 + 4, content = "forth advice", creatorId = fakeUserId, pouchId = pouchId)
        )
    }

    override fun getUserPouches(): Single<List<Pouch>> {
        return Single.just(fakeUserPouches.subList(0, 5))
    }

    override fun getMoreUserPouches(anchor: Int): Single<List<Pouch>> {
        return Single.just(fakeUserPouches.subList(5, 10))
    }

    override fun getRandomAdviceFromPouch(pouchId: Int): Single<Advice> {
        val pouchIndex = pouchId - 1
        return Single.just(fakeUserPouches[pouchIndex].advices[0])
    }

    override fun postNewPouch(pouch: Pouch): Single<PostNewPouchResult> {
        return Single.just(PostNewPouchResult(pouch.id))
    }
}