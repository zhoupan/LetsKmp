package io.github.zhoupan.lets.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform