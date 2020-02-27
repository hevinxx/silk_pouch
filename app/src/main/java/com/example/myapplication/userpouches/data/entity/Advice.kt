package com.example.myapplication.userpouches.data.entity

data class Advice(
    val id: Int,
    val content: String,
    val creatorId: Int,
    val pouchId: Int
)