package project;

class Node{
	Node next;
	String item;
	double price;
	int time;
	int number;
	int stock;
	double or_price;
	int discount;

	Node(int number, String item, double price, int time, int stock){		//constructor for singly linked lists
		this.number = number;
		next = null;
		this.item = item;
		this.price = price;
		this.time = time;
		this.stock = stock;
	}
	
	//constructor for special deals singly linked list
	Node(int number, String item, double or_price,double price,int discount, int time, int stock)
	{
	        	this.number = number;
	        	next = null;
	        	this.item = item;
	        	this.time = time;
	        	this.stock = stock;
	        	this.or_price=or_price;
	        	this.price=price;
	        	this.discount=discount;
	}

}

