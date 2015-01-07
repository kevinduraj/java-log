#!/bin/bash
#-----------------------------------------------------#
mvn clean install
cd target
CLASSPATH=logger.jar:../lib/log4j-1.2.17.jar
java -cp $CLASSPATH kduraj.MyLogger
#-----------------------------------------------------#

