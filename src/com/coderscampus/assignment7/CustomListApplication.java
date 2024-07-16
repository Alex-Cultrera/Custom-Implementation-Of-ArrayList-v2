package com.coderscampus.assignment7;

import com.coderscampus.arraylist.CustomList;

public class CustomListApplication {

	public static void main(String[] args) {
		// ***TESTING PROCESS***

				// test by instantiating the CustomArrayList class and inserting elements into it
				CustomList<String> myCustomList = new CustomArrayList<>();
				myCustomList.add("element 1");
				// instantiation of additional CustomArrayList for further testing
				CustomList<String> myShoppingList = new CustomArrayList<>();
				myShoppingList.add("eggs");
				myShoppingList.add("fruit");
				myShoppingList.add("milk");

				// and continue to add another 10, 20 or 40 more elements to myCustomList
				// method below will quickly add specified number elements to the CustomArrayList
				Elements elements = new Elements();
				elements.addElementsToCustomList(10, myCustomList);

				
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
