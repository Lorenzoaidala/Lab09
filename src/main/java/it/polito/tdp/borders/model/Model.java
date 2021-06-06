package it.polito.tdp.borders.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

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
	
	public void creaGrafo(int anno) {
		grafo = new SimpleGraph(DefaultEdge.class);
		
		Graphs.addAllVertices(this.grafo, idMap.values());
		
		for(Border b : dao.getCountryPairs(idMap, anno)) {
			DefaultEdge e = grafo.getEdge(b.getC2(), b.getC1());
			if(e==null) {
				Graphs.addEdge(this.grafo, b.getC1(), b.getC2(),b.getAnno());
			}
		}
	}
	
	public int getNVertex() {
		return this.grafo.vertexSet().size();
				
	}
	public int getNEdges() {
		return this.grafo.edgeSet().size();
	}

}
