package project;
import java.util.*;

class MyApp {
	static int flag1 = 0 ;
	void pay(QueueNode q) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		User u = new User();
		u.final_invoice(q);

		System.out.println("\n\n\t\t*****WELCOME TO PAYMENT PORTAL*****");
		while(flag1 == 0) {													//accepting delivery address for delivery
			System.out.println("Please enter delivery address : ");
			String addr = sc1.nextLine();
																			//printing all available options of payment of items
			System.out.print("Available options are: \n1.Cash on Delivery\n2.Debit card/Credit Card/ATM card\n");
			System.out.print("3.EMI\n4.UPI\n 0.Back\n");
			System.out.print("Enter your payment option: ");
			int payment = sc.nextInt();
			switch(payment) {					//back option
			case 0:
				break;

			case 1 : {
				u.cod(q);						//cash on delivery option
				break;
			}
			case 2 : {
				u.card_pay();				//card payment
				break;
			}
			case 3 : {
				u.emi_pay(q);			//emi payment
				break;
			}
			case 4 : {
				u.upi_payment();			//upi payment
				break;

			}

			default:
				System.out.println("Invalid input");		//invalid input
				break;
			}
			flag1 = 1;
		}
		
		if(flag1 == 1) {					//payment can be done only once, hence if user tries to pay again it displays payment done already
			System.out.println("Payment done!");
		}
	}

}

class Discounts_and_offers
{

	static int flag = 0;
	double offer1(QueueNode q) {								//offer1 gives 10% discount over total price to be paid
		q.total_after_offer = q.totalptax - (0.1*q.totalptax);
		System.out.println("Amount to pay -> Rs."+q.total_after_offer +"/-");			//print final price to be paid
		flag = 1;
		return q.total_after_offer;

	}

	double offer2(QueueNode q) {
		double discount=0.25*q.totalptax;							//offers 25% discount upto Rs.500
		if(discount<=500) {											//if discount less than 500 then subtract discount from total price
			q.total_after_offer = q.totalptax - discount;
			System.out.println("Amount to pay -> Rs."+q.total_after_offer +"/-");

		}

		else if(discount>500){										//else subtract Rs.500 from total price
			q.total_after_offer = q.totalptax - 500;
			System.out.println("Amount to pay -> Rs."+q.total_after_offer +"/-");

		}
		flag = 1;
		return q.total_after_offer;

	}
	double offer3(QueueNode q)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter coupon : ");
		String coupon= sc1.nextLine();
		if(coupon.equals("WWXC1234"))
		{
			if(q.totalptax>699) {								//coupon for total price above Rs.699
				q.total_after_offer = q.totalptax - 119;				//saving upto Rs.119
				flag =1;
				return q.total_after_offer;

			}
			else {
				double remainder=699-q.totalptax;					//calculating how much amount is less for coupon to be valid
				System.out.println("Add more items of price "+remainder+" or more to apply this coupon. ");
				return q.totalptax;
			}

		}
		else if(coupon.equals("RTWA1578"))
		{
			if(q.totalptax>1299) {										//coupon for total price above Rs. 1299
				q.total_after_offer = q.totalptax - 249;					//saving upto Rs.249
				System.out.println("Amount to pay -> Rs."+q.total_after_offer +"/-");
				flag =1;
				return q.total_after_offer;
			}
			else{
				double remainder=1299-q.totalptax;						//calculating how much amount is less for coupon to be valid
				System.out.println("Add more items of price "+remainder+" or more to apply this coupon. ");
				return q.totalptax;
			}
		}
		else if(coupon.equals("ONRS8563"))
		{
			if(q.totalptax>2999) {									//coupon for total price above Rs.2999
				q.total_after_offer = q.totalptax - 685;				//saving upto Rs.685
				System.out.println("Amount to pay -> Rs."+q.total_after_offer +"/-");
				flag =1;
				return q.total_after_offer;
			}
			else{
				double remainder=2999-q.totalptax;				//else calculating how much amount is less for coupon to be valid
				System.out.println("Add more items of price "+remainder+" or more to apply this coupon. ");
				return q.totalptax;
			}
		}
		else {System.out.println("Coupon invalid");						//else coupon not available
		return q.totalptax;}

	}
	double coupons( QueueNode q) {
		Discounts_and_offers dno=new Discounts_and_offers();
		int ch=0;
		Scanner sc=new Scanner(System.in);
		
		//printing coupons available
		System.out.println("Apply discounts and offers :");
		System.out.println("1.Deal of the day : Flat 10% off ");
		System.out.println("2.25% off upto Rs.500 ");
		System.out.println("3.coupon codes: [WWXC1234]-> save Rs.119 for shopping more than Rs.699 \n\t [RTWA1578]-> save Rs.249 for shopping more than Rs.1299 \n\t [ONRS8563]-> save Rs.685 for shopping more than Rs.2999");
		System.out.println("Select the offer :");
		ch = sc.nextInt();
		switch(ch) {
		case 1:
			dno.offer1(q);
			break;
		case 2:
			dno.offer2(q);
			break;
		case 3:
			dno.offer3(q);
			break;	
		}
		if(flag ==1) {
			return q.total_after_offer;
		}
		else {
			return q.totalptax;
		}
	}

}

