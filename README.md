# Onboarding Process Application

Simple application based on Getting Started from https://github.com/NovatecConsulting/micronaut-camunda-bpm

Start the example:
`./gradlew clean run`

A simple process is deployed automatically.

The Camunda Cockpit is available at `http://localhost:8080/`. Login with `admin`/`admin`.

The Camunda REST API is available at the context path `/engine-rest`, e.g. `GET http://localhost:8080/engine-rest/engine`.

`POST http://localhost:8080/cancel/1234` can be called to cancel an Onboarding instance by the business key "1234". Further calls will fail (unless a new process instance is created manually via the Tasklist with the menu item "Start process").

