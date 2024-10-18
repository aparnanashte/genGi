```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileFinderTest {

    @Test
    void findFiles_shouldReturnListOfFiles_whenDirectoryExists() {
        // Arrange
        String directoryPath = "path/to/directory";
        String filePattern = "*.txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<File> foundFiles = fileFinder.findFiles(directoryPath, filePattern);

        // Assert
        // Assertions depend on the expected files in the directory
        // Example:
        // assertEquals(3, foundFiles.size()); 
        // assertTrue(foundFiles.stream().allMatch(file -> file.getName().endsWith(".txt")));
    }

    @Test
    void findFiles_shouldReturnEmptyList_whenDirectoryDoesNotExist() {
        // Arrange
        String directoryPath = "non/existent/directory";
        String filePattern = "*.txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<File> foundFiles = fileFinder.findFiles(directoryPath, filePattern);

        // Assert
        assertEquals(0, foundFiles.size());
    }

    @Test
    void findFiles_shouldReturnEmptyList_whenFilePatternIsInvalid() {
        // Arrange
        String directoryPath = "path/to/directory";
        String filePattern = "invalid pattern";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<File> foundFiles = fileFinder.findFiles(directoryPath, filePattern);

        // Assert
        assertEquals(0, foundFiles.size());
    }
}
```

**Import Statement:**

```java
import java.io.File;
import java.util.List;
```

**Explanation:**

* The test cases are written using JUnit 5 annotations (`@Test`).
* The `findFiles_shouldReturnListOfFiles_whenDirectoryExists` test verifies that the `findFiles` method returns a list of files when the specified directory exists.
* The `findFiles_shouldReturnEmptyList_whenDirectoryDoesNotExist` test verifies that the `findFiles` method returns an empty list when the directory does not exist.
* The `findFiles_shouldReturnEmptyList_whenFilePatternIsInvalid` test verifies that the `findFiles` method returns an empty list when the file pattern is invalid.

**Note:**

* You need to replace the `directoryPath` and `filePattern` with actual values based on your specific test setup.
* The assertions in the `findFiles_shouldReturnListOfFiles_whenDirectoryExists` test need to be modified based on the expected files in the directory.
* Make sure that the `FileFinder` class is correctly defined and implemented. 
