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
        return <ScoreboardContainer match={data.match} home={data.home} visitor={data.visitor}/>;
    }
}