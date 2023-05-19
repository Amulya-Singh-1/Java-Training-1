package Syncthreadpractise;

import java.util.Comparator;
import java.util.Objects;

public class Student2 implements Comparable<Student2> {
	int id;
	String name;

	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student2 o) {
		return this.id - o.id;
	}

	public static Comparator<Student2> com = new Comparator<Student2>() {

		@Override
		public int compare(Student2 o1, Student2 o2) {
			return (o1.getName()).equals(o2.getName()) ? (o1.id - o2.id) : (o1.getName().compareTo(o2.getName()));
		}

	};
}
