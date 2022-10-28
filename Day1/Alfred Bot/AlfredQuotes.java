import java.util.Date;
public class AlfredQuotes{
    Date date = new Date();
    public String basicGreeting(){
        return ("Hello, lovly to see you. How are you?");
    }

    public String guestGreeting (String name){
        String txt = String.format("Hello %s, lovly to see you", name);
        return(txt);
    }

    public String dateAnnouncement (){
        return("It is currently "+ date + ".");
    }

    public String respondBeforeAlexis(String conversation){
        int alexisName = conversation.indexOf("Alexis");
        int alfredName = conversation.indexOf("Alfred");
        if (alexisName >= 0){
            return("Right away, sir. She certainly isn't sophisticated enough for that.");
        }
        else if(alfredName >= 0){
            return("At your service. As you wish, naturally.");
        }
        else{
            return("Right. And with that I shall retire.");
        }
    }
}