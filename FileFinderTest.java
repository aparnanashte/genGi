```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileFinderTest {

    @Test
    void findFiles_emptyDirectory_returnsEmptyList() {
        // Arrange
        String directoryPath = "path/to/empty/directory"; // Replace with an actual empty directory path

        // Act
        List<String> foundFiles = FileFinder.findFiles(directoryPath, "txt"); // Assuming FileFinder has a findFiles method

        // Assert
        assertTrue(foundFiles.isEmpty(), "Expected empty list for empty directory.");
    }

    @Test
    void findFiles_nonExistingDirectory_returnsEmptyList() {
        // Arrange
        String directoryPath = "path/to/non/existing/directory"; // Replace with a non-existing directory path

        // Act
        List<String> foundFiles = FileFinder.findFiles(directoryPath, "txt");

        // Assert
        assertTrue(foundFiles.isEmpty(), "Expected empty list for non-existing directory.");
    }

    @Test
    void findFiles_validDirectory_returnsListOfFiles() {
        // Arrange
        String directoryPath = "path/to/valid/directory"; // Replace with an actual directory path containing files
        String fileExtension = "txt";

        // Act
        List<String> foundFiles = FileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        assertFalse(foundFiles.isEmpty(), "Expected list to contain files.");
        foundFiles.forEach(file -> assertTrue(file.endsWith(fileExtension), "File name should end with the specified extension."));
    }

    // Add more test cases for different scenarios, such as:
    // - Finding files with different extensions
    // - Searching for files recursively in subdirectories
    // - Handling invalid file extensions
    // - Handling edge cases like empty file names
}
```

**Explanation:**

- The code starts with an import statement for `org.junit.jupiter.api.Test` and `static org.junit.jupiter.api.Assertions.*`.
- Three test methods are defined:
    - `findFiles_emptyDirectory_returnsEmptyList`: Tests if an empty list is returned when searching an empty directory.
    - `findFiles_nonExistingDirectory_returnsEmptyList`: Tests if an empty list is returned when searching a non-existing directory.
    - `findFiles_validDirectory_returnsListOfFiles`: Tests if a list of files with the specified extension is returned for a valid directory.
- Each test method follows the Arrange-Act-Assert pattern.
- Placeholders for actual directory paths and file extensions are provided in the `Arrange` section.
- The `Act` section calls the `FileFinder.findFiles()` method.
- The `Assert` section uses assertions to verify the expected outcome based on the test scenario.
- You can add more test cases to cover different scenarios and edge cases.

**Important Notes:**

- Replace the placeholder directory paths with your actual directory paths.
- Make sure you have the `FileFinder` class defined and implement the `findFiles()` method accordingly.
- Adjust the test methods and assertions based on your specific requirements.
- Consider adding more test cases to ensure complete coverage of the `FileFinder` class.