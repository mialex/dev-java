# Basics

##### Where JAVA stays
```shell
$ which java
```
> /usr/bin/java

##### What is the version of JAVA
```shell
$ java -version
```
> openjdk version "21.0.1" 2023-10-17  
> OpenJDK Runtime Environment (build 21.0.1+12-29)  
> OpenJDK 64-Bit Server VM (build 21.0.1+12-29, mixed mode, sharing)

### Run single JAVA file

##### Compile a single class
```shell
$ javac MyFirstClass.java
```
> MyFirstClass.class file is created

##### Run a compiled class
```shell
$ java MyFirstClass
```
##### Run without extra compilation step
```shell
$ java MyFirstClass.java
```
##### Passing in Arguments
```java
public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}
```
```shell
$ java TestClass.java World!
```
> Hello World!

##### Multiple classes in the same file
```java
public class MultipleClassesInSameFile {
    public static void main(String[] args) {
 
        System.out.println(GenerateMessage.generateMessage());
    }
}
 
class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}
```
#### Reference JDK Classes and Non-JDK Classes
A class that is part of the core JDK does not need to be added to the classpath to be executed.
```java
import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {

    public static void main(String... args) {
        String wordsAndNumbers = """
                Longing rusted furnace
                daybreak 17 benign
                """;

        try (Scanner scanner = new Scanner(wordsAndNumbers)) {
            scanner.findAll("benign").map(MatchResult::group).forEach(System.out::println);
        }
    }
}
```
```shell
$ java ScannerExample.java
```
referencing RandomUtils, part of the Apache Commons Lang, will need to have the commons-lang.jar added to the classpath at launch
```java
import org.apache.commons.lang3.RandomUtils;

public class ReferenceNonJDKClass {
    public static void main(String[] args) {
        System.out.println(RandomUtils.nextInt());
    }
}
```
```shell
java -cp /path/to/commons-lang3-3.12.0.jar ReferenceNonJDKClass.java
```
##### Executing as a Shebang File
```java
#!/path/to/your/bin/java --source 16
 
public class HelloJava {
 
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}
```
```shell
./HelloJava
```