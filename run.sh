#/bin/java
# run expects to find a binary directory, which is autocompiled by eclipse
CLASSPATH="${PWD}/bin:${PWD}/lib/mysql-connector-java-5.1.31-bin.jar"
java -classpath ${CLASSPATH} fi.utu.xtrememorning.MainGame
