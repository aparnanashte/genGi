```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileFinderTest {

    @Test
    void findFiles_emptyDirectory_returnsEmptyList() {
        // Arrange
        String directoryPath = "/path/to/empty/directory";
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<String> foundFiles = fileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        assertTrue(foundFiles.isEmpty());
    }

    @Test
    void findFiles_directoryWithFiles_returnsListOfMatchingFiles() {
        // Arrange
        String directoryPath = "/path/to/directory/with/files";
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<String> foundFiles = fileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        assertFalse(foundFiles.isEmpty());
        // Add assertions to check if the list contains expected files
    }

    @Test
    void findFiles_invalidDirectory_throwsIllegalArgumentException() {
        // Arrange
        String directoryPath = "/invalid/directory/path";
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> fileFinder.findFiles(directoryPath, fileExtension));
    }

    @Test
    void findFiles_nullFileExtension_throwsIllegalArgumentException() {
        // Arrange
        String directoryPath = "/path/to/directory";
        String fileExtension = null;
        FileFinder fileFinder = new FileFinder();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> fileFinder.findFiles(directoryPath, fileExtension));
    }

    @Test
    void findFiles_emptyFileExtension_returnsAllFiles() {
        // Arrange
        String directoryPath = "/path/to/directory";
        String fileExtension = "";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<String> foundFiles = fileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        // Add assertions to check if the list contains all files in the directory
    }

    // Add more test cases for different scenarios, including:
    // - Finding files with different extensions
    // - Finding files in subdirectories
    // - Handling files with special characters in their names
    // - Handling empty directories
}
```

**Explanation:**

* **Import Statements:** The necessary import statements for JUnit 5 are included at the top.
* **Test Class:** The `FileFinderTest` class is created to contain the test methods.
* **Test Methods:**
    * **`findFiles_emptyDirectory_returnsEmptyList()`:** Tests if the `findFiles` method returns an empty list when the directory is empty.
    * **`findFiles_directoryWithFiles_returnsListOfMatchingFiles()`:** Tests if the method returns a list of matching files when the directory contains files.
    * **`findFiles_invalidDirectory_throwsIllegalArgumentException()`:** Tests if the method throws an `IllegalArgumentException` when the directory path is invalid.
    * **`findFiles_nullFileExtension_throwsIllegalArgumentException()`:** Tests if the method throws an `IllegalArgumentException` when the file extension is null.
    * **`findFiles_emptyFileExtension_returnsAllFiles()`:** Tests if the method returns all files when the file extension is empty.
* **Assertions:** The `assertTrue`, `assertFalse`, and `assertThrows` methods are used to verify the expected outcomes of the tests.
* **Test Data:** Replace the placeholder values for `directoryPath` and `fileExtension` with actual paths and extensions that correspond to your test environment.

**Remember to:**

* Replace the placeholder comments with actual assertions for your test cases.
* Add more test cases for other scenarios relevant to your `FileFinder` class.
* Adjust the test method names to reflect the specific behavior being tested.

This is just a starting point for your test cases. You should add more tests to cover all the functionality of your `FileFinder` class and ensure it behaves as expected.
