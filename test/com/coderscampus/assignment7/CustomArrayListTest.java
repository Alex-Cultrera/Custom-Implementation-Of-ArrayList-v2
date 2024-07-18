package com.coderscampus.assignment7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
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
		int i;
//	Assert
		for (i = 0; i < 10; i++) {
			assertEquals(newTestListOfStrings.get(i), null);
		}
	}

	@Test
	void should_create_new_custom_array_list_of_10_empty_non_string_items() {
//		Arrange
		CustomList<Integer> newTestListOfIntegers = new CustomArrayList<>();
//		Act
		int i;
//		Assert
		for (i = 0; i < 10; i++) {
			assertEquals(newTestListOfIntegers.get(i), null);
		}
	}

	@Test
	public void should_throw_exception_when_trying_to_get_item_at_index_10() {
//	Arrange
		CustomList<String> testListOfStrings = new CustomArrayList<>();
//	Act
		
//	Assert
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> testListOfStrings.get(10));
	}

//	***TEST*** add(T item) 
	@Test
	void should_add_1_item_to_list() {
//		Arrange
		CustomList<Integer> newTestListOfIntegers = new CustomArrayList<>();
//		Act
		newTestListOfIntegers.add(4);
		int i;
//		Assert
		assertEquals(newTestListOfIntegers.get(0), 4);
		for (i = 1; i < 10; i++) {
			assertEquals(newTestListOfIntegers.get(i), null);
		}
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
		for (i = 0; i < 10; i++) {
			assertEquals(newTestListOfIntegers.get(i), i + 1);
		}

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
		for (i = 0; i < 11; i++) {
			assertEquals(newTestListOfIntegers.get(i), i + 1);
		}
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
		for (i = 0; i < 40; i++) {
			assertEquals(newTestListOfIntegers.get(i), i + 1);
		}
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
		assertFalse(expectedResult != 3);
		assertEquals(expectedResult, 3);
	}

//	***TEST***
//	get(int index)
	@Test
	void should_get_item_in_list_at_specified_index() {
//		Arrange
		CustomList<Integer> newTestListOfIntegers = new CustomArrayList<>();
//		Act
		int i;
		for (i = 0; i < 14; i++) {
			newTestListOfIntegers.add(i + 1);
		}
//		Assert
		for (i = 0; i < 14; i++) {
			assertEquals(newTestListOfIntegers.get(i), i + 1);
		}
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
	void should_move_sequential_non_null_items_starting_at_index_back_one_and_add_item_at_specified_index() {
//		Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//		Act
		newTestListOfStrings.add(0, "originally index zero");
		newTestListOfStrings.add(6, "originally index six");
		newTestListOfStrings.add(7, "originally index seven");
		newTestListOfStrings.add(8, "originally index eight");
		newTestListOfStrings.add(9, "originally index nine");
		newTestListOfStrings.add(6, "new index six");
//		Assert
		assertEquals(newTestListOfStrings.get(6), "new index six");
		assertEquals(newTestListOfStrings.get(7), "originally index six");
		assertEquals(newTestListOfStrings.get(10), "originally index nine");
	}

	@Test
	void should_not_move_items_with_index_less_than_specified_index_when_adding_item() {
//		Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//		Act
		newTestListOfStrings.add(0, "originally index zero");
		newTestListOfStrings.add(6, "originally index six");
		newTestListOfStrings.add(7, "originally index seven");
		newTestListOfStrings.add(8, "originally index eight");
		newTestListOfStrings.add("originally index one");
		newTestListOfStrings.add("originally index two");
		newTestListOfStrings.add(9, "originally index nine");
		newTestListOfStrings.add(2, "new index two");
		newTestListOfStrings.add(6, "new index six");
//		Assert
		assertEquals(newTestListOfStrings.get(10), "originally index nine");
		assertEquals(newTestListOfStrings.get(9), "originally index eight");
		assertEquals(newTestListOfStrings.get(8), "originally index seven");
		assertEquals(newTestListOfStrings.get(7), "originally index six");
		assertEquals(newTestListOfStrings.get(6), "new index six");
		assertEquals(newTestListOfStrings.get(5), null);
		assertEquals(newTestListOfStrings.get(4), null);
		assertEquals(newTestListOfStrings.get(3), "originally index two");
		assertEquals(newTestListOfStrings.get(2), "new index two");
		assertEquals(newTestListOfStrings.get(1), "originally index one");
		assertEquals(newTestListOfStrings.get(0), "originally index zero");
	}

//	***TEST***
//	remove(int index)
	@Test
	void should_remove_item_at_specified_index_and_reduce_index_by_one_for_items_with_index_higher_than_specified_index() {
//		Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//		Act
		newTestListOfStrings.add(0, "originally index zero");
		newTestListOfStrings.add(6, "originally index six");
		newTestListOfStrings.add(7, "originally index seven");
		newTestListOfStrings.add(8, "originally index eight");
		newTestListOfStrings.add(9, "originally index nine");
		newTestListOfStrings.remove(7);
//		Assert
		assertEquals(newTestListOfStrings.get(0), "originally index zero");
		assertEquals(newTestListOfStrings.get(6), "originally index six");
		assertEquals(newTestListOfStrings.get(7), "originally index eight");
		assertEquals(newTestListOfStrings.get(8), "originally index nine");
		assertEquals(newTestListOfStrings.get(9), null);
	}

	@Test
	void should_throw_exception_if_index_specified_is_out_of_bounds_when_removal_attempted() {
//		Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//		Act
		newTestListOfStrings.add(0, "originally index zero");
//		Assert
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> newTestListOfStrings.remove(10));
	}

}
