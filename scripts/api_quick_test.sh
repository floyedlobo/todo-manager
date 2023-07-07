#!/bin/bash

curl -X POST -H "Content-Type: application/json" http://localhost:8080/v1/task -d '{"title":"this is a task1"}'
curl -X POST -H "Content-Type: application/json" http://localhost:8080/v1/task -d '{"title":"this is a task2"}'

curl http://localhost:8080/v1/tasks
