import React from 'react';

import ScoreboardContainer from './ScoreboardContainer';

const data = {
    match: {
        stadium: 'Arena Corinthians',
        date: '13/06/2016',
        time: '19H',
    },
    home: {
        name: 'Corinthians',
    },
    visitor: {
        name: 'Palmeiras',
    }
}

export default class App extends React.Component {
    render() {
        return <ScoreboardContainer {...data}/>;
    }
}

// Primeiro ponto do refactoring: react spread operator. É quando passamos um objeto de configuração inteiro para o próximo módulo como uma propriedade única, ao invés de passar uma a uma, conforme estávamos fazendo. Pasa fazer isso, basta adicionar {...nomeDoObjeto}.