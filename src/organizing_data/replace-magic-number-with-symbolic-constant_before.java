static final double GRAVITALFORCE_CONSTANT = 9.81;
double potentialEnergy(double mass, double height) {
  return mass * height * GRAVITALFORCE_CONSTANT;
}