package com.example.myapplication.UserPouches.Domain

import com.example.myapplication.BaseStructure.UseCaseSingle
import com.example.myapplication.UserPouches.Data.Entity.Pouch
import com.example.myapplication.UserPouches.Data.UserPouchesRepository
import io.reactivex.Single

class GetUserPouchesUseCase(
    val userPouchesRepository: UserPouchesRepository
) : UseCaseSingle<Int, List<Pouch>>() {
    override fun invoke(userId: Int): Single<List<Pouch>> {
        return userPouchesRepository.getUserPouches(userId = userId)
    }
}