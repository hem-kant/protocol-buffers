#The Following protoc utility helps us generate code automatacilly in any language we want

protoc  -I=proto --python_out=python proto/simple.proto 
protoc  -I=proto --java_out=java proto/simple.proto 