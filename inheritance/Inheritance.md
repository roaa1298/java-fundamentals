# Inheritance2

### Shop class 

- At first, I made a super class(Manager) because there is methods and properties that have similar using from multiple classes. so we used a super to inherit these features to the subclasses.  
- Inside the shop class I created a constructor to create an instance of this class, and inside this contractor I initialize the properties of the class and invoking base-class(Manager) constructor to pass the name.  
- Also, I override the addReview method from the base class.  

### Theater class

- Inside the Theater class I created a constructor to create an instance of this class, and inside this contractor I initialize the properties of the class and invoking base-class(Manager) constructor to pass the name.  
- Also, I override the addReview method from the base class.  
- I added addMovie method to add movies names to the array list as strings.  
- I added removeMovie method to remove movies names from the array list.  
- we can add reviews without and with the movie name, by adding two constructors to the Review class, and we can call this case by 'the constructor is overloaded'.