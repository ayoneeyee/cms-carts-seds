## Creating quality unit tests
Overview: 

Tests can (and do) catch bugs, but it is a misnomer to imply it is a "bug catching/prevention" method/tool. 
Tests find _**defects**_...a subtle, yet important distinction. 

A defect is *any* deviation from the stated acceptance criteria. A test failure/error *could* be a bug; 
it could also be a design flaw, business logic error, user story/acceptance criteria failure, etc.

The presence (or lack) of bugs does not necessarily speak to application quality. Quality testing does, 
however, inform everyone on the problem areas, wherever they may reside, focus and drive development, determine priorities
, and more.

### Unit Testing Objectives 

The objectives for unit tests (using TDD approach) are: 

- To provide strict assurance that a feature functions correctly
- The feature performs in isolation; i.e. without any dependencies on other application components.
- To minimize bugs, as well as, prevent introduction of bugs into the code.
- To catch business logic and/or design flaws early in the Software Development Life Cycle (SLDC)

### Test Driven Development (TDD) Approach

The TDD method seeks to meet the unit testing objectives through the following steps:

1. Writing unit test **before** development begins; i.e. after the user story/task has been accepted into the sprint, but 
before the actual development on the feature begins.

1. Writing tests that provide **full** test coverage of the given feature. (See [Test Coverage](#Test Coverage))

1. Writing tests that do not exceed the scope of the feature, at the time of development. 
(i.e. Modifications/Amendments to a story should be written as a separate story)
 
#### Test Coverage

To achieve full test coverage for a feature, the following questions must be answered:

- Does the feature perform the actions, or produce the result, as stated in the acceptance criteria?
- Does the feature perform the actions, or produce the result, NOT stated in the acceptance criteria (aka "side effects")?
- Does the feature provide error handling? Error handling meaning: 
  - Does the feature inform the user when condition(s) has NOT been met? (i.e. "ID Number must be in YYYY-####-XX format")
  - Does the feature provide a way to recover from a failed condition? (i.e. Does it allow the user to try again or save progress?)
  - Does the feature, if it cannot recover, inform the user on what to do? 
  (i.e. "Try again" "Submission failed: Progress saved" "Account locked: See your administrator")
  Note: "Stack traces are NOT a valid form of error handling. It is considered a defect; and potentially a 'code smell'"

### Assign, Act, Assert!
