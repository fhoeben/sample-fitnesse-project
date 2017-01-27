Create your own FitNesse installation/testSuite based on [hsac-fitnesse-fixtures](https://github.com/fhoeben/hsac-fitnesse-fixtures)
using Maven.


To start the wiki `mvn clean compile exec:exec`, and access it at [http://localhost:9090/](http://localhost:9090/)

To upgrade to newer version of the hsac-fitnesse-fixtures project:
* stop FitNesse
* stop all selenium webdrivers that might be running
* upgrade `hsac.fixtures.version` property in `pom.xml`
* run `mvn clean -Pdelete-hsac-fitnesse-fixtures`
* Now start as normal

Upgrade FitNesse version used:
* upgrade `fitnesse.version` property in `pom.xml`
