package com.abc.bean;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
 
public class Test1 {
 List l;   
 
 @BeforeEach       
 void setUp( ) throws Exception{
	 l=Mockito.mock(List.class);
 }
 
 @Test
 void lTest1(){
	 l.add("fsd");
	 System.out.println(l.get(0));
	 Mockito.verify(l);
 }
 
}
