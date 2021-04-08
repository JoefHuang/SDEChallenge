/**
 * 
 */
package com.paytmlabs;

/**
 * @author JOEFHuang
 *
 */
public interface AverageList {
	public void add(Integer e);
	public Integer get(int index);
	public double average(int lastN) throws Exception;
}
