#!/bin/bash
cd /cmtbin/GenerateOpendata/
/cmtbin/JAVA/jdk1.8.0_172/bin/java -Dfile.encoding=UTF-8 -jar newOpendataService.jar $1 $2
