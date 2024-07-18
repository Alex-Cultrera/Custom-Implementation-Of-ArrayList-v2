package com.coderscampus.assignment7;

import com.coderscampus.arraylist.CustomList;

public class CustomListApplication {

	public static void main(String[] args) {

				// test by instantiating the CustomArrayList class and inserting elements into it
				CustomList<String> myCustomList = new CustomArrayList<>();
				myCustomList.add("element 1");
				// instantiation of additional CustomArrayList 
				CustomList<String> myShoppingList = new CustomArrayList<>();
				myShoppingList.add("eggs");
				myShoppingList.add("fruit");
				myShoppingList.add("milk");

				// and continue to add another 10, 20 or 40 more elements to myCustomList
				myCustomList.add("element 2");
				myCustomList.add("element 3");
				myCustomList.add("element 4");
				myCustomList.add("element 5");
				myCustomList.add("element 6");
				myCustomList.add("element 7");
				myCustomList.add("element 8");
				myCustomList.add("element 9");
				myCustomList.add("element 10");
				myCustomList.add("element 11");
				myCustomList.add("element 12");
				
				// then validate that all the elements inserted actually exist in the data structure
				for (int i = 0; i < myCustomList.getSize(); i++) {
					System.out.println(myCustomList.get(i));
				}

				System.out.println("---------------");

				for (int i = 0; i < myShoppingList.getSize(); i++) {
					System.out.println(myShoppingList.get(i));
				}

	}

}
