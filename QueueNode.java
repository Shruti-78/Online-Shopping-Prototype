package project;
import java.util.*;
class QueueNode {
	public QueueNode next;
	public String customer_name;
	public String city;
	public String phone_number;
	public int age;
	public String login_as;
	public String password;
	Stack<Node> stk;
	public double total;
	public double totalptax;
	public double total_after_offer;
	public double total_reduced ;
	
	//contructor for storing customer details and cart in queue node
	QueueNode(String cust_name, String login, int age, String city, String phone, String pass, Stack<Node> stk){
	next = null;
	customer_name = cust_name;
	login_as = login;
	password = pass;
	this.age = age;
	this.city = city;
	total = 0;
	totalptax = 0;
	total_reduced = 0;
	total_after_offer = 0 ;
	phone_number = phone;
	this.stk = stk;
	}
}
