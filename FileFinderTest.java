```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileFinderTest {

    @Test
    void testFindFiles_validDirectory_returnsListOfFiles() {
        // Arrange
        String directoryPath = "/path/to/directory"; // Replace with actual directory path
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<String> foundFiles = fileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        assertNotNull(foundFiles);
        assertTrue(foundFiles.size() > 0);
        foundFiles.forEach(file -> assertTrue(file.endsWith(fileExtension)));
    }

    @Test
    void testFindFiles_invalidDirectory_returnsEmptyList() {
        // Arrange
        String directoryPath = "/path/to/nonexistent/directory"; // Replace with non-existent directory path
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<String> foundFiles = fileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        assertNotNull(foundFiles);
        assertTrue(foundFiles.isEmpty());
    }

    @Test
    void testFindFiles_emptyDirectory_returnsEmptyList() {
        // Arrange
        String directoryPath = "/path/to/empty/directory"; // Replace with empty directory path
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<String> foundFiles = fileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        assertNotNull(foundFiles);
        assertTrue(foundFiles.isEmpty());
    }
}
```

**Explanation:**

- **Imports:**
    - `org.junit.jupiter.api.Test` is used to mark methods as test methods.
    - `static org.junit.jupiter.api.Assertions.*` imports static assertion methods from JUnit.
- **Class:**
    - `FileFinderTest` is the name of the test class.
- **Test Methods:**
    - **`testFindFiles_validDirectory_returnsListOfFiles()`:**
        - This test checks if the `findFiles` method returns a non-empty list of files when a valid directory path is provided.
        - It asserts that the returned list is not null, has a size greater than 0, and all files in the list end with the specified file extension.
    - **`testFindFiles_invalidDirectory_returnsEmptyList()`:**
        - This test verifies that the `findFiles` method returns an empty list when an invalid directory path is provided.
        - It asserts that the returned list is not null and is empty.
    - **`testFindFiles_emptyDirectory_returnsEmptyList()`:**
        - This test checks if the `findFiles` method returns an empty list when an empty directory is given.
        - It asserts that the returned list is not null and is empty.

**Note:**

- Replace the placeholder directory paths with actual paths in your system.
- You will need to create the `FileFinder` class yourself and implement the `findFiles` method according to your requirements.
- The provided test cases are just examples. You may need to add more test cases depending on the complexity and functionality of your `FileFinder` class.
- Remember to adjust the assertions and test logic to match the expected behavior of your `findFiles` method.
