package project;
import java.util.*;
import java.lang.Math.*;

public class User extends MyApp{
	static int flg =0;
	static int done = 0;
	static double tax=0;
	Scanner scan = new Scanner(System.in);
	Scanner scan1 = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);

	void displayCart(Stack<Node> stk) {	
		if(stk.empty()) {
			System.out.println("CART EMPTY! ");
		}
		else {
			int max_time =0;
			for(int j = stk.size()-1; j>=0; j--) {			//delivery time= max delivery time from added items
				if(stk.get(j).time > max_time) {			//traverse entire stack and find the max delivery time
					max_time = stk.get(j).time;
				}
			}
			System.out.println("Time for delivery : "+max_time+" days");
			System.out.print("ITEM NAME");
			for(int i = 0 ; i <= 41 ; i++) {					//print item name and price in cart(stack)
				System.out.print(" ");
			}
			System.out.println("PRICE(in Rs.)");
			for(int i = stk.size()-1; i>=0; i--) {
				int namelen = stk.get(i).item.length();
				System.out.print(stk.get(i).item);
				for(int a = 0 ; a <= 50-namelen ; a++) {
					System.out.print(" ");
				}
				System.out.println(stk.get(i).price);
			}System.out.println();
		}
	}


	void displayInvoice(QueueNode q) {
		if(done ==0) {
			double final_cost = 0;
			while(flg ==0) {

				for(int j = q.stk.size()-1; j>=0; j--) {		//calculating total price of all items in cart
					q.total += q.stk.get(j).price;
				}
				tax = 0.18*q.total;						//applying tax of 18% over total price
				q.totalptax = tax + q.total;		//to be paid price is sum of total price and tax amount
				flg =1;
			}
			
								//printing invoice which displays customer details, stack(cart) and the total amount calculation
			System.out.println("******************************************************************************************************************************");
			System.out.println("\t\t\t\t\t\t\t\t\tINVOICE ");
			System.out.print("Customer Name : "+q.customer_name);
			System.out.print("\nContact Number : "+q.phone_number);
			System.out.println();
			System.out.println();
			displayCart(q.stk);
			System.out.println("______________________________________________________________________________________________________________________________");
			System.out.print("\nTotal Amount : "+q.total);
			System.out.println("\nTaxes : "+tax);
			System.out.println("Grand Total : "+q.totalptax);
			System.out.println("______________________________________________________________________________________________________________________________");
			System.out.println();
			
										//applying coupons codes and offers and hence accessing discounts on the total price
			if(q.totalptax != 0) {
				System.out.print(" Do you want to apply Coupon codes and offers(Y/N) : ");
				Scanner c = new Scanner(System.in);
				String ans = c.next();
				if(ans.equalsIgnoreCase("y")) {					//if user enters yes for availing discounts call the coupons method
					Discounts_and_offers obj = new Discounts_and_offers();
					final_cost = obj.coupons(q);
					q.total_reduced = q.totalptax- final_cost;			//calculating amount reduced due to applying coupon

				}
				else {
					q.total_reduced = 0;		//if no coupon code applied then reduced amount is 0
				}
				
												//print the updated invoice again
				System.out.println("******************************************************************************************************************************");
				System.out.println("\t\t\t\t\t\t\t\t\tINVOICE ");
				System.out.print("Customer Name : "+q.customer_name);
				System.out.print("\nContact Number : "+q.phone_number);
				System.out.println();
				System.out.println();
				displayCart(q.stk);
				System.out.println("______________________________________________________________________________________________________________________________");
				System.out.print("\nTotal Amount : "+q.total);
				System.out.println("\nTaxes : "+tax);
				System.out.println("Grand Total : "+q.totalptax);
				if(ans.equalsIgnoreCase("y")) {
					System.out.println("Total after redeeming discounts : "+final_cost);
				}
				System.out.println("______________________________________________________________________________________________________________________________");
				System.out.println();
				done =1;
				return;
			}
		}
		
		
							//coupons can be applied only once so next time user enters pay bill only displays updated invoice
		if(done == 1) {
			final_invoice(q);
		}

	}		
	void final_invoice(QueueNode q ) {
		
		while(flg ==0) {

			for(int j = q.stk.size()-1; j>=0; j--) {						//calculating total price of all items in stack
				q.total += q.stk.get(j).price;
			}
			tax = 0.18*q.total;
			q.totalptax = tax + q.total;
			flg =1;
		}
		
		//printing invoice 
		System.out.println("******************************************************************************************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\tINVOICE ");
		System.out.print("Customer Name : "+q.customer_name);
		System.out.print("\nContact Number : "+q.phone_number);
		System.out.println();
		System.out.println();
		displayCart(q.stk);
		System.out.println("______________________________________________________________________________________________________________________________");
		System.out.print("\nTotal Amount : Rs. "+q.total);
		System.out.println("\nTaxes : Rs. "+tax);
		System.out.println("Grand Total : Rs. "+q.totalptax);
		System.out.println("Total after redeeming discounts : Rs. "+ (q.totalptax-q.total_reduced));
		System.out.println("______________________________________________________________________________________________________________________________");
		System.out.println();

	}

	void upi_payment() {
		String upi_id;
		System.out.println(" Enter your UPI ID : ");							//accepting upi id for generating payment link
		upi_id = scan2.nextLine();
		System.out.println(" The amount is requested on your UPI account . ");
		System.out.println(" Please complete the payment . ");
	}

	void cod(QueueNode q) {														//allows user to make payment on delivery
		System.out.println("Dear customer "+ (q.totalptax-q.total_reduced) +" Rs is the total payable amount");
		System.out.println("You are supposed to pay the same on delivery of goods.");
	}

	void card_pay() {
		int flg=0;
		String acno = " ";
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		while(flg != 12) {									//until we obtain a valid 12-digit account number keep on accepting account number
			System.out.print("Enter Account Number: ");
			acno = scan5.nextLine();
			if(acno.length() == 12 ) {							//length of account number should be 12
				for(int i = 0; i< acno.length(); i++) {
					if(Character.isDigit(acno.charAt(i))) {			//every character in string must be a digit
						flg ++;
					}
					else {														//invalid account number entered
						System.out.println("Please enter a valid 12-digit Account number! \n");
						flg = 0;
						break;
					}
				}
			}
			else {												//invalid account number entered
				System.out.println("Please enter a valid 12-digit Account number! \n");
			}
		}

		int flag1 = 0;
		while(flag1 == 0) {											//accepting expiry date of card
			System.out.print(" Enter expiry date in MMYY format : ");
			String mmyy = scan3.next();
			if(mmyy.length()==4) {								//accepting date untill a valid 4-digit date is entered
				if(mmyy.charAt(0)=='1' || mmyy.charAt(0)=='0' ) {			//validating months from 1 to 12 only
					if(mmyy.charAt(0)=='1' && mmyy.charAt(1)<='2') {
						flag1 =1;
					}
					else {								//wrong input 
						System.out.println("INVALID ENTRY");
					}
				}
				else {								//wrong input
					System.out.println("INVALID ENTRY");
				}
			}

			else {									//wrong input
				System.out.println("INVALID ENTRY ");
			}
		}
		int flag2 = 0;
		while(flag2 == 0) {						//accepting cvv until a valid 3- digit cvv is entered
			System.out.print(" Enter CVV : ");
			String cvv = scan4.next();
			if(cvv.length()==3) {
				flag2 =1;

			}
			else {											//wrong input
				System.out.println(" INVALID ENTRY ");
			}
		}
		int flag = 0;
		while(flag == 0) {
			System.out.print(" Enter OTP : ");					//accepting otp until a valid 4- digit otp is entered 
			String otp = scan1.next();
			if ( otp.length() == 4) {							//once otp is verified payment is confirmed
				System.out.println(" OTP VERIFIED ");
				System.out.println(" PAYMENT COMPLETED ");
				System.out.println(" THANK YOU !");
				flag =1;
			}
			else {
				System.out.println(" INVALID OTP ENTERED !!!");
			}
		}

	}

	double emi(double p , double n ) {
		double r = 0.1;
		double calc = Math.pow(1.1, n);
		double calc2 = p*(0.1)*calc;
		double EMI = (calc2 / (calc-1));						//calculating emi for variable month

		System.out.println(" Tenure : "+n+" Months");					//print tenure of emi
		System.out.println(" Rate of Interest applied : 10%");			//print amount to be paid at once in emi
		System.out.println(" Payable EMI per month : Rs. "+(EMI));
		System.out.println(" Total cost after EMI : Rs. "+ (EMI*n));

		return EMI;
	}
	void emi_pay(QueueNode q) {
		System.out.println(" Original amount  : "+q.totalptax);
		System.out.println(" Please select the EMI tenure :  ");		//accepting tenure of emi from user
		System.out.println(" 1. 3 Months ");
		emi(q.totalptax,3);
		System.out.println();
		System.out.println(" 2. 6 Months ");
		emi(q.totalptax,6);
		System.out.println();
		System.out.println(" 3. 12 Months");
		emi(q.totalptax,12);
		System.out.println();
		System.out.println(" 4. Customizable ");					//user can also input tenure of emi according to his comfort
		System.out.print(" ENTER CHOICE : ");
		int ch = scan.nextInt();
		switch(ch) {
		case 1 : {
			System.out.println(" 3 Months Tenure Selected");
			double fp = emi(q.totalptax,3);								//calculating emi
			System.out.println(" Please Initiate First Payment of "+fp+" Rs");				//printing first payment of emi
			card_pay();
			break;
		}
		case 2 : {
			System.out.println(" 6 Months Tenure Selected");
			double fp = emi(q.totalptax,6);									//calculating emi
			System.out.println(" Please Initiate First Payment of "+fp+ " Rs");				//printing first payment of emi
			card_pay();
			break;
		}
		case 3 : {
			System.out.println(" 12 Months Tenure Selected");
			double fp = emi(q.totalptax,12);								//calculating emi
			System.out.println(" Please Initiate First Payment of "+fp+" Rs");				//printing first payment of emi
			card_pay();
			break;

		}
		case 4 : {
			System.out.print(" Enter tenure (in months) : ");
			double nomonth = scan.nextDouble();
			double fp = emi(q.totalptax,nomonth);							//calculating emi
			System.out.println(" Please Initiate First Payment of "+fp+" Rs");				//printing first payment of emi
			card_pay();
			break;

		}

		default:												//invalid entry
			System.out.println("Invalid input");
		}
	}
}
