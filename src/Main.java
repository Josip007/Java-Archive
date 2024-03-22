

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (Empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (Empty to stop)");

            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive archiveToAdd = new Archive(identifier, name);
            if (archive.contains(archiveToAdd)) {
                continue;
            }
            archive.add(archiveToAdd);

        }

        System.out.println("==Items==");
        for (Archive items : archive) {
            System.out.println(items.identifier() + ": " + items.name());
        }

    }
}
