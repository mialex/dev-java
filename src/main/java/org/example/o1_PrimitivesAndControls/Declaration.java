package org.example.o1_PrimitivesAndControls;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Declaration {

    public void examplesVar() throws IOException {
        var message = "Hello world!";
        var path = Path.of("src/main/java/org/example/o1_PrimitivesAndControls/debug.log").toAbsolutePath();
        var stream = Files.newInputStream(path);

        // @var List<String> list
        var list = List.of("one", "two", "three", "four");
        // @var String element
        for (var element: list) {
            System.out.println(element);
        }

    }
}
