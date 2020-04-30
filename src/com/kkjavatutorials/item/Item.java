package com.kkjavatutorials.item;

import com.kkjavatutorials.visitor.ShoppingCartVisitor;

public interface Item {
	public double accept(ShoppingCartVisitor visitor);
}
