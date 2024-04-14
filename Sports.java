import java.util.Scanner;

public class Sports {

  String red = "\033[1;31m";
  String cyan = "\033[1;34m";
  String green = "\u001B[32m";
  
	Sports(){
	
		Scanner Bot = new Scanner(System.in);  
    System.out.println(red + "What's up! My name is Don, and I am the biggest Amador Valley sports fan in the world! What's your name?" + red);

    String userName = Bot.nextLine();  

     System.out.println(cyan + "Hi " + userName + "! I am part of the Amador Valley Sports Department team.\nAsk me questions regarding concussion testing, soccer and basketball tryouts, PE waivers, grade requirements, ticket costs, and the sports played each season.\nIf you are not satisfied with my answer, please contact the Amador Valley Sports Department.\nIf you want to leave, say Goodbye." + cyan);  

while(true)
{
  String question = Bot.nextLine();
  
    if (question.toLowerCase().contains("goodbye")||question.toLowerCase().contains("bye")) 
    {
      System.out.println(cyan + "Cya around!"+ cyan);
      break;
    }
    
    else if (question.toLowerCase().contains("hey") || question.toLowerCase().contains("hi") || question.toLowerCase().contains("hello")) 
    {
      hey();
    }
    
    //Soccer 
    else if (question.toLowerCase().contains("soccer") && question.toLowerCase().contains("tryouts")) 
    {
      System.out.println(green + " ⚽ Soccer Tryouts: Day 1 - Wednesday, November 9 at 7 PM in Stanford Field. Soccer Tryouts: Day 2 - Thursday, November 10 at 7 PM in Stanford Field. Soccer Tryouts: Day 3 - Friday, November 11 at 10 AM in Walker Field." + green);
    }
    else if (question.toLowerCase().contains("basketball") && question.toLowerCase().contains("tryouts")) 
    {
      System.out.println(green + "🏀 Basketball tryouts are over for this year. Next year's date is to be determined. Ask me about the cost of basketball tickets." + green);
    }
    
    //Concussion
    else if (question.toLowerCase().contains("concussion") && question.toLowerCase().contains("valid"))
    {
      System.out.println(green + "The concussion test is valid for 2 years. Would you like to know if swim or dive requires concussion testing?" + green);
    }

     //Waiver 
    else if (question.toLowerCase().contains("waiver") && question.toLowerCase().contains("outside")) {
     System.out.println(green + "You can complete your PE waiver outside of school. Ask your counsellor for more information. Would like to know how many years of sports you need to complete your PE waiver?" + green);
    }
    else if(question.toLowerCase().contains("waiver") && question.toLowerCase().contains("due")) {
     System.out.println(green + "You have to submit your PE waiver before second semester in senior year. Would you like to know about completing your PE waiver outside of school?" + green);
    }
    else if(question.toLowerCase().contains("waiver") && question.toLowerCase().contains("sport")) {
     System.out.println(green + "You need 4 years of sports for a PE waiver. Would you like to know when PE waivers are due?" + green);
    }   
      else if(question.toLowerCase().contains("grade") && question.toLowerCase().contains("sport")) {
     System.out.println(green + "You have to make sure you are not failing in any classes to play sports." + green);    
   }  
   else if(question.toLowerCase().contains("spring") && question.toLowerCase().contains("start")) {
     System.out.println(green + "Spring sports start on the first week of February. Would you like to know when fall or winter sports start?" + green);    
   }
  else if(question.toLowerCase().contains("winter") && question.toLowerCase().contains("start")) {
     System.out.println(green + "Winter sports start on the last week of October. Would you like to know when fall or spring sports start?" + green);    
   } 
         else if(question.toLowerCase().contains("fall") && question.toLowerCase().contains("start")) {
     System.out.println(green + "Fall sports start on the start of first semester. Would you like to know when spring or winter sports start?" + green);    
   }      
           
  //conucssion   
    else if (question.toLowerCase().contains("concussion") && question.toLowerCase().contains("long") || question.toLowerCase().contains("time")) {
      System.out.println(green + "The concussion test is 20-30 minutes long. Would you like to know abut how long a concussion test is valid?" + green);
    }
    else if (question.toLowerCase().contains("concussion") && question.toLowerCase().contains("when")) {
      System.out.println(green + "2-3 weeks before the sport starts.  Would you like to know long concussion testing takes?" + green);
    }
    else if (question.toLowerCase().contains("concussion") && question.toLowerCase().contains("swim")) {
      System.out.println(green + "🏊‍♂️ Swim does not require concussion testing. Would you like to know if dive requires concussion testing?" + green);
    }
    else if (question.toLowerCase().contains("concussion") && question.toLowerCase().contains("dive")) {
      System.out.println(green + "🤿 Dive requires concussion testing. Would you like to know if swim requires concussion testing?" + green);
    }

    //sports
    else if (question.toLowerCase().contains("winter") && question.toLowerCase().contains("sport")) {
      wintersports();
    }
    else if(question.toLowerCase().contains("spring") && question.toLowerCase().contains("sport")) {
      springsports();
    }  
    else if(question.toLowerCase().contains("fall") && question.toLowerCase().contains("sport")) {
      fallsports();
    } 
    else if (question.toLowerCase().contains("sport")) {
      System.out.println("Please ask me about sports specific to a season.");
    }
      
    //tickets  
    else if (question.toLowerCase().contains("ticket")){
      if (question.toLowerCase().contains("football")) {
        System.out.println(green + "🏈 Tickets are $5 for students and $10 for adults. Would you like to know more about tickets?" + green);
      }
      if (question.toLowerCase().contains("basketball")) {
        System.out.println(green + "🏀 Tickets are $5 for students and $10 for adults. Would you like to know more about tickets?" + green);
      }
      if (question.toLowerCase().contains("wrestling")) {
        System.out.println(green + "🤼‍♂️ Tickets are $5 for students and $10 for adults. Would you like to know more about tickets?" + green);
      }
      if (question.toLowerCase().contains("volleyball")) {
        System.out.println(green + "🏐 Tickets are $5 for students and $10 for adults. Would you like to know more about tickets?" + green);
      }
      else {
        System.out.println(green + "🎫 Tickets are only sold for basketball, wrestling, volleyball, and wrestling." + green);
      }
    }
      
    //Unknown question  
    else
    {
		  no();
    }
  
  }
}
	

public static void no()
	{
String [] ans = {"Good Question! I cannot answer that right not, but you should try contacting the Activities Department.", "Sorry, I am not exactly sure. Please contact the Activities Department with this question.", "I do not know the answer to that. Maybe ask a different question?"};
int num = (int)(Math.random()*ans.length);
System.out.println(ans[num]);
	}
  
public static void hey()
  {
 
   String [] ans1 = { "Hello", "What's up!" ,"Hey there!"};      
    int num1 = (int)(Math.random()*ans1.length);
    System.out.println(ans1[num1]);
  }

public static void wintersports()
{
    String [] ans2 = {"basketball" , "wrestling", "soccer"};
int num2 = (int)(Math.random()*ans2.length);
System.out.println("One of the winter sports is " + ans2[num2] + ". Ask me about fall or spring sports.");
}

public static void springsports()
{
    String [] ans3 = {"baseball" , "lacrosse", "softball", "swim" , "badminton" , "track and field" , "dive" , "stunt cheer" , "boys tennis" , "boys golf" , "boys volleyball"};
int num3 = (int)(Math.random()*ans3.length);
System.out.println("One of the spring sports is " + ans3[num3] + ". Ask me about fall or winter sports.");
}  

  public static void fallsports()
{
    String [] ans4 = {"sideline cheer", "girls golf" , "girls tennis" , "cross country", "football" , "girls volleyball" , "water polo"};
int num4 = (int)(Math.random()*ans4.length);
System.out.println("One of the fall sports is " + ans4[num4] + ". Ask me about winter or spring sports.");
}  
  
}
