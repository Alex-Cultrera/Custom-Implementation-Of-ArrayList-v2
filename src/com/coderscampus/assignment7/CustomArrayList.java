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
		if (index >= myItems.length) {
			throw new ArrayIndexOutOfBoundsException();
			}
		return (T) myItems[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	} 

}
