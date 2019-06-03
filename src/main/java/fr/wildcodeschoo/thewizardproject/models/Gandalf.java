package fr.wildcodeschoo.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private WizardInterface dressCode;

    public Gandalf(WizardInterface theChangeDress) {
        dressCode = theChangeDress;
    }

    public String giveAdvice() {
        return " You should not PASSS !! ";
    }

    public  String displayChangeDress() {

        return this.dressCode.changeDress();
    }
}
