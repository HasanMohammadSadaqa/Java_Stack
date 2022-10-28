public class AlfredTest{
    public static void main(String[] args) {
        // Here to test my functionallity
        AlfredQuotes alfredBot = new AlfredQuotes();
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Hasan Sadaqa");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis("Hi Alexis, all is good?");
        String alfredTest = alfredBot.respondBeforeAlexis("Hey Alfred, whatsapp!");
        String notRelevantTest = alfredBot.respondBeforeAlexis("It is currently Wed Aug 11 16:34:59 PDT 2022.");

        // now to print 
        System.out.println(testGreeting);
        // System.out.println(testGuestGreeting);
        // System.out.println(testDateAnnouncement);
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);
        // System.out.println(notRelevantTest);
    }
}