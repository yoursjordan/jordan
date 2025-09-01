import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("🤖 ChatBot: Hello! I’m your assistant. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.contains("bye")) {
                System.out.println("🤖 ChatBot: Goodbye! Have a nice day 😊");
                break;
            }

            switch (input) {
                case "hi":
                case "hello":
                    System.out.println("🤖 ChatBot: Hi there! How can I help you?");
                    break;
                case "what is your name":
                    System.out.println("🤖 ChatBot: I’m a Java-powered chatbot!");
                    break;
                case "how are you":
                    System.out.println("🤖 ChatBot: I’m doing great, thanks for asking!");
                    break;
                case "services":
                    System.out.println("🤖 ChatBot: We provide AI, Web Development, and Cloud services.");
                    break;
                default:
                    System.out.println("🤖 ChatBot: Sorry, I don’t understand. Can you rephrase?");
            }
        }
        sc.close();
    }
}
