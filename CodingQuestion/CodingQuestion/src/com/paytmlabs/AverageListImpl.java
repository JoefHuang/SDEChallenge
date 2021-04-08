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
	public void add(Integer e) {
		list.add(e);
	}

	@Override
	public Integer get(int index) {
		return list.get(index);
	}

	@Override
	public double average(int lastN) throws Exception {
		if (lastN > list.size() || lastN <= 0)
			throw new Exception("Incorrect parameter");
		int total = 0;
		for (int i=list.size()-1;i>=list.size()-lastN;i--) {
			total += list.get(i);
		}
		return (double)total/lastN;
	}

}
