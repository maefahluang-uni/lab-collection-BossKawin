package lab.oodp.pancake;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * A class that randomly generates names.
 */
public class NameGenerator {

    private List<String> namesList;

    /**
     * Creates the name generator by loading names.txt and reading all names from it into a set.
     * Then add the contents of that set to the namesList list.
     */
    public NameGenerator() {

        Set<String> names = new TreeSet<>();

        try (Scanner scanner = new Scanner(this.nameStr)) {

            while (scanner.hasNextLine()) {

                String name = scanner.nextLine();

                // This line removes everything from the name that's not a letter.
                // Normally, using trim() would work fine. However, the names.txt file I copy / pasted from a website
                // has some other random characters in it that aren't removed by the trim() function...
                name = name.replaceAll("[^A-Za-z]", "");

                names.add(name);

            }

        } catch (Exception e) {
            // This will not happen unless someone deleted names.txt by mistake or it's been corrupted.
            // If that happens, there's not much the user can do about it, so may as well just crash.
            throw new RuntimeException(e);
        }

        // We first assign to a Set because this will nicely remove duplicates for us.
        // We then add those elements to an ArrayList as its easier to pick an element at random from a List
        // rather than a Set.
        this.namesList = new ArrayList<>(names);

    }

    /**
     * Gets a random name from the set.
     * @return a name
     */
    public String getRandomName() {
        return this.namesList.get((int)(Math.random() * this.namesList.size()));
    }
    
