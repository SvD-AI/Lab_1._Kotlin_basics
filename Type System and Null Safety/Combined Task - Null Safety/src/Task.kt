fun generateGreeting(name: String?): String {
    val cleanName = name?.takeIf { it.isNotEmpty() } ?: "Guest"
    return "Welcome, $cleanName!"    // Поверніть рядок формату "Welcome, Name!"

}