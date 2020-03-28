package hevinxx.silkpouch

import hevinxx.silkpouch.FakeRepository.FakeUserPouchesRepository
import hevinxx.silkpouch.userpouches.data.entity.Advice
import hevinxx.silkpouch.userpouches.domain.GetMoreUserPouchesUseCase
import hevinxx.silkpouch.userpouches.domain.GetUserPouchesUseCase
import hevinxx.silkpouch.userpouches.domain.OpenPouchUseCase
import org.junit.Test

class UserPouchesDomainTest {
    private val fakeUserPouchesRepository =
        FakeUserPouchesRepository()

    private val getUserPouchesUseCase =
        GetUserPouchesUseCase(
            fakeUserPouchesRepository
        )
    private val getMoreUserPouchesUseCase =
        GetMoreUserPouchesUseCase(
            fakeUserPouchesRepository
        )
    private val openPouchUseCase =
        OpenPouchUseCase(
            fakeUserPouchesRepository
        )

    @Test
    fun getUserPouches() {
        getUserPouchesUseCase()
            .test()
            .assertNoErrors()
            .assertSubscribed()
            .assertValue{ userPouches -> userPouches.size == 5 }
            .dispose()
    }

    @Test
    fun getMoreUserPouches() {
        getMoreUserPouchesUseCase(5)
            .test()
            .assertNoErrors()
            .assertSubscribed()
            .assertValue{ userPouches -> userPouches.size == 5 }
            .dispose()
    }

    @Test
    fun openPouch() {
        openPouchUseCase(3)
            .test()
            .assertNoErrors()
            .assertSubscribed()
            .assertValue { advice -> advice.pouchId == 3 }
            .assertValue { advice -> advice is Advice }
            .dispose()
    }
}