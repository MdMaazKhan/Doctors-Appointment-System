# Doctors-Appointment-System
## What is the need?
* Suppose you want to visit a doctor and you dont want to stand in the queue.
* What If you dont want to wait in the visitors room for the doctor.
* Suppose you have taken the appointment from the doctor but you dont know how long will it take untill he comes to your number.
* What if you want to know how many patients are in the queue for today.
* What if you want to know doctors duty time, doctors expertise, how many doctors.. etc
#### Well the solution for all these problems are in this project

## Description
The project is divided in two seperate modules<br>
### Patients Module: 
* A patient can view all the doctors in a particular hospital.
* A doctor's template will display his/her timings and expertise.
* On doctors template patients can see the number of patients in the queue for today and take the appointment accordingly.
* After taking the appointment you will get your number and a Success message as displayed below.<br><br>
![DisplayDoctors](https://user-images.githubusercontent.com/71049595/122639474-b66d4700-d117-11eb-8e5f-9e511f64b011.png)
<br><br>
![patientDetails](https://user-images.githubusercontent.com/71049595/122639564-2c71ae00-d118-11eb-845e-9834a5ae898d.png)
### Doctors Module: 
* Doctors have to login into their portal.
* Doctors can see the number of patients in the queue for today.
* The current patient would be displayed on the screen with his/her details.
* Doctor can decrease the current patient to visit the next patient in the queue.<br><br>
![DocTemplate](https://user-images.githubusercontent.com/71049595/122643362-0efb0f00-d12d-11eb-833e-e9d732ecc0a2.png)<br><br>

## Synchronization of modules
As the doctor will **decrease** the patient in his profile, The doctors template page for patients would be synchronized and hence simultaneously it will decrease the number of patients in real time. Similarly if any patient has taken an appointment his data would be stored in real time to the doctors profile and the number of patients in the queue will also be increased by one.

## Other Points
* Doctors have to register.
* Once the Doctor is verified his/her profile would be created.
* Doctors have to logout once all the patients are over for the day.
* Once a patient has taken an appointment he/she should be their when his/her number comes.

## Modifications in future
* We can limit the number of patients for one day.
* We can send a notification to the patient when his number comes via text api.
* We can make some time slots for taking appointments to handle traffic.
* If the patient couldn't show in time the number would be skipped automatically. 

## Few Screenshots
<img src="https://user-images.githubusercontent.com/71049595/122644226-c5f98980-d131-11eb-9244-70a958137419.png" width="450" height="360"/><img src="https://user-images.githubusercontent.com/71049595/122644232-cb56d400-d131-11eb-8bc2-1faf4b1c05a2.png" width="500" height="330"/>
<img src="https://user-images.githubusercontent.com/71049595/122644237-d0b41e80-d131-11eb-9397-50b6e0f1e604.png"  width="550" height="400"/><br><br>

## Technologies
* HTML
* CSS
* javascript
* BOOTSTRAP
* JSP
* SERVLET
* MYSQL




