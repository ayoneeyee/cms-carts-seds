## Tests Case Section

**Description**: This folder contains all of tests cases, suites, and unit-tests 

---
## Folder Structure
    .tests
        - README.md (You are here)
    |- examples
        - demo-test.js
    |- page_objects
        |- carts  
        - README.md 
    |- suites
        - README.md 
    |- unit 
        - README.md 

     
## Best Practices for writing automated tests:

1.  Stay within your test scope! In other words, do not "test" your test (or duplicate another test).

    A good test assumes that everything worked up until the test begins...and everything works
    after it ends. It only cares about what *it* is testing. For end-to-end and acceptance-based testing, 
    treat every step like a "mini-test" (aka 'module'). This will pay off when introducing new features; 
    as these modules become a library of pre-tested tools to re-use.
 
2. Keep tests DRY (aka Don't Repeat Yourself). 
    This means that your tests should avoid repetition. Re-use variables and (use function calls) if you find that a 
    test need something that was written previously. Strive to create a single source of truth. This way, if a problem 
    occurs, it is easier to spot.
    
3. Use the principle [Arrange, Act, Assert](http://wiki.c2.com/?ArrangeActAssert)!

    This principle will help organize your tests, so that they are less error-prone and promotes quick identification 
    of a defect.
   
    **A**rrange -- declare everything your tests will need (URLs, test data, selectors, etc.) at the beginning
    of a test. Or, it can be in a page objects file. Make sure your declarations are within the testing scope (see #1). 
    For example: 
            - Global variables used for all tests/suites.
            - Section/Suite variables used in multiple, but not all, tests. (Page Object Model uses this)
            - Instance/Test variables are used only within a single test.
    
    **A**ct -- Keep it simple (but not **too** simple). Note: An action is not, by itself, Acceptance Criteria. 
    Each test (or step) should have at **minimum** three(3) actions, but no more than five (5). 
    For example, if you are testing a Login Page, and you want to enter the username, there is a minimum of 
    three (3) actions:
  
            - Identify the target web element (ex. find the web element)
            - Perform the action (type "Username")
            - Wait for it to complete (all the key strokes entered)
            
    A good rule of thumb is to add a small pause after an action, if needed. 10-100 ms is plenty of time for 
    key stokes; form submission, logins, new page navigation, and searches may be longer (use your best judgment).
  
    **A**ssert -- Once the AUT (Application Under Test) completes the action, **ALWAYS** check an action 
    completed (`expect`), and then `assert` the action performed as expected (pass/fail). Resist the urge to
    make assumptions about application behavior, especially when dealing with dynamic content.
    
3. Triage testing concerns: Leave the edge cases/checks to the "edge" of your testing. 
    
    Do not try to cover every possibility, scenario, or action all in one test. To triage means to focus on the most 
    critical elements of a test/suite first, as a baseline. Then, create additional tests/suites, covering the less 
    frequent issues. An example of triage(in order of priority):
    
    - Critical (or Happy) path -- covers the requirements/user story, verifying it meets the acceptance criteria. 
        Answers the following questions: 
        1. Does the feature perform, as intended/stated in the story/requirements?
        2. Does the feature perform correctly, independent of how the user arrived at the feature?
    
    - Validation (or Negative) path -- covers deviations from the ideal path.
        Answers the following questions:
        1. Does the application inform the user of the required (or accepted) values?
        2. Does the application catch incorrect or missing values, as stated by question #1?
        3. Does the application inform the user when it receives an incorrect or missing value?
        4. Does the application provide the user with instructions (or suggestions) to recover?
        
    - Edge (or specific) Cases -- covers the less frequent situations that can occur, often from some unexpected event.
    This may be the result of a bug, defect, or story correction.
    
    This may seem counter-intuitive, but it makes testing more efficient, and the application *more* robust, 
    in the long run. 
    
    Regression tests *must* cover the critical paths before release. Validation paths (not covered explicitly in
    the acceptance criteria) may not necessarily be in regression at the time of release, but it should (or plan to) 
    make it into regression, in the near future. Edge Cases should only be included in regression if there is no tag or 
    explicit group covering tests for a particular sprint. These tests should be addressed in the sprint it was first 
    identified/corrected. Frequent occurrence of edge cases should be "promoted" to validation.