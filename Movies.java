package bookmyshow;

public class Movies extends BookMyShow{
	String movie_name,type;
	int amt,numofseats,popcorn_price,popcorn_quantity,coke_price,coke_quantity,nachos_price,nachos_quantity,total_amt,bill_amt;
	public void selectMovie() {
		System.out.println("Please select movie : ");
		if(loc.equalsIgnoreCase("Delhi")){
			System.out.println("Press 1 for 3 idiots \n2 for PK \n3 for DDLJ");
			int ch=sc.nextInt();
			if(ch==1)
				movie_name="3 idiots";
			else if(ch==2)
				movie_name="PK";
			else if(ch==3)
				movie_name="DDLJ";
			else
				selectMovie();
			System.out.println("Enjoy Watching " + movie_name);
		}
		if(loc.equalsIgnoreCase("Bangalore")){
			System.out.println("Press 1 for KGF \n 2 for Kantara \n 3 for KGF 2");
			int ch=sc.nextInt();
			if(ch==1)
				movie_name="KGF";
			else if(ch==2)
				movie_name="Kantara";
			else if(ch==3)
				movie_name="KGF 2";
			else
				selectMovie();
			System.out.println("Enjoy Watching " + movie_name);
		}
		if(loc.equalsIgnoreCase("Chennai")){
			System.out.println("Press 1 for Vikram \n \t 2 for Leo \n \t 3 for Raja Rani");
			int ch=sc.nextInt();
			if(ch==1)
				movie_name="Vikram";
			else if(ch==2)
				movie_name="Leo";
			else if(ch==3)
				movie_name="Raja Rani";
			else
				selectMovie();
			System.out.println("Enjoy Watching " + movie_name);
		}

	}


	public void selectSeat() {
		System.out.println("Please select seat type : ");
		System.out.println(" Press 1 for Recliner -->500 \n Press 2 for executive -->300 \n Press 3 for Normal -->200");
		int ch=sc.nextInt();
		System.out.println("Enter no of seats : ");
		numofseats=sc.nextInt();
		if(ch==1) {
			type="Recliner";
			amt+=500*numofseats;
		}
		else if(ch==2) {
			type="Executive";
			amt+=300*numofseats;
		}
		else if(ch==3) {
			type="Normal";
			amt+=200*numofseats;
		}
		else {

			System.out.println("Enter Proper Input !");
			selectSeat();
		}
		System.out.println("Your seat type is "+type +" , no of seats are " + numofseats+" and price for tickets are "+amt);
	}
	public void addons() {
		System.out.println("Do you want addons ? Press Y or N");
		char ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
			System.out.println("Would you like to add popcorn ?\n1 for yes , 2 for no ");
			int popcorn=sc.nextInt();
			if(popcorn==1) {
				System.out.println("1 for small --> 400RS\n2 for nmedium --> 600RS\n3 for large --> 900RS");
				int type=sc.nextInt();
				System.out.println("Please enter no of popcorn :");
				popcorn_quantity=sc.nextInt();
				if(type==1) {
					popcorn_price+=popcorn_quantity*400;
				}
				else if(type==2) {
					popcorn_price+=popcorn_quantity*600;
				}
				else if(type==3) {
					popcorn_price+=popcorn_quantity*900;
				}
				else {
					System.out.println("Enter proper input");
				}
			}
			else if(popcorn==2) {
				System.out.println("No Popcorn Selected !");
			}
			else {
				System.out.println("Please enter proper input of your choice ");
				addons();
			}


			System.out.println("Would you like to add coke ?\n1 for Yes and 2 for No");
			int coke=sc.nextInt();
			if(coke==1) {
				System.out.println("1 for small --> 150RS\n2 for nmedium --> 270RS\n3 for large --> 350RS");
				int type=sc.nextInt();
				System.out.println("Please enter no of coke :");
				coke_quantity=sc.nextInt();
				if(type==1) {
					coke_price+=coke_quantity*150;
				}
				else if(type==2) {
					coke_price+=coke_quantity*270;
				}
				else if(type==3) {
					coke_price+=coke_quantity*350;
				}
				else {
					System.out.println("Enter proper input");
				}
			}
			else if(coke==2) {
				System.out.println("No Coke Selected !");
			}
			else {
				System.out.println("Please enter proper input of your choice ");
				addons();
			}
			System.out.println("Would you like to add nachos ?\n1 for Yes and 2 for No");
			int nachos=sc.nextInt();
			if(nachos==1) {
				System.out.println("1 for small --> 100RS\n2 for nmedium --> 200RS\n3 for large --> 300RS");
				int type=sc.nextInt();
				System.out.println("Please enter no of nachos :");
				nachos_quantity=sc.nextInt();
				if(type==1) {
					nachos_price+=nachos_quantity*100;
				}
				else if(type==2) {
					nachos_price+=nachos_quantity*200;
				}
				else if(type==3) {
					nachos_price+=nachos_quantity*300;
				}
				else {
					System.out.println("Enter proper input");
				}
			}
			else if(nachos==2) {
				System.out.println("No nachos Selected !");
			}
			else {
				System.out.println("Please enter proper input of your choice ");
				addons();
			}

		}
	}
	
	public void Bill() {
		System.out.println("Enjoy Your Movie !");
		System.out.println("Items Orderd : ");
		System.out.println("Popcorn Quantity :"+popcorn_quantity);
		System.out.println("Popcorn Price    :"+popcorn_price);
		System.out.println("Coke Quantity    :"+coke_quantity);
		System.out.println("Coke Price       :"+coke_price);
		System.out.println("Nachos Quantity  :"+nachos_quantity);
		System.out.println("Nachos Price     :"+nachos_price);
		System.out.println("GST              :8%"); 
		total_amt=popcorn_price+coke_price+nachos_price;
		System.out.println("Amount           :"+total_amt);
		bill_amt=(8/100*total_amt)+total_amt;
		System.out.println("Total Price 	 :"+bill_amt);
	}
}









