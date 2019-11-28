package com.ust.mobilejdbc.main;

import java.util.List;
import java.util.Scanner;

import com.ust.mobilejdbc.dao.ContactInfo;
import com.ust.mobilejdbc.dto.IMobileDAO;
import com.ust.mobilejdbc.util.MobileManager;

public class App {
	public static void main(String[] args) {
		//System.out.println("Press 1 to Show all Contacts");
		System.out.println("Press 1 to Show all Contacts");
		System.out.println("Press 2 to Search Contacts");
		System.out.println("Press 3 to Operate on Contacts");
		System.out.println("Press 4 to Main menu");
		Scanner sc = new Scanner(System.in);
		int key  = sc.nextInt();
		do{
			
			
				switch(key) {
				case 4:
					System.exit(0);
				case 1 :
					IMobileDAO getDao = MobileManager.getContactInfo();
					List<ContactInfo> result = getDao.getConatct();
					for(ContactInfo info: result) {
						System.out.println(info.getName());
						System.out.println(info.getNumber());
						System.out.println(info.getGroup());
						System.out.println("---------------------");
					}
					break;
				case 2 :
					System.out.println("Search by name");
					String name = sc.next();
					IMobileDAO searchDao = MobileManager.getContactInfo();
					ContactInfo searchInfo = searchDao.searchContact(name);
					System.out.println("Name: "+searchInfo.getName());
					System.out.println("Number: "+searchInfo.getNumber());
					System.out.println("Group: "+searchInfo.getGroup());
					
					System.out.println("Calling "+searchInfo.getName());
					System.out.println("Messgae "+searchInfo.getName());

					break;
				case 3 : 
					System.out.println("Press 1 to add contact");
					System.out.println("Press 2 to delete contact");
					System.out.println("Press 3 to edit contact");
					System.out.println("Press 4 to Main menu");
					int key1 = sc.nextInt();
					switch (key1) {
					case 1:
						IMobileDAO addDao = MobileManager.getContactInfo();
						ContactInfo addInfo = new ContactInfo();
						System.out.println("Enter name");
						String name1 = sc.next();
						System.out.println("Enter mobile number");
						String mob = sc.next();
						System.out.println("Enter Group Name");
						String group = sc.next();
						addInfo.setName(name1);
						addInfo.setNumber(mob);
						addInfo.setGroup(group);
						
						int count = addDao.addContact(addInfo);
						if(count > 0)
							System.out.println("Contact added");
						else
							System.out.println("Cannot add contact");
						break;
					case 2 :
						System.out.println("Enter name to delete contact");
						String delName = sc.next();
						IMobileDAO deleteDao = MobileManager.getContactInfo();
						int delCount = deleteDao.deleteContact(delName);
						if(delCount > 0)
							System.out.println("Contact Deleted");
						break;
					case 3 :
						System.out.println("Enter name to edit Contact_info");
						String ename = sc.next();
						System.out.println("Enter new Number");
						String number = sc.next();
						System.out.println("Enter new group");
						String grp = sc.next();
						
						IMobileDAO editDao = MobileManager.getContactInfo();
						ContactInfo editInfo = new ContactInfo();
						
						editInfo.setNumber(number);
						editInfo.setGroup(grp);
						
						int editCount = editDao.editContact(editInfo,ename);
						if(editCount > 0)
							System.out.println("Contact Update");
						else
							System.out.println("Contact already updated");
						
					case 4 :
						System.exit(0);
					default:
						break;
					}//end of second switch
					break;
				
				}
			
		}while(key!=4);//end of do loop
		
	}
}

