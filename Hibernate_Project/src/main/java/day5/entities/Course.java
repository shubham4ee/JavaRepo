package day5.entities;

import java.util.Objects;

public class Course {
	private int courseId;
	private String name;
	private int duration;
	private int fees;
	private String provider;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String name, int duration, int fees, String provider) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
		this.provider = provider;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", duration=" + duration + ", fees=" + fees
				+ ", provider=" + provider + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseId, duration, fees, name, provider);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && duration == other.duration && fees == other.fees
				&& Objects.equals(name, other.name) && Objects.equals(provider, other.provider);
	}

}
