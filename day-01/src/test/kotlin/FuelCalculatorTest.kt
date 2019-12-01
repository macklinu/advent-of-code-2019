import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FuelCalculatorTest {
  @ParameterizedTest
  @CsvSource("12,2", "14,2", "1969,654", "100756,33583")
  fun testFuelRequired(input: Int, expected: Int) {
    assertEquals(expected, fuelRequired(input))
  }

  @ParameterizedTest
  @CsvSource("12,2", "1969,966", "100756,50346")
  fun testTotalFuelRequirements(input: Int, expected: Int) {
    assertEquals(expected, totalFuelRequirements(input))
  }

  @Test
  fun answers() {
    val input = resourceFile("input.txt").readLines()
    assertEquals(3394689, input.map { fuelRequired(it.toInt()) }.sum())
    assertEquals(5089160, input.map { totalFuelRequirements(it.toInt()) }.sum())
  }
}