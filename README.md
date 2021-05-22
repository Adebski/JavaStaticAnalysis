# Overview
This repository contains code for a blog post on static analysis tools for the Java language you can find [on my blog
](https://blog.adebski.com/posts/incomplete-list-of-static-analysis-tools-for-java/).

# Compiling and running static analysis
Run `mvn validate` to compile the code and execute all the static analysis tools configured in the project.
Checkstyle, PMD, SpotBugs are configured as Maven plugins. Error Prone checks are exeucted 
during the compilation itself since that tool is implemented as a `javac` plugin.