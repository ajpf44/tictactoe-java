#!/bin/sh
mvn package
java -jar target/tictactoe-0.0.1-SNAPSHOT.jar
