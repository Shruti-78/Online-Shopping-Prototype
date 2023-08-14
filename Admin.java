package project;
import java.util.*;

public class Admin extends MyApp{
		
	void addProducts(SinglyLinkedList mobile,SinglyLinkedList laptop,SinglyLinkedList earphone,SinglyLinkedList swatch,SinglyLinkedList appl,SinglyLinkedList furn, SinglyLinkedList cook,SinglyLinkedList decor, SinglyLinkedList women,SinglyLinkedList men,SinglyLinkedList kid,SinglyLinkedList foot,SinglyLinkedList bag) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int addprod = 0;
		do {
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
					elec = sc1.nextInt();
					switch(elec) {
					case 0:
						break;

					case 1:
						int add = 1;
						while( add != 0) {
							Scanner item = new Scanner(System.in);
							System.out.print("Enter name of product: ");
							String item_name = item.nextLine();

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
							mobile.insert(newNode);
							System.out.println("Item added successfully.");
							System.out.println();

							System.out.print("Do you want to add more items? (0/1): ");
							add = sc1.nextInt();
							System.out.println();
							if(add != 0 && add != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 2:
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
							Node p = laptop.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							laptop.insert(newNode);
							System.out.println("Item added successfully.");
							System.out.println();
							System.out.print("Do you want to add more items? (0/1): ");
							add1 = sc1.nextInt();
							System.out.println();
							if(add1 != 0 && add1 != 1) {
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
							System.out.println("Enter time for delivery of item: ");
							int time = retail.nextInt();
							System.out.println("Enter stock of item(in days): ");
							int stock= retail.nextInt();
							Node p = earphone.head;
							int number = 1;
							while(p != null) {
								number++;
								p = p.next;
							}
							Node newNode = new Node(number, item_name, price, time, stock);
							earphone.insert(newNode);
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


	void refillProducts(Node head_mobile,Node head_laptop,Node head_earphone,Node head_swatch,Node head_appl,Node head_furn, Node head_cook,Node head_decor, Node head_women,Node head_men,Node head_kid,Node head_foot,Node head_bag) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("\t\t1.ELECTRONICS\t\t\t2.HOME N' KITCHEN\t\t\t3.FASHION\t\t\t 0.Back");
			int refill = sc.nextInt();

			switch(refill) {
			case 0:
				break;

			case 1:
				//electronics
				Scanner sc1 = new Scanner(System.in);
				Electronics ele = new Electronics();
				int elec = 1;
				while(elec != 0) {
					System.out.print("\t\t\t\t\t\tELECTRONICS:\n\t\t\t\t\t\t1. Mobiles\n\t\t\t\t\t\t2. Laptops\n\t\t\t\t\t\t 3. Earphones  \n");
					System.out.print("\t\t\t\t\t\t4. Smart Watches \n\t\t\t\t\t\t0. Back <-");
					System.out.println();
					elec = sc1.nextInt();
					switch(elec) {
					case 0:
						break;

					case 1:
						int add = 1;
						ele.display_mob(head_mobile);
						while( add != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int mobile = sc1.nextInt();

							if(mobile != 0) {
								Node temp = head_mobile;
								while( temp.number != mobile) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc1.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add = sc1.nextInt();
							System.out.println();
							if(add != 0 && add != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 2: 
						int add1 = 1;

						ele.display_laptops(head_laptop);
						while( add1 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int laptop = sc1.nextInt();

							if(laptop != 0) {
								Node temp = head_laptop;
								while( temp.number != laptop) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc1.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add1 = sc1.nextInt();
							System.out.println();
							if(add1 != 0 && add1 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					case 3 : 
						//earphone
						int add2 = 1 ;
						ele.display_earph(head_earphone);
						while(add2 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int earphone = sc1.nextInt();
							if(earphone != 0) {
								Node temp = head_earphone;
								while( temp.number != earphone) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc1.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add2 = sc1.nextInt();
							System.out.println();
							if(add2 != 0 && add2 != 1) {
								System.out.println("Invalid input!");
							}

						}
						break;
					case 4 : 
						// smart watches
						int add3 = 1 ;
						ele.display_sw(head_swatch);
						while(add3 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int swatch = sc1.nextInt();
							if(swatch != 0) {
								Node temp = head_swatch;
								while( temp.number != swatch) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc1.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add3 = sc1.nextInt();
							System.out.println();
							if(add3 != 0 && add3 != 1) {
								System.out.println("Invalid input!");
							}

						}
						break;
					}
				}
				break;

			case 2:
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
						home.dis_ha(head_appl);
						while( add != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int appliances = sc2.nextInt();

							if(appliances != 0) {
								Node temp = head_appl;
								while( temp.number != appliances) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc2.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add = sc2.nextInt();
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
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int furniture = sc2.nextInt();

							if(furniture != 0) {
								Node temp = head_furn;
								while( temp.number != furniture) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc2.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add1 = sc2.nextInt();System.out.println();
							if(add1 != 0 && add1 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 3:
						int add3 = 1;
						home.dis_cd(head_cook);
						while( add3 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int cookware = sc2.nextInt();

							if(cookware != 0) {
								Node temp = head_cook;
								while( temp.number != cookware) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc2.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add3 = sc2.nextInt();
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
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int decor = sc2.nextInt();

							if(decor != 0) {
								Node temp = head_decor;
								while( temp.number != decor) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc2.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add4 = sc2.nextInt();
							System.out.println();
							if(add4 != 0 && add4 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					}
				}
				break;

			case 3:
				Scanner sc3 = new Scanner(System.in);
				Fashion fash= new Fashion();
				int fashion = 1;
				while(fashion != 0) {
					System.out.print("FASHION:\n");
					System.out.print("1.Women clothing\n2.Men clothing\n3.Kids clothing\n4.Footwear\n5.Bags\n");
					System.out.println("0.Back");
					fashion = sc3.nextInt();
					switch(fashion) {
					case 0:
						break;

					case 1:
						int add1 = 1;
						fash.disp_wc(head_women);
						while( add1 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int women = sc3.nextInt();

							if(women != 0) {
								Node temp = head_women;
								while( temp.number != women) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc3.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add1 = sc3.nextInt();
							System.out.println();
							if(add1 != 0 && add1 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 2:
						int add2 = 1;
						fash.disp_mc(head_men);
						while( add2 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int men = sc3.nextInt();

							if(men != 0) {
								Node temp = head_men;
								while( temp.number != men) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc3.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add2 = sc3.nextInt();
							System.out.println();
							if(add2 != 0 && add2 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 3:
						int add3 = 1;
						fash.disp_kc(head_kid);
						while( add3 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int kid = sc3.nextInt();

							if(kid != 0) {
								Node temp = head_kid;
								while( temp.number != kid) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc3.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add3 = sc3.nextInt();
							System.out.println();
							if(add3 != 0 && add3 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 4:
						int add4 = 1;
						fash.disp_f(head_foot);
						while( add4 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int foot = sc3.nextInt();

							if(foot != 0) {
								Node temp = head_foot;
								while( temp.number != foot) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc3.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add4 = sc3.nextInt();
							System.out.println();
							if(add4 != 0 && add4 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;

					case 5:
						int add5 = 1;
						fash.disp_b(head_bag);
						while( add5 != 0) {
							System.out.print("Which item to be refilled? (Press 0 if none to be refilled) : ");
							int bags = sc3.nextInt();

							if(bags != 0) {
								Node temp = head_bag;
								while( temp.number != bags) {
									temp = temp.next;
								}
								System.out.print("Enter number of pieces to be added: ");
								int piece = sc3.nextInt();
								temp.stock += piece;
								System.out.println("Items added successfully.");
								System.out.println();
							}
							System.out.print("Do you want to refill more items? (0/1): ");
							add5 = sc3.nextInt();
							System.out.println();
							if(add5 != 0 && add5 != 1) {
								System.out.println("Invalid input!");
							}
						}
						break;
					}
				}
				break;

			}
			System.out.println("Do you want to refill any more products?(0/1): ");
			choice = sc.nextInt();
		}while(choice != 0);
	}

	void check_retailers(Queue q) {
		QueueNode temp2 = q.front;
		int i = 1654;
		int retailers = 0;
		while(temp2 != null) {
			if(temp2.login_as.equalsIgnoreCase("retailer")) {
				System.out.println("## RETAILER ID_"+i+" ##");
				System.out.println("Name: "+temp2.customer_name);
				System.out.println("Age: "+temp2.age);
				System.out.println("City: "+temp2.city);
				System.out.println("Phone number: "+temp2.phone_number);
				i++;
				retailers++;
			}
			temp2 = temp2.next;
		}
		if(retailers ==0 ) {
			System.out.println("No retailer record yet! ");
		}
	}
	void totalSales(Queue q) {
		double total = 0;
		QueueNode temp = q.front;
		if(temp == null) {
			System.out.println("NO SALES YET");
		}
		else {
			System.out.print("ITEM NAME");
			for(int i = 0 ; i <= 41 ; i++) {
				System.out.print(" ");
			}
			System.out.println("PRICE(in Rs.)");
			while(temp != null && temp.login_as.equalsIgnoreCase("customer")) {
				if(temp.stk.empty()) {
					System.out.println("NO SALES YET! ");
				}
				else {
					for(int i = temp.stk.size()-1; i>=0; i--) {
						int namelen = temp.stk.get(i).item.length();
						total += temp.stk.get(i).price;
						System.out.print(temp.stk.get(i).item);
						for(int a = 0 ; a <= 50-namelen ; a++) {
							System.out.print(" ");
						}
						System.out.println(temp.stk.get(i).price);
					}
				}
				temp = temp.next;
			}
			System.out.println("\nTotal sales uptill now: Rs. "+total+" /-\n\n");
		}
	}
}