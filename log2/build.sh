#!/bin/bash
#-----------------------------------------------------#
mvn clean install
cd target
java -cp logger.jar kduraj.MyLog1 
#-----------------------------------------------------#

