package graph;

import java.util.*;

public class TopoSort {
    private static class Node {
        private String val; // 值
        private int pathIn = 0; // 入度

        public Node(String val) {
            this.val = val;
        }
    }

    private static class Graph {

        // 存放顶点的set
        public Set<Node> vertexSet = new HashSet<>();

        // HashMap node -> Set<Node>
        public Map<Node, Set<Node>> adjaNode = new HashMap<>();

        public boolean addNode(Node start, Node end) {
            if (!vertexSet.contains(start)) {
                vertexSet.add(start);
            }
            if (!vertexSet.contains(end)) {
                vertexSet.add(end);
            }
            if (adjaNode.containsKey(start) && adjaNode.get(start).contains(end)) {
                return false;
            }
            if (adjaNode.containsKey(start)) {
                adjaNode.get(start).add(end);
            } else {
                Set<Node> temp = new HashSet<>();
                temp.add(end);
                adjaNode.put(start, temp);
            }
            end.pathIn++;
            return true;
        }
    }

    private static class Topo {
        private List<Node> result; // 拓扑排序结果
        private Queue<Node> setOfZeroIndegree; // 队列 存放入度为0的node
        private Graph graph;

        public Topo(Graph di) {
            this.graph = di;
            this.result = new ArrayList<>();
            this.setOfZeroIndegree = new LinkedList<>();
            for (Node iterator : this.graph.vertexSet) {
                if (iterator.pathIn == 0) {
                    this.setOfZeroIndegree.add(iterator);
                }
            }
        }

        private void process() {
            while (!setOfZeroIndegree.isEmpty()) {
                Node v = setOfZeroIndegree.poll();

                result.add(v);

                if (this.graph.adjaNode.keySet().isEmpty()) {
                    return;
                }

                for (Node w : this.graph.adjaNode.get(v)) {
                    w.pathIn--;
                    if (0 == w.pathIn) {
                        setOfZeroIndegree.add(w);
                    }
                }
                this.graph.vertexSet.remove(v);
                this.graph.adjaNode.remove(v);
            }

            if (!this.graph.vertexSet.isEmpty()) {
                throw new IllegalArgumentException("Has Cycle !");
            }
        }

        public Iterable<Node> getResult() {
            return result;
        }
    }

    public static void main(String[] args) {

        // 4个点
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");

        // 图，把点放入图中
        Graph graph = new Graph();
        graph.addNode(a, b);
        graph.addNode(c, d);
        graph.addNode(d, a);

        Topo topo = new Topo(graph);
        topo.process();
        StringBuilder strB = new StringBuilder();
        for (Node temp : topo.getResult()) {
            strB.append(temp.val.toString()).append(",");
        }
        System.out.println(strB.toString().substring(0, strB.toString().length() - 1));
    }

}

