package com.example.myapplication.userpouches.domain

import com.example.myapplication.userpouches.data.entity.Advice
import com.example.myapplication.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class OpenPouchUseCase(
    private val userPouchesRepository: UserPouchesRepository
) {
    operator fun invoke(pouchId: Int): Single<Advice> {
        return userPouchesRepository.getRandomAdviceFromPouch(pouchId = pouchId)
    }
}