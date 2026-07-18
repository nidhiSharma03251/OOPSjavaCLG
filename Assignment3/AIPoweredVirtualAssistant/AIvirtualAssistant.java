package Assignment3.AIPoweredVirtualAssistant;

interface Speaker{
    void speak(String text);
}

interface translator{
    void translate(String text, String language);
}

class AIassistant implements Speaker,translator{
    @Override
    public void speak(String text){
        System.out.println("Speak " + text);
    }

    @Override
    public void translate(String text, String language){
        System.out.println("AI assistant translate " + text + " to " + language+ ".......");

        if(language.equalsIgnoreCase("bengali")){
            System.out.println("Translated text:Nomoshkar! Tumi kemon aacho");
        }else if(language.equalsIgnoreCase("italian")){
            System.out.println("Translated text: Salve! Come va?");
        }else{
            System.out.println("Sorry translation not available.");
        }
    }
}
public class AIvirtualAssistant {
    public static void main(String[] args) {
        AIassistant Ai = new AIassistant();
        Ai.speak("Hello! How are you doing?");
        Ai.translate("Hello! How are you doing?", "italian");
    }
}
