package com.example.socialappkotlinmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform