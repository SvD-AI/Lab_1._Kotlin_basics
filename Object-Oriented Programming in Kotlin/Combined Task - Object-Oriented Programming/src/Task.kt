class Worker(val name: String, val hourlyRate: Int) {
    init {
        if (hourlyRate <= 0) throw IllegalArgumentException()
    }

    var hoursWorked: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    val salary: Int
        get() = hourlyRate * hoursWorked
}// Додайте init { ... }
// Додайте var hoursWorked та val salary