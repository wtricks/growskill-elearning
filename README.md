# GrowSkill E-learning

To build an e-learning platform like GrowSkill, we'll need to define the user journey, data models, constraints, relationships, data types, and implementation details. Here's an overview of each step:

## User Journey

Let's take the case of a user named Alice who wants to enroll in a Baking course on GrowSkill:

1. __User Registration and Login:__

Alice visits the GrowSkill website.
She registers for an account with her email and password or logs in if she already has an account.


2. __Browsing Courses:__

After logging in, Alice browses the available courses.
She selects the Baking course she's interested in.


3. __Course Details:__

Alice views the course details, including the course description, instructor's name, class schedule, and pricing.


4. __Enrollment:__

Alice decides to enroll in the Baking course.
She adds the course to her cart and proceeds to the payment page.


5. __Payment:__

Alice enters her payment information (credit card, PayPal, etc.).
She confirms the payment, and the system processes the transaction.


6. __Accessing Live Classes:__

After successful payment, Alice gains access to the live class schedule, including date, time, topics, and Zoom links.
She attends the live classes via the provided Zoom links.


7. __Course Completion:__

After completing the course, Alice can access course recordings.
She can also download a certificate of completion.
Data Models:


## User Model

__Fields:__ user_id, username, email, password, role (instructor or student)
Course Model:

__Fields:__ course_id, title, description, instructor_id, price
Class Model:

__Fields:__ class_id, course_id, date, time, topic, zoom_link
Enrollment Model:

__Fields:__ enrollment_id, user_id, course_id, payment_status
Payment Model:

__Fields:__ payment_id, user_id, course_id, transaction_date, amount
Recording Model:

__Fields:__ recording_id, course_id, link, date
Certificate Model:

__Fields:__ certificate_id, user_id, course_id, date_earned
Constraints, Relationships, and Data Types:

User roles (instructor and student) are defined in the User Model.
The Course Model has a foreign key relationship with the Instructor Model (instructor_id).
The Class Model has a foreign key relationship with the Course Model (course_id).
The Enrollment Model links users to courses with foreign keys (user_id, course_id).
The Payment Model records transactions associated with users and courses.
The Recording Model associates recordings with specific courses.
The Certificate Model links users to courses for which they've earned certificates.


## Implementation

For each step in the user journey, you'll need to write CRUD (Create, Read, Update, Delete) and read queries using your chosen technology stack (Java, Spring Boot, a database like MySQL or PostgreSQL). Below are some examples:


1. __User Registration (Create User):__

INSERT INTO User (username, email, password, role) VALUES (?, ?, ?, ?)


2. __Browsing Courses (Read Courses):__

SELECT * FROM Course


3. __Enrollment (Create Enrollment):__

INSERT INTO Enrollment (user_id, course_id, payment_status) VALUES (?, ?, ?)


4. __Accessing Live Classes (Read Classes for a Course):__

SELECT * FROM Class WHERE course_id = ?


5. __Course Completion (Read Recordings and Certificates):__

SELECT * FROM Recording WHERE course_id = ?
SELECT * FROM Certificate WHERE user_id = ?