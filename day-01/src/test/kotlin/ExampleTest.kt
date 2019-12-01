import extensions.flip
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExampleTest {
  @Test
  fun example() {
    assertEquals(1, 1)
  }

  @Test
  fun extensions() {
    val pair = 1 to 2
    assertEquals(2 to 1, pair.flip())
  }
}