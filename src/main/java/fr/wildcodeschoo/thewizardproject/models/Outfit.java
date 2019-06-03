package fr.wildcodeschoo.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Outfit implements DressAdviceInterface {

    @Override
    public String sendDressAdvice() {
        return "The wizard's dress is blue";
    }

}
