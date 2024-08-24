# Banking Application

## Project Overview

This is a simple banking application built with **Spring Boot** that provides a RESTful API for managing bank accounts and performing financial transactions. The application supports creating accounts, making deposits, withdrawals, and transferring funds between accounts.

The project demonstrates the use of Spring Boot and Spring Data JPA to build a RESTful API and manage data in a relational database.

## Key Features

- **Account Creation**: Create new bank accounts with a name and initial balance.
- **Deposit**: Add funds to an existing account.
- **Withdraw**: Withdraw funds from an existing account.
- **Transfer**: Transfer funds between two accounts.

## Technologies Used

- **Spring Boot**: For building the application and managing RESTful services.
- **Java Persistence API (JPA)**: For managing entities and persisting data.
- **Maven**: For project management and dependency management.

## Endpoints

- `GET /accounts`: Retrieve a list of all accounts.
- `POST /accounts`: Create a new account.
- `POST /deposit`: Deposit funds into an account.
- `POST /withdraw`: Withdraw funds from an account.
- `POST /transfer`: Transfer funds between two accounts.

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/albonidrizi/SimpleBankingApp.git
