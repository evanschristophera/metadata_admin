#
Works when started with ```./gradlew run``` and a [this request is run from the browser](http://localhost:8080/conferences/random)

## Broke Stuff
- [ ] broke in docker
    - need to configure in docker-compose for networking

## ToDo
- [ ] Swagger/OpenAPI
- [ ] jdbc statements as resources
    - Facilitates the creation and validation of sql statements

## Dependencies
- postgresdb: Database running in DinD container

## Known Issues
- VSCode gradle fails
    - Mitigation: ./gradlew works just fine.

## Notes
- Initial creation with mn command line:
    ```
    mn create-app --build=gradle_kotlin --jdk=21 --lang=java --test=junit --features=graalvm,postgres,jdbc-hikari com.axient.metadataadmin.metadata-admin
    ```
## Implemented Fixes
- [x] Broke: no database connection configured