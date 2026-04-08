fun toUpperCaseSafe(text: String?): String {
    if (text != null) {
        return text.uppercase()
    }
    return "EMPTY"
}