package it.polito.tdp.borders.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

import it.polito.tdp.borders.db.BordersDAO;

public class Model {
	private Graph <Country, DefaultEdge> grafo;
	private Map<Integer,Country> idMap;
	private BordersDAO dao;

	public Model() {
		idMap = new HashMap<Integer,Country>();
		dao = new BordersDAO();
		dao.loadAllCountries(idMap);
	}

}
