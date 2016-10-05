package com.epam.pirate.dataimport;


import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.pirate.dao.CharityRepository;
import com.epam.pirate.dao.OfferRepository;
import com.epam.pirate.dao.UserRepository;
import com.epam.pirate.model.Charity;
import com.epam.pirate.model.CharityBuilder;
import com.epam.pirate.model.CharityCategory;
import com.epam.pirate.model.CharityEvent;
import com.epam.pirate.model.CharityEventBuilder;
import com.epam.pirate.model.Offer;
import com.epam.pirate.model.OfferBuilder;
import com.epam.pirate.model.User;
import com.epam.pirate.model.UserBuilder;


@Component
public class DataImportListener
{
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private CharityRepository charityRepo;
    @Autowired
    private OfferRepository offerRepo;


    @PostConstruct
    public void insertData()
    {
        if (!userRepo.findAll().iterator().hasNext())
        {
            User alex = new UserBuilder().mail("alex@epam.com")
                                         .address("Sofia, Ilinden")
                                         .password("123")
                                         .contactPhone("0885123123")
                                         .build();

            User kalo = new UserBuilder().mail("kalo@epam.com")
                                         .address("Sofia, Svoboda")
                                         .password("123")
                                         .contactPhone("0885213123")
                                         .build();

            userRepo.save(alex);
            userRepo.save(kalo);

            Charity redCross = new CharityBuilder().category(CharityCategory.WELFARE)
                                                   .contactPhone("0888123123")
                                                   .description("The Bulgarian Red Cross")
                                                   .name("The Bulgarian Red Cross")
                                                   .linkToOfficialPage("http://en.redcross.bg/")
                                                   .mail("bulgaria@redcross.gov")
                                                   .build();

            Charity animalRescue = new CharityBuilder().category(CharityCategory.ANIMALS_AND_WILDLIFE)
                                                       .contactPhone("0888321312")
                                                       .description("Animal Rescue Sofia")
                                                       .name("Animal Rescue Sofia")
                                                       .linkToOfficialPage("http://arsofia.com/")
                                                       .mail("animalrescue@gmail.com")
                                                       .build();

            Charity amnestyInternational = new CharityBuilder().category(CharityCategory.ANIMALS_AND_WILDLIFE)
                                                               .contactPhone("0888321312")
                                                               .description("Amnesty International")
                                                               .name("Amnesty International")
                                                               .linkToOfficialPage("https://www.amnesty.org/en/countries/europe-and-central-asia/bulgaria/")
                                                               .mail("amnesty@gmail.com")
                                                               .build();

            charityRepo.save(redCross);
            charityRepo.save(amnestyInternational);
            charityRepo.save(animalRescue);

            ArrayList<String> offer1pics = new ArrayList<>();
            offer1pics.add("offer1.jpg");
            Offer offer1 = new OfferBuilder().category("Electronics")
                                             .title("Very nice flat screen TV, really cheap!")
                                             .description("This was my favourite TV, but now I have a new one and want to sell this one!")
                                             .price(2000)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer1pics)
                                             .build();

            ArrayList<String> offer2pics = new ArrayList<>();
            offer2pics.add("offer2.jpg");
            Offer offer2 = new OfferBuilder().category("Electronics")
                                             .title("Smart TV for sale")
                                             .description("This was my favourite TV, but now I have a new one and want to sell this one!")
                                             .price(500)
                                             .targetCharity(amnestyInternational)
                                             .user(kalo)
                                             .pictures(offer2pics)
                                             .build();

            ArrayList<String> offer3pics = new ArrayList<>();
            offer3pics.add("offer3.jpg");
            Offer offer3 = new OfferBuilder().category("Electronics")
                                             .title("Generic Smartphone")
                                             .description("Some smartphone. Can talk, read, write and sing.")
                                             .price(500)
                                             .targetCharity(animalRescue)
                                             .user(kalo)
                                             .pictures(offer3pics)
                                             .build();

            ArrayList<String> offer4pics = new ArrayList<>();
            offer4pics.add("offer4.jpg");
            Offer offer4 = new OfferBuilder().category("Books")
                                             .title("War and Peace")
                                             .description("Absolute classic, everyone should read it!")
                                             .price(20)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer4pics)
                                             .build();
            ArrayList<String> offer5pics = new ArrayList<>();
            offer5pics.add("offer5.jpg");
            Offer offer5 = new OfferBuilder().category("Books")
                                             .title("Fifty shades of gray")
                                             .description("I just want to get rid of it...")
                                             .price(1)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer5pics)
                                             .build();
            ArrayList<String> offer6pics = new ArrayList<>();
            offer6pics.add("offer6.jpg");
            Offer offer6 = new OfferBuilder().category("Clothes")
                                             .title("Black trenchcoat, good-as-new")
                                             .description("I never wore it naked, I swear")
                                             .price(55)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer6pics)
                                             .build();
            ArrayList<String> offer7pics = new ArrayList<>();
            offer7pics.add("offer7.jpg");
            Offer offer7 = new OfferBuilder().category("Clothes")
                                             .title("Full suit, worn only once")
                                             .description("I wore this on the EOA summit and won - it brings good luck!")
                                             .price(250)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer7pics)
                                             .build();

            // inactive offers
            // kalo benefits from this as a buyer
            ArrayList<String> offer8pics = new ArrayList<>();
            offer8pics.add("offer8.jpg");
            Offer offer8 = new OfferBuilder().category("Electronics")
                                             .title("Nokia 3310, best phone ever")
                                             .description("I wore this on the EOA summit and won - it brings good luck!")
                                             .price(30)
                                             .targetCharity(redCross)
                                             .user(alex)
                                             .pictures(offer8pics)
                                             .active(false)
                                             .build();

            // kalo benefits from this as a buyer
            ArrayList<String> offer9pics = new ArrayList<>();
            offer9pics.add("offer9.jpg");
            Offer offer9 = new OfferBuilder().category("Electronics")
                                             .title("Toshiba Satellite A665, still in warranty")
                                             .description("I brought this on the EOA summit and won - it brings good luck!")
                                             .price(120)
                                             .targetCharity(redCross)
                                             .user(alex)
                                             .pictures(offer9pics)
                                             .active(false)
                                             .build();

            // kalo benefits from this as a seller
            ArrayList<String> offer10pics = new ArrayList<>();
            offer10pics.add("offer10.jpg");
            Offer offer10 = new OfferBuilder().category("Books")
                                              .title("1001 easy recepies")
                                              .description("I do not cook and do not need this anymore.")
                                              .price(20)
                                              .targetCharity(redCross)
                                              .user(kalo)
                                              .active(false)
                                              .pictures(offer10pics)
                                              .build();

            offerRepo.save(offer1);
            offerRepo.save(offer2);
            offerRepo.save(offer3);
            offerRepo.save(offer4);
            offerRepo.save(offer5);
            offerRepo.save(offer6);
            offerRepo.save(offer7);
            offerRepo.save(offer8);
            offerRepo.save(offer9);
            offerRepo.save(offer10);

            CharityEvent event1 = new CharityEventBuilder().charity(redCross)
                                                           .description("Any old clothes you no longer wear are appreciated!")
                                                           .endTime(new Date())
                                                           .startTime(new Date())
                                                           .location("123,123")
                                                           .title("Clothes donation")
                                                           .build();
        }
    }
}
