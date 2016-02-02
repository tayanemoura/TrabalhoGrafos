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
 * @author tayanemoura
 */
class Vertice {

    String nome;
    List<Vertice> adj;
    private int PE;
    private int PS;
    private Vertice pai;

    Vertice(String nome) {
        this.nome = nome;
        this.adj = new ArrayList<>();
    }

    void addAdj(Vertice v) {
        adj.add(v);
    }
    
    void setPai(Vertice v){
        this.pai = v;
    }
    void setPE (int n){
        this.PE = n;
    }
    void setPS(int n){
        this.PS = n;
    }
    Vertice getPai(){
        return this.pai;
    }
    int getPE (){
        return this.PE;
    }
    int getPS(){
        return this.PS;
    }
}
