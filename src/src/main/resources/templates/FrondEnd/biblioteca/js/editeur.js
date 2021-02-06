/**
 * 
 */
 class Editeur extends React.Component { 

	constructor(props) {
		super(props);
		this.state = {editeur: []};
	}

	componentDidMount() { 
		client({method: 'GET', path: '/api/editeur'}).done(response => {
			this.setState({editeur: response.entity._embedded.editeurs});
		});
	}

	render() { 
		return (
			<EditeurList editeur={this.state.editeurs}/>
		)
	}
}