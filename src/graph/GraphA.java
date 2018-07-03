package graph;

import java.util.HashSet;

public class GraphA {
	
	/*
	 * 用邻接矩阵实现有向图
	 * */
	
	HashSet<String> vertexSet = new HashSet<String>(); // 顶点集合
	int matrix[][] = new int[100][100]; // 邻接矩阵的二维数组
	
	public void add(String begin,String end){
		vertexSet.add(begin);
		vertexSet.add(end);
		
	}
	
}
