import React, { Component, Fragment } from "react";
import { connect } from "react-redux";
import { TextField } from "@cmsgov/design-system-core";
import {
  Accordion,
  AccordionItem,
  AccordionButton,
  AccordionPanel,
} from "@reach/accordion";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faPlus } from "@fortawesome/free-solid-svg-icons";
import "@reach/accordion/styles.css";
import { addNewGoal } from "../ObjectiveAndGoals";
import QuestionComponent from "../../../fields/QuestionComponent";
import { addElementToFragment } from "../../../../actions/initial";

class Objective2bApi extends Component {
  constructor(props) {
    super(props);
    this.newGoal = this.newGoal.bind(this);
  }

  newGoal() {
    let newGoalId = this.props.goalCount + 1;
    const objectiveNumber = this.props.objectiveId.split("-")[5];
    //Adds a repeatable object (contains all 12 goal questions) to the repeatables object
    this.props.addElement(
      `2020-02-b-01-01-${objectiveNumber}-02`,
      addNewGoal(newGoalId, objectiveNumber)
    );
  }

  render() {
    return (
      <Fragment>
        <div className="objective-body">
          <div className="goals">
            {
              <>
                <Accordion multiple defaultIndex={0}>
                  {this.props.goalsArray.map((goals) => (
                    <AccordionItem key={goals.id}>
                      <div className="accordion-header">
                        <h3>
                          <AccordionButton>
                            <div className="accordion-title">
                              Goal{" "}
                              {parseInt(
                                goals.id.substring(goals.id.length - 2)
                              )}
                              :
                            </div>
                          </AccordionButton>
                        </h3>
                      </div>
                      <AccordionPanel>
                        <QuestionComponent data={goals.questions} />
                      </AccordionPanel>
                    </AccordionItem>
                  ))}
                </Accordion>
              </>
            }
          </div>
        </div>

        <div className="objective-footer">
          <h3 className="question-inner-header">
            Do you have another goal in your State Plan for this objective?
          </h3>
          <div className="ds-c-field__hint">Optional</div>
          <button
            onClick={this.newGoal}
            type="button"
            className="add-goal ds-c-button ds-c-button--primary"
          >
            Add another goal
            <FontAwesomeIcon icon={faPlus} />
          </button>
        </div>
      </Fragment>
    );
  }
}

const mapStateToProps = (state) => ({
  year: state.global.formYear,
});

const mapDispatchToProps = {
  addElement: addElementToFragment,
};

export default connect(mapStateToProps, mapDispatchToProps)(Objective2bApi);
