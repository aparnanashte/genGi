```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.List;

public class FileFinderTest {

    @Test
    void testFindFiles_validDirectory_returnsFiles() {
        FileFinder fileFinder = new FileFinder();
        String directory = "path/to/your/directory"; // Replace with your test directory
        String extension = ".txt"; // Replace with your test extension
        List<File> foundFiles = fileFinder.findFiles(directory, extension);

        // Assert that the list is not empty
        assertFalse(foundFiles.isEmpty());

        // Assert that all files in the list have the correct extension
        for (File file : foundFiles) {
            assertEquals(extension, file.getName().substring(file.getName().lastIndexOf(".")));
        }
    }

    @Test
    void testFindFiles_invalidDirectory_returnsEmptyList() {
        FileFinder fileFinder = new FileFinder();
        String directory = "invalid/directory/path"; // Replace with an invalid directory
        String extension = ".txt";
        List<File> foundFiles = fileFinder.findFiles(directory, extension);

        // Assert that the list is empty
        assertTrue(foundFiles.isEmpty());
    }

    @Test
    void testFindFiles_emptyExtension_returnsAllFiles() {
        FileFinder fileFinder = new FileFinder();
        String directory = "path/to/your/directory"; // Replace with your test directory
        String extension = ""; // Empty extension should return all files
        List<File> foundFiles = fileFinder.findFiles(directory, extension);

        // Assert that the list is not empty
        assertFalse(foundFiles.isEmpty());
    }
}
```

**Explanation:**

1. **Import Statements:** The code starts with necessary import statements.
2. **Test Class:**  The `FileFinderTest` class contains the JUnit test methods.
3. **`testFindFiles_validDirectory_returnsFiles()`:** 
   - This test checks if the `findFiles()` method returns a non-empty list when provided with a valid directory and extension.
   - It also asserts that all files in the returned list have the correct extension.
4. **`testFindFiles_invalidDirectory_returnsEmptyList()`:** 
   - This test checks if the `findFiles()` method returns an empty list when provided with an invalid directory.
5. **`testFindFiles_emptyExtension_returnsAllFiles()`:**
   - This test checks if the `findFiles()` method returns all files in the directory when provided with an empty extension.

**Remember to:**

- **Replace placeholders:**
    - `path/to/your/directory`: Replace with the actual path to your test directory.
    - `.txt`: Replace with the extension you want to test.
- **Create `FileFinder` class:**
    - You'll need to implement the `FileFinder` class with the `findFiles()` method. The provided test cases assume the existence of this class.

**Running the tests:**

- You can run these JUnit tests using your IDE or a test runner like Maven or Gradle.
