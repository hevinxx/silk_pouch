package com.example.myapplication.createpouch.domain

import com.example.myapplication.createpouch.data.entity.PostNewPouchResult
import com.example.myapplication.userpouches.data.UserPouchesRepository
import com.example.myapplication.userpouches.data.entity.Pouch
import io.reactivex.Single

class PostNewPouchUseCase(private val userPouchesRepository: UserPouchesRepository) {
    operator fun invoke(pouch: Pouch): Single<PostNewPouchResult> {
        return userPouchesRepository.postNewPouch(pouch)
    }
}