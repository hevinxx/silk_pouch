package com.example.myapplication.UserPouches.Data.Entity

data class Pouch(
    val id: Int,
    val name: String,
    val advices: List<Advice>,
    val creatorId: Int
)