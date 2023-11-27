Arquetipo Serenity BDD Screenplay
Consideraciones
- Proyecto con configuraciones en serenity.conf unicamente para chrome, debe modificarse si se desean capabilities de otros navegadores
  Name
  Proyecto base de Serenity BDD con Screenplay

Description
This project aims to establish a standard base for test automation with Srenity BDD and Screenplay

✅ Technologies
This project required:
[JDK java] version 16
[Maven] version
[Serenity] version
[Cucumbre] version
[JUnit] version
Project status
🚧 Proyecto en construcción 🚧
Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

📁 Access to project
Create or upload files
Add files using the command line or push an existing Git repository with the following command:
cd existing_repo
git remote add origin https://gitlab.com/calidad_de_software/.../.git
git branch -M develop
git push -uf origin develop
🛠️ Run tests Chrome gradle:
gradle clean test -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test --info --stacktrace --tests "ruta.nameRunner" -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test -Dcucumber.options="--tags @someTag" -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test -Dcucumber.options="--tags '@someTag or @someTag'" -Dcontext=chrome -Dwebdriver.driver=chrome
ejemplo
gradle clean test --info --stacktrace --tests "co.com.proyecto.runners.GoogleRunner" -Dcontext=chrome -Dwebdriver.driver=chrome
🛠️ Run tests Firefox gradle:
gradle clean test -Dcontext=firefox -Dwebdriver.driver=firefox
gradle test --tests "co.com.pragma.runners.GoogleRunner" -Dcontext=firefox -Dwebdriver.driver=firefox
ejemplo
gradle clean test --info --stacktrace --tests "co.com.proyecto.runners.LoginRunner" -Dcontext=firefox -Dwebdriver.driver=firefox
cucumber.options might be cucumberOptions according to version

Run tests in different environments:
gradle command... -Denvironment=defaul
gradle command... -Denvironment=dev
gradle command... -Denvironment=qa
gradle command... -Denvironment=prod
Note:

The default environment will be used if no other value is provided
Could modify the environment urls in .../test/resources/serenity.conf
** 🛠️ Run after tests to generate report, If is necesary **
gradle serenity:aggregate
Collaborate with your team
Invite team members and collaborators
Create a new merge request
Automatically close issues from merge requests
Enable merge request approvals
Automatically merge when pipeline succeeds
Test and Deploy
Use the built-in continuous integration in GitLab.

Get started with GitLab CI/CD
Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)
Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy
Use pull-based deployments for improved Kubernetes management
Set up protected environments
Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

Authors and acknowledgment

License
Open source project.