    String nameStr = "Tawnya Â \n"
    		+ "Carli Â \n"
    		+ "Chiquita Â \n"
    		+ "Shakia Â \n"
    		+ "Elane Â \n"
    		+ "Marinda Â \n"
    		+ "Scottie Â \n"
    		+ "Dwayne Â \n"
    		+ "Katelin Â \n"
    		+ "Telma Â \n"
    		+ "Coleman Â \n"
    		+ "Migdalia Â \n"
    		+ "Bronwyn Â \n"
    		+ "Ja Â \n"
    		+ "Arletha Â \n"
    		+ "Paulina Â \n"
    		+ "Antonio Â \n"
    		+ "Kaleigh Â \n"
    		+ "Chelsey Â \n"
    		+ "Neomi Â \n"
    		+ "Malorie Â \n"
    		+ "Wai Â \n"
    		+ "Ima Â \n"
    		+ "Krystal Â \n"
    		+ "Carolann Â \n"
    		+ "Lekisha Â \n"
    		+ "Paul Â \n"
    		+ "Felton Â \n"
    		+ "Vern Â \n"
    		+ "Elma Â \n"
    		+ "Ira Â \n"
    		+ "Cortney Â \n"
    		+ "Kesha Â \n"
    		+ "Joanie Â \n"
    		+ "Florinda Â \n"
    		+ "Deadra Â \n"
    		+ "Peg Â \n"
    		+ "Edda Â \n"
    		+ "Eric Â \n"
    		+ "Verona Â \n"
    		+ "Joseph Â \n"
    		+ "Christiane Â \n"
    		+ "Thea Â \n"
    		+ "Elna Â \n"
    		+ "Marybelle Â \n"
    		+ "Ronnie Â \n"
    		+ "Sheena Â \n"
    		+ "Melony Â \n"
    		+ "Tyrone Â \n"
    		+ "Jessia Â \n"
    		+ "Laure Â \n"
    		+ "Bettyann Â \n"
    		+ "Tressie Â \n"
    		+ "Wendie Â \n"
    		+ "Donya Â \n"
    		+ "Vicente Â \n"
    		+ "Lawerence Â \n"
    		+ "Rachael Â \n"
    		+ "Lakita Â \n"
    		+ "Rowena Â \n"
    		+ "Fredricka Â \n"
    		+ "Tracee Â \n"
    		+ "Gerald Â \n"
    		+ "Katelynn Â \n"
    		+ "Marielle Â \n"
    		+ "Steven Â \n"
    		+ "Brandon Â \n"
    		+ "Rhoda Â \n"
    		+ "Susannah Â \n"
    		+ "Charlott Â \n"
    		+ "Simon Â \n"
    		+ "Annabel Â \n"
    		+ "Sherri Â \n"
    		+ "Jasper Â \n"
    		+ "Eldon Â \n"
    		+ "Enrique Â \n"
    		+ "Otha Â \n"
    		+ "Jayna Â \n"
    		+ "Joey Â \n"
    		+ "Audria Â \n"
    		+ "Linsey Â \n"
    		+ "Sharika Â \n"
    		+ "Manuela Â \n"
    		+ "Mercy Â \n"
    		+ "Rosamaria Â \n"
    		+ "Zita Â \n"
    		+ "Nadia Â \n"
    		+ "Jene Â \n"
    		+ "Lashell Â \n"
    		+ "Lekisha Â \n"
    		+ "Heather Â \n"
    		+ "Arron Â \n"
    		+ "Latrina Â \n"
    		+ "Kent Â \n"
    		+ "Charissa Â \n"
    		+ "Johnsie Â \n"
    		+ "Melvin Â \n"
    		+ "Merlyn Â \n"
    		+ "Cleotilde Â \n"
    		+ "Adam Â \n"
    		+ "Kendal Â \n"
    		+ "Ayesha Â \n"
    		+ "Newton Â \n"
    		+ "Natasha Â \n"
    		+ "Lucien Â \n"
    		+ "Joellen Â \n"
    		+ "Deb Â \n"
    		+ "Percy Â \n"
    		+ "Latia Â \n"
    		+ "Vivian Â \n"
    		+ "Antonette Â \n"
    		+ "Carla Â \n"
    		+ "Luciana Â \n"
    		+ "Lawrence Â \n"
    		+ "Ellyn Â \n"
    		+ "Maurine Â \n"
    		+ "Mary Â \n"
    		+ "Marianne Â \n"
    		+ "Emma Â \n"
    		+ "Ward Â \n"
    		+ "Natalia Â \n"
    		+ "Veta Â \n"
    		+ "Shelly Â \n"
    		+ "Daniel Â \n"
    		+ "Lachelle Â \n"
    		+ "Eloise Â \n"
    		+ "Audie Â \n"
    		+ "Margorie Â \n"
    		+ "Ivonne Â \n"
    		+ "Hedy Â \n"
    		+ "Dawn Â \n"
    		+ "Wilson Â \n"
    		+ "Merlin Â \n"
    		+ "Elfreda Â \n"
    		+ "Mikel Â \n"
    		+ "Charley Â \n"
    		+ "Catina Â \n"
    		+ "Bob Â \n"
    		+ "Benito Â \n"
    		+ "Mirna Â \n"
    		+ "Rosy Â \n"
    		+ "Heidy Â \n"
    		+ "Raguel Â \n"
    		+ "Elinor Â \n"
    		+ "Karma Â \n"
    		+ "Regena Â \n"
    		+ "Melaine Â \n"
    		+ "Maritza Â \n"
    		+ "Genevieve Â \n"
    		+ "Wynell Â \n"
    		+ "Merissa Â \n"
    		+ "Adele Â \n"
    		+ "Bridgett Â \n"
    		+ "Catrina Â \n"
    		+ "Kelsey Â \n"
    		+ "Ginny Â \n"
    		+ "Randall Â \n"
    		+ "Sharolyn Â \n"
    		+ "Reyna Â \n"
    		+ "Eldridge Â \n"
    		+ "Shoshana Â \n"
    		+ "Roman Â \n"
    		+ "Hue Â \n"
    		+ "Chiquita Â \n"
    		+ "Hipolito Â \n"
    		+ "Jammie Â \n"
    		+ "Jorge Â \n"
    		+ "Anette Â \n"
    		+ "Artie Â \n"
    		+ "Veta Â \n"
    		+ "Lilia Â \n"
    		+ "Marylynn Â \n"
    		+ "Kirk Â \n"
    		+ "Brice Â \n"
    		+ "Glory Â \n"
    		+ "Lakiesha Â \n"
    		+ "Meagan Â \n"
    		+ "Marcie Â \n"
    		+ "Trinidad Â \n"
    		+ "Lucrecia Â \n"
    		+ "Saundra Â \n"
    		+ "Everett Â \n"
    		+ "Winona Â \n"
    		+ "Yan Â \n"
    		+ "Allene Â \n"
    		+ "Willian Â \n"
    		+ "Erik Â \n"
    		+ "Freida Â \n"
    		+ "Chuck Â \n"
    		+ "Cordia Â \n"
    		+ "Carri Â \n"
    		+ "Chantelle Â \n"
    		+ "Alfred Â \n"
    		+ "Nestor Â \n"
    		+ "Daron Â \n"
    		+ "Neoma Â \n"
    		+ "Lelah Â \n"
    		+ "Roderick Â \n"
    		+ "Christiana Â \n"
    		+ "Burl ";

}
