#!/bin/bash
#-----------------------------------------------------#
mvn clean install
cd target
CLASSPATH=logger.jar:~/.m2/repository/log4j/log4j/1.2.17/*
java -cp $CLASSPATH kduraj.MyLogger
#-----------------------------------------------------#

