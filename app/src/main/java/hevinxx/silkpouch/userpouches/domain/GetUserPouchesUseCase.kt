package hevinxx.silkpouch.userpouches.domain

import hevinxx.silkpouch.userpouches.data.entity.Pouch
import hevinxx.silkpouch.userpouches.data.UserPouchesRepository
import io.reactivex.Single

class GetUserPouchesUseCase(
    private val userPouchesRepository: UserPouchesRepository
) {
    operator fun invoke(): Single<List<Pouch>> {
        return userPouchesRepository.getUserPouches()
    }
}