package com.coderscampus.assignment7;

import java.util.Arrays;

import com.coderscampus.arraylist.CustomList;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] myItems = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == myItems.length) {
			myItems = Arrays.copyOf(myItems, myItems.length * 2);
		}
		if (myItems[size] == null) {
			myItems[size] = item;
			size++;
		} else {
			int s;
			for (s = size; s == myItems.length; s++) {
				if (s == myItems.length) {
					myItems = Arrays.copyOf(myItems, myItems.length * 2);
				}
				if (myItems[s] == null) {
					myItems[s] = item;
					size++;
					break;
				}
				size++;
			}
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
		if (index >= myItems.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return (T) myItems[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index >= myItems.length) {
			throw new IndexOutOfBoundsException();
		}
		if (index == myItems.length) {
			myItems = Arrays.copyOf(myItems, myItems.length * 2);
		}
		if (index == size) {
			size++;
		}		
		int remainingIndexes = myItems.length - index;
		int nullIndex = 0;
		int notNull = 0;
		int c;
		for (c = index+1; c < myItems.length; c++) {
			if (myItems[c] == null) {
				nullIndex = c;
				break;
			} else {
				notNull++;
			}
		}
		int n;
		if (myItems[index] == null) {
			myItems[index] = item;
		} else if ((myItems[index] != null) && (notNull == remainingIndexes-1)) {
			myItems = Arrays.copyOf(myItems, myItems.length * 2);
			for (n = index + remainingIndexes-1; n>=index; n--) {
				myItems[n+1] = myItems[n];
			} 
			myItems[index] = item;
		} else {
			for (n = nullIndex; n>index; n--) {
				myItems[n] = myItems[n-1];
			} 
			myItems[index] = item;
		}
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}
