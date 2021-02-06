/**
 * 
 */
 class Livre extends React.Component { 

	constructor(props) {
		super(props);
		this.state = {livre: []};
	}

	componentDidMount() { 
		client({method: 'GET', path: '/api/livre'}).done(response => {
			this.setState({livre: response.entity._embedded.livres});
		});
	}

	render() { 
		return (
			<LivreList livre={this.state.livres}/>
		)
	}
}