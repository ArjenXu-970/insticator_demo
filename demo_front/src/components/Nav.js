import React, { Component } from 'react'; // ES6 js
import QuestionService from '../service/QuestionService';



class Nav extends  Component {
    constructor(props) {
        super(props)

        this.state = {
            value: 'Please enter ID:'
        };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }


        handleChange(event) {
            this.setState({ value: event.target.value });
        }

        handleSubmit(event) {
            alert('id was submitted: ' + this.state.value);
            this.props.history.push(`/api/questions/userid=${this.state.value}`);
            alert('id was submitted1111111: ' + this.state.value);
        }


    render() { 
        return (
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark top">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navMainMenu" aria-controls="navMainMenu" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon">hello</span>
                </button>
                <div id="navMainMenu" class="navbar-collapse collapse">
                    <div class="navbar-nav ml-auto">
                        <form onSubmit={this.handleSubmit}>
                            <label>
                                Name:
                                <input type="text" value={this.state.value} onChange={ this.handleChange} />
                            </label>
                            <input type="submit" value="Submit" />
                        </form>
                    </div>
                </div>
            </nav>
        );
    }
}


export default Nav;