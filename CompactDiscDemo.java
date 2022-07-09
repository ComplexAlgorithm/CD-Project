/**
 * Finally develop a prototype of the program that will arrange Professor Ahmad’s CDs. Please
make sure to place at least two CDs in each stack and then look at the top of each stack, finally
attempt to remove a CD from a stack and make sure it ends up in the in-use stack. Please
demonstrate this with a number of CDs. 
Professor Ahmad tells you that he would like his music collection to be broken into five different
stacks. The first stack will be for any music that is not in English. The next stack will be for all
of his Rush CDs. There should also be a separate stack for all his Pink Floyd CDs. There should
be another stack for all his Iron Maiden CDs. Any remaining CDs that are in English should go
into a separate stack. Also, there should be a sixth stack where any CD should go once it has
been removed from the appropriate stack and this stack will be the one where a CD that is
currently in a CD player will go so that it will be clear which CDs are currently in use and not in
their appropriate stack.

 * @author Joshua
 *
 */
import java.util.Scanner;
public class CompactDiscDemo {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		UnBoundedStackInterface<CompactDisc> foreignStack = new NodeBasedStack<CompactDisc>();
		UnBoundedStackInterface<CompactDisc> rushStack = new NodeBasedStack<CompactDisc>();
		UnBoundedStackInterface<CompactDisc> pinkFloydStack = new NodeBasedStack<CompactDisc>();
		UnBoundedStackInterface<CompactDisc> ironMaidenStack = new NodeBasedStack<CompactDisc>();
		UnBoundedStackInterface<CompactDisc> englishStack = new NodeBasedStack<CompactDisc>();
		UnBoundedStackInterface<CompactDisc> inUseStack = new NodeBasedStack<CompactDisc>();
		
		int option;
		
