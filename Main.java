import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("\033[H\033[J");
		while (true){
		Scanner in = new Scanner(System.in);
		String bebra;
		String input;
		String f;
		String z;
		String gdzputina;
		System.out.print("Божественные Ежинные Заметки LITE 0.1"+ "\n");
		System.out.print("Напиши n чтобы создать новый файл, q для выхода и r для прочтения файла"+"\n");
		input = in.nextLine();
		if (input.matches("n"))
		{
			System.out.println("Новый Файл");
			System.out.println("введите имя файла:");
			bebra = in.nextLine();
			File file = new File(bebra);
			file.createNewFile();
			FileWriter x = new FileWriter(file);
			while(true)
			{
				f = in.nextLine();
				if (f.matches("q"))
				{
					System.out.println("выход...");
					break;
				}
				if (f.matches("s"))
				{
					gdzputina = in.nextLine();
					x.write(gdzputina);
					x.flush();
					x.close();
				}
			}
		}
		if (input.matches("q"))
		{
			System.out.println("выход...");
			break;
		}
		if (input.matches("r"))
		{
			System.out.println("напиши имя и адрес файла который ты хочешь прочитать");
			z = in.nextLine();
			FileReader fr = new FileReader(z);
			char[] a = new char[1000];
			fr.read(a);
			for (char c : a)
				System.out.print(c);
			fr.close();
		}
	}
}
}
