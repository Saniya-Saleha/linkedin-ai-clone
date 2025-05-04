import java.util.Scanner;

public class AiEngine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to AI-Powered LinkedIn Profile Helper!");
        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();

        System.out.println("\nGenerating AI Profile Summary...");
        System.out.println("You are a talented individual skilled in " + skills +
                ". Your background positions you well for opportunities in tech-driven roles.\n");

        System.out.println("Recommended Jobs:");
        if (skills.toLowerCase().contains("java")) {
            System.out.println("- Java Developer at InnovateTech");
        }
        if (skills.toLowerCase().contains("frontend")) {
            System.out.println("- Frontend Engineer at CodeBase");
        }
        if (skills.toLowerCase().contains("ai") || skills.toLowerCase().contains("ml")) {
            System.out.println("- AI Research Intern at SmartML");
        }
    }
}