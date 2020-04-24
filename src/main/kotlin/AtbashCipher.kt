object Atbash {

    fun encode(s: String): String =
            decode(s).chunked(5)
                    .joinToString(" ")

    fun decode(s: String): String =
            s.filter { it.isLetterOrDigit() }
                    .map { if (it.isLetter()) 'a' + ('z' - it.toLowerCase()) else it}
                    .joinToString("")

}
