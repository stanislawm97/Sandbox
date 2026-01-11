package pl.moljok.sandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform