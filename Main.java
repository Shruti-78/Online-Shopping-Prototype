package project;

import java.util.*;

public class Main {
	static Node head_mobile;
	static SinglyLinkedList mobile = new SinglyLinkedList();
	static Node head_laptop ;
	static SinglyLinkedList laptop = new SinglyLinkedList();
	static Node head_earphones;
	static SinglyLinkedList earphones = new SinglyLinkedList();
	static Node head_swatches;
	static SinglyLinkedList swatch = new SinglyLinkedList();

	static Node head_app;
	static SinglyLinkedList Home_appliances =new SinglyLinkedList();
	static Node head_furn;
	static SinglyLinkedList Furniture =new SinglyLinkedList();
	static Node head_cook;
	static SinglyLinkedList Cookware_dining =new SinglyLinkedList();
	static Node head_decor;
	static SinglyLinkedList Decor =new SinglyLinkedList();

	static Node head_wc=null;
	static SinglyLinkedList Women_clothing =new SinglyLinkedList();
	static Node head_mc=null;
	static SinglyLinkedList Men_clothing =new SinglyLinkedList();
	static Node head_kc=null;
	static SinglyLinkedList Kids_clothing =new SinglyLinkedList();
	static Node head_f=null;
	static SinglyLinkedList Footwear =new SinglyLinkedList();
	static Node head_b=null;
	static SinglyLinkedList Bags =new SinglyLinkedList();

