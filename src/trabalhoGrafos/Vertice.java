/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoGrafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tayanemoura e carlossarcinelli
 */
class Vertice {

    String nome;
    //lista dos vértices adjacentes
    List<Vertice> adj;

    Vertice(String nome) {
        this.nome = nome;
        this.adj = new ArrayList<>();
    }

    void addAdj(Vertice v) {
        adj.add(v);
    }
}
