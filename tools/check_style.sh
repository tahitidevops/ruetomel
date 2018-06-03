#!/usr/bin/env bash

mvn clean checkstyle:checkstyle

if grep -q "<error" target/checkstyle-result.xml; then
    echo "Le code n'est pas stylistiquement conforme"
    exit 1
else
    exit 0
fi
