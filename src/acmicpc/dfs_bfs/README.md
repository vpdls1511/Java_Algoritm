#DFS

dfs는 Stack을 이용해서 해결하는 문제이다.  
하지만, 컴퓨터 자체가 Stack의 방식으로 동작을 하기 때문에, Recursion을 이용하여 해결할 수 있다.

Dept First Search 즉, 깊이 우선 탐색으로 깊은곳을 우선적으로 탐색을 하게 된다.  
[참고영상](https://www.youtube.com/watch?v=0Njv04WiLV0&t=296s)

```java
class DFS{
    static boolean[] visited = new boolean[10]; // 방문한 Node를 기록한다
    static int[][] graph ; // Node를 기록하고, 이 Node의 
    
    public static void dfs(int node){
        visited[node] = true; // 탐색한 Node를 기록한다. ( 3번 Node에 방문하면 visited[3] = true 가 된다. ) 
        System.out.println(node + " "); // 방문한 노드를 출력
        for(int next = 1 ; next <= N ; ++next){
            /*
            DFS 문제를 해결할 때 대부분 1부터 시작을 하게 된다.
            0부터 반복을 시작하게되면 그만큼의 시간 복잡도가 늘어나게되니, 조금이라도 줄이기 위해 1부터 시작
            */
            if(!visited[next] && graph[node][next] != 0){
                dfs(next);
                /*
                사실 여기가 조금 어려운 개념이다.
                next = 2 일 때, 2번 노드를 방문했는지 확인을 한다.
                visited[2] 가 false 면 조건 1을 만족하고 그 다음 조건에 부합하는지 확인을 하게 되는데,
                graph는 0과 1로만 되어있다.
                
                0 0 0 0 0
                0 0 1 1 1
                0 1 0 0 1
                0 1 0 0 1
                0 1 1 1 0
                
                위와같은 형태인데, 이는 main 에서 graph 초기화를 할 때 이처럼 초기화를 시켜준다.
                여기서 인접행렬 이라는 개념이 들어가게 된다.
                
                쨋든, 다시 보면 node 의 값과 next의 값을 예를들어 (1,2) 라고 했을 때
                graph[1][2] 면 1이기 때문에 조건에 부합하므로 dfs함수를 호출한다.
                
                이러한 방식이 Recursion 형태로 계속해서 반복을 하게 된다. 
                */
            }
        }
    }
}
```