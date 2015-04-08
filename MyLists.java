import java.util.LinkedList;
import java.util.List;

class MyLists
{
	public static void main(String[] args)
	{
		List<String> lst = new LinkedList<String>();
		lst.add("Строка 1");
		lst.add("Строка 2");
		lst.add("Строка 3");
		lst.add("Строка 4");
		
		System.out.println("Выводим, используя foreach: ");
		for (String string : lst) 
		{
			System.out.println(string);
		}
		
		System.out.println("\nВыводим, используя for и добавляем новый элемент на 2-ю позицию при выводе 3-го элемента: ");
		
		for (int i = 0; i < lst.size(); i++) 
		{
			if (i==2) lst.add(1,"новая строка"); 
		}
		
		listPrint(lst);
		
		System.out.println("\nУдаляем элемент со 2-й позиции при выводе 3-го элемента: ");
		
		for (int i = 0; i < lst.size(); i++) 
		{
			if (i==2) lst.remove(1);
		}
		
		listPrint(lst);
		System.out.write(1);
	}
	
	static void listPrint(List<String> lst)
	{
		for (int i = 0; i < lst.size(); i++) 
		{
			System.out.println(lst.get(i));
		}
	}
}