# MClinc - Medical Appointment App

## Overview

MClinc is a modern Android application built to simplify medical appointment booking and patient management. It enables users to schedule appointments, manage their profiles, and track medical-related data بسهولة وكفاءة.

The app is developed using **Kotlin** and follows **Clean Architecture**, ensuring scalability, maintainability, and a clear separation of concerns.

---

## Architecture

The project follows **Clean Architecture + MVVM**, structured into three main layers:

* **Presentation Layer**

  * UI (Activities & Fragments using XML)
  * ViewModels

* **Domain Layer**

  * Business logic
  * Use Cases & Models

* **Data Layer**

  * Repositories
  * Firebase integration

### Advantages

* Scalable and maintainable codebase
* Clear separation of concerns
* Easier testing
* Clean and readable structure

---

## Tech Stack

* **Language:** Kotlin
* **UI:** XML Layouts
* **Architecture:** Clean Architecture + MVVM
* **Backend:** Firebase

  * Firebase Authentication
  * Firebase Firestore / Realtime Database
* **Navigation:** Fragment-based

---

## Features

### Authentication

* Sign Up
* Sign In
* Forgot Password

### Home

* Central navigation hub

### Appointment Management

* Book Appointment
* Appointment List
* Patient Queue

### Statistics

* Charts & data visualization

### Settings

* Edit Profile
* Upload Prescription
* UPI Payment
* Logout / Exit

---

## Application Flow

1. Start → Splash Screen
2. Navigate to Sign In / Sign Up / Forgot Password
3. After authentication → Home Screen
4. From Home:

   * Book Appointment
   * View Appointments
   * View Statistics
   * Open Settings
5. Firebase handles authentication and data storage
6. Exit from Settings

---

## Firebase Integration

Firebase is used for:

* User Authentication
* Storing appointments
* Managing patient queue
* Real-time updates

---

## Future Enhancements

* Push Notifications
* Dark Mode
* Doctor Dashboard
* Offline Support
