package serializationndlist;

import java.io.Serializable;

public class MyClass implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer marks;

	//constructor
	public MyClass(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "MyClass [Name=" + name + ", Marks=" + marks + "]";
	}

}
