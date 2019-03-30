package ru.job4j.calculate;

/**
*класс для вывода привет мир
*@author tyuterev
*@since 28.03.2019
*@version 1
*/


public class Calculate {
	/**
	*main
	*@param args - args
	*/
	public static void main(String[] args) {
		System.out.println("Hello, World");
	}
	/**
	*метод эхо.
	*@param name - твое имя
	*@return Echo плюс твое имя.
	*/
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
}
