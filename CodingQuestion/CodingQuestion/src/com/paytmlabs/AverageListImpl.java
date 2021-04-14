/**
 * 
 */
package com.paytmlabs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JOEFHuang
 *
 */
public class AverageListImpl implements AverageList {

	private List<Integer> list;

	public AverageListImpl() {
		list = new ArrayList<>();
	}

	public AverageListImpl(int initialCapacity) {
		list = new ArrayList<>(initialCapacity);
	}

	@Override
	public boolean add(Integer e) {
		return list.add(e);
	}

	@Override
	public Integer get(int index) {
		return list.get(index);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public double average(int lastN) {
		if (lastN > size() || lastN <= 0)
			throw new IllegalArgumentException();
		
		int total = 0;
		for (int i = size() - 1; i >= size() - lastN; i--) {
			total += get(i);
		}
		
		return (double) total / lastN;
	}

}
