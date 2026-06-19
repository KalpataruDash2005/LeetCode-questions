class Graph{
    int n;
    ArrayList<Integer>[] adj;
    Graph(int n){
        this.n=n;
        adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
    }
    void addEdge(int src,int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }
    void dfs(int src,boolean[] vis){
        if(vis[src]) return;
        vis[src]=true;
        for(int nbr:adj[src]){
            dfs(nbr,vis);
        }
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        int reqEdge=n-1;
        int avlEdge=connections.length;
        if(reqEdge>avlEdge) return -1;

        Graph g=new Graph(n);
        boolean[] vis=new boolean[n];
        for(int[] arr:connections){
            g.addEdge(arr[0],arr[1]);
        }
        int comp=0;
        for(int i=0;i<n;i++){
            if(vis[i]) continue;
            g.dfs(i,vis);
            comp++;
        }
        return comp-1;
    }
}
