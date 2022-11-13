## Three Layer Architecture


![img.png](img.png)

### Presentation
- Controller
- Model (what populates the Thymeleaf templates)
- handler method responds with the view
- ONLY JOBS ARE TO 
  - manage the model and view

### Business Logic
- Service class
- contains all business related operations 
- middle man between controller and repository
- calls to repository pass via the service class first
- decision-making logic goes in the service class 

### Data Access
- Repository class
- CRUD Operations are inside the Repository class 

No direct communication between the **Presentation** (Controller) and **Data Access** (Repository class)


