```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileFinderTest {

    @Test
    void findFile_existingFile_returnsFilePath() {
        // Arrange
        String directory = "path/to/directory";
        String fileName = "test.txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        String filePath = fileFinder.findFile(directory, fileName);

        // Assert
        assertEquals("path/to/directory/test.txt", filePath);
    }

    @Test
    void findFile_nonExistingFile_returnsNull() {
        // Arrange
        String directory = "path/to/directory";
        String fileName = "nonexistent.txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        String filePath = fileFinder.findFile(directory, fileName);

        // Assert
        assertNull(filePath);
    }

    @Test
    void findFile_emptyDirectory_returnsNull() {
        // Arrange
        String directory = "";
        String fileName = "test.txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        String filePath = fileFinder.findFile(directory, fileName);

        // Assert
        assertNull(filePath);
    }

    @Test
    void findFile_nullDirectory_returnsNull() {
        // Arrange
        String directory = null;
        String fileName = "test.txt";
        FileFinder fileFinder = new FileFinder();

        // Act
        String filePath = fileFinder.findFile(directory, fileName);

        // Assert
        assertNull(filePath);
    }

    @Test
    void findFile_nullFileName_returnsNull() {
        // Arrange
        String directory = "path/to/directory";
        String fileName = null;
        FileFinder fileFinder = new FileFinder();

        // Act
        String filePath = fileFinder.findFile(directory, fileName);

        // Assert
        assertNull(filePath);
    }
}
```

**Import Statements:**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```

**FileFinder Class:**

```java
public class FileFinder {

    public String findFile(String directory, String fileName) {
        // Implement file finding logic here
        // This is a placeholder, you need to replace this with your actual implementation
        if (directory == null || fileName == null || directory.isEmpty()) {
            return null;
        }
        // Replace the following with your actual logic to find the file
        return directory + "/" + fileName;
    }
}
```

**Explanation:**

1. **Import Statements:** Import necessary JUnit annotations and assertion methods.
2. **FileFinderTest Class:** Contains JUnit test cases for the `FileFinder` class.
3. **Test Methods:**
    * `findFile_existingFile_returnsFilePath()`: Tests that the `findFile()` method returns the correct file path when the file exists.
    * `findFile_nonExistingFile_returnsNull()`: Tests that the `findFile()` method returns `null` when the file does not exist.
    * `findFile_emptyDirectory_returnsNull()`: Tests that the `findFile()` method returns `null` when the directory is empty.
    * `findFile_nullDirectory_returnsNull()`: Tests that the `findFile()` method returns `null` when the directory is `null`.
    * `findFile_nullFileName_returnsNull()`: Tests that the `findFile()` method returns `null` when the file name is `null`.
4. **Assertions:** Use `assertEquals()` and `assertNull()` to verify the expected outcomes of the test cases.

**Remember to replace the placeholder logic in the `FileFinder` class with your actual implementation for finding files.**
