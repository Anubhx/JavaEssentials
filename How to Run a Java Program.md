# How to Run Java Program ?

## Launching Single-File Source-Code Programs

In JDK 11, Java introduced the ability to launch a single-file source-code program with the `java` launcher, without first needing to explicitly compile the source code. This works by the `java` launcher automatically invoking the compiler and storing the compiled code in-memory. This can be a great way to learn how to use Java or explore new features within the Java API, without having to go through the cruft of compiling and then executing code. There are several ways to use this feature, as well as some limitations and things to keep in mind.

### Executing Your First Single-File Source-Code Program

To execute a single-file source-code program, the first class defined in the source file must contain `public static void main(String[])` like in `HelloWorld` below:

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
```

From the command line, `HelloWorld` can be launched with (assuming the name of the file is also `HelloWorld.java`):

```bash
$ java HelloWorld.java
```

### Passing in Arguments

Arguments can also be passed in like with a normally compiled class. For example:

```java
public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }

}
```

Passing in an argument can be done like this:

```bash
$ java HelloJava.java World!
```

### Multiple Classes in Same File

Multiple classes can be defined within the same source file if needed for encapsulation purposes, like in this example:

```java
public class MultipleClassesInSameFile {
    public static void main(String[] args) {
 
        System.out.println(GenerateMessage.generateMessage());
        System.out.println(AnotherMessage.generateAnotherMessage());
    }
}
 
class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}
 
class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}
```

When executed:

```bash
$ java MultipleClassesInSameFile.java
```

Will output:

```
Here is one message
Here is another message
```

### Reference JDK Classes and Non-JDK Classes

A class that is part of the core JDK does not need to be added to the classpath to be executed. So an example referencing the `Scanner` and `MatchResult` classes can be executed simply with the `java` launcher.

To launch:

```bash
$ java ScannerExample.java
```

However, referencing non-JDK classes, like `RandomUtils` from Apache Commons Lang, will need to have the corresponding JAR file added to the classpath at launch:

```java
import org.apache.commons.lang3.RandomUtils;

public class ReferenceNonJDKClass {

    public static void main(String[] args) {
        System.out.println(RandomUtils.nextInt());
    }

}
```

To launch:

```bash
java -cp /path/to/commons-lang3-3.12.0.jar ReferenceNonJDKClass.java
```

### Executing as a Shebang File

On a Unix-like operating system, a single-file source-code application can also be launched as a shebang file like a script. Within the Java source file, as the first line in the file, add `#!/path/to/your/bin/java --source <version>`.

```java
#!/path/to/your/bin/java --source 16
 
public class HelloJava {
 
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}
```

The file cannot have `.java` as its file extension, and must also be executable (`chmod +x`). With that, it can be launched with:

```bash
./HelloJava
```