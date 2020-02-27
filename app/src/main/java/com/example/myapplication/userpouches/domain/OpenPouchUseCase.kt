package com.example.myapplication.userpouches.domain

import com.example.myapplication.basestructure.UseCaseSingle
import com.example.myapplication.userpouches.data.entity.Advice
import com.example.myapplication.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class OpenPouchUseCase(
    val userPouchesRepository: UserPouchesRepository
) : UseCaseSingle<Int, Advice>() {
    override fun invoke(pouchId: Int): Single<Advice> {
        return userPouchesRepository.getRandomAdviceFromPouch(pouchId = pouchId)
    }
}