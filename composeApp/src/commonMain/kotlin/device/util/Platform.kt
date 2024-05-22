package device.util

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform