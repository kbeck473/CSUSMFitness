# CSUSM Fitness Membership Management System (MMS)

## Overview

The **CSUSM Fitness Membership Management System (MMS)** is a Java-based desktop application designed to help gym and fitness facility administrators manage their memberships efficiently. It allows admins to add, update, view, and delete members from a central SQL database, monitor attendance in real-time, and streamline the check-in/check-out process.

🎯 Initial target: Gym/Fitness centers  
⚙️ Stack: Java (UI + Backend) + MySQL (DB)

---

## Features

- Intuitive and user-friendly UI  
- Real-time member check-in tracking  
- Add/Delete/Update member profiles  
- View individual member information  
- Track number of active members in facility  
- Secure, validated database interactions  

---

## Screenshots

`(Add your images to the /images directory and link them below)`
## Screenshots

### 🏠 Main Menu  
![Main Menu](./mainmenu.jpg)

### ➕ Create New User  
![Create New User](./createuser.jpg)

### 🔍 View User  
![View User](./viewuser.jpg)

### ❌ Delete User  
![Delete User](./deleteuser.jpg)

### 🔁 Check In/Out  
![Check In/Out](./checkin.jpg)


---

## Architecture

**Frontend:** Java Swing/JavaFX UI  
**Backend:** Java logic to handle validation and SQL interactions  
**Database:** MySQL (local or remote)

**System Flow:**

`[UI (Java)] → [Backend Logic (Java)] → [MySQL Queries] → [Database]`

---

## Technical Requirements

- Java 8 or higher  
- MySQL Server (local or hosted)  
- Windows or macOS  
- Internet connection if using remote DB  

---

## Installation

1. Clone the repository

   ```
   git clone https://github.com/kbeck473/CSUSMFitness.git
   cd CSUSMFitness
   ```

2. Configure MySQL

   - Create/import database schema (if provided)
   - Update DB connection details in the code

3. Compile and run

   ```
   javac Main.java
   java Main
   ```

---

## Functional Requirements

| Feature              | Description                                                  | Priority   |
|----------------------|--------------------------------------------------------------|------------|
| Create New User      | Adds a member to the system with validated input             | High       |
| View User Info       | Searches for a user by ID and displays their information     | High       |
| Delete User          | Removes a user from the system by ID                         | Medium     |
| Current Check-ins    | Displays number of users currently in the facility           | Low        |
| Check-in/Check-out   | Toggles a user’s check-in status                             | Medium     |

---

## Risk Analysis

**Main Risk:** Database crash or connection loss  
**Mitigation:** Periodic backups and reconnection handling logic

---

## Development and Testing

- GitHub used for version control  
- Team-based code review  
- Testing began with a small hardcoded dataset  
- Team Members:
  - Kyle Beck
  - Jorge Becerra
  - Juan Ramirez

---

## Future Enhancements

- User authentication and role management  
- Reporting and analytics dashboards  
- Mobile/web version  
- Automated email/SMS alerts  

---

## License

This project is based on an academic template by Karl E. Wiegers.  
© 2023 CSUSM Fitness Project Team — For personal and academic use only.

---

## References

- [MySQL System Requirements](https://dev.mysql.com/doc/mysql-monitor/8.0/en/system-prereqs-reference.html)  
- [GitHub Repository](https://github.com/kbeck473/CSUSMFitness)
