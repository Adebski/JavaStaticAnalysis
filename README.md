# Overview
This repository contains code for a blog post on static analysis tools for the Java language.

# Compiling and running static analysis
Run `mvn validate` to compile the code and execute all the static analysis tools configured in the project.
Checkstyle, PMD, SpotBugs are configured as Maven plugins. Error Prone checks are exeucted 
during the compilation itself since that tool is implemented as a `javac` plugin.