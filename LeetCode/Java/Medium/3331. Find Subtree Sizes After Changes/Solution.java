import java.util.*;

class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            adj[parent[i]].add(i);
        }
        
        int[] newParent = Arrays.copyOf(parent, n);
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);
        
        findParents(0, adj, s, lastSeen, newParent);
        
        List<Integer>[] newAdj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            newAdj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            newAdj[newParent[i]].add(i);
        }
        
        int[] ans = new int[n];
        countSizes(0, newAdj, ans);
        
        return ans;
    }
    
    private void findParents(int u, List<Integer>[] adj, String s, int[] lastSeen, int[] newParent) {
        int charIdx = s.charAt(u) - 'a';
        int prevAncestor = lastSeen[charIdx];
        
        if (prevAncestor != -1) {
            newParent[u] = prevAncestor;
        }
        
        lastSeen[charIdx] = u;
        for (int v : adj[u]) {
            findParents(v, adj, s, lastSeen, newParent);
        }
        lastSeen[charIdx] = prevAncestor;
    }
    
    private int countSizes(int u, List<Integer>[] newAdj, int[] ans) {
        int size = 1;
        for (int v : newAdj[u]) {
            size += countSizes(v, newAdj, ans);
        }
        ans[u] = size;
        return size;
    }
}
