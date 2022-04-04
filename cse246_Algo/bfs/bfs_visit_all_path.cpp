#include<bits/stdc++.h>
using namespace std;
#define mx 999

vector<int> graph[mx];
bool visited[mx];
int dis[mx];
int bfs(int sources){
queue<int> Q;
visited[sources]=true;
dis[sources]=0;
Q.push(sources);
while(!Q.empty()){
    int node =Q.front();
    cout<<node<<" -> ";

    Q.pop();
    for(int i = 0; i<graph[node].size();i++){
        int next = graph[node][i];
        if(visited[next]==false){
            visited[next]=true;

            dis[next]=dis[node]+1;
            Q.push(next);
        }
    }
}

}
int main(){

    int vertex,edge;
    cin>>vertex>>edge;
    for(int i = 0; i<edge;i++){
        int u,v;
        cin>>u>>v;
        graph[u].push_back(v);
        graph[v].push_back(u);
    }
    cout<<"enter the sources node: ";
    int sources;
    cin>>sources;
   // cout<<"enter dist"<<endl;
    //int endnode;
   // cin>>endnode;
    bfs(sources);
    //for(int i=1; i<=vertex; i++){
          //  cout<<"distesce of "<< i << " is : "<<dis[ i]<<endl;
   // }

return 0;
}

