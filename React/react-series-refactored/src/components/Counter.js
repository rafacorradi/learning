import React from 'react';

export default class extends React.Component {
    constructor() {
        super();
        this.state = {
            counter: 0,
        };
    }

    decrementCounter () {
        this.setState({
            counter: this.state.counter - 1,
        })
    }

    increaseCounter () {
        this.setState({
            counter: this.state.counter + 1,
        })
    }

    render() {
        return (
            <div>
                <h1>{this.state.counter}</h1>
                <div>
                    <button onClick={this.decrementCounter.bind(this)}>-</button>
                    <button onClick={this.increaseCounter.bind(this)}>+</button>
                </div>
            </div>
        )
    }
}