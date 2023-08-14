package project;

import java.util.Scanner;

public class Retailer {
	void addProducts(QueueNode q,SinglyLinkedList mobile,SinglyLinkedList laptop,SinglyLinkedList earphone,SinglyLinkedList swatch,SinglyLinkedList appl,SinglyLinkedList furn, SinglyLinkedList cook,SinglyLinkedList decor, SinglyLinkedList women,SinglyLinkedList men,SinglyLinkedList kid,SinglyLinkedList foot,SinglyLinkedList bag) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int addprod = 0;
		do {
			//displaying menu
			System.out.println("\t\t1.ELECTRONICS\t\t\t2.HOME N' KITCHEN\t\t\t3.FASHION\t\t\t 0.Back");
			addprod = sc.nextInt();

			switch(addprod) {
			case 0:
				break;

			case 1:
				//electronics
				Scanner sc1 = new Scanner(System.in);
				Electronics ele = new Electronics();
				int elec = 1;
				while(elec != 0) {
					System.out.print("\t\t\t\t\t\tELECTRONICS:\n\t\t\t\t\t\t1. Mobiles\n\t\t\t\t\t\t2. Laptops\n\t\t\t\t\t\t3. Earphones  \n");
					System.out.print("\t\t\t\t\t\t4. Smart Watches \n\t\t\t\t\t\t0. Back <-");
					System.out.println();
					elec = sc1.nextInt();												//input subcategory
					switch(elec) {
					case 0:
						break;

					case 1:
						int add = 1;
						while( add != 0) {
							Scanner item = new Scanner(System.in);
							System.out.print("Enter name of product: ");			//enter name of product
							String item_name = item.nextLine();

							Scanner retail = new Scanner(System.in);
							System.out.print("Enter price: Rs. ");					//accepting price of product
							double price = retail.nextDouble();

							System.out.print("Enter time for delivery of item(in days): ");				//acceping time for delivery
							int time = retail.nextInt();

							System.out.print("Enter stock of item: ");					//accepting left stock
							int stock= retail.nextInt();

							Node p = mobile.head;
							int number = 1;
							while(p != null) {
								number++;											//traverse till end of linked list and add new node
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							mobile.insert(newNode);									//add new node
							q.stk.push(newNode);									//push in retailers stack
							System.out.println("Item added successfully.");
							System.out.println();

							System.out.print("Do you want to add more items? (0/1): ");
							add = sc1.nextInt();
							System.out.println();
							if(add != 0 && add != 1) {								//invalid entry
								System.out.println("Invalid input!");
							}
						}
						break;

					case 2:
						int add1 = 1;
						while( add1 != 0) {
							Scanner item = new Scanner(System.in);
							System.out.println("Enter name of product: ");			//enter name of product
							String item_name = item.nextLine();
							Scanner retail = new Scanner(System.in);
							System.out.println("Enter price: Rs. ");					//accepting price of product
							double price = retail.nextDouble();
							System.out.println("Enter time for delivery of item(in days): ");			//acceping time for delivery
							int time = retail.nextInt();
							System.out.println("Enter stock of item: ");					//accepting left stock
							int stock= retail.nextInt();
							Node p = laptop.head;
							int number = 1;
							while(p != null) {											//traverse till end of linked list and add new node
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							laptop.insert(newNode);								//add new node
							q.stk.push(newNode);									//push in retailers stack
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add1 = sc1.nextInt();
							System.out.println();
							if(add1 != 0 && add1 != 1) {						//invalid entry
								System.out.println("Invalid input!");
							}
						}

						break;


					case 3://earphones 
						int add2 = 1;
						while( add2 != 0) {
							Scanner item = new Scanner(System.in);
							System.out.println("Enter name of product: ");
							String item_name = item.nextLine();
							Scanner retail = new Scanner(System.in);
							System.out.println("Enter price: Rs. ");
							double price = retail.nextDouble();
							System.out.println("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();
							System.out.println("Enter stock of item: ");
							int stock= retail.nextInt();
							Node p = earphone.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							earphone.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add2 = sc1.nextInt();
							System.out.println();
							if(add2 != 0 && add2 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 4://smart watches  
						int add3 = 1;
						while( add3 != 0) {
							Scanner item = new Scanner(System.in);
							System.out.println("Enter name of product: ");
							String item_name = item.nextLine();
							Scanner retail = new Scanner(System.in);
							System.out.println("Enter price: Rs. ");
							double price = retail.nextDouble();
							System.out.println("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();
							System.out.println("Enter stock of item: ");
							int stock= retail.nextInt();
							Node p = swatch.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							swatch.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add3 = sc1.nextInt();
							System.out.println();
							if(add3 != 0 && add3 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					default: System.out.println(" INVALID ENTRY ");
					break;

					}
				}
				break;


			case 2://home and kitchen
				Scanner sc2 = new Scanner(System.in);
				HomeNKitchen home = new HomeNKitchen();
				int hom = 1;
				while(hom != 0) {
					System.out.println("HOME N' KITCHEN:\n1. Home appliances\n2. Furniture\n3. Cookware and dining\n4. Decor\n0. Back <-");
					hom = sc2.nextInt();
					switch(hom) {
					case 0:
						break;

					case 1: 
						int add = 1;
						while( add != 0) {
							Scanner item_2 = new Scanner(System.in);
							System.out.print("Enter name of product: ");
							String item_name = item_2.nextLine();

							Scanner retail = new Scanner(System.in);
							System.out.print("Enter price: Rs. ");
							double price = retail.nextDouble();

							System.out.print("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();

							System.out.print("Enter stock of item: ");
							int stock= retail.nextInt();

							Node p = mobile.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							appl.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();

							System.out.print("Do you want to add more items? (0/1): ");
							add = sc2.nextInt();
							System.out.println();
							if(add != 0 && add != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 2://furniture
						int add1 = 1;
						while( add1 != 0) {
							Scanner item_2 = new Scanner(System.in);
							System.out.print("Enter name of product: ");
							String item_name = item_2.nextLine();

							Scanner retail = new Scanner(System.in);
							System.out.print("Enter price: Rs. ");
							double price = retail.nextDouble();

							System.out.print("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();

							System.out.print("Enter stock of item: ");
							int stock= retail.nextInt();

							Node p = furn.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							furn.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();

							System.out.print("Do you want to add more items? (0/1): ");
							add1 = sc2.nextInt();
							System.out.println();
							if(add1 != 0 && add1 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 3://cookware and dining
						int add2 = 1;
						while( add2 != 0) {
							Scanner item_3 = new Scanner(System.in);
							System.out.print("Enter name of product: ");
							String item_name = item_3.nextLine();

							Scanner retail = new Scanner(System.in);
							System.out.print("Enter price: Rs. ");
							double price = retail.nextDouble();

							System.out.print("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();

							System.out.print("Enter stock of item: ");
							int stock= retail.nextInt();

							Node p = cook.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							cook.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();

							System.out.print("Do you want to add more items? (0/1): ");
							add2 = sc2.nextInt();
							System.out.println();
							if(add2 != 0 && add2 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 4://decor
						int add3 = 1;
						while( add3 != 0) {
							Scanner item_4 = new Scanner(System.in);
							System.out.print("Enter name of product: ");
							String item_name = item_4.nextLine();

							Scanner retail = new Scanner(System.in);
							System.out.print("Enter price: Rs. ");
							double price = retail.nextDouble();

							System.out.print("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();

							System.out.print("Enter stock of item: ");
							int stock= retail.nextInt();

							Node p = decor.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							decor.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();

							System.out.print("Do you want to add more items? (0/1): ");
							add3 = sc2.nextInt();
							System.out.println();
							if(add3 != 0 && add3 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
						
						default:
							System.out.println("Invalid input");
					}
				}
				break;
				
			case 3://fashion 
				Scanner sc3 = new Scanner(System.in);
				Fashion fash = new Fashion();
				int fas = 1;
				while(fas != 0) {
					System.out.print("\t\t\t\t\t\tFASHION:\n\t\t\t\t\t\t1. Women Clothing\n\t\t\t\t\t\t2. Men Clothing\n\t\t\t\t\t\t3. Kids Clothing \n");
					System.out.print("\t\t\t\t\t\t4. Footwear \n\t\t\t\t\t\t5. Bags \n\t\t\t\t\t\t0. Back <-");
					System.out.println();
					fas = sc3.nextInt();
					switch(fas) {
					case 0:
						break;
					case 1:
						int add = 1;
						while( add != 0) {
							Scanner item = new Scanner(System.in);
							System.out.println("Enter name of product: ");
							String item_name = item.nextLine();
							Scanner retail = new Scanner(System.in);
							System.out.println("Enter price: Rs. ");
							double price = retail.nextDouble();
							System.out.println("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();
							System.out.println("Enter stock of item: ");
							int stock= retail.nextInt();
							Node p = women.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							women.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add = sc3.nextInt();
							System.out.println();
							if(add != 0 && add != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					case 2 :
						int add1 = 1;
						while( add1 != 0) {
							Scanner item = new Scanner(System.in);
							System.out.println("Enter name of product: ");
							String item_name = item.nextLine();
							Scanner retail = new Scanner(System.in);
							System.out.println("Enter price: Rs. ");
							double price = retail.nextDouble();
							System.out.println("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();
							System.out.println("Enter stock of item: ");
							int stock= retail.nextInt();
							Node p = men.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							men.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add1 = sc3.nextInt();
							System.out.println();
							if(add1 != 0 && add1 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					case 3 :
						int add2 = 1;
						while( add2 != 0) {
							Scanner item = new Scanner(System.in);
							System.out.println("Enter name of product: ");
							String item_name = item.nextLine();
							Scanner retail = new Scanner(System.in);
							System.out.println("Enter price: Rs. ");
							double price = retail.nextDouble();
							System.out.println("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();
							System.out.println("Enter stock of item: ");
							int stock= retail.nextInt();
							Node p = kid.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							kid.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add2 = sc3.nextInt();
							System.out.println();
							if(add2 != 0 && add2 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					case 4 :
						int add3 = 1;
						while( add3 != 0) {
							Scanner item = new Scanner(System.in);
							System.out.println("Enter name of product: ");
							String item_name = item.nextLine();
							Scanner retail = new Scanner(System.in);
							System.out.println("Enter price: Rs. ");
							double price = retail.nextDouble();
							System.out.println("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();
							System.out.println("Enter stock of item: ");
							int stock= retail.nextInt();
							Node p = foot.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							foot.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add3 = sc3.nextInt();
							System.out.println();
							if(add3 != 0 && add3 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					case 5 :
						int add4 = 1;
						while( add4 != 0) {
							Scanner item = new Scanner(System.in);
							System.out.println("Enter name of product: ");
							String item_name = item.nextLine();
							Scanner retail = new Scanner(System.in);
							System.out.println("Enter price: Rs. ");
							double price = retail.nextDouble();
							System.out.println("Enter time for delivery of item(in days): ");
							int time = retail.nextInt();
							System.out.println("Enter stock of item: ");
							int stock= retail.nextInt();
							Node p = bag.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							bag.insert(newNode);
							q.stk.push(newNode);
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add4= sc3.nextInt();
							System.out.println();
							if(add4 != 0 && add4 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					}
				}

				break;
			}

		}while(addprod != 0);
	}

	void displayProducts(QueueNode q) {
		if(q.stk.empty()) {									//if cart is empty display no item in stack
			System.out.println("You haven't added items yet!");
			return;
		}
		
		int i =1;
		for(int j = q.stk.size()-1; j>=0; j--) {						//for stack size display all item in stack
			System.out.println("\tPRODUCT_"+i);
			System.out.println("Name of item: "+q.stk.get(j).item);
			System.out.println("Price: Rs."+q.stk.get(j).price);
			System.out.println("Time required for delivery: "+q.stk.get(j).time+" days");
			System.out.println("Stock left: "+q.stk.get(j).stock);
			System.out.println();
			i++;
		}
	}
}
