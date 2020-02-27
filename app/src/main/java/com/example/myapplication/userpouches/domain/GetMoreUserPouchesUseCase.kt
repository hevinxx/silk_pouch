package com.example.myapplication.userpouches.domain

import com.example.myapplication.basestructure.UseCaseSingle
import com.example.myapplication.userpouches.data.entity.Pouch
import com.example.myapplication.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class GetMoreUserPouchesUseCase(
    val userPouchesRepository: UserPouchesRepository
) : UseCaseSingle<Int, List<Pouch>>() {
    override fun invoke(userId: Int): Single<List<Pouch>> {
        return userPouchesRepository.getMoreUserPouches(userId = userId)
    }
}