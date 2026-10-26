public class ArtifactCalculator {

    public static double calculateStabilityIndex(double energyLevel) {

        double difference = Math.abs(
                energyLevel - Artifact.UNIVERSAL_CATALOGING_CONSTANT);

        return Math.sqrt(difference);
    }
}
