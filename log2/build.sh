#!/bin/bash
#-------------------------------------------------------------------#
clear; time mvn clean compile assembly:single
#java -jar target/log1-1.0.0-jar-with-dependencies.jar -Dlog=/Users/kduraj/github/java-log/log1
#java -Dlog=/Users/kduraj/  -jar target/log1-1.0.0-jar-with-dependencies.jar
java -jar target/log1-1.0.0-jar-with-dependencies.jar 
#-------------------------------------------------------------------#
