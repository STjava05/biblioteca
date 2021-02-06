
 class Auteur extends React.Component { 

	constructor(props) {
		super(props);
		this.state = {auteur: []};
	}

	componentDidMount() { 
		client({method: 'GET', path: '/api/auteur'}).done(response => {
			this.setState({auteur: response.entity._embedded.auteurs});
		});
	}

	render() { 
		return (
			<AuteurList auteur={this.state.auteurs}/>
		)
	}
}