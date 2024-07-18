package com.coderscampus.assignment7;

import com.coderscampus.arraylist.CustomList;

public class CustomListApplication {

	public static void main(String[] args) {
				// test by instantiating the CustomArrayList class and inserting elements into it
				CustomList<Integer> myCustomList = new CustomArrayList<>();
				myCustomList.add(1);
				// instantiation of additional CustomArrayList 
				CustomList<String> myShoppingList = new CustomArrayList<>();
				myShoppingList.add("eggs");
				myShoppingList.add("fruit");
				myShoppingList.add("milk");
				// and continue to add another 10, 20 or 40 more elements to myCustomList
				int i;
				for (i=1; i<50; i++) {
					myCustomList.add(i+1);
				}
				// then validate that all the elements inserted actually exist in the data structure
				for (i = 0; i < myCustomList.getSize(); i++) {
					System.out.println(myCustomList.get(i));
				}
				System.out.println("---------------");
				for (i = 0; i < myShoppingList.getSize(); i++) {
					System.out.println(myShoppingList.get(i));
				}
	}
}
