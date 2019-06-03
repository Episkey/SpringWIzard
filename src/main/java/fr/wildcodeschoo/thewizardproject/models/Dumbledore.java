package fr.wildcodeschoo.thewizardproject.models;

public class Dumbledore implements WizardInterface {

    private DressAdviceInterface dressCode;

    public Dumbledore(DressAdviceInterface theChangeDress) {
        dressCode = theChangeDress;
    }

    public String giveAdvice() {
        return "you have to choose harry";
    }

    public  String changeDress() {

        return this.dressCode.sendDressAdvice();
    }

}
