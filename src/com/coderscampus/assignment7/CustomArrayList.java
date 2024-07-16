package com.coderscampus.assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] myItems = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == myItems.length) {
			myItems = Arrays.copyOf(myItems, myItems.length * 2);
		}
		myItems[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) myItems[index];
	} 

}
