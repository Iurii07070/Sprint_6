### Final Project of Sprint 6

You've been invited to assist zoologists in their research on the feline family. They are using a special program to record observations, and your task is to test a part of this program.

Refer to the [cheat sheet](https://praktikum.notion.site/1db8cbeae6a3494fbfaa62e1cf75d07e) to refresh your memory on the sprint's material.

To increase coverage, each method of each class should be called in a separate test. Write a separate test for each branch of the condition. Some branches will require parameterized testing.

The project consists of mandatory and additional tasks. The additional task does not affect the evaluation but helps gain more experience.
#### How to run:

`mvn clean test`

#### Mandatory Task

- Connect GitHub to the training environment. Once done, the qa_java repository will automatically appear in the repository list. There will be a project template in which you need to complete the code. More details in the [instructions](https://code.s3.yandex.net/qa-automation-engineer/java/track2/cheatsheets/sprint6/upload_project_6.pdf).
- Build a Maven project: include Jacoco, Mockito, and JUnit.
- The Lion class should not depend on the Feline class. Use the principle of dependency injection.
- Write mocks using Mockito. Determine which ones are needed on your own.
- Write tests for the Feline, Cat, and Lion classes.
- Think about where parameterization can be applied. Implement parameterized tests.
- Evaluate coverage using Jacoco: it should be at least 100% for the Feline, Cat, and Lion classes.

#### Additional Task

- Create the character Alex the lion from the movie "Madagascar." He will be a subclass of an ordinary lion.
- In addition to the usual methods, he has his own:
    - `getFriends()` returns a list of names of his friends: Marty the zebra, Gloria the hippopotamus, and Melman the giraffe.
    - `getPlaceOfLiving()` returns the place where he lives: the New York Zoo.
- Also, you need to override the `getKittens()` method because Alex does not have cubs. Also, write your constructor since there is no default constructor in the Lion class. Alex is male, so the same value will always be passed to the Lion class constructor.
- Test the created class with tests.

#### Evaluation Criteria

For the main task:
- Correct naming of elements. If you don't remember the rules, refer to the [cheat sheet](https://code.s3.yandex.net/qa-automation-engineer/java/cheatsheets/paid-track/sprint2/namingRules.pdf).
- Jacoco, Mockito, and JUnit are included in pom.xml.
- There is nothing unnecessary in pom.xml.
- Tests are located in src/test/java.
- The Lion class does not depend on the Feline class. The code is written with dependency injection.
- Mocks are used in tests.
- Parameterization is used in tests.
- The Feline, Cat, and Lion classes are covered by tests at 100%.
- Parameterized tests should be in a separate class.
- A report is made using Jacoco. Don't forget to commit the report. Open the console, navigate to the project folder, and execute the commands:


#### Add the Jacoco report folder to tracked files. The -f key will be useful if the target folder is specified in .gitignore.

`git add -f .\target\site\jacoco.`

#### Commit the changes

`git commit -m "add jacoco report"`

#### Push the files to the remote repository

`git push`


# Финальное практическое задание 6 спринта

## Включает в себя:
### 1. Классы для тестирования:
- **Animal** - описание класса "Животное".
- **Cat** - описание класса "Кошка".
- **Feline** - описание класса "Кошачьи". Наследуется от Animal, а так же имплементирует интерфейс Predator.
- **Lion** - описание класса "Лев". Изначальная реализация изменена - в конструктор добавлен дополнительный параметр Feline,
  обеспечивающий инъекцию зависимости.
- **LionAlex** - реализация конкретного экземпляра "лев Алекс". Наследуется от класса Lion.
  Требуется для дополнительного задания.

### 2. Тесты:
- **CatTest** - тестирование класса Cat. Использует @Spy для объекта feline и @Mock для класса Animal.
- **FelineTest** - тестрование класса Feline. Использует @Spy для объекта feline и @Mock для класса Animal.
- **LionAlexTest** - тестирование класса LionAlex. Использует @Spy для объекта feline и @Mock для класса Animal.
  Требуется для дополнительного задания.
- **Тесты для класса Lion** - разделены на 2 тестовых класса из-за особенностей оценки покрытия (параметризованные тесты
  не включаются в оценку, если тестовый класс запускается с помощью раннера Mockito):
    - **LionTest** - тестирование методов getFoodTest() и getKittensTest(). Использует @Spy для объекта feline и @Mock
      для класса Animal;
    - **LionParameterizedPositiveTest** - тестирование позитивных сценариев метода doesHaveMane(). Выполнен с помощью
      параметризации.
- **Тесты для класса Animal** - так же из-за особенностей оценки покрытия разделены на 2 тестовых класса:
    - **AnimalTest**- тестирование метода getFamilyTest().
    - **AnimalParameterizedPositiveTest** - тестирование позитивных сценариев метода getFood(). Выполнен с помощью параметризации.

Также проект содержит интерфейс **Predator** - "Хищник".