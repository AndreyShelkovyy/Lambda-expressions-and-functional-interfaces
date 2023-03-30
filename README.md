### Домашнее задание по теме «Лямбда-выражения и функциональные интерфейсы»
## Задача 1 (обязательная)
Задача 1 (обязательная)
Эта задача является продолжением задачи по теме «Коллекции TreeMap и TreeSet», поэтому для выполнения
этой задачи лучше сперва получить зачёт по предыдущей.

Возьмите репозиторий с решением задачи **«Коллекции TreeMap и TreeSet»**. Отведите ветку **lambda**. 
Удалите класс компаратора и в методе **main** замените объект этого удалённого класса на лямбду 
с той же логикой. Т.е. по сути мы дадим имплементацию компаратору на лету с помощью лямбды.

Если вы делали вторую задачу, то параметра не будет (их у лямбд не бывает) - вместо этого 
просто используйте напрямую в коде лямбды то значение, которое раньше передавали в конструктор 
компаратора.

Сделайте коммит и пуш в ветку **lambda**, создайте **PR** и не сливая скиньте ссылку на него в качестве 
решения этой задачи.

## Задача 2 (необязательная)
Эту задачу делаем в том же репозитории. Отведите ветку **eraser** от **main**.

Нашей целью будет удалить в списке людей в **main** тех людей, которые младше 18 лет 
(если сейчас в демонстрации нет таких людей - добавьте, чтобы их было как минимум 2). 
Но мы не будем для этого сами проходиться по списку, мы воспользуемся его готовым 
методом **removeIf**. Вызовите его у списка и передайте туда предикат **(Predicate<Person>)**, 
метод которого отвечал бы **true** тогда и только тогда, когда человеку из его параметра 
меньше 18 лет. Таким образом список сам пройдётся по своим элементам и оттестирует 
каждый вашим предикатом, на ком покажет **true** - тот и будет удалён.

Реализацию нужно сделать с помощью лямбды.

Сделайте коммит и пуш в ветку **eraser**, создайте **PR** и не сливая скиньте ссылку на него 
в качестве решения этой задачи.
