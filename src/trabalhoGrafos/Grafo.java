/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoGrafos;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author tayanemoura
 */
public class Grafo {

    List<Vertice> vertices;
    List<Aresta> arestas;

    public Grafo() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
    }

    private Vertice addVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    private Aresta addAresta(Vertice v1, Vertice v2) {
        Aresta e = new Aresta(v1, v2);
        v1.addAdj(e);
        arestas.add(e);
        return e;
    }
    //depois modificar para a geração de grafos que ele pediu (aleatório e com prob)
    public Grafo geraGrafo (){
        Grafo g = new Grafo();
        Vertice s = g.addVertice("s");
        Vertice t = g.addVertice("t");
        Vertice y = g.addVertice("y");
        Aresta st = g.addAresta(s, t);
        Aresta sy = g.addAresta(s, y);
        Aresta ty = g.addAresta(t, y);
        return g;
    }
    @Override
    public String toString() {
        String r = "";
        for (Vertice u : vertices) {
            r += u.nome + " -- ";
            for (Aresta e : u.adj) {
                Vertice v = e.v2;
                r += v.nome + ", ";
            }
            r += "\n";
        }
        return r;
    }

}
