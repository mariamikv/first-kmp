package ge.mk.first.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform