package com.coderscampus.assignment7;

import java.util.Arrays;

import com.coderscampus.arraylist.CustomList;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] myItems = new Object[10];
	int indexCount = 0;
	int size = 0;
	
	private void doubleBackingArray() {
		myItems = Arrays.copyOf(myItems, myItems.length * 2);
	}
	
	private void updateSizeAndIndexCount() {
		int backingArrayLength = myItems.length;
		int nullIndexes = 0;
		int firstNullIndex = 0;
		int n;
		for (n = 0; n < backingArrayLength; n++) {
			if (myItems[n] == null) {
				nullIndexes++;
			}
		}
		for (n = 0; n <= backingArrayLength; n++) {
			if (n==backingArrayLength) {
				doubleBackingArray();
			} 
			if (myItems[n] == null) {
				firstNullIndex = n;
				break;
			}
		}
		this.size = backingArrayLength - nullIndexes;
		this.indexCount = firstNullIndex;
	}

	@Override
	public boolean add(T item) {
		if (indexCount == myItems.length) {
			doubleBackingArray();
			myItems[indexCount] = item;
			updateSizeAndIndexCount();
		} else if (myItems[indexCount] == null) {
			myItems[indexCount] = item;
			updateSizeAndIndexCount();
		} 
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws ArrayIndexOutOfBoundsException {
		if ((index >= myItems.length) || (index < 0)) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return (T) myItems[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		int countIndexAndRemainingIndexes = myItems.length - index;
		int nextNullIndex = 0;
		int remainingIndexesNotNull = 0;
		int c;
		for (c = index+1; c < myItems.length; c++) {
			if (myItems[c] == null) {
				nextNullIndex = c;
				break;
			} else {
				remainingIndexesNotNull++;
			}
		}
		int n;
		if ((index >= myItems.length) || (index < 0)) {
			throw new IndexOutOfBoundsException();
		} else if (myItems[index] == null) {
			myItems[index] = item;
			updateSizeAndIndexCount();
		} else if ((myItems[index] != null) && (remainingIndexesNotNull == countIndexAndRemainingIndexes-1)) {
			doubleBackingArray();
			for (n = index+countIndexAndRemainingIndexes-1; n>=index; n--) {
				myItems[n+1] = myItems[n];
			} 
			myItems[index] = item;
			updateSizeAndIndexCount();
		} else {
			for (n = nextNullIndex; n>index; n--) {
				myItems[n] = myItems[n-1];
			} 
			myItems[index] = item;
			updateSizeAndIndexCount();
		}
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if ((index >= myItems.length) || (index < 0)) {
			throw new IndexOutOfBoundsException();
		}
		return null;
	}

}



//consider deleting this:
//else {
//	int s;
//	for (s = size; s == myItems.length; s++) {
//		if (s == myItems.length) {
//			doubleBackingArray();
//			myItems[s] = item;
//			size++;
//			break;
//		}
//		if (myItems[s] == null) {
//			myItems[s] = item;
//			size++;
//			break;
//		}
//		size++;
//	}
//}


//if (index == myItems.length) {
//	myItems = Arrays.copyOf(myItems, myItems.length * 2);
//}
//if (index == size) {
//	size++;
//}		
	



