## Description
A menu-driven Java application that manages contacts using ArrayList. It allows users to add, view, search, and delete contacts while storing names and phone numbers.

## Features
- Add contacts with names and phone numbers.
- View all saved contacts.
- Search contacts without case sensitivity.
- Delete contacts by name.
- Prevent empty contact names.
- Display messages for invalid choices and missing contacts.

## Concepts Used
- Java classes and objects
- ArrayList
- Scanner for user input
- do-while loop
- switch-case statements
- for loops
- Conditional statements (if-else)
- String methods (trim(), isEmpty(), equalsIgnoreCase())

## How to Run
1. Install the Java Development Kit (JDK).
2. Save the source file as ContactManager.java.
3. Open a terminal in the file's folder.
4. Compile the program:
   javac ContactManager.java

5. Run the program:
   java ContactManager
   

## Sample Output
--- Contact Manager ---
1. Add Contact
2. View Contacts
3. Search Contact
4. Delete Contact
5. Exit

Enter your choice: 1
Enter contact name: Rahul
Enter phone number: 9876543210
Contact added successfully!

## Data Storage
Contacts are stored in two ArrayList collections: one for names and one for phone numbers. The data remains available while the program runs but is not saved after the program exits.
