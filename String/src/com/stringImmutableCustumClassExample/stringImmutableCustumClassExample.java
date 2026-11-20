package com.stringImmutableCustumClassExample;

// Question : How to create custom immutable class like String
// Answer : To create a custom immutable class, declare the class as final, make its fields private final, 
//          initialize them through the constructor, don't provide setters, and use defensive copies for mutable fields. 
//          This ensures that the object's state cannot be changed after creation.

final class stringImmutableCustumClassExample {

	private final int id;
	private final String name;

	public stringImmutableCustumClassExample(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		stringImmutableCustumClassExample s = new stringImmutableCustumClassExample(101, "Yogesh");

		System.out.println(s.getId());
		System.out.println(s.getName());

	}
}
