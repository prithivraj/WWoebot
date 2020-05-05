fun getCount(input: List<String>): List<WordCount> {

    val countMap = hashMapOf<String, Int>()

    val pattern = "\\W+".toRegex()
    input
        .flatMap { pattern.split(it) }
        .filter { it.isNotEmpty() }
        .map { it.toLowerCase() }
        .forEach { word ->
            if (countMap.containsKey(word)) {
                val i = countMap[word]!! + 1
                countMap[word] = i
            } else {
                countMap[word] = 1
            }
        }

    return countMap.entries.sortedByDescending { it.value }.map { WordCount(word = it.key, count = it.value) }

}

data class WordCount(val word: String, val count: Int)

fun main() {
    val listOf = listOf("I love summer.", "My family loves to hike in the summer!")
    getCount(listOf).forEach { println(it) }
}

