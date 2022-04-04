#include<bits/stdc++.h>
using namespace std;
#define mx 999

vector<int> graph[mx];
bool visited[mx];
int dis[mx];
int parents[mx];
vector<int> path;


int bfs(int sources, int end_node){
    queue<int> Q;
    visited[sources]=true;
    dis[sources]=0;
    parents[sources]=-1;
    Q.push(sources);
    while(!Q.empty()){
        int node =Q.front();


        Q.pop();
        for(int i = 0; i<graph[node].size();i++){
            int next = graph[node][i];
            if(visited[next]==false){
                visited[next]=true;

                dis[next]=dis[node]+1;
                parents[next]=node;
                Q.push(next);
            }
        }

    }
}

int spath(int sources,int end_node){
    if(visited[end_node]==0){
        cout<<"no path"<<endl;
    }
    if(sources==end_node){
        cout<<"same nood";
    }
    else{
        int x = end_node;
        while(x!=-1){
            path.push_back(x);
            x = parents[x];
        }
    }
    reverse(path.begin(),path.end());
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
    cout<<"enter end node :";
    int endnode;
    cin>>endnode;
    bfs(sources,endnode);
    spath(sources,endnode);
    for(int i=0; i<path.size(); i++){
        cout<<"-> "<<path[ i];
    }

    return 0;
}


