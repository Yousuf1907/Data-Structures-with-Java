import java.util.LinkedList;

public class Science {
    int V;
    int E;

    LinkedList<Integer>[] ll;

    Science(int vertices) {
        V = vertices;
        E = 0;
        ll = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            ll[i] = new LinkedList<>();
        }
    }
}