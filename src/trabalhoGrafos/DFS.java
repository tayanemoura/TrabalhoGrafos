/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoGrafos;

/**
 *
 * @author tayanemoura e carlossarcinelli
 */
public class DFS {
 int t=0;
    
    public void dfs(Grafo g) {
        
        for (int i = 0; i < g.vertices.size(); i++) {
            g.vertices.get(i).setPE(0);
            g.vertices.get(i).setPS(0);
            g.vertices.get(i).setPai(null);
        }
        busca(g.vertices.get(0));
         
    }
    
    public void busca(Vertice v){
        t++;
        v.setPE(t);
        for (int i = 0; i < v.adj.size(); i++) {
            if (v.adj.get(i).getPE()== 0){
                //visitar aresta vw
                v.adj.get(i).setPai(v);
                busca(v.adj.get(i));
            }
            else{
                //se PS(w) = 0 e w ≠ pai(v)
                    //então visitar aresta vw
            }
        }
        t++;
        v.setPS(t);
    }

    public static void main(String[] args) {
        Grafo g = new Grafo();
        g = g.geraGrafo();
        System.out.println(g);
    }

}
