#!/usr/bin/env bash

protoc -I=simple/ --python_out=simple/ simple.proto
protoc -I=enums/ --python_out=enums/ enum_example.proto
protoc -I=complex/ --python_out=complex/ complex.proto