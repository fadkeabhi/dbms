## 5
Consider table Stud(Roll, Att,Status) Write a PL/SQL block for following
requirement and handle the exceptions. Roll no. of student will be entered
by user. Attendance of roll no. entered by user will be checked in Stud
table. If attendance is less than 75% then display the message “Term not
granted” and set the status in stud table as “D”. Otherwise display
message “Term granted” and set the status in stud table as “ND”.

Write a PL/SQL block of code for the following requirements:- Schema:
1. Borrower(Rollin, Name, DateofIssue, NameofBook, Status) 2. Fine(Roll_no,Date,Amt) Accept roll_no & name of book from user. Check the number of days (from date of issue), if days are between 15 to 30 then fine amount will be Rs 5per day. If no. of days>30, per day fine will be Rs 50 per day & for days less than 30, Rs. 5 per day. After submitting the book, status will
change from I to R. If condition of fine is true, then details will be stored into fine table.

Write a PL/SQL block for following requirement using user defined exception handling. The account_master table records the current balance for an account, which is updated whenever, any deposits or withdrawals takes place. (Acc_no, Cust_name, Balance) Input: Acc_no, Operation, Amount If the withdrawal attempted is more than the current balance held in the account. The user defined exception is raised, displaying an appropriate message. Write a PL/SQL block for above requirement using user defined exception handling.

Write a PL/SQL code block to calculate the area of a circle for a value of
radius varying from 5 to 9. Store the radius and the corresponding values of calculated area in an empty table named areas, consisting of two columns, radius and area.




## function
Write a stored function in PL/SQL for given requirement and use the same
 in PL/SQL block.

Write a Stored Procedure namely proc_Grade for the categorization of students. If
 marks scored by students in examination is <=1500 and marks>=990 then student will be
 placed in distinction category if marks scored are between 989 and900 category is first
 class, if marks 899 and 825 category is Higher Second Class. Write a PL/SQL block for
 using procedure created with the above requirement.

 Consider following schema for Bank database.
 Account(Account_No,Cust_Name,Balance, NoOfYears) Earned_Interest(Account_No,
 Interest_Amt) Write a PL/SQL procedure for following requirement. Take as input
 Account_No and Interest Rate from User. Calculate the Interest_Amt as simple interest for
 the given Account_No and store it in Earned_Interest table. Display all the details of
 Earned_Interest Table.

 Consider the following schema for the Sales table.
 Sales (Item_No int, Quantity int, Unit_Price number, Status varchar(20))
 Status can be “Shipped” or “Delivered” or “Returned”. Write a PLSQL function to calculate
 the total amount of Sales for Items with status “Shipped”. (total_amount = SUM(Quantity *
 Unit_Price). Display the Total Amount of sales.


 ## CURSORS
Write a PL/SQL block of code using Cursor that will merge the data available in the newly
 created table N_RollCall with the data available in the table O_RollCall. If the data in the first table
 already exists in the second table then that data should be skipped. Use of Cursor For Loop in the
 solution.

 Write a PL/SQL block of code demonstrating Implicit Cursor that will display the total number of
 tuples from RollCall Table having schema as follows.
 RollCall (RollNo, Date, Attendance) The Attendance column can take values as ‘P’ or ‘A’
 Use Cursor Attributes to demonstrate the working of Implicit cursor.

 Write a PL/SQL block of code using Parameterized Cursor that will display all Attendance
 details of Roll No entered by the user.

 Consider the following schema for Products table.
 Products(Product_id, Product_Name, Product_Type, Price). Write a parameterized cursor to display
 all products in the given price range of price and type ‘Apparel’.