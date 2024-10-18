```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileFinderTest {

    @Test
    void testFindFiles_ExistingFile_ReturnsFile() {
        // Arrange
        String directoryPath = "/path/to/directory";
        String fileName = "test.txt";
        // Assuming FileFinder has a findFiles(String directoryPath, String fileName) method
        FileFinder fileFinder = new FileFinder();

        // Act
        File foundFile = fileFinder.findFiles(directoryPath, fileName);

        // Assert
        assertNotNull(foundFile);
        assertEquals(fileName, foundFile.getName());
    }

    @Test
    void testFindFiles_NonExistingFile_ReturnsNull() {
        // Arrange
        String directoryPath = "/path/to/directory";
        String fileName = "non_existing_file.txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        File foundFile = fileFinder.findFiles(directoryPath, fileName);

        // Assert
        assertNull(foundFile);
    }

    @Test
    void testFindFiles_EmptyDirectory_ReturnsNull() {
        // Arrange
        String directoryPath = "/path/to/empty/directory";
        String fileName = "test.txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        File foundFile = fileFinder.findFiles(directoryPath, fileName);

        // Assert
        assertNull(foundFile);
    }

    @Test
    void testFindFiles_InvalidDirectory_ThrowsException() {
        // Arrange
        String directoryPath = "/invalid/directory/path";
        String fileName = "test.txt";
        FileFinder fileFinder = new FileFinder();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> fileFinder.findFiles(directoryPath, fileName));
    }

    // Add more test cases as needed, covering different scenarios and edge cases.
}
```

**Import Statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
```

**Explanation:**

1. **Import Statements:** Import necessary classes from JUnit and Java.
2. **Test Class:** Create a JUnit test class named `FileFinderTest`.
3. **Test Methods:** Create test methods to cover different scenarios.
4. **Arrange:** Set up the test data (directory path, file name, etc.) and create an instance of the `FileFinder` class.
5. **Act:** Call the method under test (`findFiles`) and store the result.
6. **Assert:** Use assertions to verify the expected outcome. 
   - `assertNotNull`: Verify that a file was found.
   - `assertEquals`: Verify that the found file has the expected name.
   - `assertNull`: Verify that no file was found.
   - `assertThrows`: Verify that an exception is thrown for invalid input.

**Remember to:**

- Replace `/path/to/directory` and `/path/to/empty/directory` with actual directory paths.
- Replace `FileFinder` with the actual class name.
- Add more test cases to cover various scenarios and edge cases in your `FileFinder` class.