package com.factorypattern;

public class Test {

	public static void main(String[] args) {
		Part linePlot = new LinePlot();
		Part curvePlot = new CurvePlot();
		ViewPart viewpart = ClassWithFactory.getViewForPart(linePlot);
		viewpart.printName();
		viewpart = ClassWithFactory.getViewForPart(curvePlot);
		viewpart.printName();
	}

}