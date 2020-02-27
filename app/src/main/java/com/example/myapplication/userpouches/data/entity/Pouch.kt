package com.example.myapplication.userpouches.data.entity

data class Pouch(
    val id: Int,
    val name: String,
    val advices: List<Advice>,
    val creatorId: Int
)