========================================================
    .___.__         ________ ____ ___.___               
  __| _/|__| ______/  _____/|    |   \   | ______ ____  
 / __ | |  |/  ___/   \  ___|    |   /   |/  ___// __ \ 
/ /_/ | |  |\___ \\    \_\  \    |  /|   |\___ \\  ___/ 
\____ | |__/____  >\______  /______/ |___/____  >\___  >
     \/         \/        \/                  \/     \/ 
========================================================
Project:      disGUIse Well-Check Clinic
Authors:      Al-Weeam Awad, Dave Bach, Michael Gilardi, 
	      Sean Hanson, Dylan Watts
Version:      3.0
Release Date: 4/29/2013
Course:       CSE 360, Phase III

    
===========
Description
===========
The purpose of disGUIse’s Well-Check Clinic software is to
create an efficient, simple, and convenient system where 
nurses can add patient’s to the database, and doctors can 
manage those patient’s medical records over time. The 
patient is able to directly enter in daily health indicators 
to their respective file, and the doctor can view them for 
observation. Finally, users can perform multiple actions 
using the software, such as: inputting comments, updating 
contact information, and adding prescriptions, with respect 
to login credentials.


=========
File List
=========
addNursePanel.java
addPatientPanel.java
addPrescription.java
changePassword.java
createPatientList.java
disGUIse.java
doctorPane.java
graphPanel.java
linkList.java
LoginCred.txt
loginPanel.java
nursePane.java
passwordReset.java
patientLinkedList.java
patientPane.java
popUp.java
securityQuestion.java
selectedPatientPane.java


=======
Details
=======
All users, doctors, nurses, and patients, will require a 
username and password in order to login to the clinic’s system 
and database. After logging in, users can create patients, 
edit them, or update medical information. If the username or 
password has been forgotten, the software will require the 
user to answer a security question in order to retrieve the 
account password. When a doctor is logged in, they can input 
comments, add prescriptions, and update patient information, 
saving it all to the patient’s medical file. When a nurse is 
logged in, they can update patient information, add a new 
patient to the database, and input daily indicators when the 
patient visits the clinic. When a patient is logged in, they 
can update their contact information, and input daily health 
indicators for doctor’s observation. Once a nurse adds a new 
patient to the system, a doctor and nurse are assigned to the 
patient. Patients are able to enter in daily health indicators 
such as weight, height, blood pressure, or sugar level, and view 
changes in their health over time with a graphical representation. 
Doctors can then view the patient’s health indicators and leave 
general or directive comments, add prescriptions to the account, 
or update patient information stored in the clinic database.


============
Requirements
============
Operating System:    Windows, Macintosh, Linux
Running Environment: Any Java compatible IDE


==============
Software Setup
==============
1. Open 'disGUIse.java' in a Java compatible IDE
2. Click 'Run' to begin running 'disGUIse.java'
3. The login screen will appear
4. Login using verified credentials from LoginCred.txt


===================
Functionality Notes
===================
Note1: LoginCred.txt is populated with all user's login credentials
Note2: '#' represents patient identification number

I.    How to Interpret Patient File System
       i.   "Patient Files"
             a. Files are in the form of #.txt
       ii.  "Indicator Files"
             a. Files are in the form of #indicators.txt
       iii. "Prescription Files"
             a. Files are in the form of #prescriptions.txt

II.   How to Log In
       i. Enter in a valid login identity found in LoginCred.txt
           a. Nurse accounts will open the Nurse Pane
           b. Doctor accounts will open the Doctor Pane
           c. Patient accounts will open the Patient Pane

III.  How to Delete a Patient
       i.   Access LoginCred.txt and locate desired user/patient
       ii.  Delete the line with the desired user/patient
       iii. Delete the 5 lines after the desired user/patient
       iv.  Save the updated LoginCred.txt file
       v.   Note desired patient's identification number (i.e. 1, 2, 3)
       vi.  Locate desired patient's "patient file" (see Section I)
       vii. Right click file, and select 'Delete'

IV.   How to Delete a Patient's Indicators/Prescriptions
       i.   Note desired patient's identification number (i.e. 1, 2, 3)
       ii.  Locate desired patient's "indicator file" (see Section I)
             a. To delete whole file:
                 i. Right click file, and select 'Delete'
             b. To delete single indicator:
                 i.  Select desired indicator by date, and delete the line
                 ii. Delete the four lines after the date
       iii. Locate desired patient's "prescription file" (see Section I)
             a. To delete whole file:
                 i. Right click file, and select 'Delete'
             b. To delete single prescription:
                 i.  Select desired prescription by date, and delete the line
                 ii. Delete the two lines after the date


====================
Compatibility Issues
====================
There are no known compatibility issues.