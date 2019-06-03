package fr.wildcodeschoo.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DumbledoreId")
public class Dumbledore implements WizardInterface {

    private DressAdviceInterface dressCode;

    @Autowired
    public Dumbledore(@Qualifier("outfit")DressAdviceInterface theChangeDress) {
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