class Electronics extends MyApp{
	SinglyLinkedList mobile = new SinglyLinkedList();
	SinglyLinkedList laptop = new SinglyLinkedList();
	SinglyLinkedList earphone = new SinglyLinkedList();
	SinglyLinkedList swatch = new SinglyLinkedList();	

	void display_mob(Node head1) {
		mobile.display(head1);					//displaying mobile linked list

	}
	void display_laptops(Node head2) {
		laptop.display(head2);					//displaying laptop linked list

	}
	void display_earph(Node head3) {
		earphone.display(head3);				//displaying earphone linked list
	}

	void display_sw(Node head4) {
		swatch.display(head4);					//displaying smart watch linked list
	}
}

class HomeNKitchen{
	SinglyLinkedList Home_appliances =new SinglyLinkedList();
	SinglyLinkedList Furniture =new SinglyLinkedList();
	SinglyLinkedList Cookware_dining =new SinglyLinkedList();
	SinglyLinkedList Decor =new SinglyLinkedList();

	void dis_ha(Node h_ha) 
	{
		Home_appliances.display(h_ha);			//displaying home appliances linked list
	}

	void dis_f(Node h_f) 
	{
		Furniture.display(h_f);					//displaying furniture linked list
	}

	void dis_cd(Node h_cd) 
	{
		Cookware_dining.display(h_cd);				//displaying cookware and dining linked list
	}

	void dis_d(Node h_d) 
	{
		Decor.display(h_d);					//displaying decor linked list
	}
}

class Fashion{
	SinglyLinkedList Women_clothing =new SinglyLinkedList();
	SinglyLinkedList Men_clothing =new SinglyLinkedList();
	SinglyLinkedList Kids_clothing =new SinglyLinkedList();
	SinglyLinkedList Footwear =new SinglyLinkedList();
	SinglyLinkedList Bags =new SinglyLinkedList();


	void disp_wc(Node head_wc) 
	{
		Women_clothing.display(head_wc);		//displaying women clothing linked list
	}

	void disp_mc(Node head_mc) 
	{
		Men_clothing.display(head_mc);				//displaying men clothing linked list
	}

	void disp_kc(Node head_kc) 
	{
		Kids_clothing.display(head_kc);				//displaying kids clothing linked list
	}
	void disp_f(Node head_f) 
	{
		Footwear.display(head_f);						//displaying footwear linked list
	}

	void disp_b(Node head_b) 
	{
		Bags.display(head_b);						//displaying bags linked list
	}
}

class Deals extends MyApp{
	SinglyLinkedList Discounted_Deals =new SinglyLinkedList();
	Node head=null;

	void Discounted_Deals () 												//linked list of special deals
	{
		Node d1=new Node(1, " OnePlus 10 Pro 5G ", 66999 ,61999 ,7, 3,10);
		head =d1;
		Discounted_Deals.insert(d1);
		Node d2=new Node(2,"Apple iphone 14",79900,78740,1,5,12);
		Discounted_Deals.insert(d2);
		Node d3=new Node(3,"Dell 2in1 Inspiron 7420 ",74716,49990,33,7,3);
		Discounted_Deals.insert(d3);
		Node d4=new Node(4,"Air Conditioner",75990,45990,39,5,1);
		Discounted_Deals.insert(d4);
		Node d5=new Node(5,"Office Chair",18890,9090,52,5,7);
		Discounted_Deals.insert(d5);
		Node d6=new Node(6,"Thermos",1290,1008,22 ,2,4);
		Discounted_Deals.insert(d6);
		Node d7=new Node(7,"Artificial Plants",799,499,38,3,12);
		Discounted_Deals.insert(d7);
		Node d8=new Node(8,"Tie Dye Crop Top ",1199, 319,73,1,2);
		Discounted_Deals.insert(d8);
		Node d9=new Node(9,"Knee Length Jumpsuit ",2799,1390,50,7,4);
		Discounted_Deals.insert(d9);
		Node d10=new Node(10,"Men’s Bomber Jacket",2399,949,60,5,5);
		Discounted_Deals.insert(d10);
		Node d11=new Node(11,"Men’s Denim Shorts ",1999,659,67,5,2);
		Discounted_Deals.insert(d11);
		Node d12=new Node(12,"Unisex Crocs ",3495,2310,34,6,4);
		Discounted_Deals.insert(d12);
		Node d13=new Node(13,"Stiletto Heels ",1699,599,65,3,5);
		Discounted_Deals.insert(d13);
		Node d14=new Node(14,"Cross Body Bag ",1399,899,36,5,2);
		Discounted_Deals.insert(d14);
		Node d15=new Node(15,"Waist Bag",1399,999,29,1,5);
		Discounted_Deals.insert(d15);

	}
	void dis_d() 
	{
		Discounted_Deals.display_discountedDeals(head);						//display discounted deals linked list
	}
}
