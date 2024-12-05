public class Graph {
    int vertices;
    Edge[] adjMatrix;
    String[] vertexNames;
    int[] teleportation;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new Edge[vertices];
        vertexNames = new String[vertices];
        teleportation = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adjMatrix[i] = new Edge();
            teleportation[i] = -1;
        }
    }

    public void setVertexName(int index, String name) {
        vertexNames[index] = name;
    }

    public int getVertexIndex(String name) {
        for (int i = 0; i < vertices; i++) {
            if (vertexNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addEdge(String source, String destination, int weight) {
        int sourceIndex = getVertexIndex(source);
        int destinationIndex = getVertexIndex(destination);
        if (sourceIndex == -1 || destinationIndex == -1) {
            System.out.println("Invalid vertex name.");
            return;
        }
        adjMatrix[sourceIndex].add(destinationIndex, weight);
        adjMatrix[destinationIndex].add(sourceIndex, weight);
    }

    public void shortestPath(String startName, String endName, String ignorePlanet) {
        int start = getVertexIndex(startName);
        int end = getVertexIndex(endName);
        int ignore = ignorePlanet != null ? getVertexIndex(ignorePlanet) : -1;

        if (start == -1 || end == -1) {
            System.out.println("Invalid vertex name.");
            return;
        }

        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];
        int[] previous = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
            previous[i] = -1;
        }

        distance[start] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            int u = selectMinVertex(distance, visited);
            if (u == ignore) continue;
            visited[u] = true;

            if (teleportation[u] == end) {
                distance[end] = distance[u];
                previous[end] = u;
                break;
            }

            if (teleportation[u] != -1 && !visited[teleportation[u]]) {
                int teleportVertex = teleportation[u];
                if (distance[u] < distance[teleportVertex]) {
                    distance[teleportVertex] = distance[u];
                    previous[teleportVertex] = u;
                }
            }

            Vertex temp = adjMatrix[u].head;
            while (temp != null) {
                if (!visited[temp.vertex] && temp.vertex != ignore && distance[u] != Integer.MAX_VALUE &&
                        distance[u] + temp.weight < distance[temp.vertex]) {
                    distance[temp.vertex] = distance[u] + temp.weight;
                    previous[temp.vertex] = u;
                }
                temp = temp.next;
            }
        }

        if (distance[end] == Integer.MAX_VALUE) {
            System.out.println("No path found.");
        } else {
            printPath(previous, end);
            System.out.println();
        }
    }

    public void setTeleportation(String from, String to) {
        int fromIndex = getVertexIndex(from);
        int toIndex = getVertexIndex(to);
        if (fromIndex == -1 || toIndex == -1) {
            System.out.println("Invalid vertex name for teleportation.");
            return;
        }
        teleportation[fromIndex] = toIndex;
        addEdge(from, to, 0);
    }

    private int selectMinVertex(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && distance[i] < min) {
                min = distance[i];
                index = i;
            }
        }
        return index;
    }

    private void printPath(int[] previous, int vertex) {
        if (previous[vertex] == -1) {
            System.out.print(vertexNames[vertex] + " ");
            return;
        }
        printPath(previous, previous[vertex]);
        System.out.print("=> " + vertexNames[vertex] + " ");
    }

    public void removeTeleport() {
        for (int i = 0; i < vertices; i++) {
            teleportation[i] = -1;
        }
        for (int i = 0; i < vertices; i++) {
            Vertex current = adjMatrix[i].head;
            Vertex prev = null;
            while (current != null) {
                if (current.weight == 0) {
                    if (prev == null) {
                        adjMatrix[i].head = current.next;
                    } else {
                        prev.next = current.next;
                    }
                } else {
                    prev = current;
                }
                current = current.next;
            }
        }
    }
}
