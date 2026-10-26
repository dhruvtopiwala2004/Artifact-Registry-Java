public class ArchiveReport {

    public static void displayReport() {

        System.out.println();
        System.out.println("=== Archive Report ===");

        System.out.println("Total Artifacts Registered: "
                + Artifact.getTotalArtifacts());

        String formattedConstant = String.format("%.3f",
                Artifact.UNIVERSAL_CATALOGING_CONSTANT);

        System.out.println("Universal Cataloging Constant: "
                + formattedConstant);

        String rawLog = "105.75";
        double systemEnergy = Double.parseDouble(rawLog);

        System.out.println("Current System Energy: " + systemEnergy);
    }
}