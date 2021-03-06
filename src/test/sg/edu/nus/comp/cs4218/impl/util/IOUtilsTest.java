package sg.edu.nus.comp.cs4218.impl.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.ShellException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static sg.edu.nus.comp.cs4218.impl.util.IOUtils.*;
import static sg.edu.nus.comp.cs4218.impl.util.StringUtils.CHAR_FILE_SEP;

class IOUtilsTest {

    private final static String TEST_TXT = "test.txt";
    private final static String NULL_TXT = "null/null.txt";
    private final static String NONE_TXT = "null/none.txt";

    private String originCurrentDirectory;

    @BeforeEach
    void setUp() {
        try {
            originCurrentDirectory = Environment.currentDirectory;
            FileSystemUtils.createFile(TEST_TXT);
            try (OutputStream fileOutputStream = openOutputStream(TEST_TXT);
                 Writer writer = new OutputStreamWriter(fileOutputStream)) {
                writer.write("hello\nworld");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    void openInputStreamFromExistFile() {
        assertDoesNotThrow(() -> {
            openInputStream(TEST_TXT);
        });
    }

    @Test
    void openInputStreamFromNotExistFile() {
        assertThrows(ShellException.class, () -> {
            openInputStream(NULL_TXT);
        });
    }

    @Test
    void openOutputStreamFromExistFile() {
        assertDoesNotThrow(() -> {
            openOutputStream(TEST_TXT);
        });
    }

    @Test
    void openOutputStreamFromNotExistFile() {
        assertThrows(ShellException.class, () -> {
            openOutputStream(NONE_TXT);
        });
    }

    @Test
    void closeSystemIn() {
        assertDoesNotThrow(() -> {
            closeInputStream(System.in);
            return System.in.available();
        });
    }

    @Test
    void closeSystemOut() {
        assertDoesNotThrow(() -> {
            closeOutputStream(System.out);
            System.out.print("");
        });
    }

    @Test
    void closeNullIn() {
        assertDoesNotThrow(() -> {
            closeInputStream(null);
        });
    }

    @Test
    void closeNullOut() {
        assertDoesNotThrow(() -> {
            closeOutputStream(null);
        });
    }

    @Test
    void closeNormalInputStream() {
        assertDoesNotThrow(() -> {
            closeInputStream(openInputStream(TEST_TXT));
        });
    }

    @Test
    void closeNormalOutputStream() {
        assertDoesNotThrow(() -> {
            closeOutputStream(openOutputStream(TEST_TXT));
        });
    }

    @Test
    void closeUnClosableInputStream() {
        assertThrows(ShellException.class, () -> {
            closeInputStream(new UnClosableInputStream(TEST_TXT));
        });
    }

    @Test
    void closeUnClosableOutputStream() {
        assertThrows(ShellException.class, () -> {
            closeOutputStream(new UnClosableOutputStream(TEST_TXT));
        });
    }

    @Test
    @Disabled
    void getLinesFromTestFile() {
        List<String> result = new ArrayList<>(Arrays.asList("hello", "world"));
        assertDoesNotThrow(() -> {
            assertIterableEquals(result, getLinesFromInputStream(openInputStream(TEST_TXT)));
        });
    }

    @Test
    void getLinesFromNull() {
        assertDoesNotThrow(() -> {
            assertNull(getLinesFromInputStream(null));
        });
    }

    @Test
    void getFileType() {
        assertTrue(isBinaryFile(new File("hackFiles/diffTest/image1.png")));
    }

    @Test
    void compareTwoBinFile() {
        File file1 = new File("hackFiles/diffTest/image1.png");
        File file2 = new File("hackFiles/diffTest/image2.png");
        File file3 = new File("hackFiles/diffTest/image3.png");
        assertFalse(isTwoBinaryFileEquals(file1, file2));
        assertTrue(isTwoBinaryFileEquals(file3, file2));
    }

    @AfterEach
    void tearDown() {
        Environment.currentDirectory = originCurrentDirectory;
        try {
            FileSystemUtils.deleteFileRecursive(new File("asset" + CHAR_FILE_SEP + TEST_TXT));
            FileSystemUtils.deleteFileRecursive(new File(TEST_TXT));
            FileSystemUtils.deleteFileRecursive(new File(NULL_TXT));
            FileSystemUtils.deleteFileRecursive(new File(NONE_TXT));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class UnClosableInputStream extends FileInputStream {

        public UnClosableInputStream(String name) throws FileNotFoundException {
            super(name);
        }

        @Override
        public void close() throws IOException {
            throw new IOException("Not closable");
        }
    }

    static class UnClosableOutputStream extends FileOutputStream {

        public UnClosableOutputStream(String name) throws FileNotFoundException {
            super(name);
        }

        @Override
        public void close() throws IOException {
            super.close();
            throw new IOException("Not closable");
        }
    }

}
