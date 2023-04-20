package com.example.onlionecasinos.ui.home;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlionecasinos.R;
import com.example.onlionecasinos.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    HorizontalListAdapter horizontalListAdapteradapter;
    VerticalListAdapter verticalListAdapter;


    private FragmentHomeBinding binding;


    String data;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
//
//        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        verticalRecyclerView.setAdapter(new VerticalAdapter(/* pass your data */));

        // Get the SharedPreferences object
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        data = sharedPreferences.getString("country", "");



        binding.horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.horizontalRecyclerView.setHasFixedSize(true);

        binding.verticalRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        binding.verticalRecyclerView.setHasFixedSize(true);




        if(data.equals("USA"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.usa_banner,R.drawable.usa_icon,"888","9.2","\n" +
                            "Overall, 888 is a great choice for players who are looking for a reliable and exciting online casino. The generous welcome bonus and free spins offer make it a great place to start, and the wide selection of games ensures that there is something for everyone."),
                    new CountryModel(R.drawable.usa_funduel,R.drawable.usa_icon_funduel,"FunDuel","9.8","Funduel is a new online casino that offers a unique gaming experience to its players. The casino is licensed by the government of Curacao and offers a wide variety of games, including slots, table games, video poker, and live dealer games.\n" +
                            "\n" +
                            "New players at Funduel can take advantage of a 100% welcome bonus and 120 free spins when they deposit $10 or more. The free spins can be used on the popular game Book of Dead, and the wagering requirement for the bonus is 40x, which is slightly higher than some other casinos.\n" +
                            "\n" +
                            "Some of the most popular slots at Funduel include Starburst, Gonzo's Quest, and Book of Dead. The casino also has a good selection of table games, including blackjack, roulette, and baccarat.\n" +
                            "\n" +
                            "In addition to its impressive selection of games and generous bonuses, Funduel also offers excellent customer service. Players can contact the support team 24/7 via live chat or email, and the representatives are knowledgeable and friendly.\n" +
                            "\n" +
                            "Overall, Funduel is a great choice for players who are looking for a new and exciting online casino. The welcome bonus and free spins offer is a great way to get started, and the unique gaming experience is sure to keep players entertained. However, the slightly higher wagering requirement for the bonus may not be suitable for all players.\n"),
                    new CountryModel(R.drawable.usa_planet7banner,R.drawable.usa_icon_planet7icon,"Planet7","9.1","\"Planet7 is an online casino that is powered by Realtime Gaming (RTG) software. The casino has a good reputation among players and is licensed by the government of Costa Rica. Planet7 offers a wide variety of games, including slots, table games, video poker, and specialty games.\n" +
                            "\n" +
                            "New players at Planet7 can take advantage of a 200% welcome bonus and 200 free spins when they deposit $20 or more. The free spins can be used on the popular game Nova 7s, and the wagering requirement for the bonus is 30x, which is reasonable.\n" +
                            "\n" +
                            "Some of the most popular slots at Planet7 include Asgard, Bubble Bubble, and Cash Bandits 2. The casino also has several progressive jackpot slots, including Aztec's Millions and Megasaur.\n" +
                            "\n" +
                            "In addition to its impressive selection of games and generous bonuses, Planet7 also offers excellent customer service. Players can contact the support team 24/7 via live chat or email, and the representatives are knowledgeable and friendly.\"\n"),
                    new CountryModel(R.drawable.usa_ragingbullbanner,R.drawable.usa_icon_ragingbull_icon,"Raging Bull","9.3","\"Raging Bull is a popular online casino that is powered by RTG. The casino has a good reputation among players and is licensed by the government of Curacao. Raging Bull offers a wide variety of games, including slots, table games, video poker, and specialty games.\n" +
                            "\n" +
                            "New players at Raging Bull can take advantage of a 250% welcome bonus and 120 free spins when they deposit $25 or more. The free spins can be used on the popular game Cash Bandits 2, and the wagering requirement for the bonus is 35x, which is reasonable.\n" +
                            "\n" +
                            "Some of the most popular slots at Raging Bull include Bubble Bubble, Cash Bandits 2, and Fire Dragon. The casino also has several progressive jackpot slots, including Jackpot Cleopatra's Gold and Spirit of the Inca.\n" +
                            "\n" +
                            "Overall, Raging Bull is a great choice for players who are looking for a reliable and exciting online casino. The generous welcome bonus and free spins offer make it a great place to start, and the wide selection of games ensures that there is something for everyone.\"\n"),
                    new CountryModel(R.drawable.usa_reddogbanner,R.drawable.usa_icon_reddogcasinoicon,"Red Dog","9.9","\"Red Dog is a popular online casino that is powered by RTG. The casino has a good reputation among players and is licensed by the government of Curacao. Red Dog offers a wide variety of games, including slots, table games, video poker, and specialty games.\n" +
                            "\n" +
                            "New players at Red Dog can take advantage of a 200% welcome bonus and 250 free spins when they deposit $20 or more. The free spins can be used on the popular game Cash Bandits 2, and the wagering requirement for the bonus is 35x, which is reasonable.\n" +
                            "\n" +
                            "Some of the most popular slots at Red Dog include Bubble Bubble 2, Achilles Deluxe, and Asgard. The casino also has several progressive jackpot slots, including Aztec's Millions and Megasaur.\n" +
                            "\n" +
                            "In addition to its impressive selection of games and generous bonuses, Red Dog also offers excellent customer service. Players can contact the support team 24/7 via live chat or email, and the representatives are knowledgeable and friendly.\"\n"),
                    new CountryModel(R.drawable.usa_slotocashbanner,R.drawable.usa_icon_slotcashcasinoicon,"Slotocash","9.5","\"Slotocash is a popular online casino that offers a wide variety of games and generous bonuses to its players. The casino is powered by Realtime Gaming (RTG), which is one of the leading software providers in the industry. The casino is licensed by the government of Curacao and has a good reputation among players.\n" +
                            "\n" +
                            "When it comes to bonuses, Slotocash offers a 200% welcome bonus and 300 free spins to new players who deposit $20 or more. This is a very generous offer, and the free spins can be used on the popular game Cash Bandits 3. The wagering requirement for the bonus is 30x, which is reasonable.\n" +
                            "\n" +
                            "In terms of games, Slotocash has a large selection of slots, table games, video poker, and specialty games. Some of the most popular slots include Bubble Bubble 2, Achilles Deluxe, and Witchy Wins. The casino also has several progressive jackpot slots, including Aztec's Millions and Megasaur.\n" +
                            "\n" +
                            "Overall, Slotocash is a great choice for players who are looking for a reliable and exciting online casino. The generous welcome bonus and free spins offer make it a great place to start, and the wide selection of games ensures that there is something for everyone.\"\n"),
                    new CountryModel(R.drawable.usa_uptowenacesbanner,R.drawable.usa_icon_uptwonacesicon,"Uptown Aces","9.7","\"Uptown Aces is a popular online casino that is powered by RTG. The casino has a good reputation among players and is licensed by the government of Curacao. Uptown Aces offers a wide variety of games, including slots, table games, video poker, and specialty games.\n" +
                            "\n" +
                            "New players at Uptown Aces can take advantage of a 150% welcome bonus and 400 free spins when they deposit $10 or more. The free spins can be used on the popular game Cash Bandits 2, and the wagering requirement for the bonus is 30x, which is reasonable.\n" +
                            "\n" +
                            "Some of the most popular slots at Uptown Aces include Aladdin's Wishes, Bubble Bubble, and Cash Bandits 2. The casino also has several progressive jackpot slots, including Aztec's Millions and Megasaur.\n" +
                            "\n" +
                            "In addition to its impressive selection of games and generous bonuses, Uptown Aces also offers excellent customer service. Players can contact the support team 24/7 via live chat or email, and the representatives are knowledgeable and friendly.\n" +
                            "\n" +
                            "Overall, Uptown Aces is a great choice for players who are looking for a reliable and exciting online casino. The generous welcome bonus and free spins offer make it a great place to start, and the wide selection of games ensures that there is something for everyone.\"\n"),

            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);


        }


       else if(data.equals("Canada"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.canada_magicredbanner,R.drawable.canada_magicrecasino,"Magic Red Casino","9.9","\"\tMagic Red Casino offers a modern and sleek gaming experience with a wide selection of games. Their welcome bonus is generous, and the free spins add an extra level of excitement. The site is mobile-friendly, and their customer support is available 24/7. The withdrawal process can be a bit slow, but overall it's a great casino for players looking for a variety of games.\"\n"),
                    new CountryModel(R.drawable.canada_banner,R.drawable.canada_icon,"Leovegas","9.7","\"Leovegas is another popular online casino that has been around for several years. The casino offers a wide range of games, including slots, table games, and live dealer games. One of the best things about Leovegas is its welcome bonus. New players can receive a 150% welcome bonus up to $300 and 250 free spins when they make their first deposit. The free spins can be used on popular slots like Book of Dead and Starburst.\n" +
                            "Leovegas has a very high rating of 9.7, which is a testament to the quality of its services. The website is easy to navigate and the customer support team is available 24/7 to assist players with any questions or issues they may have.\"\n"),
                    new CountryModel(R.drawable.canada_jackpotciybanner,R.drawable.canada_icon_jacocityicon,"Jackpot City","9.8","\"Jackpot City is a well-established online casino that has been operating since 1998. It is powered by Microgaming software, which is one of the most reputable and trusted software providers in the industry. As such, players can expect to find a wide variety of high-quality games that are both entertaining and fair.\n" +
                            "\n" +
                            "One of the standout features of Jackpot City is its extensive selection of progressive jackpot games. With over 20 different progressive jackpot games to choose from, players have the chance to win life-changing sums of money with just a single spin. The casino also offers a variety of other games, including slots, table games, and video poker.\n" +
                            "\n" +
                            "In terms of promotions, Jackpot City offers a generous welcome bonus for new players, as well as regular promotions and a loyalty program for existing players. Overall, Jackpot City is a great choice for players who are looking for a reliable and entertaining online casino.\"\n"),
                    new CountryModel(R.drawable.canada_eurpoaner,R.drawable.canada_icon_erupoicon,"Europa Casino","9.4","\"Europa Casino is a well-established online casino that has been operating since 2003. It is licensed and regulated by the Government of Gibraltar, which means that players can trust that the casino operates in a fair and transparent manner. The casino is powered by Playtech software, which is one of the most reputable and trusted software providers in the industry.\n" +
                            "\n" +
                            "One of the standout features of Europa Casino is its extensive selection of games. From slots and table games to video poker and live dealer games, there is something for everyone at this casino. The casino also offers a variety of progressive jackpot games, which gives players the chance to win life-changing sums of money with just a single spin.\n" +
                            "\n" +
                            "In terms of promotions, Europa Casino offers a generous welcome bonus for new players, as well as regular promotions and a loyalty program for existing players. Overall, Europa Casino is a great choice for players who are looking for a reliable and entertaining online casino.\"\n"),
                    new CountryModel(R.drawable.canada_casionly,R.drawable.canada_icon_casionly,"Casinoly","9.1","Casinoly Casino is a great online casino that offers a seamless user experience, an impressive game selection, and some generous bonuses and promotions. They offers some generous bonuses and promotions to new and existing players. New players can claim a welcome bonus, which includes a match bonus and free spins. The casino also offers regular promotions, including reload bonuses, cashback, and free spins. Players can keep track of the latest promotions by checking the promotions page on the website.The casino is licensed and regulated by a reputable gambling regulator, and it uses SSL encryption to protect players' personal and financial information. The customer support team is professional and responsive, and the payment options are diverse.\n"),
                    new CountryModel(R.drawable.canada_betwinner,R.drawable.canada_icon_betwineer,"Betwinner","9.6","\"Betwinner is a relatively new online casino that was launched in 2018. It is licensed and regulated by the Government of Curacao, which means that players can trust that the casino operates in a fair and transparent manner. The casino is powered by a variety of software providers, including Microgaming, NetEnt, and Betsoft, which means that players can expect to find a wide variety of high-quality games.\n" +
                            "\n" +
                            "One of the standout features of Betwinner is its extensive selection of sports betting options. In addition to traditional sports betting options, the casino also offers betting on esports, virtual sports, and even politics. This makes Betwinner a great choice for players who are interested in betting on a variety of different events.\n" +
                            "\n" +
                            "In terms of promotions, Betwinner offers a generous welcome bonus for new players, as well as regular promotions and a loyalty program for existing players. Overall, Betwinner is a great choice for players who are looking for a comprehensive online casino and sportsbook.\"\n"),
                    new CountryModel(R.drawable.canda_888,R.drawable.canada_icon_888,"888 Casino","9.5","\"888 Casino is a popular online casino that has been around for over 20 years. The casino offers players a wide variety of games, including slots, table games, and live dealer games. One of the best things about 888 Casino is its welcome bonus. New players can receive a 100% welcome bonus up to $200 and 200 free spins when they make their first deposit. The free spins can be used on popular slots like Starburst, Gonzo’s Quest, and Jack and the Beanstalk.\n" +
                            "The casino has a very high rating of 9.5, which is a testament to the quality of its services. The website is easy to navigate and the customer support team is available 24/7 to assist players with any questions or issues they may have.\"\n"),

            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }


        else  if(data.equals("Australia"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.canada_casionly,R.drawable.canada_icon_casionly,"Casinoly","9.5","\"Woo Casino promises to woo players with their astounding selection of over one thousand instant play casino games. This means that you’ll access all games straight from your web browser without downloading any software. These casino game titles have been developed by top-tier software providers, including Amatic, Microgaming, NetEnt, and Pragmatic Play. You can even filter the games by developer, so it's easy to find your favorites.\n" +
                            "\n" +
                            "The interface at Woo Casino has an extremely smooth feel to it, so it’s a breeze to move between video slots, table games, and jackpots. Speaking of slots, there are hundreds of classic and modern slot titles to choose from. Sail the high seas with the slot Spanish Armada, or relax down by Belatra’s Frog Creek.\"\n"),
                    new CountryModel(R.drawable.australlia_heaposwins,R.drawable.australlia_icon_heaposwens,"Heapsowins","9.7","\"Heapsowins is an RTG (“Real Time Gaming”) online casino that offers RTG’s entire catalog of slot and table games in a modern and clean and interface. In addition, the casino offers a large set of bonuses, includingn more than 3 weekly re-load bonuses and daily free spins. Despite all this, however, the casino does not provide licensing information anywhere on its website and it might be operating without a license. Bonuses and Promotions\n" +
                            "150% No Rules Bonus\n" +
                            "With the No Rules Bonus at Heapsowins, you can claim a 150% bonus with no playthrough requirements and no cashout limits. In order to claim the bonus, you will need to make a minimum deposit of USD 20 with the bonus code “NEWHEAPS.” The no-rules bonus has no wagering requirements and no cashout limits but has a 3x redemption limit. In addition, you will receive 50 free spins for “The Mariachi 5” slot game. Unlike the match bonus, the free spins come with a 30x playthrough requirement that needs to be completed before the bonus can be withdrawn.\n" +
                            "\n" +
                            "150% Match Bonus\n" +
                            "With the “HEAPS150” bonus code, you can claim 150% match bonus. The bonus has no redemption limit and can be claimed as many times as you won. A deposit of at least USD 20 is required to claim the bonus, and the bonus is subject to 30x playthrough requirements and a USD 50,000 cash-out limit. The bonus can be played on all Slots & Keno games at the casino, but cannot be used on live games. See the casino’s terms and conditions for more information about the games to which the bonus applies.\"\n"),
                    new CountryModel(R.drawable.australia_hellspins,R.drawable.australia_icon_hellspin,"Hell spins","9.2","Hell Spin stands out immediately for an interesting look, one that emphasizes fun characters (such as their flaming head mascot) and sharp graphics. And, like other online casinos, the site lets you gamble for real money on games that are played online either on a computer or a mobile device. The question that’s important to answer is whether or not they can be trusted to be legitimate and follow through on their promises. Amidst these main categories, you’ll find an incredible selection of individual games. By our rough count, you can find over 4,000 varieties of slots. Add to that over 500 table games, most of which are administered by live dealers and croupiers, and you can imagine what we’re describing. The welcome offered by Hell Spin is a straight match, 100% of that first deposit. As for the maximum limit, you can get up to 300 AUD. On top of that, you also get the benefit of 100 free spins on the Wild Walker slot, to be doled out in two 50-spin servings.\n"),
                    new CountryModel(R.drawable.australia_nationalcasino,R.drawable.australoia_icon_nationalcasino,"National","9.8","\"\n" +
                            "National Casino is a great choice for those who are looking for a high-quality gaming experience. The casino offers a wide range of games, including popular slots, table games, and live dealer games. The website is user-friendly and easy to navigate, making it easy to find the games you want to play.\n" +
                            "\n" +
                            "In terms of bonuses, National Casino offers a generous welcome package that includes a 100% match bonus and 250 free spins. The free spins can be used on popular slots like Book of Cats, Platinum Lightning, and Aztec Magic. The wagering requirements for the welcome bonus are reasonable, with a 40x playthrough requirement before you can withdraw any winnings.\n" +
                            "\n" +
                            "Overall, National Casino is a great choice for players who want a high-quality gaming experience with a generous welcome package.\"\n"),
                    new CountryModel(R.drawable.australia_ozwin,R.drawable.australia_icon_ozwin,"Ozwin","9.1","Ozwin Casino is an online betting site that launched in 2020 and caters to players in Australia. With a deposit amount of 20, you can get a 125% welcome bonus along with 200 free spins. The casino rating is a fantastic 9.1, which means that players can expect an excellent gaming experience. The site is more or less the typical RTG casino, with all of the same games and banking methods. While it's not as great as the sites Aussies had access to a decade ago, this casino does serve as a good choice for punters who're stuck with what the government has restricted you to.\n"),
                    new CountryModel(R.drawable.australia_playmo,R.drawable.australia_icon_playmo,"PlayAmo","9.3","\"PlayAmo is a great choice for those who are looking for a high-quality gaming experience with a wide range of games. The casino offers popular slots, table games, and live dealer games from top providers like NetEnt, Microgaming, and Evolution Gaming. The website is well-designed and easy to navigate, with a user-friendly interface that makes it easy to find the games you want to play.\n" +
                            "\n" +
                            "In terms of bonuses, PlayAmo offers a generous welcome package that includes a 200% match bonus and 400 free spins. The free spins can be used on popular slots like The Dog House, Elvis Frog in Vegas, and Platinum Lightning. The wagering requirements for the welcome bonus are reasonable, with a 40x playthrough requirement before you can withdraw any winnings.\"\n"),
                    new CountryModel(R.drawable.australia_woo,R.drawable.australia_icon_woo,"Woo","9.5","\"Woo Casino is a popular choice for those who are looking for a fun and exciting gaming experience. The casino offers a wide range of games, including popular slots, table games, and live dealer games. The website is well-designed and easy to navigate, with a user-friendly interface that makes it easy to find the games you want to play.\n" +
                            "\n" +
                            "In terms of bonuses, Woo Casino offers a generous welcome package that includes a 150% match bonus and 120 free spins. The free spins can be used on popular slots like Wolf Gold, Book of Cats, and Platinum Lightning. The wagering requirements for the welcome bonus are reasonable, with a 40x playthrough requirement before you can withdraw any winnings.\n" +
                            "\n" +
                            "Overall, Woo Casino is a great choice for players who want a fun and exciting gaming experience with a generous welcome package.\"\n"),


            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }



        else if(data.equals("Germany"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.canada_casionly,R.drawable.canada_icon_casionly,"Casinoly","9.1","Casinoly ist ein beliebtes Casino mit einer großen Auswahl an Spielen und großzügigen Bonusangeboten. Neue Spieler können einen 200% Bonus auf ihre erste Einzahlung sowie 200 Freispiele erhalten. Das Casino bietet auch regelmäßige Aktionen und Boni für treue Spieler. Die Website von Casinoly ist benutzerfreundlich und einfach zu navigieren. Das Casino bietet auch schnelle Auszahlungen und hervorragenden Kundensupport. Insgesamt ist Casinoly ein großartiger Ort für Spieler, die nach einem unterhaltsamen und lohnenden Casino-Erlebnis suchen.\n"),
                    new CountryModel(R.drawable.germany_cazimbo,R.drawable.germany_icon_cazimbo,"Cazimbo","9.9","Cazimbo ist ein Casino, das für seine großzügigen Bonusangebote bekannt ist. Neue Spieler können einen 150% Bonus auf ihre erste Einzahlung sowie 400 Freispiele erhalten. Das Casino verfügt über eine beeindruckende Auswahl an Spielen, die von führenden Entwicklern wie NetEnt und Microgaming bereitgestellt werden. Die Website von Cazimbo ist benutzerfreundlich und einfach zu navigieren. Das Casino bietet auch schnelle Auszahlungen und hervorragenden Kundensupport. Cazimbo ist definitiv ein Casino, das es wert ist, ausprobiert zu werden.\n"),
                    new CountryModel(R.drawable.germany_gallo,R.drawable.germany_icon_gallo,"Gallo","9.5","Gallo bietet seinen Spielern ein großartiges Spielerlebnis mit einer beeindruckenden Auswahl an Spielen und einem großzügigen Willkommensbonus. Spieler, die sich bei Gallo anmelden, können einen 100% Bonus auf ihre erste Einzahlung sowie 120 Freispiele erhalten, die ihnen helfen können, ihre Gewinne zu maximieren. Das Casino verfügt auch über eine benutzerfreundliche Website und bietet ausgezeichneten Kundensupport. Insgesamt ist Gallo ein großartiger Ort für Spieler, die nach einem erstklassigen Casino-Erlebnis suchen.\n"),
                    new CountryModel(R.drawable.germany_nationalcasino,R.drawable.germany_icon_nationalcasino,"National Casino","9.1","National Casino ist ein Casino mit einer großartigen Auswahl an Spielen und großzügigen Bonusangeboten. Neue Spieler können einen 200% Bonus auf ihre erste Einzahlung sowie 120 Freispiele erhalten, um ihre Gewinne zu maximieren. Das Casino verfügt über eine benutzerfreundliche Website und bietet ausgezeichneten Kundensupport. National Casino bietet auch regelmäßige Aktionen und Boni für treue Spieler. Insgesamt ist National Casino ein großartiger Ort für Spieler, die nach einem unterhaltsamen und lohnenden Casino-Erlebnis suchen.\n"),
                    new CountryModel(R.drawable.germnany_netbet,R.drawable.germenynetbet_icon,"Netbet","9.9","Netbet ist ein Casino mit einer beeindruckenden Auswahl an Spielen und großzügigen Bonusangeboten. Neue Spieler können einen 150% Bonus auf ihre erste Einzahlung sowie 400 Freispiele erhalten, um ihre Gewinne zu maximieren. Das Casino verfügt über eine benutzerfreundliche Website und bietet ausgezeichneten Kundensupport. Netbet bietet auch regelmäßige Aktionen und Boni für treue Spieler. Insgesamt ist Netbet ein großartiger Ort für Spieler, die nach einem erstklassigen Casino-Erlebnis suchen.\n"),
                    new CountryModel(R.drawable.germany_nomini,R.drawable.germany_icon_nomini,"Nomini","9.5","Nomini ist ein aufregendes Casino mit einer großartigen Auswahl an Spielen und großzügigen Bonusangeboten. Neue Spieler können einen 100% Bonus auf ihre erste Einzahlung sowie 200 Freispiele erhalten, um ihre Gewinne zu maximieren. Das Casino bietet auch regelmäßige Aktionen und Boni für treue Spieler. Die Website von Nomini ist benutzerfreundlich und einfach zu navigieren, und das Casino bietet schnelle Auszahlungen und hervorragenden Kundensupport. Insgesamt ist Nomini ein großartiger Ort für Spieler, die nach einem unterhaltsamen und lohnenden Casino-Erlebnis suchen.\n"),
                    new CountryModel(R.drawable.germany_silver,R.drawable.germany_silver_icon,"Silver Play Casino","9.3","Silver Play Casino ist ein Casino mit einer guten Auswahl an Spielen und großzügigen Bonusangeboten. Neue Spieler können einen 100% Bonus auf ihre erste Einzahlung sowie 200 Freispiele erhalten, um ihre Gewinne zu maximieren. Das Casino verfügt über eine benutzerfreundliche Website und bietet guten Kundensupport. Silver Play Casino bietet auch regelmäßige Aktionen und Boni für treue Spieler. Insgesamt ist Silver Play Casino ein solides Casino für Spieler, die nach einem unterhaltsamen und lohnenden Casino-Erlebnis suchen.\n"),
                    new CountryModel(R.drawable.germany_vulkan,R.drawable.germany_icon_vulkan,"Vulkan","9.7","Vulkan ist ein Casino mit einer beeindruckenden Auswahl an Spielen und großzügigen Bonusangeboten. Neue Spieler können einen 150% Bonus auf ihre erste Einzahlung sowie 300 Freispiele erhalten, um ihre Gewinne zu maximieren. Das Casino verfügt über eine benutzerfreundliche Website und bietet ausgezeichneten Kundensupport. Vulkan bietet auch regelmäßige Aktionen und Boni für treue Spieler. Insgesamt ist Vulkan ein großartiger Ort für Spieler, die nach einem erstklassigen Casino-Erlebnis suchen.\n"),


            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }


        else  if(data.equals("France"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.france_agentspin,R.drawable.france_icon_agentspin,"Agent spins","9.3","Agent spins est un casino en ligne relativement nouveau qui a rapidement gagné en popularité grâce à ses offres généreuses et son large choix de jeux. En plus du bonus de bienvenue de 200% jusqu'à 400 € et des 120 tours gratuits, le casino propose régulièrement des promotions pour ses joueurs fidèles. Les joueurs peuvent profiter de plus de 500 jeux de différents fournisseurs de logiciels de casino, notamment NetEnt, Microgaming et Play'n GO. Avec un service clientèle disponible 24h/24 et 7j/7, Agent spins est un choix sûr pour les joueurs à la recherche d'un nouveau casino en ligne excitant.\n"),
                    new CountryModel(R.drawable.france_casinbowinoui,R.drawable.france_icon_casinooui,"Wionoui","9.3","Wionoui offre un bonus de bienvenue de 100% jusqu'à 150€ et 150 tours gratuits. Les conditions de mise sont raisonnables et il y a une grande sélection de jeux à choisir. Les paiements sont rapides et fiables. Le service client est également disponible 24h/24 et 7j/7. Dans l'ensemble, Wionoui est un excellent choix pour les joueurs qui cherchent un casino en ligne fiable et divertissant.\n"),
                    new CountryModel(R.drawable.france_enzo,R.drawable.france_icon_enzo,"Enzo","9.5","Enzo offre un généreux bonus de bienvenue de 200% jusqu'à 600€ et 120 tours gratuits. Les conditions de mise sont raisonnables et il y a une grande sélection de jeux à choisir. Les paiements sont rapides et fiables. Le service client est également disponible 24h/24 et 7j/7. Enzo est un choix solide pour les joueurs qui cherchent à maximiser leur dépôt initial et à profiter d'une expérience de jeu de qualité supérieure.\n"),
                    new CountryModel(R.drawable.france_grato,R.drawable.france_icongrato,"Gratowin","9.2","Gratowin offre un bonus de bienvenue de 100% jusqu'à 200€ et 120 tours gratuits. Le casino propose une large sélection de jeux de qualité, ainsi qu'un programme de fidélité généreux pour les joueurs réguliers. Les conditions de mise sont raisonnables et les paiements sont rapides et sécurisés. Le service client est également disponible 24h/24 et 7j/7. Dans l'ensemble, Gratowin est un excellent choix pour les joueurs à la recherche d'un casino en ligne fiable et divertissant.\n"),
                    new CountryModel(R.drawable.france_machance,R.drawable.france_iconmachance,"Ma Chance","9.8","Ma Chance propose l'une des offres de bienvenue les plus généreuses du marché, avec un bonus de 200% jusqu'à 2000€ et 200 tours gratuits. Le casino propose une expérience de jeu exceptionnelle avec une sélection de jeux impressionnante, ainsi qu'un service client de première classe disponible 24h/24 et 7j/7. Les paiements sont rapides et fiables, et les conditions de mise sont raisonnables. En bref, Ma Chance est le choix parfait pour les joueurs à la recherche d'un casino en ligne haut de gamme.\n"),
                    new CountryModel(R.drawable.france_unique,R.drawable.france_icon_uniqe,"Casino unique","9.8","Min Deposit : 20$\n" +
                            "Offer: BONUS JUSQU'À 200 €\n" +
                            "\n" +
                            "Casino unique\n" +
                            "Créé par Play Logia en 2016, Unique Casino offre aux joueurs la possibilité de jouer à des centaines de jeux à partir d'un casino sous licence avec une solide histoire.\n" +
                            "Vous pourrez faire tourner les rouleaux sur plus de 450 jeux de machines à sous en ligne et trouver des dizaines de jeux de table, que vous jouiez depuis un appareil mobile ou de bureau.\n" +
                            "Unique Casino est un site de jeux en ligne populaire qui existe depuis 2016. Licencié à Curaçao, le site offre aux joueurs un bonus de bienvenue de 200% et l'accès à plus de 500 jeux de casino.\n" +
                            "Avec plusieurs promotions en cours, Unique Casino offre aux joueurs la possibilité de réclamer souvent de l'argent bonus. Des remises en argent, des bonus de rechargement et des tours gratuits sont disponibles.\n" +
                            "Certaines des autres catégories les mieux notées chez Unique Casino incluent un service client utile et des options bancaires pratiques. Les joueurs se voient proposer des retraits rapides et sont protégés par un cryptage SSL.\n" +
                            "Bonus de casino unique\n" +
                            "En tant que nouveau joueur sur Unique Casino, vous pourrez réclamer un bonus de bienvenue de 100%. Lorsque vous effectuez votre premier dépôt (qui doit être supérieur à 10 $), le casino le doublera. Ainsi, si vous déposez 100 $, vous obtiendrez 100 $ supplémentaires pour jouer. Le montant maximum de bonus que vous pouvez réclamer est de 200 $.\n" +
                            "Vous aurez besoin de voir cette page de destination spéciale sur Unique Casino pour vous assurer de recevoir l'intégralité du bonus de 100%. \n" +
                            "Promotions en cours au casino unique\n" +
                            "Les bonus disponibles sur Unique Casino ne manquent pas. Chaque fois que vous vous connectez, des promotions attendent d'être réclamées.\n" +
                            " \n" +
                            "Roue bonus hebdomadaire\n" +
                            "Chaque semaine, vous pourrez faire tourner la roue des bonus qui offre différents bonus de rechargement qui offrent d'égaler votre dépôt de 25% à 100%. Cela vaut la peine de faire tourner la roue, car cela garantit un petit coup de pouce à votre premier dépôt Unique Casino de la semaine.\n" +
                            "Faites tourner la roue des bonus une fois par semaine sur Unique Casino pour un bonus de match.\n" +
                            " \n" +
                            "Bonus de cashback\n" +
                            "Les bonus de cashback sont disponibles pour les membres VIP sur Unique Casino. Si vous êtes un passionné de jeux de casino, je vous recommande de rejoindre le club VIP. Vous recevrez une remise en argent chaque semaine, qui varie en fonction de votre niveau VIP, des bonus précédents et de l'historique des gains.\n" +
                            " \n" +
                            "Bonus de dépôt rapide\n" +
                            "Le bonus de dépôt rapide est un outil utile qui vous permet d'approvisionner votre compte en quelques clics. En plus d'être pratique, il vous offre également un bonus. Chaque fois que vous effectuez un dépôt rapide, attendez-vous à voir un peu d'argent supplémentaire sur votre compte.\n" +
                            " \n" +
                            "Bonus unique de casino sans dépôt\n" +
                            "Si vous recherchez un bonus sans dépôt avec lequel jouer sur Unique Casino, malheureusement, vous n'avez pas de chance.\n" +
                            "Tous les bonus disponibles sur Unique Casino sont des bonus de match, vous devrez donc déposer de l'argent si vous souhaitez réclamer des tours gratuits ou de l'argent bonus.\n"),
                    new CountryModel(R.drawable.france_vegas,R.drawable.france_icon_vegas,"Vegas plus","9.7","Min Deposit : 10$\n" +
                            "Offer : Pack de Bienvenue de 750 €\n" +
                            "Revue du casino Vegas Plus\n" +
                            "Vegas Plus est un nouveau casino en ligne qui met l'accent sur le joueur au lieu de gagner de l'argent. Même si le site est encore frais, il a un grand objectif en tête - la domination mondiale du marché des jeux d'argent en ligne. C'est un objectif assez grand et audacieux à avoir pour un casino aussi jeune, mais nous devons dire que les choses se passent plutôt bien pour Vegas Plus.\n" +
                            "Agréé par le gouvernement de Curaçao, le casino Vegas Plus s'est associé à des concepteurs de jeux primés pour vous offrir les meilleurs jeux de l'industrie. Des centaines de machines à sous et de jeux de table dans le hall sont disponibles sans interruption grâce à la plateforme de jeu instantané. Il vous suffit de vous connecter au casino et de jouer à vos meilleurs favoris - il n’est pas nécessaire de télécharger des logiciels ou des modules complémentaires encombrants.\n" +
                            "Casino optimisé pour les mobiles, Vegas Plus place le joueur avant tout. Outre le fait que vous vous amuserez beaucoup dans le casino, vous aurez également des chances infinies de gagner de superbes prix avec les promotions Vegas Plus.\n" +
                            "Continuez à lire notre critique ci-dessous pour voir ce qui rend ce casino si excitant.\n" +
                            "Bonus de bienvenue Vegas Plus Casino\n" +
                            "Le bonus de bienvenue Vegas Plus est assez simple - vous obtenez un bonus de premier dépôt de 100% ainsi qu'une couverture de 50% sur votre deuxième. Vous pouvez gagner jusqu'à 750 € au total si vous utilisez les deux, ce qui n'est certainement pas une mauvaise façon de commencer votre expérience dans ce casino de type Vegas.\n" +
                            "Ce n’est pas tout: une fois votre compte vérifié et votre premier dépôt effectué, vous bénéficiez également de 10 tours gratuits pendant les 5 jours suivants. C’est un total de 50, ce qui signifie 50 chances supplémentaires de gagner.\n" +
                            " \n" +
                            "Conditions générales du bonus de bienvenue\n" +
                            "Le bonus de bienvenue est offert à tous les nouveaux joueurs Vegas Plus de plus de 18 ans. Bien entendu, chaque joueur ne peut ouvrir qu'un seul compte. Ceci est fait pour éviter la fraude et réclamer plus d'un bonus de bienvenue.\n" +
                            "Bien que l'offre de bienvenue de Vegas Plus semble certainement délicieuse, les conditions de mise la ruinent. Debout à 120x, il est presque impossible de les compléter. Nous ne savons pas combien de jours vous avez pour terminer les paris, nous partons donc du principe que vous disposez de 30 jours.\n" +
                            "Pour mettre les choses en perspective, si vous réclamez les deux bonus et disposez de 500 € de fonds supplémentaires, vous devrez miser ce montant 120 fois; 500 € x 120 équivaut à 60 000 €, ce qui est trop sauf si vous êtes un gros joueur. De plus, vous ne pouvez parier que sur les machines à sous avec vos bonus - aucun pari sur les jeux de table ne compte.\n"),


            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }


        else if(data.equals("Brazil"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.brazil_2bet,R.drawable.brazil_icon_2pbt,"20 Bet","9.3","\"O 20Bet é um cassino online relativamente novo, mas já fez um grande impacto na indústria de jogos de azar. Com uma ampla seleção de jogos de cassino, bônus generosos e suporte ao cliente de primeira linha, o 20Bet é uma excelente escolha para quem procura uma experiência de cassino online emocionante.\n" +
                            "\n" +
                            "O bônus de boas-vindas do 20Bet é particularmente impressionante, com novos jogadores recebendo um bônus de 120% e 150 rodadas grátis em seu primeiro depósito de R$10 ou mais. Isso dá a você muitas oportunidades de ganhar grande desde o início. Além do bônus de boas-vindas, o 20Bet oferece uma variedade de outras promoções, incluindo bônus de recarga, rodadas grátis e muito mais.\n" +
                            "\n" +
                            "A seleção de jogos no 20Bet é impressionante, com títulos de alguns dos principais desenvolvedores de jogos do mundo. Se você é um fã de caça-níqueis, encontrará muitos jogos divertidos e emocionantes para jogar, incluindo alguns dos mais populares títulos da indústria. Além disso\"\n"),
                    new CountryModel(R.drawable.brazil_betobetbanner,R.drawable.brazil_betobet_icon,"Bet O Bet","9.5","\"Bet O Bet é um cassino online com muito a oferecer. Desde a sua seleção de jogos até seus bônus e promoções, o Bet O Bet tem algo para todos. Uma das características mais marcantes deste cassino é seu bônus de boas-vindas. Novos jogadores podem receber um bônus de boas-vindas de 100% e 250 rodadas grátis em seu primeiro depósito de R$20 ou mais. Essa é uma ótima maneira de começar no cassino e aumentar suas chances de ganhar grande.\n" +
                            "\n" +
                            "Mas o bônus de boas-vindas não é a única promoção disponível no Bet O Bet. O cassino também oferece bônus regulares e rodadas grátis para manter seus jogadores engajados e voltando para mais. A seleção de jogos do Bet O Bet é impressionante, com títulos de alguns dos principais desenvolvedores de jogos da indústria. Se você prefere slots, jogos de mesa ou jogos de cassino ao vivo, encontrará muitos para escolher no Bet O Bet.\n" +
                            "\n" +
                            "No geral, o Bet O Bet é uma ótima escolha para quem procura uma experiência de cassino online de alta qualidade. Com seus generosos bônus, ampla variedade de jogos e excelente suporte ao cliente, você não pode errar com o Bet O Bet.\"\n"),
                    new CountryModel(R.drawable.brazilbetwinner,R.drawable.brazil_iconbetwinner,"Bet Winner","9.1","\"O Bet Winner é um cassino online que oferece uma ampla variedade de jogos de cassino, incluindo caça-níqueis, jogos de mesa e jogos de cassino ao vivo. Mas o que realmente chama a atenção neste cassino são seus bônus e promoções. O bônus de boas-vindas do Bet Winner é um dos mais generosos que você encontrará em qualquer lugar, com novos jogadores recebendo um bônus de 150% e 400 rodadas grátis em seu primeiro depósito de R$30 ou mais.\n" +
                            "\n" +
                            "Além do bônus de boas-vindas, o Bet Winner também oferece uma variedade de outras promoções, incluindo bônus de recarga, torneios de caça-níqueis e muito mais. Isso significa que há sempre algo para esperar quando se joga no Bet Winner.\n" +
                            "\n" +
                            "A seleção de jogos no Bet Winner é impressionante, com títulos de alguns dos principais desenvolvedores de jogos do mundo. Se você é um fã de caça-níqueis, encontrará muitos jogos divertidos e emocionantes para jogar, incluindo alguns dos mais populares títulos da indústria. Além disso, o Bet Winner tem uma seleção sólida de jogos de mesa e jogos de cassino ao vivo, o que significa que há algo para todos.\n" +
                            "\n" +
                            "O suporte ao cliente do Bet Winner também é excelente. Se você tiver alguma dúvida ou problema, poderá entrar em contato com a equipe de suporte 24 horas por dia, 7 dias por semana, através de chat ao vivo, telefone ou e-mail. A equipe de suporte é amigável, eficiente e está sempre pronta para ajudar.\"\n"),
                    new CountryModel(R.drawable.brazil_leovegas,R.drawable.brazil_icon_leovegas,"Leo Vegas","9.7","O Leo Vegas é um dos principais cassinos online do mundo, e por boas razões. Com uma ampla seleção de jogos de cassino, bônus generosos e suporte ao cliente de primeira linha, o Leo Vegas é uma excelente escolha para quem procura uma experiência de cassino online emocionante. O bônus de boas-vindas do Leo Vegas é particularmente impressionante, com novos jogadores recebendo um bônus de 100% e 400 rodadas grátis em seu primeiro depósito de R$30 ou mais. Isso dá a você muitas oportunidades de ganhar grande desde o início.\n"),
                    new CountryModel(R.drawable.brazil_playzee,R.drawable.brazil_icon_playxe,"Playzee","9.3","O Playzee é um cassino online relativamente novo, mas já está fazendo sucesso na indústria de jogos de azar. Com uma ampla seleção de jogos de cassino, bônus generosos e suporte ao cliente de primeira linha, o Playzee é uma excelente escolha para quem procura uma experiência de cassino online emocionante. O bônus de boas-vindas do Playzee é particularmente impressionante, com novos jogadores recebendo um bônus de 150% e 250 rodadas grátis em seu primeiro depósito de R$20 ou mais. Isso dá a você muitas oportunidades de ganhar grande desde o início. Além do bônus de boas-vindas, o Playzee oferece uma variedade de outras promoções, incluindo bônus de recarga, rodadas grátis e muito mais. A seleção de jogos no Playzee é impressionante, com títulos de alguns dos principais desenvolvedores de jogos do mundo. Se você é um fã de caça-níqueis, encontrará muitos jogos divertidos e emocionantes para jogar, incluindo alguns dos mais populares títulos da indústria. Além disso, o Playzee tem uma seleção sólida de jogos de mesa e jogos de cassino ao vivo, o que significa que há algo para todos. O suporte ao cliente do Playzee também é excelente. Se você tiver alguma dúvida ou problema, poderá entrar em contato com a equipe de suporte 24 horas por dia, 7 dias por semana, através de chat ao vivo, telefone ou e-mail. A equipe de suporte é amigável, eficiente e está sempre pronta para ajudar. \n"),
                    new CountryModel(R.drawable.brazil_rio,R.drawable.brazil_icon_rio,"Spin Rio Casino","9.3","O Spin Rio Casino é um cassino online popular com uma grande seleção de jogos emocionantes. A plataforma é fácil de usar e atraente, com um design moderno que é fácil de navegar. Eles oferecem um bônus de boas-vindas de 100% de até R$ 1.000 em seu primeiro depósito, juntamente com 200 giros grátis. Os giros grátis podem ser usados em uma variedade de jogos emocionantes, incluindo caça-níqueis populares. A equipe de suporte ao cliente está disponível 24 horas por dia, 7 dias por semana, e eles são rápidos para responder a quaisquer perguntas ou preocupações que você possa ter. Com uma avaliação geral de 9,3, o Spin Rio Casino é altamente recomendado para jogadores que procuram uma experiência de cassino online emocionante e confiável.\n"),


            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }

        else  if(data.equals("Italy"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.italy_casinomidsas,R.drawable.italy_icon_casinoidas,"Casino Midas","4.4","\"Casino Midas è un casinò online che offre una vasta selezione di giochi ai giocatori. Il casinò è noto per il suo bonus di benvenuto del 150% sul primo deposito, fino a €1.000, e 120 giri gratuiti su alcune slot machine selezionate. Il casinò offre anche una varietà di promozioni e bonus regolari ai suoi giocatori, tra cui bonus di ricarica e cashback.\n" +
                            "\n" +
                            "Inoltre, il casinò ha un programma fedeltà che premia i giocatori per la loro attività sul sito. Il livello VIP aumenta man mano che si gioca, offrendo premi sempre più generosi e vantaggi esclusivi.\n" +
                            "\n" +
                            "Nel complesso, Casino Midas è un'ottima scelta per i giocatori che cercano un'esperienza di casinò online gratificante e di alta qualità.\"\n"),
                    new CountryModel(R.drawable.italy_casmbiecasino,R.drawable.italy_icon_casombiecasino,"Casombie Casino","4.7","\"Casombie Casino è un casinò online relativamente nuovo, ma già molto popolare tra i giocatori. Il casinò offre una vasta selezione di giochi, tra cui slot machine, giochi da tavolo e giochi con croupier dal vivo.\n" +
                            "\n" +
                            "Il bonus di benvenuto di Casombie Casino è del 100% sul primo deposito, fino a €500, e 200 giri gratuiti su alcune slot machine selezionate. Il casinò offre anche una varietà di promozioni e bonus regolari ai suoi giocatori, tra cui bonus di ricarica, cashback e tornei con premi in denaro.\n" +
                            "\n" +
                            "Inoltre, il casinò ha un programma fedeltà che premia i giocatori per la loro attività sul sito. Il livello VIP aumenta man mano che si gioca, offrendo premi sempre più generosi e vantaggi esclusivi.\"\n"),
                    new CountryModel(R.drawable.italy_cobra,R.drawable.italy_icon_cobra,"Cobra Casino","4.5","\"Cobra Casino è un casinò online che offre una vasta selezione di giochi ai giocatori. Il casinò è noto per il suo bonus di benvenuto del 120% sul primo deposito, fino a €500, e 150 giri gratuiti su alcune slot machine selezionate. Il casinò offre anche una varietà di promozioni e bonus regolari ai suoi giocatori, tra cui bonus di ricarica, cashback e tornei con premi in denaro.\n" +
                            "\n" +
                            "Il sito web di Cobra Casino è ben strutturato e facile da navigare, il che lo rende facile da usare per i giocatori di tutti i livelli. Il casinò è dotato di un'ampia gamma di giochi, tra cui slot machine, giochi da tavolo e giochi con croupier dal vivo.\n" +
                            "\n" +
                            "Cobra Casino è noto per la sua sicurezza e affidabilità, con standard di sicurezza elevati e protocolli di crittografia avanzati per proteggere le informazioni dei giocatori. Inoltre, il casinò ha un team di supporto clienti disponibile 24 ore su 24, 7 giorni su 7, per assistere i giocatori con qualsiasi domanda o problema.\"\n"),
//                    new CountryModel(R.drawable.italy_uniqecasino,R.drawable.italy_icon_uniqecasino,""),
                    new CountryModel(R.drawable.italy_vegasplus,R.drawable.italy_icon_vegas,"Vegas Plus","4.9","\"Vegas Plus è un casinò online che offre un'ampia selezione di giochi ai giocatori. Dal blackjack alle slot machine, il casinò ha qualcosa per tutti. Il casinò è autorizzato e regolamentato dall'Autorità di Gioco di Curaçao e offre un ambiente di gioco sicuro e protetto.\n" +
                            "\n" +
                            "Una delle cose che distingue Vegas Plus dagli altri casinò online è la sua offerta di bonus di benvenuto. I nuovi giocatori possono ricevere un bonus di benvenuto del 150% sul loro primo deposito, fino a €750, e 200 giri gratuiti. I giri gratuiti possono essere utilizzati su determinati giochi di slot, e il bonus ha un requisito di scommessa di 30x.\n" +
                            "\n" +
                            "Oltre al bonus di benvenuto, Vegas Plus offre anche promozioni e bonus regolari ai suoi giocatori. Ci sono tornei giornalieri con premi in denaro, bonus di ricarica settimanali e persino un programma fedeltà che premia i giocatori per la loro attività sul sito.\"\n"),
                    new CountryModel(R.drawable.italy_wazamba,R.drawable.italy_icon_wazamba,"Wazamba","4.7","\"Wazamba è un casinò online che offre una vasta gamma di giochi ai giocatori. Dai classici giochi di slot ai giochi live del casinò, Wazamba ha qualcosa per tutti. Il casinò è autorizzato e regolamentato dall'Autorità di Gioco di Malta e offre un ambiente di gioco sicuro e protetto.\n" +
                            "\n" +
                            "Una delle cose che fa distinguere Wazamba è la sua offerta di bonus di benvenuto. I nuovi giocatori possono ricevere un bonus di benvenuto del 100% sul loro primo deposito, fino a €500, e 150 giri gratuiti. I giri gratuiti possono essere utilizzati su determinati giochi di slot.\n" +
                            "\n" +
                            "Oltre al bonus di benvenuto, Wazamba offre anche promozioni e bonus regolari ai suoi giocatori. Ci sono tornei giornalieri con premi in denaro, bonus di ricarica settimanali e persino un programma fedeltà che premia i giocatori per la loro attività sul sito.\n" +
                            "\n" +
                            "Nel complesso, Wazamba è una grande scelta per i giocatori che cercano un'esperienza di casinò online divertente e gratificante. Con la sua vasta selezione di giochi e generosi bonus, Wazamba è sicuramente in grado di impressionare.\"\n"),
                    new CountryModel(R.drawable.italy_zodiac,R.drawable.italy_icon_zodiac,"Zodiac Bet","4.1","\"Zodiac Bet è un casinò online che è noto per i suoi giochi e promozioni a tema astrologico. Il casinò è autorizzato e regolamentato dall'Autorità di Gioco di Malta e offre un ambiente di gioco sicuro e protetto ai giocatori.\n" +
                            "\n" +
                            "Una delle cose che distingue Zodiac Bet dagli altri casinò online è la sua offerta di bonus di benvenuto. I nuovi giocatori possono ricevere un bonus di benvenuto del 200% sul loro primo deposito, fino a €1.000, e 120 giri gratuiti. I giri gratuiti possono essere utilizzati su determinati giochi di slot, e il bonus ha un requisito di scommessa di 40x.\n" +
                            "\n" +
                            "Oltre al bonus di benvenuto, Zodiac Bet offre anche promozioni e bonus regolari ai suoi giocatori. Ci sono tornei giornalieri con premi in denaro, bonus di ricarica settimanali e persino un programma fedeltà che premia i giocatori per la loro attività sul sito.\"\n"),


            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }

        else  if(data.equals("Russia"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.betwinner,R.drawable.betwinnericon,"Bet Winner","9.1","Bet Winner - это казино с высоким рейтингом 9.1, которое предлагает щедрые бонусы и множество игр. Их приветственный бонус составляет 200% от первого депозита и 120 бесплатных вращений, что делает его одним из самых щедрых бонусов на рынке. Казино имеет простой и интуитивно понятный интерфейс, что делает его легким в использовании для новых пользователей. Они также предлагают множество различных опций для депозитов и выводов, включая электронные кошельки, банковские карты и многое другое.\n"),
                    new CountryModel(R.drawable.freshcsinobanner,R.drawable.freshcasinoicon,"Fresh Casino","9.5","Fresh Casino предлагает приветственный бонус 150% на первый депозит и 200 бесплатных вращений. Бонус доступен при депозите от 10 до 30 долларов. Казино имеет высокий рейтинг 9.5 и предлагает широкий выбор игр. Они также предлагают множество различных опций для депозитов и выводов, включая электронные кошельки, банковские карты и многое другое.\n"),
                    new CountryModel(R.drawable.gcbetbanner,R.drawable.gcbetcasinoicon,"GG Bet","9.5","GG Bet - это казино с высоким рейтингом 9.5, которое предлагает широкий выбор игр и щедрые бонусы. Их приветственный бонус составляет 150% от первого депозита и 120 бесплатных вращений, что делает его одним из самых щедрых бонусов на рынке. Казино имеет простой и интуитивно понятный интерфейс, что делает его легким в использовании для новых пользователей. Они также предлагают множество различных опций для депозитов и выводов, включая электронные кошельки, банковские карты и многое другое.\n"),
                    new CountryModel(R.drawable.jetcasinobanner,R.drawable.jetcasinoicon,"Jet Casino","9.9","Jet Casino - это казино с высоким рейтингом 9.9, которое предлагает щедрые бонусы и множество игр. Их приветственный бонус составляет 100% от первого депозита и 400 бесплатных вращений, что делает его одним из самых щедрых бонусов на рынке. Казино имеет простой и интуитивно понятный интерфейс, что делает его легким в использовании для новых пользователей. Они также предлагают множество различных опций для депозитов и выводов, включая электронные кошельки, банковские карты и многое другое.\n"),
                    new CountryModel(R.drawable.joycasinobanner,R.drawable.joycasinoicon,"Joy Casino","9.1","150% бонус + 400 бесплатных спинов (соответствующих количеству бесплатных спинов в колонке \"Бесплатные спины\"). Joy Casino - одно из лучших онлайн-казино, которое предлагает своим игрокам более 2000 игр от лучших провайдеров, таких как NetEnt, Microgaming, Play'n GO и других. Сайт очень удобен в использовании и имеет простой интерфейс. Служба поддержки доступна круглосуточно и отзывчива на запросы игроков. Казино также предлагает быстрые выплаты и множество бонусов и промоакций для новых и постоянных игроков.\n"),
                    new CountryModel(R.drawable.rpxcasinobanner,R.drawable.roxcasinoicon,"ROX Casino","9.4","200% бонус + 200 бесплатных спинов (соответствующих количеству бесплатных спинов в колонке \"Бесплатные спины\"). RPX Casino - это новое казино, которое было основано в 2021 году и предлагает более 2000 игр от разных провайдеров, таких как NetEnt, Microgaming, Pragmatic Play и других. Сайт очень удобен в использовании и имеет простой интерфейс. Служба поддержки доступна круглосуточно и отзывчива на запросы игроков. Казино также предлагает быстрые выплаты и множество бонусов и промоакций для новых и постоянных игроков.\n"),
                   // new CountryModel(R.drawable.solcasinobanner,R.drawable.solcasinoicon),
                    new CountryModel(R.drawable.vulkanbanner,R.drawable.vulkancasinoicon,"Vulkan","9.3","Казино Вулкан предоставляет новым игрокам отличное предложение - 100% бонус на первый депозит и 200 бесплатных спинов! Казино Вулкан - лучшее место для любителей азартных игр\n"),


            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }

        else   if(data.equals("Spain"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.spain_casino,R.drawable.spain_icon_888,"888","9.7","888 es un casino en línea con una impresionante selección de juegos y generosas ofertas de bonificación. Los nuevos jugadores pueden obtener un bono de bienvenida del 150% en su primer depósito, así como 300 tiradas gratis para maximizar sus ganancias. El casino tiene un sitio web fácil de usar y ofrece un excelente servicio al cliente. 888 también ofrece promociones y bonificaciones regulares para jugadores leales. En general, 888 es un gran lugar para aquellos que buscan una experiencia de casino de primera clase.\n"),
                  //  new CountryModel(R.drawable.canada_casionly,R.drawable.canada_icon_casionly,""),
                    new CountryModel(R.drawable.sspain_codere,R.drawable.spain_codere_icon,"Codere","9.3","Codere es un casino en línea con una buena selección de juegos y ofertas generosas. Los nuevos jugadores pueden obtener un bono de bienvenida del 100% en su primer depósito, así como 200 tiradas gratis para maximizar sus ganancias. El casino tiene un sitio web fácil de usar y ofrece un buen servicio al cliente. Codere también ofrece promociones y bonificaciones regulares para jugadores leales. En general, Codere es un casino sólido para aquellos que buscan una experiencia de casino divertida y gratificante.\n"),
                    new CountryModel(R.drawable.spain_enzo,R.drawable.france_icon_enzo,"Enzo Casino","9.1","Enzo Casino es un casino en línea con una amplia variedad de juegos y generosas ofertas de bonificación. Los nuevos jugadores pueden obtener un bono de bienvenida del 200% en su primer depósito, así como 120 tiradas gratis para maximizar sus ganancias. El casino tiene un sitio web fácil de usar y ofrece un excelente servicio al cliente. Enzo Casino también ofrece promociones y bonificaciones regulares para jugadores leales. En general, Enzo Casino es un excelente lugar para aquellos que buscan una experiencia de casino de alta calidad y atractivas recompensas.\n"),
                    new CountryModel(R.drawable.germany_gallo,R.drawable.germany_icon_gallo,"Gall Casino","9.1","Gall Casino es un casino en línea de alta calidad con una amplia variedad de juegos de casino emocionantes. Con una valoración de 9.1, Gall Casino es uno de los casinos mejor valorados en el mercado. Además, ofrecen un bono de bienvenida del 150% hasta 30€, lo que significa que si depositas 30€, recibirás un bono de 45€ y 400 tiradas gratis para usar en sus juegos.\n"),
                    new CountryModel(R.drawable.italy_casinomidsas,R.drawable.italy_icon_casinoidas,"Midas","9.6","Midas Casino es un casino en línea de alta calidad con una amplia variedad de juegos de casino emocionantes. Con una valoración de 9.6, Midas es uno de los casinos mejor valorados en el mercado. Además, ofrecen un bono de bienvenida del 100% hasta 20€, lo que significa que si depositas 20€, recibirás un bono de 20€ y 220 tiradas gratis para usar en sus juegos.\n"),
                    new CountryModel(R.drawable.germany_silver,R.drawable.germany_silver_icon,"Silver Play","9.4","Silver Play es un casino en línea muy popular con una amplia selección de juegos de casino. Con una valoración de 9.4, Silver Play es uno de los casinos mejor valorados en el mercado. Además, ofrecen un bono de bienvenida del 120% hasta 15€, lo que significa que si depositas 15€, recibirás un bono de 18€ y 300 tiradas gratis para usar en sus juegos.\n"),
                    new CountryModel(R.drawable.spinsambabanner,R.drawable.spinsambaicon,"Spin Samba","9.2","Spin Samba es un casino en línea confiable y emocionante que ofrece una amplia variedad de juegos de casino para todos los gustos. Con una valoración de 9.2, Spin Samba es uno de los casinos mejor valorados en el mercado. Además, ofrecen un generoso bono de bienvenida del 100% hasta 30€, junto con 400 tiradas gratis para usar en sus juegos. ¡No te pierdas la oportunidad de disfrutar de la experiencia de Spin Samba!\n"),


            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }

        else   if(data.equals("Others"))
        {
            CountryModel[] models = new CountryModel[]{
                    new CountryModel(R.drawable.canda_888,R.drawable.canada_icon_888,"888","9.1-9.9","888 is a well-established online casino that has been in business since 1997. The casino offers a large selection of games from top software providers, as well as a variety of bonuses and promotions. The welcome bonus at 888 includes a 200% bonus up to a certain amount and 200 free spins, which is a great offer for new players. The casino has a solid reputation in the industry and has won numerous awards for its services.\n"),
                    new CountryModel(R.drawable.bet9jabanner,R.drawable.bet9jaicon,"Bet9ja","9.4","Bet9ja Casino supports multiple payment methods, including bank transfers, debit/credit cards, and e-wallets, making it convenient for players to deposit and withdraw funds. The casino also has a responsive customer support team available 24/7 to assist players with any issues they may encounter. The casino also offers bonuses and promotions to its users, including a welcome bonus for new players, daily bonuses, and free spins. They also have a loyalty program for regular players, which rewards them with exclusive bonuses and perks.\n"),
                    new CountryModel(R.drawable.betonlinebanner,R.drawable.betonlineicon,"Bet Online","9.9","Bet Online is a well-established online casino that has been in business for over 20 years. The casino offers a large selection of games from top software providers, as well as a variety of bonuses and promotions. The welcome bonus at Bet Online includes a 150% bonus up to a certain amount and 250 free spins, which is a great offer for new players. The casino has a solid reputation in the industry and is known for its reliable and secure services.\n"),
                    new CountryModel(R.drawable.canada_eurpoaner,R.drawable.canada_icon_erupoicon,"Europa Casino","9.1-9.9","Europa Casino is a popular online casino that offers a variety of games, including slots, table games, and live dealer games. The casino is known for its excellent customer service and its generous bonuses and promotions. The welcome bonus at Europa Casino includes a 150% bonus up to a certain amount and 120 free spins, which is a great offer for new players. The casino has a solid reputation in the industry and is known for its reliable and secure services.\n"),
                    new CountryModel(R.drawable.leovegasbanner,R.drawable.brazil_icon_leovegas,"Leo Vegas","9.1-9.9","Leo Vegas is a popular online casino that offers a wide range of games, including slots, table games, and live dealer games. The casino is known for its excellent mobile platform and its generous bonuses and promotions. The welcome bonus at Leo Vegas includes a 100% bonus up to a certain amount and 300 free spins, which is a great offer for new players. The casino has a solid reputation in the industry and has won several awards for its services.\n"),
                    new CountryModel(R.drawable.australia_playmo,R.drawable.playamoicon,"PlayAmo","9.3","\"PlayAmo is a great choice for those who are looking for a high-quality gaming experience with a wide range of games. The casino offers popular slots, table games, and live dealer games from top providers like NetEnt, Microgaming, and Evolution Gaming. The website is well-designed and easy to navigate, with a user-friendly interface that makes it easy to find the games you want to play.\n" +
                            "\n" +
                            "In terms of bonuses, PlayAmo offers a generous welcome package that includes a 200% match bonus and 400 free spins. The free spins can be used on popular slots like The Dog House, Elvis Frog in Vegas, and Platinum Lightning. The wagering requirements for the welcome bonus are reasonable, with a 40x playthrough requirement before you can withdraw any winnings.\"\n"),
                    new CountryModel(R.drawable.vulkanbanner,R.drawable.germany_icon_vulkan,"Vulkan Vegas","9.1","Vulkan Vegas is a popular online casino that offers a wide variety of games, including slots, table games, and live dealer games. The casino is known for its excellent mobile platform and its generous bonuses and promotions. The welcome bonus at Vulkan Vegas includes a 100% bonus up to a certain amount and 400 free spins, which is a great offer for new players. The casino has a solid reputation in the industry and is known for its reliable and secure services.\n"),


            };

            horizontalListAdapteradapter =  new HorizontalListAdapter(getContext(),models);
            verticalListAdapter = new VerticalListAdapter(getContext(),models);

        }



        binding.horizontalRecyclerView.setAdapter(horizontalListAdapteradapter);
        horizontalListAdapteradapter.notifyDataSetChanged();

        binding.verticalRecyclerView.setAdapter(verticalListAdapter);
        verticalListAdapter.notifyDataSetChanged();






        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        binding = null;
    }
}