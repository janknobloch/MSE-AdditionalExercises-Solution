package de.tum.jk.equals;

public class ObjectHierarchyMain {

	/**
	 * 
	 * 
	 * The equals method implements an equivalence relation on non-null object
	 * references:
	 * 
	 * It is reflexive: for any non-null reference value x, x.equals(x) should
	 * return true.
	 * 
	 * It is symmetric: for any non-null reference values x and y, x.equals(y)
	 * should return true if and only if y.equals(x) returns true.
	 * 
	 * It is transitive: for any non-null reference values x, y, and z, if
	 * x.equals(y) returns true and y.equals(z) returns true, then x.equals(z)
	 * should return true.
	 * 
	 * It is consistent: for any non-null reference values x and y, multiple
	 * invocations of x.equals(y) consistently return true or consistently return
	 * false, provided no information used in equals comparisons on the objects is
	 * modified.
	 * 
	 * For any non-null reference value x, x.equals(null) should return false.
	 */

	public static void main(String[] args) {
		Professor p1 = new Professor("Jan", 30, 2000.0);
		Professor p2 = new Professor("Jan", 30, 2000.0);
		Professor p3 = new Professor("Jan", 30, 2000.0);

		// check for reflexivity
		System.out.println("\nCheck reflexivity: x.equals(x) should return true");
		System.out.println("p1.equals(p1): ->" + p1.equals(p1));

		// check for symmetry
		System.out.println("\nCheck symmetry: x.equals(y) should return true if and only if y.equals(x) returns true");
		System.out.println("p1.equals(p2): ->" + p1.equals(p2));
		System.out.println("p2.equals(p1): ->" + p2.equals(p1));

		// check for transivity
		System.out.println(
				"\nCheck transivity: if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.");
		System.out.println("p1.equals(p2): ->" + p1.equals(p2));
		System.out.println("p2.equals(p3): ->" + p2.equals(p3));
		System.out.println("p1.equals(p3): ->" + p1.equals(p3));
		// check null values
		System.out
				.println("\nCheck null values: For any non-null reference value x, x.equals(null) should return false");
		System.out.println("p1.equals(null): ->" + p1.equals(null));

		System.out.println("\nCheck object Hierarchies: Assure only comparable classes are compared.");

		Professor p4 = new Professor("Jan1", 30, 2000.00);
		Student s1 = new Student("Jan", 30, 1.0);
		Student s2 = new Student("Tim", 30, 1.0);
		System.out.println("p4.equals(s1): ->"+p4.equals(s1)); // IDE already states that this is not a valid compare Professor vs Students
		System.out.println("s1.equals(s1): ->"+s1.equals(s1));
		System.out.println("s1.equals(s2): ->"+s1.equals(s2));
		System.out.println("p1.equals(p4): ->"+p1.equals(p4));
	}
}
