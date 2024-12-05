class Edge {
    Vertex head;

    public void add(int vertex, int weight) {
        Vertex newNode = new Vertex(vertex, weight);
        if (head == null) {
            head = newNode;
        } else {
            Vertex temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}