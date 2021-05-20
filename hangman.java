import java.util.Scanner;

public class Hangman
{
    String word,clue;
    int option;
    public void Hang1()
    {
        System.out.println("      _______   ");
        System.out.println("     |       |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("_____|_____ ");
    }
    public void Hang2()
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       ");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("_____|_____ ");
    }
    public void Hang3()
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |");
        System.out.println("_____|_____ ");
    }
    public void Hang4()
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |      /");
        System.out.println("_____|_____ ");
    }
    public void Hang5()
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |       |");
        System.out.println("     |      / \\");
        System.out.println("_____|_____ ");
    }
    public void Hang6()
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |      /|");
        System.out.println("     |       |");
        System.out.println("     |      / \\");
        System.out.println("_____|_____ ");
    }
    public void Hang7()
    {
        System.out.println("      _______ ");
        System.out.println("     |       |");
        System.out.println("     |      ( )");
        System.out.println("     |       |");
        System.out.println("     |      /|\\");
        System.out.println("     |       |");
        System.out.println("     |      / \\");
        System.out.println("_____|_____ ");
    }

    private void printUser(char[] u)
    {
        for(int i = 0; i<u.length;i++)
        {
            System.out.print(u[i]+" ");
        }
        System.out.println();
    }

    public String[] Sports()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "He is an Argentine footballer who plays for La Liga club FC Barcelona and is the captain\n of the Argentina national team, playing mainly as a forward.";
                word = "LIONEL MESSI";
            }
            break;
            case 1:
            {
                clue = "First person to score 200 in ODIs";
                word = "SACHIN TENDULKAR";
            }
            break;
            case 2:
            {
                clue = "It is a South Asian team sport.";
                word = "KABADDI";
            }
            break;
            case 3:
            {
                clue = "It is a two-player board game";
                word = "CHESS";
            }
            break;
            case 4:
            {
                clue = "It is a team sport in which two teams of six players are separated by a net.";
                word = "VOLLEYBALL";
            }
            break;
            case 5:
            {
                clue = "Known as 'The wall'";
                word = "RAHUL DRAVID";
            }
            break;
            case 6:
            {
                clue = "World Table Tennis Champion";
                word = "ZHANG JIKE";
            }
            break;
            case 7:
            {
                clue = "A famous sport";
                word = "FOOTBALL";
            }
            break;
            case 8:
            {
                clue = "Played on a hard board divided by a net";
                word = "TABLE TENNIS";
            }
            break;
            case 9:
            {
                clue = "Grandmaster of chess";
                word = "VISHWANATAN ANAND";
            }
            break;
        }
        return new String[] {word,clue};
    }

    public String[] Movies()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "Movie in which Daniel Radcliffe has acted";
                word = "THE WOMAN IN BLACK";
            }
            break;
            case 1:
            {
                clue = "It is a 2012 Indian satirical comedy film that satires organized religion directed by Umesh Shukla";
                word = "OH MY GOD";
            }
            break;
            case 2:
            {
                clue = "Schwarzenegger plays the role of a cyborg assassin sent back\n in time from the year 2029 to 1984 to kill Sarah Connor";
                word = "THE TERMINATOR";
            }
            break;
            case 3:
            {
                clue = "It is a movie about 2 kids who become spies";
                word = "SPY KIDS";
            }
            break;
            case 4:
            {
                clue = "This film stars Jason Statham as Frank Martin, a driver for hire \n a mercenary transporter who will deliver anything, anywhere – no questions asked – for the right price";
                word = "THE TRANSPORTER";
            }
            break;
            case 5:
            {
                clue = "This film tells the story of Jamal Malik, a young man from the Juhu slums\n of Mumbai who appears on the Indian version of Who Wants to Be a Millionaire?";
                word = "SLUMDOG MILLIONARE";
            }
            break;
            case 6:
            {
                clue = "Set during the Sierra Leone Civil War in 1996–2001, the film shows a country\n torn apart by the struggle between government soldiers and rebel forces";
                word = "BLOOD DIAMOND";
            }
            break;
            case 7:
            {
                clue = "This film stars Macaulay Culkin as Kevin McCallister, an eight-year-old boy, who is mistakenly\nleft behind when his family flies to Paris for their Christmas vacation";
                word = "HOME ALONE";
            }
            break;
            case 8:
            {
                clue = "This film follows Dominic Toretto, Brian O'Conner and Mia Toretto as they plan a heist\n to steal $100 million from corrupt businessman Hernan Reyes";
                word = "FAST FIVE";
            }
            break;
            case 9:
            {
                clue = "This film consists of many superheroes";
                word = "THE AVENGERS";
            }
            break;
        }
        return new String[] {word,clue};        
    }

    public String[] Computers()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "The brain of the computer";
                word = "CENTRAL PROCESSING UNIT";
            }
            break;
            case 1:
            {
                clue = "Stores a real world 2d object in the form of a digital image";
                word = "SCANNER";
            }
            break;
            case 2:
            {
                clue = "A screen that displays output from a computer";
                word = "MONITOR";
            }
            break;
            case 3:
            {
                clue = "It is a family of computer networking technologies for LANs";
                word = "ETHERNET";
            }
            break;
            case 4:
            {
                clue = "It is a computer network that uses Internet Protocol technology to share information,\noperational systems, or computing services within an organization";
                word = "INTRANET";
            }
            break;
            case 5:
            {
                clue = "It is an IDE for Java";
                word = "BLUE J";
            }
            break;
            case 6:
            {
                clue = "It is an application developed by Microsoft that is used for playing audio,\nvideo and viewing images";
                word = "WINDOWS MEDIA PLAYER";
            }
            break;
            case 7:
            {
                clue = "It is a software application that provides comprehensive facilities \nto computer programmers for software development";
                word = "INTEGRATED DEVELOPMENT ENVIRONMENT";
            }
            break;
            case 8:
            {
                clue = "It is a temporary form of computer data storage";
                word = "RANDOM ACCESS MEMORY";
            }
            break;
            case 9:
            {
                clue = "It is a digital circuit that performs arithmetic and logical operations.";
                word = "ARITHMETIC AND LOGIC UNIT";
            }
            break;
        }
        return new String[] {word,clue};        
    }

    public String[] Food()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "It is an Indian food cited as top ten tasty foods of the world";
                word = "MASALA DOSA";
            }
            break;
            case 1:
            {
                clue = "A fruit which has the same name as its colour";
                word = "ORANGE";
            }
            break;
            case 2:
            {
                clue = "It is an oven-baked, flat, round bread typically topped with\na tomato sauce, cheese and various toppings";
                word = "PIZZA";
            }
            break;
            case 3:
            {
                clue = "It is a type of staple food made from some type of unleavened dough\nwhich is rolled flat and cut into long thin strips";
                word = "NOODLES";
            }
            break;
            case 4:
            {
                clue = "Sorry. No clue for this one";
                word = "PINEAPPLE";
            }
            break;
            case 5:
            {
                clue = "A bun between which a patty is kept";
                word = "BURGER";
            }
            break;
            case 6:
            {
                clue = "A famous Indian Cuisine known as 'chat'";
                word = "PANI PURI";
            }
            break;
            case 7:
            {
                clue = "Is perfect for completing the idiom - As cool as a ______________";
                word = "CUCUMBER";
            }
            break;
            case 8:
            {
                clue = "Consists of two or more slices of bread with fillings between them";
                word = "SANDWICH";
            }
            break;
            case 9:
            {
                clue = "Sorry. No clue for this one";
                word = "PASTA";
            }
            break;
        }
        return new String[] {word,clue};        
    }

    public String[] Countries()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "Means 'Rich Coast' in Spanish";
                word = "COSTA RICA";
            }
            break;
            case 1:
            {
                clue = "Sorry. No clue for this one";
                word = "INDIA";
            }
            break;
            case 2:
            {
                clue = "T&T";
                word = "TRINIDAD AND TOBAGO";
            }
            break;
            case 3:
            {
                clue = "Consists of nearly one thousand islands";
                word = "SOLOMON ISLANDS";
            }
            break;
            case 4:
            {
                clue = "It's capital is Riyadh";
                word = "SAUDI ARABIA";
            }
            break;
            case 5:
            {
                clue = "Lucky guy : You're getting a free letter : P";
                word = "THE PHILIPPINES";
            }
            break;
            case 6:
            {
                clue = "The fastest man on Earth is from this country";
                word = "JAMAICA";
            }
            break;
            case 7:
            {
                clue = "3 movies have been filmed using this country's name";
                word = "MADAGASCAR";
            }
            break;
            case 8:
            {
                clue = "Greatest world power";
                word = "UNITED STATES OF AMERICA";
            }
            break;
            case 9:
            {
                clue = "Lucky guy : You're getting a free letter : Y";
                word = "MALAYSIA";
            }
            break;
        }
        return new String[] {word,clue};
    }
