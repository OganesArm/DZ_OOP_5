package DZ_Seminar5;

/*
Создать в формате MVP проект блокнот. Суть: пользователь может делать какие-то записи для себя (список продуктов или
запись к врачу, не важно, просто текст, который надо сохранить). Приложение сохраняет эти записи и при просьбе
пользователя может выдавать список всех записей. Сохранять можно в обычный список (например ArrayList) или в файл*.
Все общение с пользователем должно быть во view части проекта. Можно построить диалог с пользователем по типу: выберите
команду: 1- добавить фразу, 2- вывести весь список. Усложнение проекта на свой вкус) например можно сохранять в формате
JSON или реализовать возможность удаления или изменения записей.
*/

 import DZ_Seminar5.model.Notepad;
 import DZ_Seminar5.presenter.Presenter;
 import DZ_Seminar5.view.ConsoleUI;
 import DZ_Seminar5.view.View;
 
 public class Program {
     public static void main(String[] args) {
         View view = new ConsoleUI();
         Notepad notepad = new Notepad();
         new Presenter(view, notepad);
 
         view.start();
     }
 }