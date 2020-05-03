package com.kkjavatutorials.visitor;

import com.kkjavatutorials.item.impl.Book;
import com.kkjavatutorials.item.impl.Fruit;
/**
 * @author KK JavaTutorials
 *Overloaded visit method for different Items
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public double visit(Book book) {
		double cost = 0.0;
		if(book.getPrice() > 500) {
			cost = book.getPrice()-100;
		}else {
			cost = book.getPrice();
		}
		System.out.println(" BooK:"+book.getName() +", Book ISBN:"+book.getIsbnNumber()+", Cost :"+cost);
		return cost;
	}

	@Override
	public double visit(Fruit fruit) {
		double cost = fruit.getPricePerKg()*fruit.getWeight();
		System.out.println("Fruit :"+fruit.getName()  + ", cost :"+cost);
		return cost;
	}

}
