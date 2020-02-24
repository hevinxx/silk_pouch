package com.example.myapplication

import com.example.myapplication.FakeRepository.FakeUserPouchesRepository
import com.example.myapplication.UserPouches.Data.Entity.Advice
import com.example.myapplication.UserPouches.Domain.GetMoreUserPouchesUseCase
import com.example.myapplication.UserPouches.Domain.GetUserPouchesUseCase
import com.example.myapplication.UserPouches.Domain.OpenPouchUseCase
import org.junit.Test

class UserPouchesDomainTest {
    private val fakeUserPouchesRepository = FakeUserPouchesRepository()

    private val getUserPouchesUseCase = GetUserPouchesUseCase(fakeUserPouchesRepository)
    private val getMoreUserPouchesUseCase = GetMoreUserPouchesUseCase(fakeUserPouchesRepository)
    private val openPouchUseCase = OpenPouchUseCase(fakeUserPouchesRepository)

    @Test
    fun getUserPouchesTest() {
        getUserPouchesUseCase(1)
            .test()
            .assertNoErrors()
            .assertSubscribed()
            .assertValue{ userPouches -> userPouches.size == 5 }
            .dispose()
    }

    @Test
    fun getMoreUserPouchesTest() {
        getMoreUserPouchesUseCase(1)
            .test()
            .assertNoErrors()
            .assertSubscribed()
            .assertValue{ userPouches -> userPouches.size == 5 }
            .dispose()
    }

    @Test
    fun openPouchTest() {
        openPouchUseCase(3)
            .test()
            .assertNoErrors()
            .assertSubscribed()
            .assertValue { advice -> advice.pouchId == 3 }
            .assertValue { advice -> advice is Advice }
            .dispose()
    }
}