package edu.mum.cs.ea.springbatch.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person,Person>{
    private static final Logger logger = LoggerFactory.getLogger(PersonItemProcessor.class);
    @Override
    public Person process(Person person) throws Exception {
        String firstName = person.getFirstName().toUpperCase();
        String lastName = person.getLastName().toLowerCase();
        Person transformedPerson = new Person(firstName,lastName);
        logger.info("Converting (" + person + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }
}
