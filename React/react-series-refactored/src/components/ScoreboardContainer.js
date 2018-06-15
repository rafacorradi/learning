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
        const { match, home, visitor } = this.props;
        const styleSheet = {float: 'left', 'marginRight': '20px'};

        return (
            <div>
                <div style = {styleSheet}>
                    <h3>Casa</h3>
                    <Team {...home} goals={this.state.home_goals} scoreGoal={this.scoreHomeGoal.bind(this)}/>
                </div>
                <div style = {styleSheet}>
                    <Match {...match}/>
                </div>
                <div style = {styleSheet}>
                    <h3>Visitante</h3>
                    <Team {...visitor} goals={this.state.visitor_goals} scoreGoal={this.scoreVisitorGoal.bind(this)}/>
                </div>
                <div style = {{clear: 'both'}}></div>
            </div>
        )
    }
}

// Segundo ponto do refactoring: extract data. Consiste na operação que está sendo feita na linha 28. Pode-se definir uma variável simples (var), ou no caso do ECS6 (let ou const) e em seguida definir dentro de colchetes uma ou mais variáveis com o mesmo nome do índice do objeto passado pelo módulo pai e igualar tudo às propriedades recebidas. Desta forma, defini-se rapidamente os objetos que se deseja utilizar e/ou repassar para outros módulos. Em seguida, é possível aplicar o react spread operator para definir como propriedade um destes objetos extraídos.

// Terceiro ponto do refactoring: aplicar css geral como propriedade. Para isso, defina um objeto em uma variável e aplique o css que será reaproveitado. Em seguida, aplique na propriedade style de cada elemento, a variável, e o elemento irá receber o estilo que foi configurado.