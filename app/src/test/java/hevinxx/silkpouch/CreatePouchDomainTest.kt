package hevinxx.silkpouch

import hevinxx.silkpouch.FakeRepository.FakeUserPouchesRepository
import hevinxx.silkpouch.createpouch.domain.PostNewPouchUseCase
import hevinxx.silkpouch.userpouches.data.entity.Pouch
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import org.junit.Test

class CreatePouchDomainTest {
    private val fakeUserPouchesRepository =
        FakeUserPouchesRepository()
    private val postNewPouchUseCase =
        PostNewPouchUseCase(
            fakeUserPouchesRepository
        )

    @Test
    fun createNewPouch() {
        val newPouch = mock<Pouch> { on { id } doReturn 11 }
        postNewPouchUseCase(newPouch)
            .test()
            .assertNoErrors()
            .assertSubscribed()
            .assertValue{ result -> result.pouchId == 11 }
            .dispose()
    }
}