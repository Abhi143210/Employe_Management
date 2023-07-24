# Employee Management System

The Employee Management System is a Java Swing-based application that allows users to manage employee details, including adding, deleting, updating, and fetching records. It provides a secure login page to ensure access control to the system.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Employee Management System is designed to simplify the process of managing employee data within an organization. It offers a user-friendly graphical interface built using Java Swing, making it easy to interact with the application. The system requires users to log in with their security credentials to access the features, ensuring data security and privacy.

## Features
**Main Page:**
 -In the first page we have major button ADD TO CONTINUE.
 ![Main Page](https://github.com/Abhi143210/Employe_Management/blob/main/emp/splash.png)
- **Secure Login:** Users are required to log in with their credentials to access the application, ensuring that only authorized personnel can manage employee data.
 ![Login](https://github.com/Abhi143210/Employe_Management/blob/main/emp/login.png)

- **Employee Management:** Once logged in, users can perform various operations related to employee data:
   

    - In the Home Page we have Add, update,remove,view option can see.
       ![Home](https://github.com/Abhi143210/Employe_Management/blob/main/emp/home.png)

    - Add new employees to the system.
        ![Login](https://github.com/Abhi143210/Employe_Management/blob/main/emp/add.png)
    - Delete records of employees who are no longer with the organization.
      ![Remove](https://github.com/Abhi143210/Employe_Management/blob/main/emp/s4.png)

    - Update employee information, such as name, contact details, etc.
 ![Update](https://github.com/Abhi143210/Employe_Management/blob/main/emp/update.png)

    - Fetch and view all records of employees in the database.
 ![View](https://github.com/Abhi143210/Employe_Management/blob/main/emp/view.png)

## Technologies Used

The Employee Management System is developed using the following technologies:

- Java Swing: Java's GUI toolkit is used to create the graphical user interface, making the application interactive and visually appealing.

- Apache NetBeans IDE 8: The project is built using Apache NetBeans IDE, providing a user-friendly development environment.

- MySQL and JDBC: The application is connected to a MySQL database using Java Database Connectivity (JDBC), enabling data storage and retrieval.

## Installation

To run the Employee Management System locally, follow these steps:

1. Clone the repository to your local machine using the following command:


2. Open Apache NetBeans IDE 8 (or any compatible IDE) and navigate to the cloned project.

3. Set up a MySQL database and update the connection details in the application code (`src/com/example/DatabaseManager.java`) to match your database credentials.

4. Build and run the application from your IDE.

## Usage

1. Launch the application after completing the installation steps.

2. You will be prompted with a login page. Enter your credentials to log in.

3. Once logged in, you can access the different features of the Employee Management System, such as adding, deleting, updating, and fetching employee records.

## Contributing

We welcome contributions to the Employee Management System project. If you find any issues or want to add new features, feel free to submit a pull request.

Before contributing, please read our [contribution guidelines](CONTRIBUTING.md).

## License

The Employee Management System is open-source software licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this project as per the terms of the MIT License.

