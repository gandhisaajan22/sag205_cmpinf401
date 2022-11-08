package edu.pitt.sag205_Lab9;

public class Circle {
	private double radius;
	private String color;
	public Circle() {
		radius = 5.0;
		color = "Green";
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}
