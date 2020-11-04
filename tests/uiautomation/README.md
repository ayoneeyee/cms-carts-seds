# TestNG Based Test Automation Framework
Lightweight UI test automation framework that utilizes TestNG testing framework.  It removes the needs of writing low-level 
browser automation code by abstracting selenium codes and generates detailed test execution reports.  It also supports
command based cross browser testing capabilities enabled by maven system properties.  

### Framework Project Structure Diagram
```
|-reports                         #  all the generated test execution reports are here 
|-pom.xml                         #  project object model file for the maven software
|-testconfig.xml                      #  TestNG configuration files for the test structures and groupings 
|-src
   |---test
         |----java                #  all the java source files needs to stored in this folder 
                |-[+]testcase     #  java class package, all test class will be stored here 
                |-[+]utility      #  java class package, all the utility class will be stored here 
                |-[+]pageobjects  #  java class package, all the commons class wil be stored here 
        
|-.gitignore                     #  git ignore config file 
|-README.md                      #  you are currently viewing this file 
```

## Pre-requisites
* Download and install Chrome or Firefox browser  ( viewing report, test execution )
* Download and install JDK v1.8 + 
* Download and install Apache Maven v3.0+
* Download and install Git v2.0+ 

## Set-up Instructions 
You need to have following test execution set up 
![screenshot](/tests/uiautomation/images/test_execution_setup.png)

## How to write Test Cases 

## How to run Tests 
All the test triggering is done through maven commands, this framework supports multiple different types of 
test executions such as smoke, regression, and end-to-end on different possible environment such as QA, Staging, and 
UAT. 

#### Executing specific tests 
If you would like to execute a specific test that are stated on testconfig.xml file
```shell script
mvn test -Dtestof="smoke"
```

If you would like to execute all of the tests that are stated on testconfig.xml file 
```shell script
mvn test 
```

If you would like to execute multiple different types of test stated on testconfig.xml file 
```shell script
mvn test -Dtestof="test1", "test2", "test3"
```

If you would like to execute a specific test on specific environment ( default=UAT ) 
```shell script
mvn test -Dtestof="test1" -Denv="Staging"
```

## How to get Report 
All the test execution reports are avaialbe as HTML report on following folder after test execution 
```
 report
   |--[HTML] reports
```
