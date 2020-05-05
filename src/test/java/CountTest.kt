import org.junit.Test

class CountTest {

    @Test
    fun testCount(){
        val testInput = listOf(
            "",
            "This is a test!",
            "Is this a test?",
            "Thank you"
        )

        val count = getCount(testInput)

        assert(count.size==6)
        assert(count.first().count==2)
        assert(count.last().count==1)
        assert(count.contains(WordCount("a",2)))
        assert(count.contains(WordCount("test",2)))
        assert(count.contains(WordCount("this",2)))
        assert(count.contains(WordCount("is",2)))
        assert(count.contains(WordCount("thank",1)))
        assert(count.contains(WordCount("you",1)))
    }
}