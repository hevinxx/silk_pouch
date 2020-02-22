package com.example.myapplication.BaseStructure

import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

abstract class UseCaseObservable<Param, Result> {
    abstract operator fun invoke(param: Param): Observable<Result>
}

abstract class UseCaseSingle<Param, Result> {
    abstract operator fun invoke(param: Param): Single<Result>
}

abstract class UseCaseCompletable<Param> {
    abstract operator fun invoke(param: Param): Completable
}