package hevinxx.silkpouch.userpouches.domain

import hevinxx.silkpouch.userpouches.data.entity.Pouch
import hevinxx.silkpouch.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class GetMoreUserPouchesUseCase(
    private val userPouchesRepository: UserPouchesRepository
) {
    operator fun invoke(anchor: Int): Single<List<Pouch>> {
        return userPouchesRepository.getMoreUserPouches(anchor)
    }
}