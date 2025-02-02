# Main Class Generator

Main Class Generator is a utility tool to create a Java project with a predefined structure. This tool helps you quickly set up a new Java project with a main class and necessary configurations.

## Features

- Generate a new Java project with a main class.
- Predefined project structure.
- Easy to use.

## Usage

To generate a new Java project, run the following command:

```java

import com.mainclassgenerator.cryxie.Generator;

 new Generator().generate("com.example.myproject", directory -> {
            System.out.println("Directory structure created at: " + directory.getAbsolutePath());
        });
```

This will create a new Java project with the package `com.example.myproject` and a main class named `Main`.

## Project Structure

The generated project will have the following structure:

```
myproject/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── myproject/
│                       └── Main.java

```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request on GitHub.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, please contact [eliezerBrasilian](https://github.com/eliezerBrasilian).
