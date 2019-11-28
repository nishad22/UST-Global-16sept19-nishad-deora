package com.ustglobal.set.treeemployee;

public class Person implements Comparable<Person>{
	String name;
	int sal;
	String prof;
	int id;
	String company;
	public Person(String name,int sal,int id) {
		this.name = name;
		this.sal = sal;
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sal;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Person p) {
		Integer j = this.id;
		Integer i = p.id;
		return (j.compareTo(i));
	}
	
}
