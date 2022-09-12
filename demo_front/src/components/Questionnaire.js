import React, { Component } from 'react'

class Questionnaire extends Component {
    
    constructor(props) {
        super(props)
        
        this.state = {
            question:[],
            id: this.props.match.params.id,
            select_question: "",
            select_answer:""
        }


        this.nextQuestion = this.nextQuestion.bind(this);
    }

    componentDidMount() {

        // step 4
        if (this.state.id === '_add') {
            return
        } else {
            QuestionService.getQuestionById(this.state.id).then((res) => {
                let question = res.data;
                this.setState({
                    
                });
            });
        }
    }
    
    
    render() {
        return (
            <div className="App">

                    <div className="question-card">

                        
                        <h3 className="question-text">{questions.content}</h3>

                        <ul>
                            {questions[currentQuestion].options.map((option) => {
                                return (
                                    <li
                                        key={option.id}
                                        onClick={() => optionClicked(option.isCorrect)}
                                    >
                                        {option.text}
                                    </li>
                                );
                            })}
                         </ul>

                            <button onClick={ () => this.nextQuestion(question.opt)} className="btn">next</button>
                    </div>
            </div>
        )
    }
}


export default Questionnaire