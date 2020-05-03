package com.kkjavatutorials.client;

import com.kkjavatutorials.item.Item;
import com.kkjavatutorials.item.impl.Book;
import com.kkjavatutorials.item.impl.Fruit;
import com.kkjavatutorials.visitor.ShoppingCartVisitor;
import com.kkjavatutorials.visitor.ShoppingCartVisitorImpl;
/**
 * 
 * @author Kishan Kumar
 *
 */
public class VisitorTest {

	public static void main(String[] args) {

		Item items[] =  new Item[] {
				new Book("Core Java", "8989898", 450.0),
				new Book("Hibernate", "8980998", 700.0),
				new Fruit("Mango", 2, 100.0),
				new Fruit("Apple", 3, 200.0)
			};
		
		double totalCost = calculateTotalCost(items);
		
		System.out.println("Total Cost ::"+totalCost);
			
	}

	private static double calculateTotalCost(Item[] items) {
		ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
		double totalCost = 0.0;
		for (Item item : items) {
			totalCost += item.accept(shoppingCartVisitor);
		}
		return totalCost;
	}


}
