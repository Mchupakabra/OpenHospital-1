package org.isf.exatype.test;


import org.isf.utils.exception.OHException;
import org.isf.exatype.model.ExamType;

import static org.junit.Assert.assertEquals;

public class TestExamType 
{	
    private String code = "Z";
    private String description = "TestDescription";
    
			
	public ExamType setup(
			boolean usingSet) throws OHException 
	{
		ExamType examType;
	
				
		if (usingSet == true)
		{
			examType = new ExamType();
			_setParameters(examType);
		}
		else
		{
			// Create ExamType with all parameters 
			examType = new ExamType(code, description);
		}
				    	
		return examType;
	}
	
	public void _setParameters(
			ExamType examType) 
	{	
		examType.setCode(code);
		examType.setDescription(description);
		
		return;
	}
	
	public void check(
			ExamType examType) 
	{		
    	System.out.println("Check ExamType: " + examType.getCode());
    	assertEquals(code, examType.getCode());
    	assertEquals(description, examType.getDescription());
		
		return;
	}
}
