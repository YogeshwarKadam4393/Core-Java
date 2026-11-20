package com.QUEUE_EXAMPLE;

import java.util.LinkedList;
import java.util.Queue;

public class QUEUE_EXAMPLE2 {

	public static void main(String[] args) {

		System.out.println("============= QUEUE USING LINKEDLIST ==============");

		Queue<Integer> q = new LinkedList<Integer>();

		// QUEUE WORKS ON : FIFO
		// FIFO : FIRST IN FIRST OUT
		// Queue is an INTERFACE
		// LinkedList is one of the IMPLEMENTATION classes of Queue

		q.add(10);
		q.add(20);
		q.add(10);
		q.add(30);
		q.add(40);
		q.add(50);

		System.out.println(q);
	}
}