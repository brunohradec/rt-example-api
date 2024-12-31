# rt-example-api

An example API for `rt-example` frontend

## How to run?

Start the docker container with the postgres database using:
```bash
docker compose up
```

Start the Spring application form the IDE or using:
```bash
./gradlew :bootRun
```

## API

This example exposes 2 endpoints that a `GET` request can be sent to:
- http://localhost:8080/api/employees?page=0&size=5
- http://localhost:8080/api/jobs?type={type}&page=0&size=5
