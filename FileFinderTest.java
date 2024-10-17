```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileFinderTest {

    @Test
    void findFiles_emptyDirectory_returnsEmptyList() {
        // Arrange
        String directoryPath = "path/to/empty/directory";
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<String> foundFiles = fileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        assertEquals(0, foundFiles.size());
    }

    @Test
    void findFiles_validDirectory_returnsListOfFiles() {
        // Arrange
        String directoryPath = "path/to/directory/with/files";
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        List<String> foundFiles = fileFinder.findFiles(directoryPath, fileExtension);

        // Assert
        assertTrue(foundFiles.size() > 0);
        for (String file : foundFiles) {
            assertTrue(file.endsWith(fileExtension));
        }
    }

    @Test
    void findFiles_invalidDirectory_throwsFileNotFoundException() {
        // Arrange
        String directoryPath = "path/to/nonexistent/directory";
        String fileExtension = ".txt";
        FileFinder fileFinder = new FileFinder();

        // Act & Assert
        assertThrows(FileNotFoundException.class, () -> fileFinder.findFiles(directoryPath, fileExtension));
    }

    // ... add more test cases as needed ...
}
```

**Import Statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
```

**Explanation:**

1. **Import Statements:** These import the necessary classes for writing JUnit tests.
2. **Test Class:** The `FileFinderTest` class is the test class for the `FileFinder` class.
3. **Test Methods:** Each test method tests a specific aspect of the `FileFinder` class.
4. **Assertions:** The `assertEquals`, `assertTrue`, and `assertThrows` methods are used to assert the expected behavior of the methods under test.
5. **Test Cases:**
    - `findFiles_emptyDirectory_returnsEmptyList`: Tests that an empty directory returns an empty list of files.
    - `findFiles_validDirectory_returnsListOfFiles`: Tests that a valid directory returns a list of files with the specified extension.
    - `findFiles_invalidDirectory_throwsFileNotFoundException`: Tests that an invalid directory throws a `FileNotFoundException`.

**Notes:**

- Replace `"path/to/empty/directory"`, `"path/to/directory/with/files"`, and `"path/to/nonexistent/directory"` with actual paths to directories on your system.
- The `FileFinder` class must be in the same package as the test class.
- Adjust the test cases based on the specific methods and functionality of your `FileFinder` class.
