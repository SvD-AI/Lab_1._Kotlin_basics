class RowScope { fun weight() = "W" }
class ColumnScope { fun gravity() = "G" }

fun Row(content: RowScope.() -> String) = RowScope().content()
fun Column(content: ColumnScope.() -> String) = ColumnScope().content()

fun testScopes(): String {
    val r1 = Row { weight() }
    val r2 = Column { gravity() }
    return r1 + r2
}