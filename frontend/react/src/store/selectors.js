import jsonpath from "jsonpath";

export const selectQuestion = (state, id) => {
  const jp = `$..[*].contents.section.subsections[*].parts[*]..questions[?(@.id=='${id}')]`;
  const questions = jsonpath.query(state, jp);
  if (questions.length) {
    return questions[0];
  }

  // const jpFieldset = `$..[*].contents.section.subsections[*].parts[*].questions[?(@.type=='fieldset')].questions[?(@.id=='${id}')]`;
  // const fieldsetQuestions = jsonpath.query(state, jpFieldset);
  // if (fieldsetQuestions.length) {
  //   return fieldsetQuestions[0];
  // }

  return null;
};

// const jp = `$..[*].contents.section.subsections[*].parts[*].questions[*].questions[?(@.id=='${id}')]`;
