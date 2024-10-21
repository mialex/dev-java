package org.example.o7_Exception;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.List;
import java.util.ArrayList;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public void readList() {
        try {
            for (int i = 0; i < SIZE; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                // it is unchecked exception as IndexOutOfBoundsException extends RuntimeException
                // in this case it's better to catch it
                System.out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public void writeListWithResource() throws IOException {
        // The FileWriter constructor throws IOException, which must be caught.
        try (PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"))) {
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        }
    }

    public void multiTryWithResource(String zipFileName, String outputFileName) throws IOException {
        Charset charset = StandardCharsets.US_ASCII;
        Path outputFilePath = Paths.get(outputFileName);

        try (
            ZipFile zf = new ZipFile(zipFileName);
            BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset)
        ) {
            // Enumerate each entry
            for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {
                // Get the entry name and write it to the output file
                String newLine = System.getProperty("line.separator");
                String zipEntryName = ((java.util.zip.ZipEntry)entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void throwUncheckedException() {
        Object obj;

        for (int i = 0; i < 20; i++) {
            if (i >= 0 && i < list.size()) {
                // It's not a checked exception, so we don't need to change method definition
                throw new EmptyStackException();
            }

            list.get(i);
        }
    }


}
