Task:
Create REST application Hotel booking
 
With capabilities (each represented by separate endpoint):
1. View list of available rooms (room have a number, category, price, additional options like breakfast, cleaning with additional cost) for specified dates.
2. View rooms filtered by category.
3. Create user.
4. User can book the room for specified days.
5. User can view his booking.
6. User can get the total price of the booking (room for dates period + cost of additional options).
7. View all bookings for the hotel.
 
Tech stack: Java 8, Spring Boot, Spring MVC, Spring Data, Hibernate, H2, maven.
Authentication and authorization are not included in the task.
 
Requirements:
1. Source code must be stored on GitHub with access to the repository.
2. The repository must contain file README.MD with instructions for launching the application and any other necessary documentation for the application (in English).
3. Running the application should not require a standalone application server (application should run on embedded tomcat server) or installation of any software except Java and maven. 
4. The project should contain SQL-script for creating database tables and filling them with data necessary to test application.
5. The project should be covered with unit tests.
6. Availability of UML class diagram is a plus.
 
Evaluation criteria:
• functional correctness according to the technical requirements,
• readability, maintainability, and compliance of the code with OOP and SOLID principles,
• documentation for the application and  the code,
• any non-standard technical solutions,
• any additional features not specified in the technical requirements, but making the application more functional or convenient,
• task execution time.

Solution:

For run and check my application you need pull it in IDEA.

After run application you can see title page on http://localhost:8988/
where will be this buttons:
![unknown](https://user-images.githubusercontent.com/32884032/37377746-6f8cf974-2734-11e8-9dc0-566b96673f21.jpg)

1. View list of available rooms (room have a number, category, price, additional options like breakfast, cleaning with additional cost) for specified dates.

Push "Free Rooms" and will map to page for choose dates(from-to) in format like yyyy/MM/dd. And will receive rest answer.

2. View rooms filtered by category.

Push "Found With Filters" and will map to page where will see 1 dropdown menu for choose category filter. And received rest answer.

3. Create user.

Push "Registration" for map to registration page and enter your values. After that will return to main page.

4. User can book the room for specified days.

Push "Reservation" and in next page choose "Category", Enter users surname and password for validate and choose dates.

5. User can view his booking.

Push "Your reserves" for enter users surname and password on next page and receive rest answer from database.

6. User can get the total price of the booking (room for dates period + cost of additional options).

Push "User Sum" and receive Integer number from server with includes breackfast and cleaning price.

7. View all bookings for the hotel.

Push "Show Reserves" and receive rest ansver from database with all includes for reserved rooms.

Requirements:
1. Source code must be stored on GitHub with access to the repository.

You are here now.

2. The repository must contain file README.MD with instructions for launching the application and any other necessary documentation for the application (in English).

Includes in project

3. Running the application should not require a standalone application server (application should run on embedded tomcat server) or installation of any software except Java and maven. 

application work with embedded tomcat server.

4. The project should contain SQL-script for creating database tables and filling them with data necessary to test application.

In my application there are files for init tables and filling them with data - schema.sql and data.sql. But i can`t run it befor spring boot testing.

5. The project should be covered with unit tests.

In my project you can see simple unit tests. Since i could not create tables befor spring boot tests i cant creat a tests for check rest answer.
But i check then i don`t connect to database and write other tests.

6. Availability of UML class diagram is a plus.
dont work with uml and dont have a time for studies now.
