package hevinxx.silkpouch.createpouch.domain

import hevinxx.silkpouch.createpouch.data.entity.PostNewPouchResult
import hevinxx.silkpouch.userpouches.data.UserPouchesRepository
import hevinxx.silkpouch.userpouches.data.entity.Pouch
import io.reactivex.Single

class PostNewPouchUseCase(private val userPouchesRepository: UserPouchesRepository) {
    operator fun invoke(pouch: Pouch): Single<PostNewPouchResult> {
        return userPouchesRepository.postNewPouch(pouch)
    }
}