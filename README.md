# newton

[![Build Status](https://travis-ci.org/Null0rg/newton.svg?branch=master)](https://travis-ci.org/Null0rg/newton)

This project is for teaching purposes only. It features an immature Java-based implementation of the well known [Newton Method](https://en.wikipedia.org/wiki/Newton%27s_method) and demonstrates how to write unit test it.

## How To Build and Test

### Requirements

- JDK >=8
- Internet connections (other dependencies will be downloaded automatically)

### IDE

Open the `newton` [Gradle](http://www.gradle.org/) project in your favourite IDE (tested with IntelliJ 2018) and build it
by calling the `assemble` or `test` tasks.

### Command Line

Navigate to the [Gradle](http://www.gradle.org/) project (e.g., `path/to/newton`) and enter the following command

#### Bash (Linux/OS X/Cygwin/other Unix-like shell)

For building:

    bash gradlew assemble
    
For testing:
    
    bash gradlew test    
    
#### Windows (CMD)

For building:

    gradlew assemble
    
For testing:
    
    gradlew test   
    
