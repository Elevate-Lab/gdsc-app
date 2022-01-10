# GDSC IIITA Community App

### Problem Statement :
How can students who are not the members of GDSC get to know about the events organised by GDSC and their timeline and how will they access the recordings and other resources provided by GDSC?

### Proposed Solution :
We observed that this problem was very common due to which a lot of students were unable to get information regarding the events organised by GDSC. Even if they were informed, there was no provision of reminders, so we came up with a solution. We developed an android application called GDSC IIITA which will remind the students about the events in advance and the students can also opt for time to time push notifications which will further increase the participation in the events. We will also upload the recordings of each event after the event is over, so that the unfortunate students that were unable to attend the event can also benefit from the GDSC events. The contact details of members of GDSC will also be available there so that the students can ask their doubts from the GDSC members directly through the application. Details of various projects currently done by the GDSC team will also be updated there, so the interested students can contribute to the projects. The students can also share their work with the mentors through the application. This application will help in providing the students an online platform to discuss among themselves and work on projects together. This application is based on our motto i.e. to “Build Good Things, Together”

<img src="https://user-images.githubusercontent.com/61201718/148825552-bb7acc56-c44d-49e9-9cde-29eeb6521345.jpg" width="600" height="900" />

### Functionality & Concepts used :
The App has a very simple and interactive interface which helps the students select their route bus and track its location. Following are few android concepts used to achieve the functionalities in app :
1. Constraint Layout : Most of the activities in the app uses a flexible constraint layout, which is easy to handle for different screen sizes.
2. Simple & Easy Views Design : Interactive buttons made it easier for students to register for the events and browse the projects. Apps also uses App Navigation to switch between different screens.
3. RecyclerView : To present the list of different route busses we used the efficient recyclerview. 
4. LiveData & Room Database : We are also using LiveData to update & observe any changes in the app data such as projcts and events. 
5. Firebase: We have used firebase to store data remotely and caching the data into Room Database

### Application Link & Future Scope :
The app is currently in the Alpha testing phase with GDSC team member, You can access the app [here](https://github.com/Elevate-Lab/gdsc-app/blob/main/app/release/app-release.apk). We are planning to launch this app by end of January.
