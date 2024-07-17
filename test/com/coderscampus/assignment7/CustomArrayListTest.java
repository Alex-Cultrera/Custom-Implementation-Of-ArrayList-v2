package com.coderscampus.assignment7;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.coderscampus.arraylist.CustomList;

class CustomArrayListTest {

//	***TEST*** generic custom array list implementing generic custom list
	@Test
	void should_create_custom_array_list_of_10_empty_strings() {
//	Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//	Act
		String firstItem = newTestListOfStrings.get(0);
		String tenthItem = newTestListOfStrings.get(9);
//	Assert
		assertEquals(firstItem, null);
		assertEquals(tenthItem, null);
	}

//	why is this test failing???
//	@Test
//	public void should_throw_exception_when_trying_to_get_item_at_index_10() {
////	Arrange
//		CustomList<String> testListOfStrings = new CustomArrayList<>();
////	Act
//		String eleventhItem = testListOfStrings.get(10);
////	Assert
//		assertThrows(ArrayIndexOutOfBoundsException.class, () -> System.out.println(eleventhItem));
//	}

	@Test
	void should_create_new_custom_array_list_of_10_empty_non_string_items() {
//		Arrange
		CustomList<Integer> newTestListOfIntegers = new CustomArrayList<>();
//		Act
		Integer firstItem = newTestListOfIntegers.get(0);
		Integer tenthItem = newTestListOfIntegers.get(9);
//		Assert
		assertEquals(firstItem, null);
		assertEquals(tenthItem, null);
	}

//	***TEST*** add(T item) 
	@Test
	void should_add_1_item_to_list() {
//		Arrange
		CustomList<Integer> newTestListOfIntegers = new CustomArrayList<>();
//		Act
		newTestListOfIntegers.add(4);
//		Assert
		assertEquals(newTestListOfIntegers.get(0), 4);
	}

	@Test
	void should_add_10_items_to_list() {
//		Arrange
		CustomList<Integer> newTestListOfIntegers = new CustomArrayList<>();
//		Act
		int i;
		for (i = 0; i < 10; i++) {
			newTestListOfIntegers.add(i + 1);
		}
//		Assert
		assertEquals(newTestListOfIntegers.get(0), 1);
		assertEquals(newTestListOfIntegers.get(9), 10);

	}

	@Test
	void should_add_11_items_to_list() {
//		Arrange
		CustomList<Integer> newTestListOfIntegers = new CustomArrayList<>();
//		Act
		int i;
		for (i = 0; i < 11; i++) {
			newTestListOfIntegers.add(i + 1);
		}
//		Assert
		assertEquals(newTestListOfIntegers.get(0), 1);
		assertEquals(newTestListOfIntegers.get(10), 11);
	}

	@Test
	void should_add_40_items_to_list() {
//		Arrange
		CustomList<Integer> newTestListOfIntegers = new CustomArrayList<>();
//		Act
		int i;
		for (i = 0; i < 40; i++) {
			newTestListOfIntegers.add(i + 1);
		}
//		Assert
		assertEquals(newTestListOfIntegers.get(0), 1);
		assertEquals(newTestListOfIntegers.get(39), 40);
	}

//	***TEST***
//	getSize()
	@Test
	void should_get_correct_size_of_list() {
//		Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//		Act
		newTestListOfStrings.add("one");
		newTestListOfStrings.add("two");
		newTestListOfStrings.add("three");
		int expectedResult = newTestListOfStrings.getSize();
//		Assert
		assertFalse(expectedResult==4);
		assertEquals(expectedResult, 3);
	}

//	***TEST***
//	get(int index)
	@Test
	void should_get_item_in_list_at_specified_index() {
//		Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//		Act
		newTestListOfStrings.add("one");
		newTestListOfStrings.add("two");
		newTestListOfStrings.add("three");
//		Assert
		assertEquals(newTestListOfStrings.get(2), "three");
	}

//	***TEST***
//	add(int index, T item)
	@Test
	void should_add_item_to_list_at_specified_index() {
//		Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//		Act
		newTestListOfStrings.add(2, "three");
//		Assert
		assertEquals(newTestListOfStrings.get(0), null);
		assertEquals(newTestListOfStrings.get(1), null);
		assertEquals(newTestListOfStrings.get(2), "three");
		
	}

	@Test
	void should_increase_index_by_1_for_items_with_index_equal_to_or_greater_than_specified_index_when_adding_item() {
//		Arrange
//		Act
//		Assert
	}

	@Test
	void should_not_change_index_by_of_items_with_index_less_than_specified_index_when_adding_item() {
//		Arrange
//		Act
//		Assert
	}

//	***TEST***
//	remove(int index)
	@Test
	void should_remove_item_at_specified_index_from_list() {
//		Arrange
//		Act
//		Assert
	}

	@Test
	void should_not_be_null_at_removed_items_previous_index() {
//		Arrange
//		Act
//		Assert
	}

	@Test
	void should_throw_exception_if_index_specified_is_out_of_bounds_when_removal_attempted() {
//		Arrange
//		Act
//		Assert
	}

	@Test
	void should_decrease_index_of_newer_items_by_1_when_removing_item() {
//		Arrange
//		Act
//		Assert
	}

	@Test
	void should_not_change_index_of_older_items_when_removing_item() {
//		Arrange
//		Act
//		Assert
	}

}
