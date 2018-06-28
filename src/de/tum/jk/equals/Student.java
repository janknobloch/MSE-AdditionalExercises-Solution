package de.tum.jk.equals;

public class Student extends Person {

	double grade;

	public Student(String name, int alter, double note) {
		super(name, alter);
		this.grade = note;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name != other.name || age != other.age || grade != other.grade)
			return false;
		return true;
	}

}
