fun hasAllUniqueCharacters(str: String): Boolean {
    var checker = 0
    for (c in str) {
        require(c in 'a'..'z') { "Character '$c' is not a lowercase letter (a-z)." }
        val bitIndex = c - 'a'
        if (checker and (1 shl bitIndex) != 0) {
            return false
        }
        checker = checker or (1 shl bitIndex)
    }
    return true
}

fun main() {
    val testCases = listOf("abcdef", "aabcde", "xyz", "aabb", "programming")
    for (input in testCases) {
        println("\"$input\" -> ${if (hasAllUniqueCharacters(input)) "All unique" else "Has duplicates"}")
    }
}