		do {
			System.out.println("Press 1 to pick up a CD from the giant pile and enter its information.");
			System.out.println("Press 2 to look at the top of each stack of CDs.");
			System.out.println("Press 3 to remove a CD from a stack.");
			System.out.println("Press 4 to view the size of all the stacks.");
			System.out.println("Press 5 to display the contents of each stack.");
			System.out.println("Press 6 to display the total number of CDs in each stack combined.");
			System.out.println("Press 7 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			/**
			 * This program should give the user many different options. The first is to pick up a CD from the
giant pile and enter its information. Based on this information the program should place the CD
into the appropriate stack. There should be a separate option to look at the top of each stack.
There should also be a separate option to remove the top CD from any stack. When the user
chooses to remove the top CD from a stack it should be put in the in-use stack. There should
also be an option that gives the size of all the stacks. There should also be a separate option to
display the contents of each stack. Finally, there should be an option that displays the total
number of CDs that are in all of the stacks combined. 
			 */
			
			if(option == 1) {
				CompactDisc currentDisc = new CompactDisc();
				
				System.out.println("Enter the name of the album");
				String newName = keyboard.nextLine();
				System.out.println("Enter the name of the artist");
				String newArtist = keyboard.nextLine();
				System.out.println("Enter the language the lyrics are in");
				String newLanguage = keyboard.nextLine();
				
				currentDisc.setAlbum(newName);
				currentDisc.setArtist(newArtist);
				currentDisc.setLanguage(newLanguage);
				try {
					if(!currentDisc.getLanguage().equals("English")) {
						foreignStack.push(currentDisc);
					}
					else if(currentDisc.getArtist().equals("Rush")) {
						rushStack.push(currentDisc);
					}
					else if(currentDisc.getArtist().equals("Pink Floyd")) {
						pinkFloydStack.push(currentDisc);
					}
					else if(currentDisc.getArtist().equals("Iron Maiden")) {
						ironMaidenStack.push(currentDisc);
					}
					else {
						englishStack.push(currentDisc);
					}
				}
				catch(StackFullException e) {
					System.out.println(e.getMessage());
				}
				
			}
			else if(option == 2) {
				int look = 0;
				
				System.out.println("Press 1 to look at the top of the foreign music stack.");
				System.out.println("Press 2 to look at the top of the Rush music stack.");
				System.out.println("Press 3 to look at the top of the Pink Floyd music stack.");
				System.out.println("Press 4 to look at the top of the Iron Maiden music stack.");
				System.out.println("Press 5 to look at the top of the english music stack.");
				System.out.println("Press 6 to look at the top of the in use stack.");
				look = keyboard.nextInt();
				keyboard.nextLine();
				
				try {
					if(look == 1) {
						System.out.println(foreignStack.peek().toString());
					}
					else if(look == 2) {
						System.out.println(rushStack.peek().toString());
					}
					else if(look == 3) {
						System.out.println(pinkFloydStack.peek().toString());
					}
					else if(look == 4) {
						System.out.println(ironMaidenStack.peek().toString());
					}
					else if(look == 5) {
						System.out.println(englishStack.peek().toString());
					}
					else if(look == 6) {
						System.out.println(inUseStack.peek().toString());
					}
					else {
						System.out.println("Invalid input.");
					}
				}
				catch(StackEmptyException e) {
					System.out.println(e.getMessage());
				}
			}
			
			else if(option == 3) {
				
				System.out.println("Press 1 to pop the top of the foreign music stack.");
				System.out.println("Press 2 to pop the top of the Rush music stack.");
				System.out.println("Press 3 to pop the top of the Pink Floyd music stack.");
				System.out.println("Press 4 to pop the top of the Iron Maiden music stack.");
				System.out.println("Press 5 to pop the top of the english music stack.");
				int view = keyboard.nextInt();
				keyboard.nextLine();
				
				try {
					if(view == 1) {
						CompactDisc topOfStack = foreignStack.peek();
						foreignStack.pop();
						inUseStack.push(topOfStack);
					}
					else if(view == 2) {
						CompactDisc topOfStack = rushStack.peek();
						rushStack.pop();
						inUseStack.push(topOfStack);					
					}
					else if(view == 3) {
						CompactDisc topOfStack = pinkFloydStack.peek();
						pinkFloydStack.pop();
						inUseStack.push(topOfStack);
					}
					else if(view == 4) {
						CompactDisc topOfStack = ironMaidenStack.peek();
						ironMaidenStack.pop();
						inUseStack.push(topOfStack);
					}
					else if(view == 5) {
						CompactDisc topOfStack = englishStack.peek();
						englishStack.pop();
						inUseStack.push(topOfStack);
					}
					else {
						System.out.println("Invalid input.");
					}
				}
				catch(StackEmptyException e) {
					System.out.println(e.getMessage());
				}
				catch(StackFullException e) {
					System.out.println(e.getMessage());
				}
			}
		else if(option == 4) {
				System.out.println("The size of the Foreign Stack is: " + foreignStack.size());
				System.out.println("The size of the Rush Stack is: " + rushStack.size());
				System.out.println("The size of the Pink Floyd Stack is: " + pinkFloydStack.size());
				System.out.println("The size of the Iron Maiden Stack is: " + ironMaidenStack.size());
				System.out.println("The size of the In Use Stack is: " + inUseStack.size());
		}
		else if(option == 5) {
				System.out.println("Foreign Stack has: " + foreignStack.toString());
				System.out.println("Rush Stack has: "+ rushStack.toString());
				System.out.println("Pink Floyd Stack has: " + pinkFloydStack.toString());
				System.out.println("Iron Maiden Stack has: " + ironMaidenStack.toString());
				System.out.println("In Use Stack has: " + inUseStack.toString());
				
		}
		else if(option == 6) {
			int totalDiscs = foreignStack.size() + rushStack.size() + pinkFloydStack.size() 
							+ ironMaidenStack.size() + inUseStack.size();
			System.out.println("Total CDs: " + totalDiscs);
		}
		else if(option == 7) {
			System.out.println("Thank you for using the program!");
		}
		else {
			System.out.println("Error!");
		}
			
	}while(option != 7);

}

}
