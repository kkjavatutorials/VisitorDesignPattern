package com.kkjavatutorials.visitor;

import com.kkjavatutorials.item.impl.Book;
import com.kkjavatutorials.item.impl.Fruit;

public interface ShoppingCartVisitor {

	public double visit(Book book);
	public double visit(Fruit fruit);
}
