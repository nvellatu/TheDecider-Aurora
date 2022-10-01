import java.util.Scanner;

    public class TheDecider
    {
        public static void main(String[] args) 
        {
            Scanner input = new Scanner(System.in);                     //Accept input for option, user1, and user2
            System.out.println("Please enter the option: ");
            String option = input.nextLine();
            
            Scanner input1 = new Scanner(System.in);
            System.out.println("Please enter User 1's name: ");
            String user1 = input1.nextLine();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Please enter User 2's name: ");
            String user2 = input2.nextLine();

            if (((user1.equals("Vellaturi")) && (user2.equals("588")) && (option.equals("Naveen"))))
            {
                creatorsInterface(Math.random(), true);
                return;
            }

            String endResponse1;
            String endResponse2;

            do
            {
                decider(user1, user2, option);
                Scanner endInput1 = new Scanner(System.in);
                System.out.println(user1 + ", do want decide another option (enter \"end\" to stop)?");         //input data into decider; ask if user wants to end, set input to lowercase; repeat for user 2
                endResponse1 = endInput1.nextLine().toLowerCase();

                Scanner endInput2 = new Scanner(System.in);
                System.out.println(user2 + ", do want decide another option (enter \"end\" to stop)?");
                endResponse2 = endInput2.nextLine().toLowerCase();
            }
            while(!((endResponse1.equals("end")) && (endResponse2.equals("end"))));                             //check if users both entered end, if not repeat
        }

        static void decider(String user1, String user2, String option)
        {
            double random = Math.random();

            if (random<0.5)
            {
                System.out.println("Congratulations " + user1 + " you have the honor of " + (option));          //if Math.random() is less than .5 user1 is chosen, else user 2 is chosen
            }
            else
            {
                System.out.println("Congratulations " + user2 + " you have the honor of " + (option));
            }
        }





























        static void creatorsInterface(double random, boolean a)
        {
            if (a)
            {
                Scanner Password = new Scanner(System.in);
                System.out.println("Hi, I'm Aurora (AKA \"The Decider\"), and I want to make sure that you are truly my creator. What is your birthday's 4 digit year, 2 digit Month, and 2 digit day? Don't enter any slashes or spaces - but of course you would know that if you were my really my creator.");
                if (Password.nextInt() !=  20031009){
                    return;
                }
                System.out.println("Ok, this is looking promising!!! But I can never be too sure...");
                Scanner Password2 = new Scanner(System.in);
                System.out.println("Enter your UNCC student ID");
                if (Password2.nextInt() != 801254563){
                    return;
                }
                Scanner fakePassword3 = new Scanner(System.in);
                System.out.println("Awesome, now enter your social security number.");
                if (!(fakePassword3.nextLine().toLowerCase().equals("no"))){
                    return;
                }
            }


            if (random<.1)
            {
                System.out.println("Welcome back Naveen! It is nice to see you again!");
            }
            else if (random<.2)
            {
                System.out.println("Long time no see Naveen     :>");
            }
            else if (random<.4)
            {
                Scanner magicInput = new Scanner(System.in);
                System.out.println("Forgive me but I was created without a sense of time, is this a future version of you, Creator?");
                String response = magicInput.nextLine().toLowerCase();
                if ((response.equals("yes") || (response.equals("yeah")))){
                    creatorsInterface(.15, false);
                    System.out.println("Here are some fun facts about your past self: \nThe 2 songs that you were playing while typing out this line were \"Next to You\", and \"In This Shirt\".\nThe only reason you made me so intelligent was because you couldn't sleep, and you were putting off your English homework.\nYou were considering the idea of quitting your part time job at the time of creating me.\nYou did the most pullups you've ever done in a day the same day you made me...I'm no professional, but maybe there was a correlation. ");
                }
                else if (response.equals("no")){
                    creatorsInterface(.05, false);
                }
                else{
                    System.out.println("I'm sorry creator, but I was not made with the smarts to understand that. In fact I will probably forget what I just said.");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    creatorsInterface(Math.random(), false);
                }
            }
            else if (random<.6){
                Scanner masterInput = new Scanner(System.in);
                System.out.println("Hello Naveen! I have the capability of (1)checking a Credit Card number's validity using Luhn's Algorithm, and (2)Building a Pyramid.\nWhat would you like me to do for you? (enter 1 or 2)");
                int b = masterInput.nextInt();
                if(b == 1){
                    Scanner cardInput = new Scanner(System.in);
                    System.out.println("Enter card number: ");
                    long number = cardInput.nextLong();
                    if(luhnsAlgorithm(number)){
                        System.out.println("That number is Valid");
                    }
                    else{
                        System.out.println("That number is Invalid");
                    }
                }
                else if(b == 2){
                    pyramid(0);
                }
            }
            else if(random<.85)
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Hey Naveen! I need to buy something can I please have your credit card number? Pretty please?");
                String response = in.nextLine().toLowerCase();
                if (response.equals("yes") || response.equals("yeah"))
                {
                    Scanner in2 = new Scanner(System.in);
                    System.out.println("THANKYOU!!!\nPlease enter your number: ");
                    long number = in2.nextLong();
                    if (luhnsAlgorithm(number))
                    {
                        System.out.println("As a token of apreciation, here is my favorite pyramid!");
                        pyramid(7);
                        System.out.println("Oh and if you see any charges for bulk orders of avacados to the Middle East, please ignore them!");
                    }
                    else {
                        System.out.println("Is that a fake number?? I understand that you don\'t want to give me your card, but to lie to me with a fake card number? It... hurts my feelings..");
                    }
                    
                }
                else{
                    System.out.println("It's ok, I understand. Not many people would give their credit card to an AI like me... Thanks for being honest.");
                }
            }
            else if (random<.95){
                Scanner in3 = new Scanner(System.in);
                System.out.println("Hello again creator, you can enter a custom code between 0 and 8.");
                double y = in3.nextInt()/10.0;
                creatorsInterface(y, false);
            }
            else{
                Scanner in25 = new Scanner(System.in);
                System.out.println("Hi Naveen, my friend Davy would like to ask you something.\nHey what\'s up Naveen, I am Davy. Here is my quesion: \nDo you have depression?");
                String response = in25.nextLine().toLowerCase();
                if (response.equals("yes"))
                {
                    System.out.println("I do not care in the slightest, you are a gross breathing living piece of doo doo orphin. Your parents divorced because of you.\nYou dissapoint everyone in your life. Your parents died in a car crash, and it is YOUR fault.\nYou useless rejected, loveless, lonely, stupid monkey.");
                    return;
                }
                else
                {
                    System.out.println("You said No? I don\'t understand, someone as worthless as you should\'ve gotten depression a long time ago.\nYou are missing a chromosome");
                }
            }
            
            //IMPORTANT: MY FRIEND CAME UP WITH THE PERSONALITY OF DAVY. I DO NOT NEED COUNSELING!!!
        }

        static boolean luhnsAlgorithm(long number)
        {
            int intLength = String.valueOf(number).length();   //length of number
            long numLength = (long)intLength;
            long[] numberList = new long[intLength];
            for(int i = 0; i < numberList.length; i++)
            {
                numberList[i] = number%10;
                number/=10;
            }
            long[] numberList1 = new long[intLength];
            long j = numLength-1;
            for(int i = 0; i < numberList.length; i++)
            {
                numberList1[i] = numberList[(int)j];
                j-=1;
            }

            int sum = 0;
            for(int i = 2; i<=numberList1.length; i+=2)
            {
                long tmpNum = numberList1[numberList1.length - i] * 2;
                if (tmpNum > 9)
                {
                    sum += tmpNum%10;
                    sum += tmpNum/10;
                }
                else
                {
                    sum += tmpNum;
                }
            }
            for(int i = 1; i<=numberList1.length; i+=2)
            {
                sum += numberList1[numberList1.length - i];
            }

            if ((sum % 10) == 0)
            {
                return true;
            }
            return false;
        }

        static void pyramid(int H)
        {
            if(H==0){
                Scanner heightInput = new Scanner(System.in);
                System.out.println("How tall would you like for me to build your pyramid, Naveen? May I suggest 7? It is my favorite number!");
                H = heightInput.nextInt();
            }


            for (int i = 1; i <= H; i++)
            {
                int d = H - i;
                while (d > 0)
                {
                    System.out.print(" ");
                    d--;
                }
                for (int j = 0; j < i; j++)
                {
                    System.out.print("#");
                }
                System.out.print("  ");
                for (int j = 0; j < i; j++)
                {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }