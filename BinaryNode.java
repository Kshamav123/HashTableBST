package com.hashbst;

public class BinaryNode<K extends Comparable<K>>  {
	K data;
	BinaryNode<K> left;
	BinaryNode<K> right;
	public BinaryNode(K data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
