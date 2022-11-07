package edu.pitt.sag205_Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RecordList {
	private class Node{
		Record data;
		Node next;
		public Node(Record dataValue) {
			next = null;
			data = dataValue;
		}
	}
	private Node head;
	public RecordList() {
		head = new Node(null);
	}
	public int indexOf(String name) {
		Node currentNode = head;
		int index = 0;
		while (currentNode.next != null && !currentNode.next.data.getName().equals(name)) {
			currentNode = currentNode.next;
			index++;
		}
		if (currentNode.next == null) {
			return -1;
		}else {
			return index;
		}
	}
	public int add(Record data) {
		Node node = new Node(data);
		if(head.next == null) {
			head.next = node;
			return 0;
		}
		if (data.getTime() < head.next.data.getTime()) {
			node.next = head.next;
			head.next = node;
			return 0;
		}
		Node numb = head.next;
		int index = 1;
		while(numb.next != null) {
			if(data.getTime() >= numb.data.getTime() && data.getTime() <= numb.next.data.getTime()) {
				node.next = numb.next;
				numb.next = node;
				return index;
			}
			index++;
			numb = numb.next;
		}
		numb.next = node;
		return index;
	}
	public void print() {
		Node currentNode = head.next;
		while (currentNode != null) {
			System.out.println(currentNode.data.getName() + "," + currentNode.data.getTime());
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	public void writeToFile(String filename) {
		try {
			PrintWriter write = new PrintWriter(new File(filename));
			for(Node n = head.next; n != null; n = n.next) {
				write.println(n.data.getName() + "," + n.data.getTime());
				}
			write.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
}
