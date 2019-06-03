package fr.wildcodeschoo.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("GangalfId")
public class Gandalf implements WizardInterface {

    private DressAdviceInterface dressCode;

    @Autowired
    public Gandalf(DressAdviceInterface theChangeDress) {
        dressCode = theChangeDress;
    }
    @Override
    public String giveAdvice() {
        return "you have to choose harry";
    }
    @Override
    public  String changeDress() {

        return this.dressCode.sendDressAdvice();
    }
}
