#!/bin/bash

case "$1" in
  compile)
    javac *.java
    ;;
  *)
    java ds "$@"
    ;;
esac