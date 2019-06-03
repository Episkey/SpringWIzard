package fr.wildcodeschoo.thewizardproject.models;

public class Dumbledore implements WizardInterface {

    private WizardInterface dressCode;

    public Dumbledore(WizardInterface theChangeDress) {
        dressCode = theChangeDress;
    }

    public String giveAdvice() {
        return "you have to choose harry";
    }

    public  String displayChangeDress() {

        return this.dressCode.changeDress();
    }

}
