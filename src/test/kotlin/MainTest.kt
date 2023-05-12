import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTest {
    private var objectUnderTest: MainCode? = null

    @BeforeEach
    fun setup() {
        objectUnderTest = MainCode()
    }

    @Test
    fun mainTest() {
        assertEquals(objectUnderTest!!.doit(), 0)
    }
}