package com.hashbst;

public class BinarySearchTreeMain {
	public static void main(String[] args) 
	{
		BinarySearchTree<Integer> myBST = new BinarySearchTree<Integer>();
		myBST.addElement(56);
		myBST.addElement(30);
		myBST.addElement(70);
		myBST.addElement(22);
		myBST.addElement(40);
		myBST.addElement(11);
		myBST.addElement(3);
		myBST.addElement(16);
		myBST.addElement(60);
		myBST.addElement(95);
		myBST.addElement(65);
		myBST.addElement(63);
		myBST.addElement(67);
		System.out.println("The size of Binary Search Tree is: "+myBST.getSize());
		myBST.searchElement(63);
		System.out.println("Elements of the BST: ");
		myBST.getNodes();
       // myBST.printNodes(null);
		
	}
}



