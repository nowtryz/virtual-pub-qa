Virtual Pub
===========

Given a simple codebase, this project aims to catch as much programming mistakes as possible. To do so, this project uses Gradle with the following plugins:
 - JaCoCo
 - JUnit5
 - SonarLint

See reports
-----------

To get all the reports, you simply need to run the following command:
```shell
./gradlew test check   # unix based operated systems
gradlew.bat test check # windows
```

Reports are then available under the `build/reports` folder.