	public static void execute(QueueNode q_node) {
		int choice = 0;
		User user = new User();
		MyApp m = new MyApp();
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		do {
			
			//displaying menu
			System.out.println("\t\t\t\t\t\t\t\t***WELCOME TO 'MyApp'***\n");
			System.out.print("\t\t1.ELECTRONICS\t\t\t2.HOME N' KITCHEN\t\t\t3.FASHION\t\t\t4.SPECIAL DEALS\n");
			System.out.print("\t\t5.CART\t\t\t	6.VIEW INVOICE\t\t\t	7.PAY BILL\t\t\t 0. LOGOUT <-\n");
			choice = input.nextInt();
			System.out.println();

			switch(choice) {
			case 0: //logout
				System.out.println("YOU JUST LOGGED OUT!");
				break;

			case 1 :
				//electronics
				Electronics ele = new Electronics();
				int elec = 1;
				while(elec != 0) {
					System.out.print("\t\t\t\t\t\tELECTRONICS:\n\t\t\t\t\t\t1. Mobiles\n\t\t\t\t\t\t2. Laptops\n\t\t\t\t\t\t3. Earphones  \n");
					System.out.print("\t\t\t\t\t\t4. Smart Watches \n\t\t\t\t\t\t0. Back <-");
					System.out.println();
					elec = input.nextInt();				//accepting input for sub-category
					switch(elec) {
					case 0:
						break;

					case 1:
						int add = 1;
						ele.display_mob(head_mobile);			//display linked list of mobile
						while( add != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int mobile = input2.nextInt();					//accepting input for which mobile you want

							if(mobile != 0) {
								Node temp = head_mobile;					//traverse until you find mobile with that product number
								while(temp != null && temp.number != mobile) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");			//else item not found
								}
								else {
									if(temp.stock <= 0) {						//if stock is 0, stock is finished,item cannot be sold
										System.out.println("OUT OF STOCK!!");
									}
									else {
										temp.stock--;								//decrement stock
										q_node.stk.push(temp);					//push item on stack of customer
										user.flg = 0;
										user.done = 0;
										m.flag1 = 0;
										System.out.println("Item added to cart.");
										System.out.println();
									}
								}
							}
							System.out.print("Do you want to add any more items? (0/1): ");
							add = input.nextInt();
							System.out.println();									//take input if more items need to be added
							if(add != 0 && add != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 2: 
						int add1 = 1;
						ele.display_laptops(head_laptop);					//display laptop linked list
						while( add1 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int laptop = input2.nextInt();							//accepting which laptop to be bought

							if(laptop != 0) {
								Node temp = head_laptop;						//traverse until you find laptop with that product number 
								while(temp != null && temp.number != laptop) {
									temp = temp.next;
								}
								if(temp == null) {								//else item not found
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;							//decrement stock
									q_node.stk.push(temp);				//push item onto the stack of customer
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add1 = input.nextInt();
							System.out.println();							//accept input whether to add more items
							if(add1 != 0 && add1 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 3 : 
						//earphone
						int add2 = 1 ;
						ele.display_earph(head_earphones);
						while(add2 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int earphone = input2.nextInt();
							if(earphone != 0) {
								Node temp = head_earphones;
								while(temp != null && temp.number != earphone) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add2 = input.nextInt();
							System.out.println();
							if(add2 != 0 && add2 != 1) {
								System.out.println("Invalid input!");
							}

						}
						break;
					case 4 : 
						// smart watches
						int add3 = 1 ;
						ele.display_sw(head_swatches);
						while(add3 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int swatch = input2.nextInt();
							if(swatch != 0) {
								Node temp = head_swatches;
								while(temp != null && temp.number != swatch) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add3 = input.nextInt();
							System.out.println();
							if(add3 != 0 && add3 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					default:
						System.out.println("Invalid input!");
						break;
					}
				}
				break;

			case 2 :
				//home and kitchen
				HomeNKitchen home = new HomeNKitchen();
				int hom = 1;
				while(hom != 0) {
					System.out.println("\t\t\t\t\t\tHOME N' KITCHEN:\n\t\t\t\t\t\t1. Home appliances\n\t\t\t\t\t\t2. Furniture");
					System.out.println("\t\t\t\t\t\t3. Cookware and dining\n\t\t\t\t\t\t4. Decor\n\t\t\t\t\t\t0. Back <-");
					hom = input.nextInt();
					switch(hom) {
					case 0:
						break;

					case 1: 
						int add = 1;
						home.dis_ha(head_app);
						while( add != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int appliances = input2.nextInt();

							if(appliances != 0) {
								Node temp = head_app;
								while(temp != null && temp.number != appliances) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add = input.nextInt();
							System.out.println();
							if(add != 0 && add != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 2:
						int add1 = 1;
						home.dis_f(head_furn);
						while( add1 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int furniture = input2.nextInt();

							if(furniture != 0) {
								Node temp = head_furn;
								while(temp != null && temp.number != furniture) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add1 = input.nextInt();System.out.println();
							if(add1 != 0 && add1 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 3:
						int add3 = 1;
						home.dis_cd(head_cook);
						while( add3 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int cookware = input2.nextInt();

							if(cookware != 0) {
								Node temp = head_cook;
								while(temp != null && temp.number != cookware) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add3 = input.nextInt();
							System.out.println();
							if(add3 != 0 && add3 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 4:
						int add4 = 1;
						home.dis_d(head_decor);
						while( add4 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int decor = input2.nextInt();

							if(decor != 0) {
								Node temp = head_decor;
								while(temp != null && temp.number != decor) {
									temp = temp.next;
								}if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add4 = input.nextInt();
							System.out.println();
							if(add4 != 0 && add4 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					default:
						System.out.println("Invalid input!");
						break;
					}
				}
				break;

			case 3 :
				//fashion
				Fashion fash= new Fashion();
				int fashion = 1;
				while(fashion != 0) {
					System.out.println("\t\t\t\t\t\tFASHION:");
					System.out.print("\t\t\t\t\t\t1.Women clothing\n\t\t\t\t\t\t2.Men clothing\n\t\t\t\t\t\t3.Kids clothing"
							+ "\n\t\t\t\t\t\t4.Footwear\n\t\t\t\t\t\t5.Bags\n\t\t\t\t\t\t0.Back <-");

					fashion = input.nextInt();
					switch(fashion) {
					case 0:
						break;

					case 1:
						int add1 = 1;
						fash.disp_wc(head_wc);
						while( add1 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int women = input3.nextInt();

							if(women != 0) {
								Node temp = head_wc;
								while(temp != null && temp.number != women) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add1 = input.nextInt();
							System.out.println();
							if(add1 != 0 && add1 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 2:
						int add2 = 1;
						fash.disp_mc(head_mc);
						while( add2 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int men = input2.nextInt();

							if(men != 0) {
								Node temp = head_mc;
								while(temp != null && temp.number != men) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add2 = input.nextInt();
							System.out.println();
							if(add2 != 0 && add2 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 3:
						int add3 = 1;
						fash.disp_kc(head_kc);
						while( add3 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int kid = input2.nextInt();

							if(kid != 0) {
								Node temp = head_kc;
								while(temp != null && temp.number != kid) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add3 = input.nextInt();
							System.out.println();
							if(add3 != 0 && add3 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 4:
						int add4 = 1;

						fash.disp_f(head_f);
						while( add4 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int foot = input2.nextInt();

							if(foot != 0) {
								Node temp = head_f;
								while(temp != null && temp.number != foot) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add4 = input.nextInt();
							System.out.println();
							if(add4 != 0 && add4 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 5:
						int add5 = 1;
						fash.disp_b(head_b);
						while( add5 != 0) {
							System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
							int bags = input2.nextInt();

							if(bags != 0) {
								Node temp = head_b;
								while(temp != null && temp.number != bags) {
									temp = temp.next;
								}
								if(temp == null) {
									System.out.println("Item not found! \n");
								}
								else {
									temp.stock--;
									q_node.stk.push(temp);
									user.flg = 0;
									user.done = 0;
									m.flag1 = 0;
									System.out.println("Item added to cart.");
									System.out.println();
								}
							}
							System.out.print("Do you want to add more items? (0/1): ");
							add5 = input.nextInt();
							System.out.println();
							if(add5 != 0 && add5 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					}
				}
				break;

			case 4://special deals
				int add = 1;
				Deals deal = new Deals();

				deal.Discounted_Deals();
				deal.dis_d();
				while( add != 0) {
					System.out.print("Which item would you like to buy? (Press 0 if you don't like any item) : ");
					int deals = input2.nextInt();

					if(deals != 0) {
						Node temp = deal.Discounted_Deals.head;
						while(temp != null && temp.number != deals) {
							temp = temp.next;
						}
						if(temp == null) {
							System.out.println("Item not found! \n");
						}
						else {
							temp.stock--;
							q_node.stk.push(temp);
							user.flg = 0;
							user.done = 0;
							m.flag1 = 0;
							System.out.println("Item added to cart.");
							System.out.println();
						}
					}
					System.out.print("Do you want to add more items? (0/1): ");
					add = input.nextInt();
					System.out.println();
					if(add != 0 && add != 1) {
						System.out.println("Invalid input!");
					}
				}
				break;

			case 5://cart
				int cart = 1;

				do {
					System.out.println("1.Remove an item\n2.Clear cart\n3.Display cart\n 0.Back");
					cart = input3.nextInt();
					switch(cart) {
					case 0:
						break;

					case 1:
						Node temp2 = q_node.stk.pop();
						temp2.stock++;
						user.flg = 0;
						user.done = 0;
						m.flag1 = 0;
						user.displayCart(q_node.stk);
						q_node.total = 0;
						q_node.totalptax = 0;
						q_node.total_after_offer=0;
						q_node.total_reduced =0;
						break;

					case 2:
						while(!q_node.stk.empty()) {
							Node t = q_node.stk.pop();
							t.stock++;
						}
						user.flg = 0;
						user.done = 0;
						m.flag1 = 0;
						System.out.println(" Cart Cleared");
						q_node.total = 0;
						q_node.totalptax = 0;
						q_node.total_after_offer=0;
						q_node.total_reduced =0;

						break;

					case 3:
						user.displayCart(q_node.stk);
						break;

					default:
						System.out.println("Invalid input!");
						break;
					}
				}while( cart != 0);
				break;

			case 6://view invoice
				user.displayInvoice( q_node);
				break;

			case 7: //bill payment
				MyApp my_app = new MyApp();
				my_app.pay(q_node);
				user.done = 1;
				break;

			default: 
				System.out.println("Invalid input!");
				break;

			}
		}while(choice != 0);
	}

	static void creation() {
		Node m1,m2,m3,m4,m5;
		Node l1,l2,l3,l4,l5;
		m1 = new Node(1, " Realme GT Master Edition  ", 29000, 8 ,10);
		mobile.insert(m1);
		head_mobile = m1;
		m2 = new Node (2, " One Plus Nord 2 ", 35000 , 10,10);
		mobile.insert(m2);
		m3 = new Node (3, " Samsung Galaxy S10 ", 54000 , 12,10);
		mobile.insert(m3);
		m4 = new Node(4, " Xiaomi 11T Pro 5G Hyperphone", 37999,5,10);
		mobile.insert(m4);
		m5 = new Node (5," iPhone 14 Pro Max ", 149900, 7,10);
		mobile.insert(m5);

		l1 = new Node (1," HP Pavillion ", 70000,10,10);
		laptop.insert(l1);
		head_laptop = l1;
		l2 = new Node( 2," Dell Inspiron 14",91000,8,10);
		laptop.insert(l2);
		l3 = new Node ( 3," Acer Aspire 5 ",62990,5,10);
		laptop.insert(l3);
		l4 = new Node (4," Apple Mac Book Air (M2 chip)" , 139390,15,10);
		laptop.insert(l4);
		l5 = new Node(5," Lenovo IdeaPad Slim3",53990,6,10);
		laptop.insert(l5);

		Node e1 = new Node(1, " OPPO Enco Buds ",1799,3,10);
		earphones.insert(e1);
		head_earphones = e1;
		Node e2 = new Node(2, " boAt Airdopes Atom 81",1499,2,10);
		earphones.insert(e2);
		Node e3 = new Node(3, " boAt Rockerz Bluetooth NeckBand ",999,3,10);
		earphones.insert(e3);
		Node e4 = new Node (4, " Bose QuietComfort 45 BT Headphones ",29990,5,10);
		earphones.insert(e4);
		Node e5 = new Node (5, " JBL C100SI Wired Earphones",1099,2,10);
		earphones.insert(e5);

		Node sw1 = new Node(1, " Noise Pulse Go Buzz",2199,1,10);
		swatch.insert(sw1);
		head_swatches = sw1;
		Node sw2 = new Node(2, " boAt Wave Call Smart Watch ",1999,2,10);
		swatch.insert(sw2);
		Node sw3 = new Node(3, " Fire Boltt Phoenix Smart Watch",2099,3,10);
		swatch.insert(sw3);
		Node sw4 = new Node(4, " Noise ColorFit Pulse ",1199,2,10);
		swatch.insert(sw4);
		Node sw5 = new Node (5, " Mi Watch Revolve", 4500,5,10);
		swatch.insert(sw5);

		Node ha1=new Node(1,"Washing Machine",40000,6,15);
		head_app =ha1;
		Home_appliances.insert(ha1);
		Node ha2=new Node(2,"Geyser",30000,4,15);
		Home_appliances.insert(ha2);
		Node ha3=new Node(3,"Microwave Oven",25000,5,10);
		Home_appliances.insert(ha3);
		Node ha4=new Node(4,"Television",55000,5,10);
		Home_appliances.insert(ha4);
		Node ha5=new Node(5,"Ceiling fan",12000,5,16);
		Home_appliances.insert(ha5);

		Node fu1=new Node(1,"Dining Table 4 Seater",20000,6,8);
		head_furn =fu1;
		Furniture.insert(fu1);
		Node fu2=new Node(2,"L Shape Sofa Set",40000,4,2);
		Furniture.insert(fu2);
		Node fu3=new Node(3,"3 Piece Drawer",6000,5,3);
		Furniture.insert(fu3);
		Node fu4=new Node(4,"Side Table",8000,5,3);
		Furniture.insert(fu4);
		Node fu5=new Node(5,"Study Table",6000,5,8);
		Furniture.insert(fu5);

		Node cd1=new Node(1,"White Dining Set",4000,6,9);
		head_cook=cd1;
		Cookware_dining.insert(cd1);
		Node cd2=new Node(2,"Bronze Jug",400,4,5);
		Cookware_dining.insert(cd2);
		Node cd3=new Node(3,"Tupperware 6 Bottle Set",300,5,11);
		Cookware_dining.insert(cd3);
		Node cd4=new Node(4,"Refrigeratorware",500,5,5);
		Cookware_dining.insert(cd4);
		Node cd5=new Node(5,"Air Fryer",13000,5,4);
		Cookware_dining.insert(cd5);

		Node d1=new Node(1,"Photo Frames",400,6,7);
		head_decor=d1;
		Decor.insert(d1);
		Node d2=new Node(2,"Showpieces",1600,4,8);
		Decor.insert(d2);
		Node d3=new Node(3,"Curtains",3000,5,6);
		Decor.insert(d3);
		Node d4=new Node(4,"Smart Lights",1500,5,6);
		Decor.insert(d4);
		Node d5=new Node(5,"Clocks",2000,5,8);
		Decor.insert(d5);

		Node wc1=new Node(1,"Black Tshirt",600,6,15);
		head_wc=wc1;
		Women_clothing.insert(wc1);
		Node wc2=new Node(2,"Orange oversized Tshirt ",800,4,13);
		Women_clothing.insert(wc2);
		Node wc3=new Node(3,"Formal white shirt",1000,5,14);
		Women_clothing.insert(wc3);
		Node wc4=new Node(4,"Crop black denim jacket",1400,5,10);
		Women_clothing.insert(wc4);
		Node wc5=new Node(5,"Blue high rise jeans",1800,5,7);
		Women_clothing.insert(wc5);

		Node mc1=new Node(1,"Grey formal pants",2000,6,14);
		head_mc=mc1;
		Men_clothing.insert(mc1);
		Node mc2=new Node(2,"White crisp shirt",1200,4,10);
		Men_clothing.insert(mc2);
		Node mc3=new Node(3,"Collar neck blue tshirt",900,5,12);
		Men_clothing.insert(mc3);
		Node mc4=new Node(4,"Navy blue jeans",1900,5,9);
		Men_clothing.insert(mc4);
		Node mc5=new Node(5,"Orange sweatshirt",1200,5,8);
		Men_clothing.insert(mc5);

		Node kc1=new Node(1,"Unisex Denim dungaree",3000,6,8);
		head_kc=kc1;
		Kids_clothing.insert(kc1);
		Node kc2=new Node(2,"White bear onesie",1500,4,13);
		Kids_clothing.insert(kc2);
		Node kc3=new Node(3,"Marvel tshirt set of 3",1800,5,7);
		Kids_clothing.insert(kc3);
		Node kc4=new Node(4,"Girls yellow frock",900,5,14);
		Kids_clothing.insert(kc4);
		Node kc5=new Node(5,"Boys suspender pants",1200,5,10);
		Kids_clothing.insert(kc5);

		Node f1=new Node(1,"Men formal black shoes",5000,6,16);
		head_f=f1;
		Footwear.insert(f1);
		Node f2=new Node(2,"White sneakers ",2000,4,14);
		Footwear.insert(f2);
		Node f3=new Node(3,"Ankle length boots women",3000,5,10);
		Footwear.insert(f3);
		Node f4=new Node(4,"Sports sandals",1200,5,9);
		Footwear.insert(f4);
		Node f5=new Node(5,"Bathroom chappals",400,5,13);
		Footwear.insert(f5);

		Node b1=new Node(1,"Laptop bag",2000,6,15);
		head_b=b1;
		Bags.insert(b1);
		Node b2=new Node(2,"Tote bag",1000,4,12);
		Bags.insert(b2);
		Node b3=new Node(3,"Sling bag",1200,5,11);
		Bags.insert(b3);
		Node b4=new Node(4,"Brown mens wallet",1100,5,14);
		Bags.insert(b4);
		Node b5=new Node(5,"Hand purse",900,5,10);
		Bags.insert(b5);

	}
	public static void main(String[] args) {
		int login = 0;
		String username;
		String password = null;
		String password_admin = null;
		Queue q = new Queue();
		creation();

		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);
		System.out.println("\n\n\t\t\t\t\t\t\t\t***** WELCOME TO MYAPP *****");
		do {
			System.out.println("\n\n\t\t\t\t\t\t\t\t\tLogin options:");
			System.out.println("\n\t\t\t\t\t\t\t\t\t1. SIGNUP");
			System.out.println("\t\t\t\t\t\t\t\t\t2. LOGIN");
			System.out.println("\t\t\t\t\t\t\t\t\t3. ADMIN");
			System.out.println("\t\t\t\t\t\t\t\t\t 0.EXIT APP");
			login = input4.nextInt();
			switch(login) {

			case 0:
				System.out.println("THANK YOU! PLEASE VISIT AGAIN...");
				break;

			case 1: 
				//new user
				Stack<Node> stk = new Stack();
				Scanner user = new Scanner(System.in);
				int taken = 0;
				System.out.print("Enter username: ");
				username = user.nextLine();
				QueueNode temp_node = q.front;
				while(temp_node != null && taken != 1) {
					if(temp_node.customer_name.equals(username)) {
						System.out.println("Please enter a different username. User with this username already exists! \n");
						Scanner user_2 = new Scanner(System.in);
						System.out.print("Enter username: ");
						username = user_2.nextLine();
						taken = 1;
					}
					temp_node = temp_node.next;
				}

				Scanner log = new Scanner(System.in);
				int flag = 0;
				String login_as = null;
				while(flag != 1) {
					System.out.print("You want to login as(Customer/Retailer): ");
					login_as = log.nextLine();
					if(login_as.equalsIgnoreCase("customer") || login_as.equalsIgnoreCase("retailer")) {
						flag = 1;
						break;
					}
					else {
						System.out.println("Invalid input! \n");
					}
				}
				System.out.print("Enter age: ");
				int age = input4.nextInt();
				if(age < 16) {
					System.out.println("You are not eligible ");
					break;
				}

				Scanner user2 = new Scanner(System.in);
				System.out.print("Enter city: ");
				String city = user2.nextLine();

				Scanner phone = new Scanner(System.in);
				String mobile_no = null;
				int flag2 = 0;
				while(flag2 != 10) {
					System.out.print("Enter mobile number: ");
					mobile_no = phone.nextLine();
					if(mobile_no.length() == 10 ) {
						for(int i = 0; i< mobile_no.length(); i++) {
							if(Character.isDigit(mobile_no.charAt(i))) {
								flag2 ++;
							}
							else {
								System.out.println("Please enter a valid 10-digit phone number! \n");
								flag2 = 0;
								break;
							}
						}
					}
					else {
						System.out.println("Please enter a valid 10-digit phone number! \n");
					}
				}

				int flag3 = 0;
				while(flag3 != 1) {
					Scanner password3 = new Scanner(System.in);
					System.out.print("Create password: ");
					password = password3.nextLine(); 

					Scanner password4 = new Scanner(System.in);
					System.out.print("Confirm password: ");
					String password2 = password4.nextLine();

					if(password.equals(password2)) {
						System.out.println("Password set successfully!\nPlease remember your password for next login...");
						flag3 = 1;
						break;
					}
					else {
						System.out.println("Your entries for password and confirm password do not match ! \n\t\tTRY AGAIN\n");
					}
				}
				QueueNode customer = new QueueNode(username, login_as, age, city, mobile_no, password, stk);
				q.enQueue(customer);
				if(customer.login_as.equalsIgnoreCase("customer")) {
					execute(customer);
				}

				else if(customer.login_as.equalsIgnoreCase("retailer")){
					Retailer ret = new Retailer();
					int flag_ret =0;
					while(flag_ret == 0 ) {
						System.out.println("\t\t\t\t\t\t\t\t***WELCOME TO 'MyApp'***\n");
						System.out.println("\t\t1.ADD PRODUCTS\t\t\t2.DISPLAY LIST OF PRODUCTS ADDED BY YOU\t\t\t 0.LOGOUT");
						int ad = input4.nextInt();
						switch(ad) {
						case 0:
							System.out.println("YOU JUST LOGGED OUT!");
							flag_ret = 1;
							break;

						case 1:
							ret.addProducts(customer,mobile, laptop, earphones, swatch, Home_appliances, Furniture, Cookware_dining, Decor, Women_clothing, Men_clothing,Kids_clothing,Footwear,Bags);
							break;

						case 2:
							ret.displayProducts(customer);
							break;

						default:
							System.out.println("Invalid input!");
						}
					}
				}
				break;

			case 2:
				Scanner u = new Scanner(System.in);
				System.out.print("Enter username: ");
				username = u.nextLine();
				Scanner password1 = new Scanner(System.in);
				System.out.print("Enter password: ");
				password = password1.nextLine();
				if(q.isEmpty()) {
					System.out.println("You do not have an account! \nPlease sign up...");
				}
				else {
					QueueNode temp = q.front;
					int start = 0;
					while(temp != null) {
						while(temp.customer_name.equals(username)) {
							if(temp.password.equals(password)) {
								start =1;
								System.out.println("LOGGED IN SUCCESSFULLY! ");
								if(temp.login_as.equalsIgnoreCase("customer")) {
									execute(temp);
								}

								else if(temp.login_as.equalsIgnoreCase("retailer")){
									Retailer ret2 = new Retailer();
									System.out.println("\t\t\t\t\t\t\t\t***WELCOME TO 'MyApp'***\n");
									System.out.println("\t\t1.ADD PRODUCTS\t\t\t2.DISPLAY LIST OF PRODUCTS ADDED BY YOU\t\t\t 0.LOGOUT");
									int ad = input4.nextInt();
									switch(ad) {
									case 0:
										System.out.println("YOU JUST LOGGED OUT!");
										break;

									case 1:
										ret2.addProducts(temp, mobile, laptop, earphones, swatch, Home_appliances, Furniture, Cookware_dining, Decor, Women_clothing, Men_clothing,Kids_clothing,Footwear,Bags);
										break;

									case 2:
										ret2.displayProducts(temp);
										break;

									default:
										System.out.println("Invalid input!");
									}
								}
								break;
							}
							else {
								System.out.println("Incorrect password! Please re-enter.");
								Scanner password2 = new Scanner(System.in);
								System.out.print("Enter password: ");
								password = password2.nextLine();
							}
						}
						temp = temp.next;
					}
					if(start == 0) {
						System.out.println("Incorrect username or password! ");
						break;
					}
				}
				break;

			case 3:
				//admin
				Scanner pass = new Scanner(System.in);
				System.out.print("Enter password: ");
				password_admin = pass.nextLine();

				if(password_admin.equalsIgnoreCase("1234")) {
					Admin admin = new Admin();
					int back = 0;
					while(back != 1) {
						System.out.println("\t\t\t\t\t\t\t\t***WELCOME TO 'MyApp'***\n");
						System.out.println("\t1.REFILL PRODUCTS\t\t2.CHECK SALES\t\t3.CHECK FOR RETAILERS\t\t4.ADD PRODUCTS\t\t 0.LOGOUT");
						int ad = input4.nextInt();
						switch(ad) {
						case 0:
							back = 1;
							System.out.println("YOU JUST LOGGED OUT!");
							break;

						case 1:
							admin.refillProducts(head_mobile,head_laptop,head_earphones,head_swatches,head_app,head_furn,head_cook,head_decor,head_wc,head_mc,head_kc, head_f, head_b);
							break;

						case 2:
							//check sales;
							admin.totalSales(q);
							break;

						case 3:
							//retailers
							admin.check_retailers(q);
							break;

						case 4:
							//add products
							admin.addProducts(mobile, laptop, earphones, swatch, Home_appliances, Furniture, Cookware_dining, Decor, Women_clothing, Men_clothing, Kids_clothing, Footwear, Bags);
							break;

						default:
							System.out.println("Invalid input!");
							break;
						}
					}
				}
				else {
					System.out.println("Invalid password!");
				}
				break;

			default:
				System.out.println("Invalid input!");
			}
		}while( login != 0);
	}
}

