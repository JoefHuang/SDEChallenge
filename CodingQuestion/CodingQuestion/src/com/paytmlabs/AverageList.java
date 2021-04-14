/**
 * 
 */
package com.paytmlabs;

/**
 * @author JOEFHuang
 *
 */
public interface AverageList {
	
	public boolean add(Integer e);

	public Integer get(int index);

	public int size();

	public double average(int lastN);
}
