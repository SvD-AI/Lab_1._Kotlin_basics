fun formatUser(login: String, domain: String = "example.com", isActive: Boolean = true): String = "[$login@$domain] - Active: $isActive"
fun testUser(): String {
    return formatUser(login = "admin", isActive = false)
}