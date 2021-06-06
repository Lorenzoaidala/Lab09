package it.polito.tdp.borders.model;

import java.util.*;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.borders.db.BordersDAO;

public class Model {
	private Graph <Country, DefaultEdge> grafo;
	private Map<Integer,Country> idMap;
	private List<Country> countries;
	private BordersDAO dao;

	public Model() {
		idMap = new HashMap<Integer,Country>();
		dao = new BordersDAO();
		dao.loadAllCountries(idMap);
	}
	
	public void creaGrafo(int anno) {
		grafo = new SimpleGraph<>(DefaultEdge.class);
		
		//Graphs.addAllVertices(this.grafo, idMap.values());
		if(dao.getCountryPairs(idMap, anno).isEmpty()) {
			System.out.println("Nessun confine disponibile per i paesi nell'anno selezionato");
			return;
		}
			
			
		for(Border b : dao.getCountryPairs(idMap, anno)) {
			this.grafo.addVertex(b.getC1());
			this.grafo.addVertex(b.getC2());
			this.grafo.addEdge(b.getC1(), b.getC2());
		}
		
		countries = new ArrayList<Country>(this.grafo.vertexSet());
		Collections.sort(countries);
	}
	
	public int getNVertex() {
		return this.grafo.vertexSet().size();
				
	}
	public int getNEdges() {
		return this.grafo.edgeSet().size();
	}

}
