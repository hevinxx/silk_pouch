package com.example.myapplication.UserPouches.Domain

import com.example.myapplication.BaseStructure.UseCaseSingle
import com.example.myapplication.UserPouches.Data.Entity.Advice
import com.example.myapplication.UserPouches.Data.UserPouchesRepository
import io.reactivex.Single

class OpenPouchUseCase(
    val userPouchesRepository: UserPouchesRepository
) : UseCaseSingle<Int, Advice>() {
    override fun invoke(pouchId: Int): Single<Advice> {
        return userPouchesRepository.getRandomAdviceFromPouch(pouchId = pouchId)
    }
}