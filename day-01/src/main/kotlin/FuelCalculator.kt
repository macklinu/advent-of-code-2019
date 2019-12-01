fun fuelRequired(mass: Int): Int {
  return mass.div(3) - 2
}

fun totalFuelRequirements(initialMass: Int): Int {
  val fuels = mutableListOf<Int>()
  var mass = initialMass
  while (mass > 0) {
    val fuel = fuelRequired(mass)
    if (fuel > 0) fuels.add(fuel)
    mass = fuel
  }
  return fuels.sum()
}