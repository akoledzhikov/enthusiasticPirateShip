package com.epam.pirate.dataimport;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.pirate.dao.CharityEventRepository;
import com.epam.pirate.dao.CharityGoalRepository;
import com.epam.pirate.dao.CharityPostRepository;
import com.epam.pirate.dao.CharityRepository;
import com.epam.pirate.dao.OfferRepository;
import com.epam.pirate.dao.UserContributionRepository;
import com.epam.pirate.dao.UserRepository;
import com.epam.pirate.dao.UserRewardRepository;
import com.epam.pirate.model.Charity;
import com.epam.pirate.model.CharityBuilder;
import com.epam.pirate.model.CharityCategory;
import com.epam.pirate.model.CharityEvent;
import com.epam.pirate.model.CharityEventBuilder;
import com.epam.pirate.model.CharityGoal;
import com.epam.pirate.model.CharityGoalBuilder;
import com.epam.pirate.model.CharityPost;
import com.epam.pirate.model.CharityPostBuilder;
import com.epam.pirate.model.ContributionType;
import com.epam.pirate.model.Offer;
import com.epam.pirate.model.OfferBuilder;
import com.epam.pirate.model.User;
import com.epam.pirate.model.UserBuilder;
import com.epam.pirate.model.UserContribution;
import com.epam.pirate.model.UserContributionBuilder;
import com.epam.pirate.model.UserReward;
import com.epam.pirate.model.UserRewardBuilder;


@Component
public class DataImportListener
{
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private CharityRepository charityRepo;
    @Autowired
    private OfferRepository offerRepo;
    @Autowired
    private CharityEventRepository eventRepo;
    @Autowired
    private CharityGoalRepository goalRepo;
    @Autowired
    private CharityPostRepository postRepo;
    @Autowired
    private UserContributionRepository contribRepo;
    @Autowired
    private UserRewardRepository rewardRepo;


