package com.example.myapplication.UserPouches.Data.Entity

data class Advice(
    val id: Int,
    val content: String,
    val creatorId: Int,
    val pouchId: Int
)