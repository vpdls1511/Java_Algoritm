# DFS

> dfs는 Stack을 이용해서 해결하는 문제이다.  
하지만, 컴퓨터 자체가 Stack의 방식으로 동작을 하기 때문에, Recursion을 이용하여 해결할 수 있다.

### Dept First Search 즉, 깊이 우선 탐색으로 깊은곳을 우선적으로 탐색을 하게 된다.  
[DFS 참고영상](https://www.youtube.com/watch?v=0Njv04WiLV0&t=296s)

```java
class DFS{
    static boolean[] visited = new boolean[10]; // 방문한 Node를 기록한다
    static int[][] graph ; // Node를 기록
    
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

# BFS
> bfs는 Queue를 이용한다.
> Queue의 경우, 직접 구현을 해 주어야 한다.

### Breath-First Search로, 넓이 우선 탐색이다.

[BFS 참고영상](https://www.youtube.com/watch?v=yQ7o1Y7X_Rg&t=370s)

```java

import java.util.LinkedList;
import java.util.Queue;

class BFS {
    static boolean[] visited = new boolean[10]; // dfs와 동일하게 방문한 node를 기록한다.
    static int[][] graph; // Node를 graph에 기록한다. 이 때 Node를 순서가 없는 Graph로 변환해준다.

    public static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        // Queue 를 선언해주고, 이를 Integer 형태의 자료를 넣을 수 있도록 해준다.
        // Queue 는 LinkedList 객체로 선언을 해준다.
        visited[node] = true; // 탐색 전 시작하는 위치의 node를 방문했다고 기록한다.
        queue.add(node); // Node를 queue 에 넣어준다.
        
        while (!queue.isEmpty()){ // queue가 빌 때까지 반복한다.
            int curr = queue.remove(); // 현재 들어가있는 queue 를 deQueue 시켜주고,
            System.out.print(curr + " "); //  deQueue된 curr 을 출력해준다.
            
            for(int next = 1 ; next <= N ; i++){ // N은 노드의 개수로, 노드의 개수만큼 반복한다.
                if(!visited[next] && graph[curr][next] != 0){
                    visited[next] = true;
                    queue.add(next);
                    
                    // 방문하지 않았고, 다음 방문할 Graph 배열의 값이 1일 경우,
                    // 방문을 하고, 해당 Node 를 방문했다고 기록을 해 준다.
                    // 이 다음 queue에 방문한 node를 추가해준다.
                }
            }
        }
    }
}

```