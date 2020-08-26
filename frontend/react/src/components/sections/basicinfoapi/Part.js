import React from "react";
import { connect } from "react-redux";
import { extractJsonPathExpressionFromQuestionLike, selectFragmentById, winnowProperties } from "../../../store/formData";
import QuestionLike from "./QuestionLike";

const Part = ({ fragment, partId }) => {
  const title = fragment.title ? <h2>{fragment.title}</h2> : <span></span>;
  const text = fragment.text ? <p>{fragment.text}</p> : <span></span>;
  return fragment? (
    <div id={fragment.id}>
    {title}
    {text}

    {fragment.questions.map((questionLike, index) => {
      // Some children might be fieldsets, and most fieldsets don't have ids, so we have to build a jsonpath expression instead:
      const jpexpr = extractJsonPathExpressionFromQuestionLike(questionLike.id, partId, index);
      const key = `questionLike-${index}`;

      return (
        <QuestionLike key={key} fragmentkey={key} jpexpr={jpexpr}/>
      )
  
      })}
        
    </div>

  ) : null;
}


const mapStateToProps = (state, ownProps) => ({
  fragment: winnowProperties(selectFragmentById(state, ownProps.partId)),
  partId: ownProps.partId,
  abbr: state.stateUser.currentUser.state.id,
  year: state.global.formYear,
  programType: state.stateUser.programType,
  programName: state.stateUser.programName,
});

export default connect(mapStateToProps)(Part);
