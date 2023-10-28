import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Assets.Items;
import Assets.Main;
import Assets.NPC;
import Assets.Players;
import Assets.Ending;

public class Game {
    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Players player = new Players() {};
        player.setItem(null);

        NPC doctor = new NPC() {};
        doctor.setName("Suspicious Person");
        doctor.setStatus(true);

        NPC mob = new NPC() {};
        mob.setName("Mob");
        mob.setStatus(true);

        NPC assassins = new NPC() {};
        assassins.setName("Bartender");
        assassins.setStatus(true);

        Items unknownBook = new Items() {};
        unknownBook.setName("Unknown Book");

        Items weirdLocket = new Items() {};
        weirdLocket.setName("Weird Locket");

        // GET TO THE GAME
        // Intro
        clear();
        Main intro = new Main() {};
        intro.setNarratives("\n\nAfter a long and excruciating day at school, with the sun as hot as ever, you decide to go home. Albeit not alone, but alongside your best friend. You both talked to each other while walking together, all is well until you hear a certain sentence coming out of your best friend's mouth.\r\n\n");
        intro.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        intro.setNarratives("\n\nBest Friend: I'll be moving out soon, sadly, i won't live near you anymore. So this might be our last day walking home together like this. Luckily i'll be living near my partner's house! So atleast there's something positive behind all this haha!\r\n\n");
        intro.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        intro.setNarratives("\n\nAfter you hear that, you feel nothing but resentment. As the only person who truly understands you and was there every time decided to leave you. But you didn't think too much of it as it might not be under their control, it might be their parents who forced them to move, it might be some other issues. Either way, you decide to not continue talking and just focus on heading home safely.\r\n\n");
        intro.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        intro.setNarratives("\n\nYou saw the familiar road that leads to your house, you both exchanged goodbyes before you came inside your home and went straight to your room. Because it was such a tiring day, you decide to just drift to sleep as soon as you get on your bed, while ignoring how messy your room is even though your parents told you many times to clean after yourself.\r\n\n");
        intro.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        // Main1
        Main main1 = new Main() {};
        main1.setNarratives("\nAfter a fairly long time. You woke up, to see yourself in an unfamiliar place. You find it kind of odd as you've never seen anything like this before, from the roads, the trees everything doesn't seem familiar at all to you. \r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        main1.setNarratives("\nYou look back, to see that you woke up on a patch of grass. Somehow as comfortable as the bed you had back home. But you ignore the oddities and decide to move forward.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\nYou see an old inn with old styled people going in and out of it, so you decide to venture in and try to get some information.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\nAs soon as you get in, you're greeted by a bulky man that is the bartender. \r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n" + assassins.name + ": " + "What's your name sir?\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        player.setName();
        System.out.println();
        main1.setNarratives("\n" + assassins.name + ": " + player.name + ", How can i help you?\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        

        final List<String> choices = new ArrayList<String>();
        Collections.addAll(choices, "A. Yeah, can i ask you a few questions?", "B. Yeah, can i have a drink?");
        main1.setChoices(choices);
        while (true) {
            main1.showChoices(0);
            main1.showChoices(1);
            player.setChoices();
            clear();
            System.out.println();
            if (player.getChoices().equals("A")) {
                main1.setNarratives("\n\n" + assassins.name + ": Okay, but you need to buy a drink first.\r\n\n");
                main1.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            } else if (player.getChoices().equals("B")) {
                // print lainnya
                main1.setNarratives("\n\n" + assassins.name + ": Sure, what do you want?\r\n\n");
                main1.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
        }

        choices.clear();
        Collections.addAll(choices, "A. A shot of tequila please.", "B. Can i have a glass of water?");
        main1.setChoices(choices);
        while (true) {
            main1.showChoices(0);
            main1.showChoices(1);
            player.setChoices();
            System.out.println();
            if (player.getChoices().equals("A")) {
                main1.setNarratives("\n\n" + assassins.name + ": Here you go, a shot of tequila. Drink more of this and you'll become as manly as me! Haha!\r\n\n");
                main1.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            } else if (player.getChoices().equals("B")) {
                // print lainnya
                main1.setNarratives("\n\n" + assassins.name + ": Here's your glass of water, it's rare to see anyone ever coming here for a glass of water, but a welcomed surprise.\r\n\n");
                main1.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
        }
        choices.clear();
        

        // Main 1 Loop Event
        main1.setNarratives("\n\n" + player.name + ": What is this place?\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.print("\nPress enter to continue...");
        scanner.nextLine();
        clear();

        main1.setNarratives("\n\n" + assassins.name + ": This is my beloved inn of course! Well, that is if you're asking about that haha! But i'm guessing i misunderstood sir so, this is the town of Seraphvale, we enjoy it here! even when there's trouble arise haha!\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n" + assassins.name + ": (Seraphvale huh, i've never heard of such a place..but.. trouble?..)\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);


        main1.setNarratives("\n\n" + player.name + ": Why is everyone wearing such old school clothes?\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        main1.setNarratives("\n\n" + assassins.name + ": What do you mean? old school? that's a new word haha! It's what we wear all the time. Though, why is sir wearing such elegant clothes? Are you a noble?\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        main1.setNarratives("\n\n" + player.name + ": nono! i'm just a normal person. (I'm wearing such normal clothes but he thinks I'm a noble..)\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        

        main1.setNarratives("\n\n" + player.name + ": How did i end up here?\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        main1.setNarratives("\n\n" + assassins.name + ": Did you lose your way? Haha! How should i know sir? You're the one controlling your legs! haha!\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        main1.setNarratives("\n\n" + player.name + ":  (Why did i even ask that, of course they wouldn't know)\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\nSuddenly, you felt like someone was staring at you, you looked beside you to see a person you didn't know was there, staring. You can't help but look at them too.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(2);
        
        main1.setNarratives("\n\nThey're wearing all black, with a mask and hat on. You feel an overwhelming fear when looking at them, but also feel like they're somewhat familiar.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\nThen suddenly they broke eye contact, threw some coins at the bartender and left the inn in a hurry.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        //Main 1 Loop End
        main1.setNarratives("\n\n" + player.name + ": Who was that?\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        main1.setNarratives("\n\n" + assassins.name + ": Not sure, but it seem to be an outsider as well, never seen someone wearing something so shady before.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n" + assassins.name + ": There have been alot of things happening in this town lately, people disappearing, murders at night, civil unrest, even rumors of a big monster attacking this town soon.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n" + assassins.name + ": Frankly if i were you, i would just run. Far away.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n" + assassins.name + ": I don't know why you came here even, haha!\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n" + player.name + ": I see.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n ((You still haven't been able to get your mind off that person))\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        System.out.print("\nPress enter to continue...");
        scanner.nextLine();
        clear();

        main1.setNarratives("\n\n" + player.name + ": Well i'll go ahead and follow them.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n" + assassins.name + ": Oh? be careful though sire, no need to pay for your drinks. It's on the house.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n" + assassins.name + ": But though, have this. It's a book they left here in a hurry. Mind aswell give it to them when you met them haha!\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n(You decide to take the book)\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        player.setItem(unknownBook);
        main1.setNarratives("\n\n[Unknown Book Obtained]\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        main1.setNarratives("\n\n" + assassins.name + ": Here you go, be sure to tell them thank you from me when you met them haha!\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n(You open the book)\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n(It seems to be full of human diagrams with most being focused on the human head, the notes beside it is unintelligible to you)\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n(Looking at the pictures sends tingles down your spine as to how detailed the pictures are)\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n(You close the book and head out)\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main1.setNarratives("\n\n" + assassins.name + ": Well good luck on your venture sire! Be careful.\r\n");
        main1.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();
        
        // Main 2
        Main main2 = new Main() {};
        main2.setNarratives("\n\n(You went outside, to see people staring at you from afar. Seem like everyone's judging you based on your appearance as this person who's wearing clothes from the modern world. Or are they judging you based on something else? either way, you endured it and move forward, trying to search what is going on in this town)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(You then decide to come up to one of the people sitting on their porch)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        main2.setNarratives("\n\n" + player.name + ": Hello sir, did you see anyone wearing-\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        main2.setNarratives("\n\n(Before you could finish your sentence, the man interrupts)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\nRandom man: don't talk to me. I don't know you, and you don't seem to belong here even, leave immediately.\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n" + player.name + ": Oh okay, sorry.\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(Without even doing anything, you were judged by the masses. Almost everyone there seem to despise you, but you ignore them)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        main2.setNarratives("\n\n(But then you hear a scream in an alley, you were startled but see everyone minding their own business, not even a bit concerned about the horrifying scream you just heard)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(You ran to the source of the sound, but stopped when you see something moving a bit more further, you hid and peek a bit to see what's happening)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(To your horrors, you see someone on the ground with their head wide open)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(Suddenly in the corner of your eyes, you see someone coming..)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(It's the person from before, dark clothing with their mask on)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        main2.setNarratives("\n\n(You try your best to not make noise and try to process what's happening as best as you can)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(You see the suspicious person picking up what seems to be the expired person's brain)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(You hear a faint sound of them talking to themselves..)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n" + doctor.name + ": Fine specimen, but alas. I shall need more. At the mean time, i shall write this down.\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        main2.setNarratives("\n\n(The suspicious person then reaches into their bag to retrieve something, but suddenly became panicked trying to search for it)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n" + doctor.name + ": Where's.. where's my encyclopedia?!\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\n(You realized that they are referring to the book that the bartender gave)\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        

        main2.setNarratives("\n\n" + doctor.name + ": This is upmost unfortunate, where did i leave it..?\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main2.setNarratives("\n\nWhat do you do?\r\n");
        main2.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        // Main 2  choice 1
        choices.clear();
        Collections.addAll(choices, "A. Stay Quiet.", "B. Reveal yourself", "C. Run");
        main2.setChoices(choices);
        while (true) {
            main2.showChoices(0);
            main2.showChoices(1);
            main2.showChoices(2);
            player.setChoices();
            clear();
            System.out.println();
            if (player.getChoices().equals("A")) {
                main2.setNarratives("\n\n(You stay quiet as much as you can, to try and not make your presence known by the person.)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n(But while you try to not make any noise, unfortunately you knocked some kind of bottle that was near you. Causing a loud bottle drop noise. This alerted the person.)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n" + doctor.name + ": hmm, seems like someone's here.\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                main2.setNarratives("\n\n(The suspicious person proceeds to pack up their stuff and run)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                main2.setNarratives("\n\n(You decide to take a breather after they left before you continue on forward, as the view was traumatizing.)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                break;
            } else if (player.getChoices().equals("B")) {
                // print kayak loop choice main 1
                main2.setNarratives("\n\n(You suddenly jumped out from your cover to reveal yourself to them)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n" + doctor.name + ": Ah, hello. It seems you've followed me.\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n" + doctor.name + ": May i know why you've followed me young one?\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n(The unexpected outcome from you revealing yourself caused you to become stunned, you thought they'd attack you as they did to the now expired person but instead they greet you with a calm tone)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n" + doctor.name + ": I've heard from the inn, it seems like you're not from here. But for some undefined reason, it seems you have many questions you want to ask. Please, do ask away\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n(You felt surprised, being welcomed this much. So you felt comfortable enough to ask)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                // DoctorEvent1 - LoopEvent
                main2.setNarratives("\n\n" + player.name + ": Why did you kill that man?\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                System.out.print("\n\nPress enter to continue...");
                scanner.nextLine();
                clear();

                main2.setNarratives("\n\n" + doctor.name + ": It may have seemed so, yes, but I shall tell you. All is for research\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                main2.setNarratives("\n\n" + doctor.name + ": To find a cure for such a hard disease to treat.\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n" + doctor.name + ": But the scope of this research has widened too much, so I had to take intrusive procedures. And in this case, I had to inspect the human brain itself to find out what might be causing such a disease.\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                
                main2.setNarratives("\n\n" + player.name + ": Who are you?\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                System.out.print("\n\nPress enter to continue...");
                scanner.nextLine();
                clear();

                main2.setNarratives("\n\n" + doctor.name + ": I am the cure. The person who shall cure the pestilence that has been plaguing this town. But it seems most people here don't want to be cured, seen by their unwillingness to even cooperate.\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n(The suspicious man sighs while looking at the dead body)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n" + doctor.name + ": It's an unfortunate thing.\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n" + player.name + ": Why are you wearing such clothing?\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                System.out.print("\n\nPress enter to continue...");
                scanner.nextLine();
                clear();

                main2.setNarratives("\n\n" + doctor.name + ": There's a reason why I wear these clothing child, is to shield myself from the plague. Such a hard disease to cure would be detrimental if I were to be infected as well.\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                main2.setNarratives("\n\n" + doctor.name + ": But. It's fairly unfortunate, i may have lost my book with all of my research.\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n(The suspicious man notices the book in your hand)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n" + doctor.name + ": That seem to be my book you're holding child. May you give it to me?\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                main2.setNarratives("\n\n What do you do?\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                // DoctorEvent1 - Crucial
                choices.clear();
                Collections.addAll(choices, "A. Here you go.", "B. No, i won't give it to you.");
                main2.setChoices(choices);
                while (true) {
                    main2.showChoices(0);
                    main2.showChoices(1);
                    player.setChoices();
                    clear();
                    if (player.getChoices().equals("A")) {
                        // Print the messages
                        main2.setNarratives("\n\n" + doctor.name + ": Thank you child, your willingness to trust me will not go in vain. I shall now continue my research, please. Do call me if you need any help.\r\n");
                        main2.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);
                        
                        main2.setNarratives("\n\n" + doctor.name + ": Oh pardon me, what is your name?\r\n");
                        main2.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        main2.setNarratives("\n\n" + player.name + ": " + player.name + "\r\n");
                        main2.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        main2.setNarratives("\n\n" + doctor.name + ": " + player.name + " huh, nice ring to it. We'll be good acquaintances. You can refer to me as Medico.\r\n");
                        main2.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        doctor.setName("Medico");

                        main2.setNarratives("\n\n" + doctor.name + ": For now, please let me be. I shall go back to my research.\r\n");
                        main2.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        player.removeItem();

                        System.out.print("\n\nPress enter to continue...");
                        scanner.nextLine();
                        clear();
                        break;
                    } else if (player.getChoices().equals("B")) {
                        // Print the messages
                        main2.setNarratives("\n\n(Suspicious man sighed)\r\n");
                        main2.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        main2.setNarratives("\n\n" + doctor.name + ": I know, it's hard to trust me on this. As my methods of research seem to be of utmost concern.\r\n");
                        main2.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        main2.setNarratives("\n\n" + doctor.name + ": But I need it, so child. Give me the book.\r\n");
                        main2.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        
                        choices.clear();
                        Collections.addAll(choices, "A. Okay, here..", "B. No!, I will not give it to you!");
                        main2.setChoices(choices);
                        while (true) {
                            main2.showChoices(0);
                            main2.showChoices(1);
                            player.setChoices();
                            clear();
                            if (player.getChoices().equals("A")) {
                                // Print the messages
                                main2.setNarratives("\n\n" + doctor.name + ": Thank you child, your willingness to trust me will not go in vain. I shall now continue my research, please. Do call me if you need any help.\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);
                                
                                main2.setNarratives("\n\n" + doctor.name + ": Oh pardon me, what is your name?\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                main2.setNarratives("\n\n" + player.name + ": " + player.name + "\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                main2.setNarratives("\n\n" + doctor.name + ": " + player.name + " huh, nice ring to it. We'll be good acquaintances. You can refer to me as Medico.\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                doctor.setName("Medico");

                                main2.setNarratives("\n\n" + doctor.name + ": For now, please let me be. I shall go back to my research.\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);
                                player.removeItem();

                                main2.setNarratives("\n\n[UNKNOWN BOOK LOST]\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                System.out.print("\n\nPress enter to continue...");
                                scanner.nextLine();
                                clear();
                                break;
                            } else if (player.getChoices().equals("B")) {
                                // Print the messages
                                main2.setNarratives("\n\n" + doctor.name + ": Then you leave me no choice.\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                main2.setNarratives("\n\n(Suspicious man then approaches you and try to grab it from your hand)\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);
                                
                                main2.setNarratives("\n\n(You try to pull as hard as you can but to no avail, so you decide to push him as hard as you can)\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                main2.setNarratives("\n\n(You succeeded, causing him to lose balance and eventually fall hard on the ground. Hitting a rock.)\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                main2.setNarratives("\n\n(He lays there, unresponsive. Suddenly a blood pool formed.)\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);
                                
                                main2.setNarratives("\n\n(You realized what you've done, dropped the book and booked it out of there)\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                main2.setNarratives("\n\n[UNKNOWN BOOK LOST]\r\n");
                                main2.showNarratives();
                                System.out.println();
                                TimeUnit.SECONDS.sleep(1);

                                System.out.print("\n\nPress enter to continue...");
                                scanner.nextLine();
                                clear();
                                
                                player.removeItem();
                                doctor.setStatus(false);
                                break;  
                            }
                        }
                        break;
                    }
                }
                break;
            } else if (player.getChoices().equals("C")) {
                // print lainnya
                main2.setNarratives("\n\n(You ran as fast as you can out of there, not looking back)\r\n");
                main2.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                System.out.print("\n\nPress enter to continue...");
                scanner.nextLine();
                clear();
                
                break;
            }
        }
        // Main 3
        Main main3 = new Main() {};
        
        main3.setNarratives("\n\n(You went back to the inn, you see the bartender there again.)\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n" + assassins.name + ": Ohoho! look who's back! haha!\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        main3.setNarratives("\n\n(You try your best to not look at him while you sat down)\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        main3.setNarratives("\n\n(You held back tears as to what you just saw)\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n" + assassins.name + ": Hey, don't look so down boss! Cheer up!\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n" + assassins.name + ": Name's James, James the Bartender!! Sorry i didn't tell ya earlier but. Pleasure to have met you boss! haha!\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();
        
        try {
            player.item.equals(unknownBook);
            // Print the early choices here
            main3.setNarratives("\n\n(The Suspicious man walked back in the inn, with panicked movement)\r\n");
            main3.showNarratives();
            System.out.println();
            TimeUnit.SECONDS.sleep(1);

            main3.setNarratives("\n\n(The suspicious man then went up to James the bartender and proceeds to ask him a few questions)\r\n");
            main3.showNarratives();
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            
            main3.setNarratives("\n\n" + doctor.name + ": Pardon me, but have you seen any sort of book i may have left here perchance?\r\n");
            main3.showNarratives();
            System.out.println();
            TimeUnit.SECONDS.sleep(1);

            main3.setNarratives("\n\n(James the Bartender then looks at me, confirming whether he should tell them or not.)\r\n");
            main3.showNarratives();
            System.out.println();
            TimeUnit.SECONDS.sleep(1);

            choices.clear();
            Collections.addAll(choices, "A. (Nod)", "B. (Shake your head)");
            main3.setChoices(choices);
            while (true) {
                main3.showChoices(0);
                main3.showChoices(1);
                player.setChoices();
                clear();
                if (player.getChoices().equals("A")) {
                    main3.setNarratives("\n\n(James the Bartender then looks at me, confirming whether he should tell them or not.)\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n" + assassins.name + ": oh, this person right here has it. Gave it to them when you hurried out of here haha!\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);
                    
                    main3.setNarratives("\n\n(The suspicious man turned to me and saw the book)\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);
                    break;
                } else if (player.getChoices().equals("B")) {
                    main3.setNarratives("\n\n(James obliged)");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n" + assassins.name + ": Sorry, but we haven't seen any books here. You might've lost it somewhere else\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);
                    
                    main3.setNarratives("\n\n(As concrete as James's lie was, it didn't phase the Suspicious man, because as soon as James finished his sentence, he saw the book i was trying to hide behind my body)\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);
                    break;
                }
            }

            main3.setNarratives("\n\n" + doctor.name + ": Say, that does look familiar. May i have a closer look child?\r\n");
            main3.showNarratives();
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            
            // Crucial choice ->
            choices.clear();
            Collections.addAll(choices, "A. (Nod)", "B. (Shake your head)");
            main3.setChoices(choices);
            while (true) {
                main3.showChoices(0);
                main3.showChoices(1);
                player.setChoices();
                clear();
                if (player.getChoices().equals("A")) {
                    // Print the messages
                    main3.setNarratives("\n\n(You hesitantly hand over the book to the suspicious man)\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n" + doctor.name + ": hmm, yes. This is the book alright.\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n" + doctor.name + ": Thank you so much child for trusting me and keeping this for me. All my years of research is on this book, I would not know what to do if i lost it. Say child, what is your name?\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);
                    
                    main3.setNarratives("\n\n" + player.name + ": " + player.name + "\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);
                    
                    main3.setNarratives("\n\n" + doctor.name + ": " + player.name + " huh, nice ring to it. Because you kept this book for me, i'll return the favor and help you in times of need in the future. You can refer to me as Medico.\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    doctor.setName("Medico");

                    main3.setNarratives("\n\n" + doctor.name + ": Now pardon me, i shall go back to my work.\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n(Medico graciously walked to the front door and disappeared)\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n(James the Bartender then looked at me)\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n" + assassins.name + ": Hope you did the right thing.\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);


                    main3.setNarratives("\n\n[UNKNOWN BOOK LOST]\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);
                    
                    player.removeItem();

                    System.out.print("\n\nPress enter to continue...");
                    scanner.nextLine();
                    clear();
                    break;
                } else if (player.getChoices().equals("B")) {
                    // Print the messages
                    main3.setNarratives("\n\n(You shook your head, not wanting to give the book to them)\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n(Suspicious man sighed)\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n" + doctor.name + ":  Please child, dont make this any harder. That book is crucial to my work.\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    main3.setNarratives("\n\n" + doctor.name + ": Be a good child, and hand over the book.\r\n");
                    main3.showNarratives();
                    System.out.println();
                    TimeUnit.SECONDS.sleep(1);

                    choices.clear();
                    Collections.addAll(choices, "A. (Hand over the book)", "B. (Ask James for help)");
                    main3.setChoices(choices);
                    while(true) {
                        main3.showChoices(0);
                        main3.showChoices(1);
                        player.setChoices();
                        clear();
                        if (player.getChoices().equals("A")) {
                            // Print the messages
                            main3.setNarratives("\n\n(You hesitantly hand over the book to the suspicious man)\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + doctor.name + ": Thank you child.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + doctor.name + ": hmm, yes. This is the book alright.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + doctor.name + ": Thank you so much child for trusting me and keeping this for me. All my years of research is on this book, I would not know what to do if i lost it. Say child, what is your name?\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);
                            
                            main3.setNarratives("\n\n" + player.name + ": " + player.name + "\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);
                            
                            main3.setNarratives("\n\n" + doctor.name + ": " + player.name + " huh, nice ring to it. Because you kept this book for me, i'll return the favor and help you in times of need in the future. You can refer to me as Medico.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            doctor.setName("Medico");

                            main3.setNarratives("\n\n" + doctor.name + ": Now pardon me, i shall go back to my work.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n(Medico graciously walked to the front door and disappeared)\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n(James the Bartender then looked at me)\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + assassins.name + ": Hope you did the right thing.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);


                            main3.setNarratives("\n\n[UNKNOWN BOOK LOST]\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            player.setItem(null);

                            System.out.print("\n\nPress enter to continue...");
                            scanner.nextLine();
                            clear();
                            break;
                        } else if (player.getChoices().equals("B")) {
                            // Print the messages
                            main3.setNarratives("\n\n(You call out to james for help)\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + assassins.name + ": I think you should go sir, my client here seem to be uncomfortable and i would like to not cause a scene.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + doctor.name + ": Please, it's my life long research in that book. I need-\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + assassins.name + ": I said.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + assassins.name + ": Leave.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n(Suspicious man let out a deep sigh)\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + doctor.name + ": I suppose it was my fault i left it here. So i shall take my leave.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n(Suspicious man then got up and start walking to the exit door)\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + doctor.name + ": Disappointing. All i wanted was to help. But alas, i failed to gain trust.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n(After the suspicious man got out, he seemed to have disappeared)\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n" + assassins.name + ": Give me the book, i'll keep it with me just so you don't get bothered by them ever again.\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n(Nobody knows where that suspicious man is now and he was never seen again)\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            main3.setNarratives("\n\n[UNKNOWN BOOK LOST]\r\n");
                            main3.showNarratives();
                            System.out.println();
                            TimeUnit.SECONDS.sleep(1);

                            player.setItem(null);
                            doctor.setStatus(false);
                            System.out.print("\n\nPress enter to continue...");
                            scanner.nextLine();
                            clear();
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {

        } finally {

        }

        main3.setNarratives("\n\n" + assassins.name + ": Say, it's getting pretty late, i'll close down for today. You should find somewhere to sleep (MC)\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n" + assassins.name + ": But, first. Here\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n(They hand you a weird looking locket)\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n[Weird Locket Obtained]\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n" + assassins.name + ": This locket is special, its a hand down from my past friend haha. Sadly, he's no longer here, the plague took him. So, i'd like to give it to you! haha!\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n" + assassins.name + ": It may look weird, but it has its uses! Because we were such close friends on a crowded town. A bell like feature was implemented in it. If you were to press this button, a high pitched ringing would happen! Neat isn't it?! So if you need any help. Just ring it! haha!\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        main3.setNarratives("\n\n(So they did, they closed down the inn for the day and you're left alone outside)\r\n");
        main3.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();
        
        // Mob Event
        Main mobEvent = new Main() {};

        mobEvent.setNarratives("\n\n(It was a quiet night until you hear someone scream, but its not the same scream as before)\r\n");
        mobEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        mobEvent.setNarratives("\n\n" + mob.name + "1: THAT'S THEM! THE KILLER!\r\n");
        mobEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        mobEvent.setNarratives("\n\n" + mob.name + "2: IT IS! THE CANNIBAL KILLER!\r\n");
        mobEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        mobEvent.setNarratives("\n\n" + mob.name + "3: YOU LIKE TAKING PEOPLE'S LIVES?! WE'LL TAKE YOURS INSTEAD!\r\n");
        mobEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        mobEvent.setNarratives("\n\n(You see a full mob consisting of 20-30 people charging at you, you dont hesitate to start running scared as to what'll happen if you were to get caught)\r\n");
        mobEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        mobEvent.setNarratives("\n\n(You managed to get into an alley to hide. Confused on what to do while people are out for your blood. You can't believe all this is happening because of something you didn't do.)\r\n");
        mobEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        choices.clear();
        Collections.addAll(choices, "A. Hide", "B. Find a better spot", "C. Ring the Locket");
        mobEvent.setChoices(choices);
        while(true) {
            mobEvent.showChoices(0);
            mobEvent.showChoices(1);
            mobEvent.showChoices(2);
            player.setChoices();
            clear();

            if (player.getChoices().equals("A")) {
                mobEvent.setNarratives("\n\n(You hide the best you can, but it doesn't seem like the crowd is decreasing anytime soon.. until...)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            } else if (player.getChoices().equals("B")) {
                mobEvent.setNarratives("\n\n(You try to find a better spot to hide, but alas. Because of your sudden movement, you were seen)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            } else if (player.getChoices().equals("C")) {
                mobEvent.setNarratives("\n\n(You rang the locket, but it seems to do nothing. Seems like the bartender lied to you)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(Because of your sudden movement of trying to ring the locket. They found you.)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            }         
        }

        mobEvent.setNarratives("\n\n" + mob.name + "1: THERE THEY ARE! IN THE ALLEY! I FOUND THEM!\r\n");
        mobEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        mobEvent.setNarratives("\n\n" + mob.name + "2: GET THEM!!\r\n");
        mobEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        // Crucial Event
        choices.clear();
        Collections.addAll(choices, "A. (Run)", "B. (Stand your ground and explain.)");
        mobEvent.setChoices(choices);
        while(true) {
            mobEvent.showChoices(0);
            mobEvent.showChoices(1);
            player.setChoices();
            clear();        

            if (player.getChoices().equals("A")) {
                // Print the messages
                mobEvent.setNarratives("\n\n(You ran. You ran as fast as you can to the point the crowd becomes a blur. And somehow, you lost them.)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(You sat down and take a breather, while you're at it. You took off your clothes, messing up your hair and everything resembling you to not get recognized)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(You let out a big sigh of relief as to how you avoided possibly dying from a big crowd like that)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(Though, you realized you're resting near what looks like an abandoned cottage. So you decide to go in and rest there while waiting for the crowd to die off)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mob.setStatus(false);
                break;
            } else if (player.getChoices().equals("B")) {
                // Print the messages
                mobEvent.setNarratives("\n\n(You stood your ground. People who were charging at you stopped on their tracks confused as to why you're just standing there)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(You pull out words to try and explain yourself out of this situation)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(And somehow..)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(It worked.)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(It seems impossible, but the big crowd actually were willing to listen to you)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n" + mob.name + "1: Ah, so sorry about that. Thought you were the killer but it seems there's been a big misunderstanding.\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n" + mob.name + "2: Yeah, sorry for chasing you down! no hard feelings?\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n" + mob.name + "3: Maybe if you weren't looking so different, we wouldn't do this. It's just the fact we saw you going out of the alley the body was in. Sorry about that!\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n" + mob.name + "1: \r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\nWhole Mob: YEAHHH!\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(You let out a big sigh of relief that you survived this ordeal)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n" + mob.name + "3: Oh yeah, if you don't have anywhere to spend the night, there is an abandoned cottage right down the road. You can spend the night there!\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n" + player.name + "3: Oh thank you so much for the information, i'll go there now.\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(You were surprised they are willing to help you out this much)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                mobEvent.setNarratives("\n\n(You arrived at the cottage down the road)\r\n");
                mobEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
        }
        
        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();
        
        // Assassin Event
        Main assassinEvent = new Main() {};

        assassinEvent.setNarratives("\n\n(You went in the cottage to rest. When suddenly..)\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        assassinEvent.setNarratives("\n\n(A knife went past you from behind and hit the wall)\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        assassinEvent.setNarratives("\n\n???#1: Target Spotted.\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        assassinEvent.setNarratives("\n\n???#2: Proceeding to neutralization.\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        assassinEvent.setNarratives("\n\n(You then see 2 people revealing themselves from the shadow)\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        assassinEvent.setNarratives("\n\n(You look at them and they seem to be different height, with one of them being similar to someone you've seen)\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        assassins.name = "Assassin";

        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        assassinEvent.setNarratives("\n\n"+assassins.name+"#1 : Assassin one reporting in!\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        assassinEvent.setNarratives("\n\n"+assassins.name+"#2 : Assassin two reporting in!\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        assassinEvent.setNarratives("\n\n"+assassins.name+"#1 : You're dead murderer.\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        assassinEvent.setNarratives("\n\n(A sudden surge of adrenaline fills you, you must survive the ordeal no matter what, considering what you just happened)\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        choices.clear();
        Collections.addAll(choices, "A. Run.", "B. Try to grab the knife that was thrown");
        assassinEvent.setChoices(choices);
        while (true) {
            assassinEvent.showChoices(0);
            assassinEvent.showChoices(1);
            player.setChoices();
            System.out.println();
            if (player.getChoices().equals("A")) {
                assassinEvent.setNarratives("\n\n(You try and run, but suddenly, you feel a sharp pain in your leg)\r\n\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                assassinEvent.setNarratives("\n\n(You fall down on the ground near the knife that was thrown, it seems they've injured your leg by sheer precision of their knives throws)\r\n\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            } else if (player.getChoices().equals("B")) {
                // print lainnya
                assassinEvent.setNarratives("\n\n(You dashed to the knife but unfortunately, they saw that. And injures your leg by throwing another knife)\r\n\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                assassinEvent.setNarratives("\n\n(You fall down on the ground near the knife, it seems they've injured your leg badly.)\r\n\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
        }
        choices.clear();

        System.out.print("\n\nPress enter to continue...");
        scanner.nextLine();
        clear();

        assassinEvent.setNarratives("\n\n(Assassin#1 then pull off their mask, It's james. You can't believe it, someone you thought was your friend is now actively trying to kill you. But you noticed something..)\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        assassinEvent.setNarratives("\n\n(James's face isn't normal. It's much more.. emotionless.)\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        assassins.name="James the Assassin";

        assassinEvent.setNarratives("\n\n"+assassins.name+": You shouldn't have done that. Now die.\r\n");
        assassinEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        // Crucial Event
        choices.clear();
        Collections.addAll(choices, "A. (Grab the knife beside you and defend yourself.)", "B. (Ring the Locket.)");
        assassinEvent.setChoices(choices);
        while(true) {
            assassinEvent.showChoices(0);
            assassinEvent.showChoices(1);
            player.setChoices();      
            if (player.getChoices().equals("A")) {
                // Print the messages
                assassinEvent.setNarratives("\n\n(You grabbed the knife, and plunged it deep into his heart. Killing him instantly.)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                assassinEvent.setNarratives("\n\nAssassin#2 : NOO!!\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                assassinEvent.setNarratives("\n\n(Assassin#2: then dashes towards you to try and avenge their partner's death)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                assassinEvent.setNarratives("\n\n(Delay..)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                assassinEvent.setNarratives("\n\n(But somehow, you came out on top. You got up to see 2 dead bodies beside you.. but it somehow doesn't phase you that much..)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                assassins.setStatus(false);
                break;
            } else if (player.getChoices().equals("B")) {
                // Print the messages
                assassinEvent.setNarratives("\n\n(You rang the locket in a desperate attempt to save yourself)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                assassinEvent.setNarratives("\n\n(And suddenly you hear a ring from James's pocket)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                
                assassinEvent.setNarratives("\n\n(But it was too late, a knife plunged deep into your left shoulder)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                assassinEvent.setNarratives("\n\n(You wonder, why didn't he go for something vital instead?)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);

                assassinEvent.setNarratives("\n\n(But before you could finish that thought, he let go of the knife and sat still, motionless)\r\n");
                assassinEvent.showNarratives();
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                choices.clear();
                Collections.addAll(choices, "A. (Grab the knife and kill him.)", "B. (Ring the Locket again.)");
                assassinEvent.setChoices(choices);
                
                while(true) {
                    assassinEvent.showChoices(0);
                    assassinEvent.showChoices(1);
                    player.setChoices();

                    if (player.getChoices().equals("A")) {
                        // Print the messages
                        assassinEvent.setNarratives("\n\n(You grabbed the knife, and plunged it deep into his heart. Killing him instantly.)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\nAssassin#2 : NOO!!\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);
                        
                        assassinEvent.setNarratives("\n\n(Assassin#2 then dashes towards you to try and avenge their partner's death)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n(Delay..)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n(But somehow, you came out on top. You got up to see 2 dead bodies beside you.. but it somehow doesn't phase you that much..)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassins.setStatus(false);
                        break;
                    } else if (player.getChoices().equals("B")) {
                        // Print the messages
                        assassinEvent.setNarratives("\n\n(You rang the locket again, with a knife still plunged deep into your shoulder…)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n(The ring from james's pocket rang louder.)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n(Suddenly James let out a huge scream as if he was possessed)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n"+assassins.name+": GET OUT OF MY HEAD!\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n(But then, everything went silent)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n"+assassins.name+": *GASPING FOR AIR*\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n"+assassins.name+": Oh no.."+player.name+"!\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n(Seems like he's back to normal, well. Other than the knife in your shoulder.)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n(James then pull out the locket inside his pocket, which is what produced the ringing.)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n"+assassins.name+": Holy, glad i gave the locket to ya!r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        System.out.print("\n\nPress enter to continue...");
                        scanner.nextLine();
                        clear();

                        assassinEvent.setNarratives("\n\n"+assassins.name+": #2! He's not the enemy! i was controlled!\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\nAssassin#2: What do you mean you're controlled?!\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n"+assassins.name+": I was controlled! Help me pick him up! They might show up any minute now!\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);

                        assassinEvent.setNarratives("\n\n(But it was too late..)\r\n");
                        assassinEvent.showNarratives();
                        System.out.println();
                        TimeUnit.SECONDS.sleep(1);
                        
                        break;
                    }
                }
                break;
            }
        }
        Main ENDEvent = new Main() {};

        ENDEvent.setNarratives("\n\n(Suddenly, a huge earthquake appears..)\r\n");
        ENDEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        ENDEvent.setNarratives("\n\n(Explosions can be heard. Then the cottage's roof suddenly get destroyed, revealing an abomination beyond anyone's comprehension)\r\n");
        ENDEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        ENDEvent.setNarratives("\n\n???: "+player.name+". I. MORBUSREX, BEEN SEARCHING FOR YOU, AND WILL TAKE YOU. DO NOT RESIST.\r\n");
        ENDEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        
        ENDEvent.setNarratives("\n\n. ");
        ENDEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(2);

        ENDEvent.setNarratives(" . ");
        ENDEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(2);

        ENDEvent.setNarratives(" . ");
        ENDEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(2);

        ENDEvent.setNarratives(" . ");
        ENDEvent.showNarratives();
        System.out.println();
        TimeUnit.SECONDS.sleep(2);
    }
}