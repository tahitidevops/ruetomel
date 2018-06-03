#!/usr/bin/env bash

if grep -q "SNAPSHOT" pom.xml; then
    echo "Il reste des SNAPSHOTS dans le pom.xml";
    exit 1;
else
    exit 0;
fi