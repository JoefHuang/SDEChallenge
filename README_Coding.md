# AverageList README

## High level explanation

AverageList.java is an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. 
AverageListImpl.java is an implementation of the AverageList.java interface for the data structure.

### AverageList.java Usage

AverageList.java provides an interface to a data structure, which is a list of Integers. 

AverageList.java provides the following methods to access the data structure and to get the moving average:

	public boolean add(Integer e);
	
	- This method allows callers to add an Integer element to the data structure. If the element is successfully added to the data structure, a boolean value of "true" will be returned.
	
	public Integer get(int index);
	
	- This method allows callers to get an element from the data structure by the element's index.
	
	public int size();

	- This method allows callers to get the total number of the elements in the data structure.
	
	public double average(int lastN);
	
	- This method allows callers to get a moving average of the last N elements added. If the input parameter lastN is out of the scope of the current elements in the data structure, an IllegalArgumentException will be thrown.

### AverageListImpl.java Usage

AverageListImpl.java provides an implementation of the AverageList.java interface. It uses ArrayList as the backing data structure, so the following items apply:

- The "add" and "get" operations have the same time and space complexities as the corresponding methods in ArrayList.  

- The "add" and "get" operations will throw the same Runtime Exceptions as the corresponding methods in ArrayList

- It supports a constructor by loadFactor, and the same "expand" behaviors as ArrayList

Please note, this implementation is thread-unsafe. In a concurrent environment, a thread-safe implementation should be used. There are multiple options to create a thread-safe implementation, one option is to use the CopyOnWriteArrayList data structure, which provides out-of-the-box support for concurrency, at the cost of performance. 

