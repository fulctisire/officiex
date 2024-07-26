import org.apache.commons.text.WordUtils;

public class WordUtilsExample {
    public static void main(String[] args) {
        String input = "this is an example text.";

        // Capitalize each word
        String capitalized = WordUtils.capitalize(input);
        System.out.println("Capitalized: " + capitalized); // Output: This Is An Example Text.

        // Wrap the text at a specified width
        String wrapped = WordUtils.wrap(input, 10);
        System.out.println("Wrapped:\n" + wrapped);
        // Output:
        // this is an
        // example
        // text.

        // Capitalize fully
        String fullyCapitalized = WordUtils.capitalizeFully(input);
        System.out.println("Fully Capitalized: " + fullyCapitalized); // Output: This Is An Example Text.

        // Uncapitalize
        String uncapitalized = WordUtils.uncapitalize(capitalized);
        System.out.println("Uncapitalized: " + uncapitalized); // Output: this is an example text.

        // Swap case
        String swappedCase = WordUtils.swapCase(input);
        System.out.println("Swapped Case: " + swappedCase); // Output: THIS IS AN EXAMPLE TEXT.
    }
}
