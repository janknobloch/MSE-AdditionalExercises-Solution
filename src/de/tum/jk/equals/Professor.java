package de.tum.jk.equals;

public class Professor extends Person {

	double salary;

	public Professor(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Professor [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (name != other.name || age != other.age || salary != other.salary)
			return false;
		return true;
	}

}
