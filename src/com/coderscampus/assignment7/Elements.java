package com.coderscampus.assignment7;


public class Elements {
	String element = "element ";

	public void addElementsToCustomList(int numberOfElements, CustomList<String> aList) {
		int i = 0;
		int elementNumber;
		elementNumber = aList.getSize();
		while (i < numberOfElements) {
			aList.add(element + String.valueOf(elementNumber+1));
			elementNumber++;
			i++;
		}
	}

}
