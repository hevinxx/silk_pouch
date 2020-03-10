package com.example.myapplication.userpouches.domain

import com.example.myapplication.userpouches.data.entity.Pouch
import com.example.myapplication.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class GetUserPouchesUseCase(
    private val userPouchesRepository: UserPouchesRepository
) {
    operator fun invoke(): Single<List<Pouch>> {
        return userPouchesRepository.getUserPouches()
    }
}