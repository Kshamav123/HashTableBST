package com.hashbst;

public class MapMyNode<K,V> implements INode<K>{
	K key;
	V value;
	MapMyNode<K,V> next;
	public MapMyNode(K key,V value)
	{
		this.key=key;
		this.value=value;
		next=null;
	}
	public K getKey()
	{
		return key;
	}
	public void setKey(K key)
	{
		this.key=key;
	}
	public INode getNext()
	{
		return next;
	}
	@Override
	public void setNext(INode<K> next)
	{
		this.next=(MapMyNode<K,V>)next;
	}
	
	public V getValue()
	{
		return this.value;
	}
	public void setValue(V value)
	{
		this.value=value;
	}
	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MapMyNode{" + "key=").append(this.key).append(" , value=").append(this.value).append('}');
		if(next != null) 
		{
			myNodeString.append("->").append(next);
		}
		return myNodeString.toString();
	}	

}
