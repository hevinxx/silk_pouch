package com.example.myapplication.userpouches.domain

import com.example.myapplication.userpouches.data.entity.Pouch
import com.example.myapplication.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class GetMoreUserPouchesUseCase(
    private val userPouchesRepository: UserPouchesRepository
) {
    operator fun invoke(anchor: Int): Single<List<Pouch>> {
        return userPouchesRepository.getMoreUserPouches(anchor)
    }
}