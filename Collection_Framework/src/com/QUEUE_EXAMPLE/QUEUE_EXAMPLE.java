package com.QUEUE_EXAMPLE;

import java.util.LinkedList;
import java.util.Queue;

public class QUEUE_EXAMPLE {

	public static void main(String[] args) {

		System.out.println("============= QUEUE ==============");

		Queue<Integer> q = new LinkedList<Integer>();

		// QUEUE WORKS ON : FIFO
		// FIFO : FIRST IN FIRST OUT
		// Queue is an INTERFACE
		// LinkedList is one of the IMPLEMENTATION classes of Queue

		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);

		System.out.println(q);


		// add() : Adds element into Queue
		q.add(60);
		System.out.println(q);


		// offer() : Adds element into Queue
		q.offer(70);
		System.out.println(q);


		// remove() : Removes and returns head element
		System.out.println(q.remove());
		System.out.println(q);


		// poll() : Removes and returns head element
		System.out.println(q.poll());
		System.out.println(q);


		// element() : Returns head element WITHOUT removing
		System.out.println(q.element());
		System.out.println(q);


		// peek() : Returns head element WITHOUT removing
		System.out.println(q.peek());
		System.out.println(q);


		// size() : Returns number of elements
		System.out.println("Size : " + q.size());


		// contains() : Checks whether element is present
		System.out.println("Contains 30 : " + q.contains(30));


		// isEmpty() : Checks whether Queue is empty
		System.out.println("Is Empty : " + q.isEmpty());


		// clear() : Removes all elements
		q.clear();
		System.out.println(q);

	}

}