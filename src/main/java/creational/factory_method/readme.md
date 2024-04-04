# Factory Method

Factory method is a creational design pattern.

#### Problem
Imagine that you’re creating a logistics management application. The first version of your app can only handle transportation by trucks, so the bulk of your code lives inside the Truck class.

After a while, your app becomes pretty popular. Each day you receive dozens of requests from sea transportation companies to incorporate sea logistics into the app.

#### Usage
- Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
- Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.

> ##### Note
> Factory method design pattern contains one factory method (mostly). 
> If it contains more factory methods, the design pattern gets closer to abstract factory design pattern.