public class SplitDemo {
    public static void main(String[] args) {
        String version = "1.2.3";

        // Wrong: "." means "any character"
        String[] wrong = version.split(".");
        System.out.println("Using split(\".\"):");
        for (String part : wrong) {
            System.out.println("[" + part + "]");
        }

        // Correct: "\\." means "literal dot"
        String[] correct = version.split("\\.");
        System.out.println("Using split(\"\\\\.\"):");
        for (String part : correct) {
            System.out.println("[" + part + "]");
        }
    }
}