    @PostConstruct
    public void insertData()
    {
        if (!userRepo.findAll().iterator().hasNext())
        {
            Charity redCross = new CharityBuilder().category(CharityCategory.WELFARE)
                                                   .contactPhone("0888123123")
                                                   .description("The Bulgarian Red Cross")
                                                   .name("The Bulgarian Red Cross")
                                                   .linkToOfficialPage("http://en.redcross.bg/")
                                                   .mail("bulgaria@redcross.gov")
                                                   .profilePicture("http://localhost:8080/pirate/resources/redCross.jpg")
                                                   .build();

            Charity animalRescue = new CharityBuilder().category(CharityCategory.ANIMALS_AND_WILDLIFE)
                                                       .contactPhone("0888321312")
                                                       .description("Animal Rescue Sofia")
                                                       .name("Animal Rescue Sofia")
                                                       .linkToOfficialPage("http://arsofia.com/")
                                                       .mail("animalrescue@gmail.com")
                                                       .profilePicture("http://localhost:8080/pirate/resources/animalRescue.jpg")
                                                       .build();

            Charity amnestyInternational = new CharityBuilder().category(CharityCategory.ANIMALS_AND_WILDLIFE)
                                                               .contactPhone("0888321312")
                                                               .description("Amnesty International")
                                                               .name("Amnesty International")
                                                               .linkToOfficialPage("https://www.amnesty.org/en/countries/europe-and-central-asia/bulgaria/")
                                                               .mail("amnesty@gmail.com")
                                                               .profilePicture("http://localhost:8080/pirate/resources/amnesty.png")
                                                               .build();

            charityRepo.save(redCross);
            charityRepo.save(amnestyInternational);
            charityRepo.save(animalRescue);

            User alex = new UserBuilder().mail("alex@epam.com")
                                         .address("Sofia, Ilinden")
                                         .password("123")
                                         .contactPhone("0885123123")
                                         .build();

            ArrayList<Charity> kalosFavouriteCharities = new ArrayList<>();
            kalosFavouriteCharities.add(redCross);
            kalosFavouriteCharities.add(animalRescue);
            User kalo = new UserBuilder().mail("kalo@epam.com")
                                         .address("Sofia, Svoboda")
                                         .password("123")
                                         .contactPhone("0885213123")
                                         .favouriteCharities(kalosFavouriteCharities)
                                         .build();

            userRepo.save(kalo);
            userRepo.save(alex);
   

            ArrayList<String> offer1pics = new ArrayList<>();
            offer1pics.add("http://localhost:8080/pirate/resources/offer1.jpg");
            Offer offer1 = new OfferBuilder().category("Electronics")
                                             .title("Very nice flat screen TV, really cheap!")
                                             .description("This was my favourite TV, but now I have a new one and want to sell this one!")
                                             .price(2000)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer1pics)
                                             .build();

            ArrayList<String> offer2pics = new ArrayList<>();
            offer2pics.add("http://localhost:8080/pirate/resources/offer2.jpg");
            Offer offer2 = new OfferBuilder().category("Electronics")
                                             .title("Smart TV for sale")
                                             .description("This was my favourite TV, but now I have a new one and want to sell this one!")
                                             .price(500)
                                             .targetCharity(amnestyInternational)
                                             .user(kalo)
                                             .pictures(offer2pics)
                                             .build();

            ArrayList<String> offer3pics = new ArrayList<>();
            offer3pics.add("http://localhost:8080/pirate/resources/offer3.jpg");
            Offer offer3 = new OfferBuilder().category("Electronics")
                                             .title("Generic Smartphone")
                                             .description("Some smartphone. Can talk, read, write and sing.")
                                             .price(500)
                                             .targetCharity(animalRescue)
                                             .user(kalo)
                                             .pictures(offer3pics)
                                             .build();

            ArrayList<String> offer4pics = new ArrayList<>();
            offer4pics.add("http://localhost:8080/pirate/resources/offer4.jpg");
            Offer offer4 = new OfferBuilder().category("Books")
                                             .title("War and Peace")
                                             .description("Absolute classic, everyone should read it!")
                                             .price(20)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer4pics)
                                             .build();
            ArrayList<String> offer5pics = new ArrayList<>();
            offer5pics.add("http://localhost:8080/pirate/resources/offer5.jpg");
            Offer offer5 = new OfferBuilder().category("Books")
                                             .title("Fifty shades of gray")
                                             .description("I just want to get rid of it...")
                                             .price(1)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer5pics)
                                             .build();
            ArrayList<String> offer6pics = new ArrayList<>();
            offer6pics.add("http://localhost:8080/pirate/resources/offer6.jpg");
            Offer offer6 = new OfferBuilder().category("Clothes")
                                             .title("Black trenchcoat, good-as-new")
                                             .description("I never wore it naked, I swear")
                                             .price(55)
                                             .targetCharity(redCross)
                                             .user(kalo)
                                             .pictures(offer6pics)
                                             .build();
            ArrayList<String> offer7pics = new ArrayList<>();
            offer7pics.add("http://localhost:8080/pirate/resources/offer7.jpg");
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
            offer8pics.add("http://localhost:8080/pirate/resources/offer8.jpg");
            Offer offer8 = new OfferBuilder().category("Electronics")
                                             .title("Nokia 3310, best phone ever")
                                             .description("I wore this on the EOA summit and won - it brings good luck!")
                                             .price(30)
                                             .targetCharity(redCross)
                                             .user(alex)
                                             .pictures(offer8pics)
                                             .build();

            // kalo benefits from this as a buyer
            ArrayList<String> offer9pics = new ArrayList<>();
            offer9pics.add("http://localhost:8080/pirate/resources/offer9.jpg");
            Offer offer9 = new OfferBuilder().category("Electronics")
                                             .title("Toshiba Satellite A665, still in warranty")
                                             .description("I brought this on the EOA summit and won - it brings good luck!")
                                             .price(120)
                                             .targetCharity(redCross)
                                             .user(alex)
                                             .pictures(offer9pics)
                                             .build();

            // kalo benefits from this as a seller
            ArrayList<String> offer10pics = new ArrayList<>();
            offer10pics.add("http://localhost:8080/pirate/resources/offer10.jpg");
            Offer offer10 = new OfferBuilder().category("Books")
                                              .title("Vegan Cooking")
                                              .description("I'm not a vegan, therefore I don't need this.")
                                              .price(20)
                                              .targetCharity(redCross)
                                              .user(kalo)
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

            ArrayList<String> event1Gallery = new ArrayList<>();
            event1Gallery.add("http://localhost:8080/pirate/resources/donation/image1.jpg");
            event1Gallery.add("http://localhost:8080/pirate/resources/donation/image2.jpg");
            event1Gallery.add("http://localhost:8080/pirate/resources/donation/image3.jpg");
            CharityEvent event1 = new CharityEventBuilder().charity(redCross)
                                                           .description("Any old clothes you no longer wear are appreciated!")
                                                           .endTime(new Date(System.currentTimeMillis() - 32 * 60 * 1000))
                                                           .startTime(new Date(System.currentTimeMillis() - 36 * 60 * 1000))
                                                           .location("123,123")
                                                           .title("Clothes donating campaign")
                                                           .pictures(event1Gallery)
                                                           .build();

            CharityEvent event2 = new CharityEventBuilder().charity(redCross)
                                                           .description("Course will cover the bare minimum of FA techniques every person should know.")
                                                           .endTime(new Date())
                                                           .startTime(new Date())
                                                           .location("123,125")
                                                           .title("First Aid training for students")
                                                           .build();

            CharityEvent event3 = new CharityEventBuilder().charity(redCross)
                                                           .description("The hospital desperately needs some equipment and supplies for its ambulances.")
                                                           .endTime(new Date())
                                                           .startTime(new Date())
                                                           .location("123,153")
                                                           .title("Dinner fundraiser - funds will go towards St Ekatherina Hopital")
                                                           .build();

            CharityEvent event4 = new CharityEventBuilder().charity(redCross)
                                                           .description("Everyone is welcome to participate, regardless of blood type.")
                                                           .endTime(new Date())
                                                           .startTime(new Date())
                                                           .location("123,1323")
                                                           .title("Blood donating campaign")
                                                           .build();

            eventRepo.save(event1);
            eventRepo.save(event2);
            eventRepo.save(event3);
            eventRepo.save(event4);

            CharityGoal goal1 = new CharityGoalBuilder().charity(redCross)
                                                        .description("Refugee shelter building")
                                                        .currentAmountOfMoney(3000)
                                                        .targetAmountOfMoney(6000)
                                                        .build();

            CharityGoal goal2 = new CharityGoalBuilder().charity(redCross)
                                                        .description("HIV prevention campaign")
                                                        .currentAmountOfMoney(1200)
                                                        .targetAmountOfMoney(1250)
                                                        .build();

            CharityGoal goal3 = new CharityGoalBuilder().charity(redCross)
                                                        .description("Search & Rescue equipment purchase")
                                                        .currentAmountOfMoney(800)
                                                        .targetAmountOfMoney(15000)
                                                        .build();
            
            CharityGoal goal4 = new CharityGoalBuilder().charity(amnestyInternational)
                            .description("DummyGoal")
                            .currentAmountOfMoney(800)
                            .targetAmountOfMoney(15000)
                            .build();
            
            CharityGoal goal5 = new CharityGoalBuilder().charity(animalRescue)
                            .description("DummyGoal")
                            .currentAmountOfMoney(800)
                            .targetAmountOfMoney(15000)
                            .build();

            goalRepo.save(goal2);
            goalRepo.save(goal1);
            goalRepo.save(goal3);
            goalRepo.save(goal4);
            goalRepo.save(goal5);

            CharityPost post1 = new CharityPostBuilder().charity(redCross)
                                                        .title("Hello Everyone!")
                                                        .text("Hi Everyone, \n We're really happy that we've joined this new fund raising and event-planning platform! We look forward to helping a lot of people, together with all of you :)))")
                                                        .datePosted(new Date(System.currentTimeMillis() - 24 * 60 * 1000))
                                                        .build();

            CharityPost post2 = new CharityPostBuilder().charity(redCross)
                                                        .title("Did you know?")
                                                        .text("That the Mountain Rescue Service (MRS) is part of the Bulgarian Red Cross? They guys & gals there are doing really good job, so let's support them by purchasing some new search and resuce equipment! You can learn more about their job here - http://en.redcross.bg/activities/activities2.html")
                                                        .datePosted(new Date(System.currentTimeMillis() - 12 * 60 * 1000))
                                                        .build();

            CharityPost post3 = new CharityPostBuilder().event(event1)
                                                        .title("Event postponed a bit")
                                                        .text("We shall start a tiny bit latter - our truck got stuck in a traffic jam. Sorry!")
                                                        .datePosted(new Date(System.currentTimeMillis() - 36 * 60 * 1000))
                                                        .build();

            CharityPost post4 = new CharityPostBuilder().event(event1)
                                                        .title("Thank you ALL!!")
                                                        .text("Today, we've gathered more than 200kg of winter clothes, which will be distrubited to the people in our homeless shelters ASAP. A big THANK YOU to everyone involved! ")
                                                        .datePosted(new Date(System.currentTimeMillis() - 32 * 60 * 1000))
                                                        .build();

            postRepo.save(post1);
            postRepo.save(post2);
            postRepo.save(post3);
            postRepo.save(post4);

            UserContribution alex1 = new UserContributionBuilder().user(alex)
                                                                  .text("You've sold this:"
                                                                        + offer8.getTitle() + " in favor of "
                                                                        + offer8.getTargetCharity().getName())
                                                                  .value(offer8.getPrice())
                                                                  .type(ContributionType.SELL)
                                                                  .date(new Date())
                                                                  .build();
            UserContribution alex2 = new UserContributionBuilder().user(alex)
                                                                  .text("You've sold this:"
                                                                        + offer9.getTitle() + " in favor of "
                                                                        + offer9.getTargetCharity().getName())
                                                                  .value(offer9.getPrice())
                                                                  .type(ContributionType.SELL)
                                                                  .date(new Date())
                                                                  .build();
            UserContribution alex3 = new UserContributionBuilder().user(alex)
                                                                  .text("You've bought this:"
                                                                        + offer10.getTitle()
                                                                        + " and the money goes to "
                                                                        + offer10.getTargetCharity()
                                                                                 .getName())
                                                                  .value(offer10.getPrice())
                                                                  .type(ContributionType.PURCHASE)
                                                                  .date(new Date())
                                                                  .build();

            UserContribution kalo1 = new UserContributionBuilder().user(kalo)
                                                                  .text("You've bought this:"
                                                                        + offer8.getTitle()
                                                                        + " and the money goes to "
                                                                        + offer8.getTargetCharity().getName())
                                                                  .type(ContributionType.PURCHASE)
                                                                  .date(new Date())
                                                                  .build();
            UserContribution kalo2 = new UserContributionBuilder().user(kalo)
                                                                  .text("You've bought this:"
                                                                        + offer9.getTitle()
                                                                        + " and the money goes to "
                                                                        + offer9.getTargetCharity().getName())
                                                                  .type(ContributionType.PURCHASE)
                                                                  .date(new Date())
                                                                  .build();
            UserContribution kalo3 = new UserContributionBuilder().user(kalo)
                                                                  .text("You've sold this:"
                                                                        + offer10.getTitle()
                                                                        + " in favor of "
                                                                        + offer9.getTargetCharity().getName())
                                                                  .type(ContributionType.SELL)
                                                                  .date(new Date())
                                                                  .build();

            UserContribution kalo4 = new UserContributionBuilder().user(kalo)
                                                                  .type(ContributionType.ONE_OFF_DONATION)
                                                                  .text("You've made a one-off donation towards"
                                                                        + redCross.getName())
                                                                  .value(100)
                                                                  .date(new Date())
                                                                  .build();
            UserContribution kalo5 = new UserContributionBuilder().user(kalo)
                                                                  .type(ContributionType.MONTHLY_DONATION)
                                                                  .text("You've made a monthly donation towards"
                                                                        + redCross.getName())
                                                                  .value(10)
                                                                  .date(new Date())
                                                                  .build();
            UserContribution kalo6 = new UserContributionBuilder().user(kalo)
                                                                  .type(ContributionType.EVENT)
                                                                  .text("You've participated in this event "
                                                                        + event1.getTitle()
                                                                        + " organized by "
                                                                        + redCross.getName())
                                                                  .value(30)
                                                                  .date(new Date())
                                                                  .build();

            contribRepo.save(alex1);
            contribRepo.save(alex2);
            contribRepo.save(alex3);

            contribRepo.save(kalo1);
            contribRepo.save(kalo2);
            contribRepo.save(kalo3);
            contribRepo.save(kalo4);
            contribRepo.save(kalo5);
            contribRepo.save(kalo6);

            UserReward reward1 = new UserRewardBuilder().user(kalo)
                                                        .awardedBy("Bulgarian Red Cross")
                                                        .description("Thank you badge")
                                                        .text("")
                                                        .picture("http://localhost:8080/pirate/resources/thankYouBadge.jpg")
                                                        .build();

            UserReward reward2 = new UserRewardBuilder().user(kalo)
                                                        .awardedBy("Bulgarian Red Cross")
                                                        .description("Event invitation - Friends of BRC meetup.")
                                                        .text("")
                                                        .picture("http://localhost:8080/pirate/resources/friendsMeetup.png")
                                                        .build();

            UserReward reward3 = new UserRewardBuilder().user(kalo)
                                                        .awardedBy("Technopolis")
                                                        .description("Digital photo frame")
                                                        .text("")
                                                        .picture("http://localhost:8080/pirate/resources/photoFrame.jpg")
                                                        .build();

            rewardRepo.save(reward1);
            rewardRepo.save(reward2);
            rewardRepo.save(reward3);
        }
    }
}
