package com.shan.spring5.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("ES")
@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Munda - ES";
    }
}
