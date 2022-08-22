# Cursor: "Homework 06" (Andrey Kiyas)
___
### Git link(s):
- [Pull request 01 (Part 01)](https://github.com/andrey-kiyas/CursorHomeWorks06/pull/1)
- [Pull request 02 (Part 02)](https://github.com/andrey-kiyas/CursorHomeWorks06/pull/2)
___
### EN
HOMEWORK #1:
- Create new Spring Boot application using start.spring.io, add web starter as a dependency
- Write @restcontroller that returns List<UUID> on GET request (use @getmapping and/or @requestmapping) where @requestparam should define size of the list
- Example: if GET request is /uuid?size=100 then list should contain 100 unique uuids.
- Write @controller that returns index page with Lorem ipsum text (use any template engine you like)

HOMEWORK #2:
- Create separate maven project
- Write UuidService that generates UUIDs
- Make the module auto-configurable with @configuration class and resources/META-INF/spring.factories
- Install module into local's Maven repo mvnw clean install
- Add module as a dependency to the application from Homework 1
___
### UA
ДОМАШНЄ ЗАВДАННЯ №1:
- Створіть нову програму Spring Boot за допомогою start.spring.io, додайте веб-стартер як залежність
- Напишіть @restcontroller, який повертає List<UUID> на запит GET (використовуйте @getmapping та/або @requestmapping), де @requestparam має визначати розмір списку
- Приклад: якщо запит GET має значення /uuid?size=100, тоді список має містити 100 унікальних uuid.
- Напишіть @controller, який повертає сторінку індексу з текстом Lorem ipsum (використовуйте будь-який механізм шаблонів, який вам подобається)

ДОМАШНЄ ЗАВДАННЯ №2:
- Створіть окремий проект maven
- Напишіть UuidService, який генерує UUID
- Зробіть модуль автоконфігурованим за допомогою @configuration class і resources/META-INF/spring.factories
- Встановіть модуль у локальне репо Maven mvnw чиста інсталяція
- Додайте модуль як залежність до програми з домашнього завдання 1
---