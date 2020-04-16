# Junit5
## What is JUnit 5?

Unlike previous versions of JUnit, JUnit 5 is composed of several different modules from three different sub-projects.


JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

The JUnit Platform serves as a foundation for launching testing frameworks on the JVM. It also defines the TestEngine API for 

developing a testing framework that runs on the platform. Furthermore, the platform provides a Console Launcher to launch the 
platform from the command line and a JUnit 4 based Runner for running any TestEngine on the platform in a JUnit 4 based 
environment. First-class support for the JUnit Platform also exists in popular IDEs (see IntelliJ IDEA, Eclipse, NetBeans, and 
Visual Studio Code) and build tools (see Gradle, Maven, and Ant).

JUnit Jupiter is the combination of the new programming model and extension model for writing tests and extensions in JUnit 5. The 
Jupiter sub-project provides a TestEngine for running Jupiter based tests on the platform.

JUnit Vintage provides a TestEngine for running JUnit 3 and JUnit 4 based tests on the platform.

![extensions_DatabaseTestsDemo](https://user-images.githubusercontent.com/26750131/79479277-889fe600-7fda-11ea-97c4-ea8b7d5d77aa.png)
https://junit.org/junit5/docs/current/user-guide/
