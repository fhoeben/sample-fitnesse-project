This testing project uses the FitNesse baseline provided by [hsac-fitnesse-fixtures](https://github.com/fhoeben/hsac-fitnesse-fixtures).
It offers a web environment (wiki) to define and run tests. 

## Baseline Features
The hsac-fitnesse-fixtures aim to assist in testing (SOAP) web services and web applications (using Selenium) minimizing the amount of (custom) Java code needed to define tests.

The baseline FitNesse installation offers the following features:

* Ability to easily create a standalone (no JDK or Maven required) FitNesse environment.
* Run FitNesse tests on a build server, reporting the results in both JUnit XML format and HTML.
* FitNesse installation for test/fixture developers containing:
    - the fixture base classes (and Selenium drivers for _Chrome_, _Internet Explorer_, _Edge_ and _PhantomJs_),
    - Maven classpath plugin (such that tests can use all dependencies from `pom.xml`),
    - HSAC's fitnesse-plugin to add additional Wiki features (random values, calculating relative dates,
      Slim scenarios without need to specify all parameters, Slim scripts that take a screenshot after each step),
    - easy fixture debugging,

More details can be found on its [GitHub Wiki](https://github.com/fhoeben/hsac-fitnesse-fixtures/wiki), or [in the local
wiki installation](http://localhost:9090/HsacExamples) (see instructions below on how to start in).

## Running Locally
To start the wiki locally execute: `mvn clean compile exec:exec`, it can then be accessed at [http://localhost:9090/](http://localhost:9090/).

More details on the features of hsac-fitnesse-fixtures, and example tests, can then be accessed at 
[http://localhost:9090/HsacExamples](http://localhost:9090/HsacExamples).

## Upgrading

To upgrade to newer version of the hsac-fitnesse-fixtures project:

* stop FitNesse
* stop all selenium webdrivers that might be running
* upgrade `hsac.fixtures.version` property in `pom.xml`
* run `mvn clean -Pdelete-hsac-fitnesse-fixtures`
* start as normal

Upgrade FitNesse version used:

* stop FitNesse
* upgrade `fitnesse.version` property in `pom.xml`
* start as normal
