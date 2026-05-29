public class FloydWarshall {
    // User function template for JAVA

class Solution {
	public void floydWarshall(int[][] dist) {
		// Code here
		int m = dist.length;
		int mat[][] = new int[m][m];
		int INF = (int)1e8;
		for (int via = 0; via<m; via++) {
			for (int i = 0; i<m; i++) {
				for (int j = 0; j<m; j++) {
					if (dist[i][via] != INF && dist[via][j] != INF)
						dist[i][j] = Math.min(dist[i][j], (dist[i][via]+dist[via][j]));
					}
				}
			}
			//detecting negative cycle
		for(int i=0;i<m;i++) {
		    for(int j=0;j<m;j++) {
		        if(dist[i][j]==(int)1e8) dist[i][j]=-1;
		    }
		}
	}
}
}
