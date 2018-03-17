package com.factorypattern;

public class ClassWithFactory {
	
	public static ViewPart getViewForPart(Part part){
		
		if(part instanceof LinePlot)
			return new LinePlotView();
		else if(part instanceof CurvePlot)
			return new CurvePlotView();
		else
			return null;
		
	}
}
