package com.coderscampus.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus.arraylist.CustomList;

class CustomArrayListTest {

//	***TEST***
//	generic custom array list implementing generic custom list
	@Test
	void should_create_new_custom_array_list_of_strings() {
//		Arrange
		CustomList<String> newTestListOfStrings = new CustomArrayList<>();
//	Act
//	Assert
	}

	@Test
	void should_create_new_custom_array_list_of_non_strings() {
//		Arrange
//		Act
//		Assert
	}

//	***TEST***
//	add(T item) 
	@Test
	void should_add_1_item_to_list() {
//		Arrange
//		Act
//		Assert
	}
	
	@Test
	void should_add_10_items_to_list() {
//		Arrange
//		Act
//		Assert
	}
	
	@Test
	void should_add_40_items_to_list() {
//		Arrange
//		Act
//		Assert
	}
	
	@Test
	void should_double_backing_array_size_when_adding_item_and_backing_array_is_full() {
//		Arrange
//		Act
//		Assert
	}
	
//	***TEST***
//	getSize()
	@Test
	void should_get_correct_size_of_list() {
//		Arrange
//		Act
//		Assert
	}
	
//	***TEST***
//	get(int index)
	@Test
	void should_get_item_in_list_at_specified_index() {
//		Arrange
//		Act
//		Assert
	}
	
//	***TEST***
//	add(int index, T item)
	@Test
	void should_add_item_to_list_at_specified_index() {
//		Arrange
//		Act
//		Assert
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
