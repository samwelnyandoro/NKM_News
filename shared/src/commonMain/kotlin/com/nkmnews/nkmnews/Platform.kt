package com.nkmnews.nkmnews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform