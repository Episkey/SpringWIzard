package fr.wildcodeschoo.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private DressAdviceInterface dressCode;

    public Gandalf(DressAdviceInterface theChangeDress) {
        dressCode = theChangeDress;
    }

    public String giveAdvice() {
        return " You should not PASSS !! ";
    }

    public  String changeDress() {

        return this.dressCode.sendDressAdvice();
    }
}
