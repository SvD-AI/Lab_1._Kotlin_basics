class Product(val price: Double) {
    init {
        if (price < 0) throw IllegalArgumentException()
    }
}