//     public int wordlength(String w)
//     {
//         int c = 0;
//         {
//             for(int i = 0;i<w.length();i++)
//             {
//                 if(w.charAt(i)!=32)
//                 {
//                      c++;
//                 }
//             }
//         }
//         return c;
//     }

    public static void main(String[] args)
    {
        Hangman obj = new Hangman();
        Scanner scan = new Scanner(System.in); 
        System.out.println("Lets play HANGMAN");
        System.out.println();
        System.out.println("Enter your choice according to the following options.\nNOTE: Words are related to the topics given below.\n\n1. Sports\n2. Movies\n3. Computer\n4. Food\n5. Countries");
        System.out.println();
        int choice = scan.nextInt();
        System.out.println("\f");
        String bothwordandclue[] = new String[2];
        if(choice == 1)
            bothwordandclue = obj.Sports();
        else if(choice == 2)
            bothwordandclue = obj.Movies();
        else if(choice == 3)
            bothwordandclue = obj.Computers();
        else if(choice == 4)
            bothwordandclue = obj.Food();
        else if(choice == 5)
            bothwordandclue = obj.Countries();
        else
        {
          System.out.println("Wrong choice");
        }
        int counter = 7;
        String guessword = bothwordandclue[0];
        String wordclue = bothwordandclue[1];
        int lengthofword = guessword.length();
        int checkguess = 0;
        char letters[] = new char[lengthofword];
        char user[] = new char[lengthofword];
        // int ctr = 0;
        boolean win = false;
        for(int i = 0;i<user.length;i++)
        {
            char letter = guessword.charAt(i);
            letters[i] = letter;
            if(Character.isLetter(letter))
            {
            if((letter == 'A')||(letter == 'E')||(letter == 'I')||(letter == 'O')||(letter == 'U'))
            {
                user[i]='x';
            }
            else
            {
                user[i] = '_';
            }
            }
        }
        
        // game starts
        System.out.println("Clue: " + wordclue);
        do
        {
            if(counter == 6)
                obj.Hang1();
            else if(counter == 5)
                obj.Hang2();
            else if(counter == 4)
                obj.Hang3();
            else if(counter == 3)
                obj.Hang4();
            else if(counter == 2)
                obj.Hang5();
            else if(counter == 1)
                obj.Hang6();
                
            System.out.println();
            obj.printUser(user);
            System.out.println("Enter your guess letter");
            String guessletter = scan.next();
            guessletter = guessletter.toUpperCase();
            System.out.println("\f");
            char ch = guessletter.charAt(0);
            checkguess=0;
            for(int i = 0;i<lengthofword;i++)
            {
                if(ch == letters[i])
                {
                    if((user[i]=='x') || (user[i]=='_')) {
                        checkguess=1;
                        user[i]= ch;
                    }
                }                
            }
            String userword = new String(user);
            if(userword.equals(guessword))
            {
                System.out.println("\t\tCONGRATULATIONS! YOU HAVE WON THE GAME!");
                win = true;
            }
            else
            {
                if(checkguess == 1)
                {
                    System.out.println("Correct Guess. You have " + counter + " incorrect guesses left");
                    System.out.println();
                }
                else
                {
                    counter--;
                    System.out.println("Wrong guess. You have " + counter + " incorrect guesses left");
                    System.out.println();
                }
            }
            if(counter == 0)
             {   System.out.println("Wrong guess. You hanged the man :(");
                System.out.println();
                obj.Hang7();
                System.out.println("\nSorry you lost the game\n\nThe correct word is " + guessword);
            }
            System.out.println("Statements to check");
            System.out.println("Counter " + counter);
        }while((counter>0)&&(win==false));
    }
}
