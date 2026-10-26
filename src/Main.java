public class Main {
    public static void main(String[] args) {

        Artifact artifact1 = new Artifact("Alien Crystal", 101);
        Artifact artifact2 = new Artifact("Space Rock", 102);
        Artifact artifact3 = new Artifact("Unknown Object", null);

        System.out.println("Intergalactic Archive of Weirdness");
        System.out.println();

        System.out.println("Artifact 1: " + artifact1.getName());
        System.out.println("ID: " + artifact1.getId());

        System.out.println();

        System.out.println("Artifact 2: " + artifact2.getName());
        System.out.println("ID: " + artifact2.getId());

        System.out.println();

        System.out.println("Artifact 3: " + artifact3.getName());
        System.out.println("ID: " + artifact3.getId());

        System.out.println();

        System.out.println("Total Artifacts Registered: "
                + Artifact.getTotalArtifacts());

        System.out.println();
        System.out.println("Universal Cataloging Constant: "
                + Artifact.UNIVERSAL_CATALOGING_CONSTANT);

        System.out.println();

        double energyLevel = 105.75;

        double stabilityIndex =
                ArtifactCalculator.calculateStabilityIndex(energyLevel);

        System.out.println("Artifact Energy Level: " + energyLevel);
        System.out.println("Stability Index: " + stabilityIndex);

        ArchiveReport.displayReport();
    }
}