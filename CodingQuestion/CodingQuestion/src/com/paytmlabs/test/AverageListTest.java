package com.paytmlabs.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.paytmlabs.AverageList;
import com.paytmlabs.AverageListImpl;

public class AverageListTest {

	@Test
	public void testAdd() {
		AverageList al = new AverageListImpl();
		al.add(1);
		assertTrue("testAdd failed", al.get(0) == 1);
	}

	@Test
	public void testGet() {
		AverageList al = new AverageListImpl();
		al.add(1);
		al.add(2);
		assertTrue("testGet failed", al.get(0) == 1);
		assertTrue("testGet failed", al.get(1) == 2);
	}

	@Test
	public void testAverage() throws Exception {
		AverageList al = new AverageListImpl();
		al.add(1);
		al.add(2);
		al.add(3);
		
		assertTrue("testAverage failed: " + al.average(1), al.average(1) == 3);
		assertTrue("testAverage failed: " + al.average(2), al.average(2) == 2.5);
		assertTrue("testAverage failed: " + al.average(3), al.average(3) == 2);
	}

}
