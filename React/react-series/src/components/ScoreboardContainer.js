import React from 'react';

import Team from './Team';
import Match from './Match'

export default class ScoreboardContainer extends React.Component {
    constructor() {
        super();
        this.state = {
            home_goals: 0,
            visitor_goals: 0,
        }
    }

    scoreHomeGoal () {
        this.setState ({
            home_goals: this.state.home_goals +1,
        });
    }

    scoreVisitorGoal () {
        this.setState({
            visitor_goals: this.state.visitor_goals +1,
        });
    }

    render () {
        return (
            <div>
                <div style = {{float: 'left', 'marginRight': '20px'}}>
                    <h3>Casa</h3>
                    <Team name={this.props.home.name} goals={this.state.home_goals} scoreGoal={this.scoreHomeGoal.bind(this)}/>
                </div>
                <div style = {{float: 'left', 'marginRight': '20px'}}>
                    <Match stadium={this.props.match.stadium} date={this.props.match.date} time={this.props.match.time}/>
                </div>
                <div style = {{float: 'left', 'marginRight': '20px'}}>
                    <h3>Visitante</h3>
                    <Team name={this.props.visitor.name} goals={this.state.visitor_goals} scoreGoal={this.scoreVisitorGoal.bind(this)}/>
                </div>
                <div style = {{clear: 'both'}}></div>
            </div>
        )
    }
}