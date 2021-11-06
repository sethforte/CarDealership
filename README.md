# CarDealership
Simple Project to explain Object Orientation Basics


Pre Requisite Knowledge - Classes, Objects, Data Types, Inheritance, Control Flow.



**TASK**

- Write a program to simulate a car dealership sales process. There will be employees selling vehicles to customers.
- Create a way to handle the Customer. You will need to create a method that checks if the customer is financing, and if so, run
their credit history to see if they quality for a loan. They will alawys qualify for a loan if they want to finance, their loan amount will simply be the difference between their cash on hand and the price of the vehicle.

- If they are not financing, you will need to create a way to process the transaction. Make sure they have enough funds to afford the vehicle!


**SOLUTION/EXPLANATION**


**CUSTOMER CLASS**

What attributes does the customer have?
- private String name;
- private String address;
- private String cashOnHand;


What does a customer do?
- Purchases a vehicle. 

  (This is the method **purchaseCar**. In order for the customer to be able to purhcase that car,
  the method needs to look at the vehicle and employee class, as well as the option on if the customer will be financing the vehicle in the arguments.)
  ![image](https://user-images.githubusercontent.com/59266347/140597312-ddd6a792-725d-4155-ad9c-380b25753575.png)
  




DEALERSHIP CLASS

The Dealership class is our main method. This class will start our program. We will be creating an instance of the Customer and invoke its **purchaseCar** method and pass in the details.

- What vehicle does the customer want?
- Which employee helped him?
- Does the customer want to finance the vehicle? (True/False)


