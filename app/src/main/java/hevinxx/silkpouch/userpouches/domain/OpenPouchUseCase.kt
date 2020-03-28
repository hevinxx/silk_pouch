package hevinxx.silkpouch.userpouches.domain

import hevinxx.silkpouch.userpouches.data.entity.Advice
import hevinxx.silkpouch.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class OpenPouchUseCase(
    private val userPouchesRepository: UserPouchesRepository
) {
    operator fun invoke(pouchId: Int): Single<Advice> {
        return userPouchesRepository.getRandomAdviceFromPouch(pouchId = pouchId)
    }
}