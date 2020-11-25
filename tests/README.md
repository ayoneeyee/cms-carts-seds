# Nightwatch Automated Testing framework

Automated Testing Framework using Nightwatch.js
## Table of Contents

1. Overview
1. Installation
1. Running Tests
    1. Automated Test Writing Guides
    1. Nightwatch Test Writing Guides
1. Other Notes
 
---
### Overview

NightwatchJS is an end-to-end (e2e) automated test framework, written 100% in JavaScript/ECMAScript, designed 
to provide a singe source location for testing, from unit tests to full regression workflows.

### Installation

Pre-requisite: 

- Node.js 12.x or higher

From the root directory folder (this folder), use node package manager `npm`:

`npm install`
   
### Running Tests (Commands)

To run tests(Must have all browsers if running locally):

`npm test` or `npm run test`: Runs tests using Chrome (default)
`npm run test-firefox` : Runs tests using Firefox
`npm run test-cross-browser`: Run in all browsers in parallel (Chrome & Firefox at this time)

Coming soon:
`npm run test-unit`: Run unit tests *In development*
`npm run test-integration` : Run unit integration tests
`npm run test-bugfix`: Runs tests related to a bug fix (by Sprint)

To update: 
    `npm up`

see [Running Tests in Nightwatch](https://nightwatchjs.org/guide/running-tests/nightwatch-runner.html)

A test_runner script will be updated and provided soon.

### Automated Test Writing Guides

[Best Practices for writing automated tests](tests/README.md)

### Nightwatch Test Writing Guides

### Other Notes/Bugs

- 13 November 2020: Bug Impact (Low) There is a (possible) bug in chromedriver, when running tests headless(without a browser).
Description: When attempting to perform an action on a clickable element, chromedriver reports an error, 
falsely identifying the element as a non-clickable element`[size of the element is zero]`. Until this is resolved,
avoid running headless tests in chromedriver. 
