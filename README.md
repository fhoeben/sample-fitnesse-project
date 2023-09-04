This testing project uses the FitNesse baseline provided by [hsac-fitnesse-fixtures](https://github.com/fhoeben/hsac-fitnesse-fixtures).
It offers a web environment (wiki) to define and run tests. It is extended with [Praegus' Toolchain plugin](https://gitlab.com/praegus/toolchain-fixtures/toolchain-fitnesse-plugin), improving the vanilla wiki.

## Baseline Features
The hsac-fitnesse-fixtures aim to assist in testing (SOAP) web services and web applications (using Selenium) minimizing the amount of (custom) Java code needed to define tests.

The baseline FitNesse installation offers the following features:

* Ability to easily create a standalone (no JDK or Maven required) FitNesse environment.
* Run FitNesse tests on a build server, reporting the results in both JUnit XML format and HTML.
* FitNesse installation for test/fixture developers containing:
    - the fixture base classes (and Selenium drivers for _Chrome_, _Internet Explorer_, _Edge_ and _Firefox_),
    - HSAC's fitnesse-plugin to add additional Wiki features (random values, calculating relative dates,
      Slim scenarios without need to specify all parameters, Slim scripts that take a screenshot after each step),
    - easy fixture debugging,
    - Praegus' toolchain-plugin, improving the wiki's look and feel and page editing features, combining:
      - [Bootstrap-plus wiki theme](https://github.com/tcnh/fitnesse-bootstrap-plus-theme)
      - [Autocomplete responder](https://gitlab.com/praegus/toolchain-fixtures/fitnesse-autocomplete-responder)

More details can be found on its [GitHub Wiki](https://github.com/fhoeben/hsac-fitnesse-fixtures/wiki), or [in the local
wiki installation](http://localhost:9090/HsacExamples) (see instructions below on how to start in).

## Running Locally
To start the wiki locally execute: `mvn clean compile dependency:copy-dependencies exec:exec`, it can then be accessed at [http://localhost:9090/](http://localhost:9090/).

More details on the features of hsac-fitnesse-fixtures, and example tests, can then be accessed at 
[http://localhost:9090/HsacExamples](http://localhost:9090/HsacExamples).

An empty ('template' or 'boilerplate') test suite, to give you a flying start creating your own test suite, can be found at 
[http://localhost:9090/MyTestSuite](http://localhost:9090/MyTestSuite). All basic setup has been taken care of, 
so you can start defining your own tests in this suite immediately. 

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

## Setting Up a Development Environment

A description on how to set up a development environment to work based on this project can be found in the
[hsac-fitnesse-fixtures' wiki](https://github.com/fhoeben/hsac-fitnesse-fixtures/wiki/Installation-guide).
