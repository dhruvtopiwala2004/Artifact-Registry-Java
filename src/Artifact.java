public class Artifact {

    private String name;
    private Integer id;
    private static int totalArtifacts = 0;
    public static final double UNIVERSAL_CATALOGING_CONSTANT = 3.14159;

    public Artifact(String name, Integer id) {
        this.name = name;
        this.id = id;
        totalArtifacts++;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public static int getTotalArtifacts() {
        return totalArtifacts;
    }
}