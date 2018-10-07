package carenbb.com.hackathon.emotion.joton;

/**
 * Created by HP on 28-Mar-16.
 */
public class DataImergencyInfo {

    private String info;
    private String descriptionMain;
    private String description2name;
    private String description2;
    private String description3name;
    private String description3;
    private int imageResourceId;

    public static final DataImergencyInfo[] infos = {
            new DataImergencyInfo("গ্রামীন স্বাস্থ্য সেবার তথ্যাবলি",
                    " সরকার যখন অব্যাহতভাবে জনগণের স্বাস্থ্যসেবা নিশ্চিত করার অঙ্গীকার ব্যক্ত করে চলেছে তখন চিকিৎসক সংকটের কারণে মারাত্মকভাবে ব্যাহত হচ্ছে সরকারী স্বাস্থ্যকেন্দ্র ও হাসপাতালসমূহে জনগণের চিকিৎসা কার্যক্রম। সরকারী হাসপাতালে প্রয়োজনীয় সংখ্যক চিকিৎসক নাই। চিকিৎসকেরা উপজেলা পর্যায়ে থাকতে চায় না। এই সংকটের প্রভাব জনস্বাস্থ্যের সর্বক্ষেত্রে বিরাজমান। এর বিরূপ দিক পরিলক্ষিত হয় গ্রামগঞ্জের মা ও শিশু স্বাস্থ্যের ক্ষেত্রে।",
                    "গ্রামীণ চিকিৎসা ও চিকিৎসকঃ",
                    "গ্রামের দাইয়েরা একমাত্র ব্যক্তি যারা গর্ভ থেকে শুরু করে প্রসব হওয়া পর্যন্ত মায়েদের দেখাশোনা করেন। গ্রামে গরীব, অসহায় গর্ভবতী নারীদের পাশে দাঁড়ায় এই দাইমারা। কোন কিছুর বিনিময়ে তারা এই কাজ করেন না।\n" +
                            "গর্ভবতী না হলেও মায়েদের ঘরে ঘরে যান দাইমায়েরা। তারা ট্রাডিশনাল বার্থ এটেন্ডেন্ট (ঞইঅ) নয়। তারা হাসপাতালের সাথেও জড়িত নয় কিন্তু তারা গর্ভবতী নারীদের খোঁজ-খবর করেন। অনেক এলাকায় সপ্তাহে একদিন তারা উঠান বৈঠকও করেন। সেখানে তারা মা এবং গর্ভবতী নারীদের ডাকেন, তাদের সাথে কথা বলেন। স্বাস্থ্য এবং পুষ্টি বিষয়ে আলোচনা করেন।\n" +
                            "দাইমারা শুধু গর্ভবতী নারীদেরকেই পরামর্শ দেন তা নয়। স্বাভাবিক জন্মদান, প্রসব পরবর্তী সেবা ও নবজাতক শিশুরও পরামর্শ দিয়ে থাকেন। জন্মদানে কোন জটিলতা বা ঝুঁকিপূর্ণ সমস্যা দেখলেই দাইমারা রোগীকে জেলা সদর হাসপাতালে নেওয়ার জন্য পরিবারকে পরামর্শ দেন, নিজে সাথে থেকে রোগীকে হাসপাতালেও নেন। গ্রামের গরীব মায়েদের বেসরকারী ক্লিনিকে স্বাস্থ্য সেবা নেওয়া ব্যয়বহুল এবং তাদের পক্ষে এত টাকা করচ করা সম্ভব হয় না। গর্ভকালিন জটিলতা বা ঝুঁকিপূর্ণ নারীকে দাইমারা সাধারণত সরকারী সদর হাসপাতালে (সরকারী স্বাস্থ্য সেবা কেন্দ্র) নেয়। তবে সেখানেও সব সময় ডাক্তার পাওয়া যায় না।\n" +
                            "সাধারণত ইউনিয়ন পর্যায়ে হাসপাতাল খোলে সকাল ৯টায়। বেলা সার ১২টার পরে হাসপাতাল বন্ধ হয়ে যায়। গ্রামের মানুষ তাই ইউনিয়ন হাসপাতালকে বলে সারে ১২টার হাসপাতাল। এখানে সাধারণ জ্বর, ঠান্ডার ইত্যাদি ওষুধ পাওয়া যায়। গর্ভবতী নারীর স্বাস্থ্য পরীক্ষা বা গর্ভবতী নারীদের জটিল কোন সমস্যার সেবা এখানে নাই। গর্ভবতী নারী, প্রসবোত্তর মা বা নবজাতক শিশুর জটির কোন অসুবিধা হলে দাইমায়েরা উপজেলা বা জেলা সদর হাসপাতালে যাওয়ার পরামর্শ দেয়।\n" +
                            "সব উপজেলা হাসপাতালে আবার গর্ভবতী নারীদের প্রসবকালীন জটিলতা মোকাবেলা করার ব্যবস্থা নাই। অপ্রতুল চিকিৎসক, এনেসথেশিয়া জন্য চিকিৎসক নাই ফলে দূরদুরান্ত থেকে রোগীরা এসে চিকিৎসা পায় না। বাধ্য হয়ে যেতে হয় বেসরকারী ক্লিনিকগুলোতে। আর এখানে সেবা নিতে যাওয়া মানেই প্রচুর টাকার যোগান দেওয়া। গরীব অসহায় পরিবারগুলোকে তখন বাধ্য হয়ে বিক্রি করতে হয় বাড়ির আসবাসপত্র অথবা গরু, ছাগর, হাঁস-মুরগি। অনেকক্ষেত্রে চড়া সুদে টাকা তুলে চিকিৎসা করতে হয়। আর সুদের টাকা পরিশোধ করতে হয় সর্বস্বান্ত।\n" +
                            "জেলা পর্যায়ে মা ও শিশু কল্যাণ কেন্দ্র রয়েছে। সেখানে গর্ভবতী নারীর স্বাস্থ্য পরীক্ষা, সাধারণ সন্তান প্রসব এবং গর্ভবতী নারীদের জটিল কোন সমস্যা দেখা দিলে তারও সেবা পাওয়া যায়। কিন্তু মা ও শিশু কল্যাণ কেন্দ্র সকাল ৯টা থেকে দুপুর আড়াইটা পর্যন্ত চিকিৎসা সেবা দেওয়া হয়। এই সময়ের পরে অসহায় নারী বা শিশুদের চিকিৎসা সেবা পাওয়া কঠিন হয়ে পরে।\n" +
                            "গ্রামে কিছু কিছু পরিবারের লোকজন প্রাইভেট ক্লিনিকের দালাল হিসাবে কাজ করে এবং ক্লিনিকেই যাতে সন্তান জন্মগ্রহণ করে সেই জন্য গর্ভবতী মাকে উদ্বুদ্ধ করে। তারাই আবার প্রাথমিক অবস্থায় গর্ভবতী মায়ের পরামর্শের জন্য দাইমাদের সাথে যোগাযোগ রাখেন। এসব ক্ষেত্রে গর্ভবতী মায়ের সব কিছু স্বাভাবিক থাকলেও পরিবারের কাছে তখন দাইমার কথার কোন গ্রহণযোগ্যতা থাকে না বা দাম থাকে না।\n" +
                            "গর্ভবতী মায়ের প্রসবকালীন কোন অসুবিধা থাকলে কোথায় নিতে হবে তা আগে থেকে দাইয়েরা জানেন। প্রসবপূর্ব সেবার যে নিয়ম আছে সেখানে কি কি দেখতে হয় তা দাইয়েরা জানেন। ফলে দাইমা বিপদজনক গর্ভবতী মাকে চিহ্নিত করতে পারেন। গর্ভবতী মায়ের একলামশিয়া হতে পারে, অতিরিক্ত রক্তক্ষরণ হতে পারে। বিপদজনক চিহ্নগুলি চিনতে পারে বলেই দাইয়েরা সরকারী হাসপাতালে রেফার করতে পারে। গর্ভাবস্থায় মায়ের বিপদজনক চিহ্নগুলি সহজেই দাইয়েরা শিখতে পারে।\n",
                    "দাইমায়ের কথা তুলে ধরা হলো-",
                    "রাবেয়া বেগম, দাইমা, নাল্লা পাড়া, টাংগাইল।\n" +
                            "দাই এর কাজ করতে করতে যে অভিজ্ঞতা হয়েছে তাতে একজন গর্ভবতী মায়ের কবে সন্তান প্রসব হবে তা বুঝতে পারি। গর্ভাকালে মায়েদের বেশী বেশী শাক-সবজি খাওয়ার পরামর্শ দেই। সব সময় আমরা গর্ভবতী মাকে দেখাশুনা করি কিন্তু আমাদের কাজের দাম নাই। আমরা আমাদের কাজের দাম চাই। সরকারী স্বাস্থ্য সেবা কেন্দ্রে গর্ভবতী মাকে নিয়ে গেলে যেন আমাদের একটু দাম দেয়।\n" +
                            "সফুরা বেগম, পারাসিধাই, ঈশ্বরদী, পাবনা।\n" +
                            "গর্ভবতী মায়ের প্রসবকালীন কোন সমস্যা দেখলে প্রথমেই সদর হাসপাতালে নেওয়া হয়। সদর হাসপাতাল ভাল কিন্তু আমাদের (দাইমাদের) মূল্য দেয় না। নার্সরা আমাদের মুখ (বকাবকি) করে। যে গর্ভবতী মাকে নিয়ে যাই তার কাছে থাকতে দিতে চায় না।\n" +
                            "সীমা দাস সীমু, উবিনীগ\n "),
            new DataImergencyInfo("গর্ভবতী মায়ের জ্বর মাপার উপায়",
                    "কিভাবে থার্মোমিটার ব্যাবহার করে তাপমাত্রা মাপা হয়ঃ\n" +
                            "\n" +
                            "\n" +
                            "প্রথমে থার্মোমিটারটিকে ভাল সাবান, ঠাণ্ডা পানি অথবা অ্যালকোহল দিয়ে ধুয়ে নিতে হবে। ধাতব অংশের বিপরীত অংশে থার্মোমিটারটিকে ধরে ঝাঁকাতে হবে যতক্ষণ পর্যন্ত পারদের মাত্রা ৩৬ ডিগ্রি এর কমে না আসে ।\n" +
                            "এবার থার্মোমিটারটিকে গর্ভবতীর জিহ্বার নিচে রাখতে হবে তার পর তাকে মুখ বন্ধ করে ফেলতে হবে।\n" +
                            "অথবা রোগী যদি কামড় দিয়ে ভেঙ্গে ফেলার সম্ভবনা থাকে তাহলে বগলের নিচে রাখতে হবে।\n" +
                            "৩ থেকে ৪ মিনিট পর থার্মোমিটারটা বের করে নাও ও তাপমাত্রা দেখতে হবে।\n" +
                            "সব শেষে হাত ভাল করে ধুয়ে ফেলতে হবে।\n",
                   null,
                    null,
                   null,
                    null),
            new DataImergencyInfo("গর্ভবতী মায়ের জ্বর কমানোর উপায়",
                    "কিভাবে জ্বর কমাতে হয়ঃ\n" +
                            "\n" +
                            "\n" +
                            " জ্বরে আক্রান্ত গর্ভবতী  জ্বর কমলে সুস্থ বোধ করেন ।কিন্তু জ্বরের কোন কারন থাকলে (ম্যালেরিয়া) এই চিকিৎসায় তেমন উপকার পাওয়া যাবে না।\n" +
                            "পেরাসিটামল বি পি (৫০০ থেকে ১০০০ মি গ্রা) ৪ থেকে ৬ ঘণ্টা পর পর নিলে জ্বর কমে আসে ।(বি দ্রঃ দিনে ৪০০০ মি গ্রা এর বেশি দেওয়া যাবে না )\n" +
                            "আইসোপ্রোপেন প্রেগনেন্সির শেষ ৩ মাস নিরাপদ নয় ।\n" +
                            "হালকা গোসল শীতল পানি শীতল কাপড় (ঠাণ্ডা নয়) জ্বর কমাতে সাহায্য করে \n" +
                            "প্রতি ঘন্টায় পানি শুন্যতা রোধকারী পানীয় ১ কাপ করে পান করা ভাল । যদি পান করা সম্ভব না হয় তাহলে স্যালাইন বা রেক্টাল ফ্লুয়িড দেওয়া যেতে পারে।\n",
                    null,
                    null,
                    null,
                    null),
            new DataImergencyInfo("নবজাতকের শরীর মোছা ও মোড়ানোর উপায়",
                    "নবজাতককের শরীর মোছার উপায়ঃ\n" +
                            "\n" +
                            "* পরিষ্কার এক টুকরা বড় কাপড়ের ওপর শিশুকে নিন।\n" +
                            "* কাপড় দিয়ে নবজাতকের সারা শরীর জড়িয়ে ফেলুন।\n" +
                            "* কাপড় দিয়ে নবজাতকের মাথা ভালোভাবে মুছুন।\n" +
                            "* এরপর নবজাতকের গলা, ঘাড় ও কাঁধ ভালোভাবে মুছুন।\n" +
                            "* এভাবে বুক, পেট ও হাত ভালোভাবে মুছুন।\n" +
                            "* এরপর নবজাতকের পিঠ ভালোভাবে মুছুন।\n" +
                            "* নবজাতকের কোমর থেকে পায়ের তালু পর্যন্ত ভালোভাবে মুছুন।\n" +
                            "* একই নিয়মে মাথা থেকে পা পর্যন্ত আরো কয়েকবার মুছুন।\n" ,
                            null,
                    null,
                    null,
                    null),
            new DataImergencyInfo("কিভাবে গর্ভবতী মায়ের রক্তপাত বন্ধে চিকিৎসা দিতে হবে",
                    " রক্তপাত বন্ধে যে রোগির অবস্থা বিবেচনা করে নিচের যেকোনো একটি ঔষধ ব্যাবহার করতে হবে।",
                    "অক্সিটোসিনঃ",
                    "ইঞ্জেকশন এর মাধ্যমে ১০ ইউনিট অক্সিটোসিন শক্ত পেশির  ভিতরে প্রবেশ করাতে হবে । যদি ২০ মিনিটের মধ্যে রক্তপাত বন্ধ না হয় তাহলে আপনি ২য় বার একই ভাবে দিতে হবে । ",
                    "মিসোপ্রোস্টল ও এঞ্জোমেট্রিনঃ",
                    "৪০০ গ্রাম মিসোপ্রোস্টল মুখে প্রবেশ করাতে হবে । যদি গর্ভবতী বিতৃষ্ণা অনুভব করেন তাহলে ট্যাবলেট এর মাধ্যমে পায়ু পথে দেয়া যেতে পারে ।\n" +
                            "\n" +
                            " (যখন অমরা বের হয়ে আসবে তখন দেওয়া যাবে )\n" +
                            "ইঞ্জেকশন এর মাধ্যমে .২০ মিগ্রাঃ এঞ্জোমেট্রিন শক্ত পেশির পাশ দিয়ে প্রবেশ করাতে ।অথবা .২ মিগ্রা এর এঞ্জোমেট্রিন পিল মুখে প্রবেশ করাতে । আপনি প্রতি ২ থেকে ৪ ঘন্টা পর পর এঞ্জোমেট্রিন নিতে পারেন।\n" +
                            "বিদ্রঃ অতিরিক্ত রক্তচাপের গর্ভবতীকে এঞ্জোমেট্রিন দেওয়া যাবে না ।\n "),

            new DataImergencyInfo("কিভাবে মাকে রেক্টাল ফ্লুয়িড দেওয়া হয়",
                    "সাধরনত গরভাবস্তায় মা যখন খুব দুর্বল হয়ে পড়ে তখন রেক্টাল ফ্লুয়িড দেওয়া হয় । নিয়ম নিচে বর্ণনা করা হয়েছে ",
                    "প্রয়োজনীয় জিনিসঃ",
                    "         ১। একটি পরিষ্কার টিউব সংযুক্ত ব্যাগ ।\n" +
                            "         ২। গর্ভবতীর নিচে দেওয়ার জন্য এক টুকরা পরিষ্কার কাপড় ।\n" +
                            "         ৩।৬০০ মিলি (১/২ লিটারের সামান্য বেশি  ) উষ্ণ খাওয়ার পানি এবং লবণ চিনি ও পানি স্বল্পতা রোধকারী পানীয় ।\n ",
                    "যা করনীয়ঃ",
                    "       ১। গর্ভবতী মাকে বলতে হবে কিভাবে কাজটা করা হবে। হাত ধুয়ে ফেলতে হবে।\n" +
                            "      ২। গর্ভবতীকে বাম পাশ করে শুয়ে দিয়ে মাথার নিচে ১ টুকরা কাপড় দিতে হবে।\n" +
                            "      ৩। ফ্লুয়িড এর ব্যাগ টা একটু টিপে টিউবে একটু ফ্লুয়িড নিয়ে আসতে হবে যাতে ভিতরে বায়ু না থাকে ।\n" +
                            "      ৪। টিউবের শেষ অংশ বায়ু বা ভেসিলিন দিয়ে শুকিয়ে নিতে হবে । গর্ভবতীকে গভীর শ্বাসপ্রশ্বাস নিয়ে স্থির করতে হবে টিউবটা পায়ু পথে প্রবেস করাতে হবে, ১০ সেন্টিমিটার বা ৪ ইঞ্চির বেশি কখনো নয়। \n"),

            new DataImergencyInfo("কিভাবে সন্তান প্রসবের সময় মায়ের জরায়ু ঘষতে হয়",
                    "কিভাবে জরায়ু ঘষতে হয়ঃ\n" +
                            "                                   সন্তান প্রসবের পূর্ব মুহূর্তে জরায়ুর উপরিভাগে হাতটা চেপে ধরে রাখতে, একই হাত বৃত্তাকারে ঘুরাতে হবে । যতক্ষণ জরায়ু শক্ত বলের মত অনুভব না হয় ততোক্ষণ ঘষতে হবে ।\n" +
                            "জরায়ু সাধারণত পেটের টিক মাঝখানে অবস্থান করে । যদি জরায়ু মাঝখানে না থাকে তাহলে বুঝতে হবে গর্ভবতীর পেটে মূত্র আছে ।\n" +
                            "১ থেকে ২ মিনিট পর জরায়ু চেক কর যদি আবার নরম অনুভব হয় তাহলে পূর্বের ন্যায় ঘোষতে । যদিও ঘর্ষণ গর্ভবতী মায়ের জন্য খুব কস্টদায়ক  ।\n",
                    null,
                    null,
                    null,
                    null),
            new DataImergencyInfo("গর্ভকালীন সময়ে যেসব ওষুধ সেবনে সাবধাণ থাকবেন",
                    "একজন নারী যখন গর্ভবতী হন, তখন তাঁর দেহমনে বিরাট একটা পরিবর্তন সূচিত হয়। কারণ, তাঁর ভেতরে বেড়ে উঠছে অনাগত একটি জীবন। তাই গর্ভবতী নারীকে সব সময় সতর্ক থাকতে হয়। কারণ, সামান্য অসতর্কতার ফলে তাঁর কিংবা শিশুটির অনেক বড় ক্ষতি হয়ে যেতে পারে। গর্ভাবস্থায় সবচেয়ে বেশি সতর্ক থাকা উচিত ওষুধ সেবনে। বিশেষ করে প্রথম তিন মাসে কোনো ওষুধই পারতপক্ষে খাওয়া উচিত নয়। এমনকি ভিটামি,ন বা আয়রনও নয়। নিচে আমরা কিছু ওষুধের তালিকা তুলে দিলাম, যা গর্ভাবস্থায় কোনো পর্যায়েই খাওয়া উচিত নয়।",
                    "অ্যাসপিরিন (ব্যথানাশক): ",
                    "এটি খেলে শিশুর (ডিএফএন, ইকোস্পিরিন) শারীরিক গঠনে অসুবিধা হতে পারে। এটি কার্ভা ইত্যাদি নামে বাজারে পওয়া যায়।এন্ডোমিথাসিন: আইমেট, ইন্ডোমেট ইত্যাদি নামে পাওয়া যায়। (বাতের জন্য) শিশুর শারীরিক গঠনে অসুবিধা হতে পারে।ক্লোরোকুইন (ম্যালেরিয়ার ওষুধ):গর্ভাবস্থায় প্রথম দিকে ব্যবহারে শিশু বধির ও বোবা হতে পারে। ",
                    "অন্যান্যঃ",
                    "ক্লোরামফেনিকল (টাইফয়েডের ওষুধ):শিশুর মৃত্যু ঘটায়।\n" +
                            "\n" +
                            "সালফোনামাইড (ডায়াবেটিসের ওষুধ): এটি খেলে শিশুর জন্ডিস হতে পারে। তাই গর্ভাবস্থায় মায়ের ডায়াবেটিস \n" +
                            "থাকলে ইনসুলিন ব্যবহার করা শ্রেয়।\n" +
                            "\n" +
                            "টেট্রাসাইক্লিন: এটি শিশুর হাড় ও দাঁতের গঠনে ক্ষতি করে।\n" +
                            "\n" +
                            "কর্টিসোন/প্রেডনিসোলন (স্টেরয়েড-জাতীয় ওষুধ): মৃত শিশু জন্ম নেবে।\n" +
                            "\n" +
                            "ইস্ট্রোজেন/স্টিলবেস্টরন (হরমোন-জাতীয় ওষুধ): মেয়েশিশু\n" +
                            "হলে ভবিষ্যতে যৌনাঙ্গে ক্যানসার হতে পারে।\n" +
                            "\n" +
                            "জন্মনিয়ন্ত্রণ বড়ি (ওরাল কন্ট্রাসেপটিভ পিল): ভ্রূণের গঠন বিকৃতি করবে।\n" +
                            "\n" +
                            "ভিটামিন-এ: বেশি মাত্রায় ব্যবহারে শিশুর জন্মগত ত্রুটি দেখা দিতে পারে।\n" +
                            "\n" +
                            "কৃমিনাশক: (যেমন—অ্যালবেন, অ্যালমক্স, আরমক্স ইত্যাদি) গর্ভপাত ঘটানোর আশঙ্কা থাকে।\n" +
                            "\n" +
                            "মেট্রনিডাজল: (যেমন—ফ্লাজিল, ফিলমেট, অ্যামোডিস ইত্যাদি) আমাশয়ের ওষুধ, গর্ভাবস্থায় প্রথম তিন মাস ব্যবহারে শিশুর গঠনে বিকৃতি দেখা দিতে পারে।\n" +
                            "\n" +
                            "ডায়াজিপাম: (যেমন—সেডিল, রিলাক্সেন ইত্যাদি) ঘুমের ওষুধ, এটি খেলে শিশুর মাংসপেশির দৃঢ়তা থাকবে না। মায়ের স্তন চুষতে পারবে না।\n" +
                            "প্রত্যেক গর্ভবতী মা ওষুধের ব্যাপারে সতর্ক থাকবেন; যা আপনার ভবিষ্যৎ সন্তানের মঙ্গল আনবে।\n "),

            new DataImergencyInfo("গর্ভবতী মায়ের খাবার স্যালাইন তৈরির পদ্ধতি",
                    "সাধরনত ২ ভাবে খাবার স্যালাইন তৈরি করা যায় \n" +
                            "গর্ভবতী মায়ের চাপের ও জ্বরের সময় খাবার স্যালাইন দেওয়া খুব প্রয়োজন ।\n",
                    "প্রথম পদ্মতিঃ",
                    "প্রয়োজনীয় উপকরণ (গুডু শস্যদানা ও লবণ)\n" +
                            "চালের গুড়া সবচেয়ে ভাল কিন্তু গম ,শাল্গম,রান্না করা আলু ও ব্যাবহার করা যেতে পারে \n" +
                            "এ লিটার বিশুদ্দ      পানিতে আধা চা চামচ লবণ নিতে হবে পরে ৮ চা চামচ শস্য গুডা নিয়ে ৫ থকে ৭ মিনিট পর ভাল ভাবে মিশিয়ে গর্ভবতীকে খাওয়াতে হবে ।  \n ",
                    "২য় পদ্মতিঃ",
                    "প্রয়োজনীয় উপকরণ (চিনি ও লবণ)\n" +
                            "এ লিটার বিশুদ্দ      পানিতে আধা চা চামচ লবণ নিতে হবে পরে ৮ চা চামচ  চিনি  নিয়ে ভাল ভাবে মিশিয়ে গর্ভবতীকে খাওয়াতে হবে ।  \n"),

            new DataImergencyInfo("গর্ভবতী মায়ের ব্লাডার ও কিডনি সংক্রামণের প্রতিকার ",
                    "যদি গর্ভবতীর ব্লাডারে ইনফেকশন ঘটে থাকে প্রতি ১ ঘন্টা অন্তর ১ গ্লাস করে তরল পান করতে হবে এটি তার শরীরের আক্রান্ত স্থানকে পরিষ্কার করতে সাহায্য করবে । ফলের রস ও চা ও অনেক উপকার করে ।যদি গর্ভবতী দ্রুত সুস্থ হয়ে না যান এবং কিডনি আক্রান্ত হওয়ার কোন লক্ষণ প্রকাশ পায় তাহলে দ্রুত এন্টিবায়োটিক দিতে হবে ।",
                    "এন্টিবায়োটিকঃ",
                    "৫০০ মিগ্রা অ্যামক্সিসিলিন দিনে ৩ বার করে ৭ দিন দিতে হবে । যদি গর্ভবতীর অ্যামক্সিসিলিন বা পেনিসিলিন এ অ্যালার্জি থাকে তাহলে ৯৬০ মিগ্রা কট্রিমক্সাযল দিনে ৩ বার ৭ দিন দিতে হবে।(প্রেগ্নেন্সির শেষ ৩ মাস কট্রিমক্সাযল দেওয়া যাবে না) ",
                    "প্রতিরোধঃ",
                    "প্রতিবার মল মুত্র ত্যাগের পর বর্জ্য দূরে কোথাও ফেলা যাতে সংক্রামণ না হয় ।\n" +
                            "হাত ধোয়া ও পরিষ্কার পরিচ্ছন্ন ভাবে চলা।\n"),

            new DataImergencyInfo("গর্ভবতী মায়ের মুত্রে প্রোটিন পরিমাপ করার পদ্ধতি",
                    "কিভাবে মুত্রে প্রোটিন এর পরিমাণ দেখবেনঃ\n" +
                            "মুত্রে প্রোটিন প্রি-অ্যাক্লামসিয়ার একটা লক্ষণ ।\n",
                    "পদ্মতিঃ",
                    "ইউরিস্টিক নামক ছোট প্লাস্টিকের কাটি  মুত্রে প্রোটিন চেক করার জন্য ব্যাবহার করা হয়  নিকটস্থ স্বাস্থ্যকর্মীর কাছে অথবা ফার্মেসীতে ইউরিস্টিক এর বোতল পেতে পারেন ।এই স্টিক বিভিন্ন রঙের হয়ে থাকে (হলুদ থেকে গাড সবুজ পরিবর্তন ঘটে ) । গর্ভবতীর ইউরিনে স্টিকটা ডুবিয়ে পরে বোতলের গায়ে অংকিত কালার চার্ট দিয়ে কালারটি মিলিয়ে নিতে হবে ।\n" +
                            "যদি স্কয়ার গাঢ সবুজ হয়ে যায় তাহলে প্রোটিন আছে । এটি সবচেয়ে সহজ ও সঠিক পদ্মতি ।\n ",
                   null,
                    null),

            new DataImergencyInfo("রক্ত চাপ পরিমাপের উপায়",
                    "বিপদ বলে কয়ে আসে না। হাতের কাছেও সব সময় ডাক্তার পাবেন না। প্রয়োজনীয় কিছু কাজ আপনাকেও  করতে হতে পারে বা করা উচিত , এতে অনেক সময় অনেক বড় বিপদ থেকেও বেঁচে যাওয়া যায়। জীবন রক্ষা করা যায়। অথবা ছোটো খাটো সমস্যা আপনিও সামলাতে পারেন। অনেক কারণেই আপনার বা আপনার পরিবারের যে কারো প্রেশার (রক্তচাপ) বেড়ে বা কমে যেতে পারে। আপনি যদি তাৎক্ষনিক প্রেশারটা মাপতে পারেন তাহলে তার জীবনও রক্ষা হতে পারে। তাছাড়া উচ্চ রক্তচাপ একটি নীরব ঘাতক। নিয়মিত রক্তচাপ পরীক্ষা করে আমরা আগে থেকেই তা শনাক্ত করতে পারি বা উচ্চ রক্তচাপ জনিত জটিলতা থেকে রক্ষা পেতে পারি। আজকে আমরা কী করে প্রেশার মাপতে হয় তা শিখবো। ",
                    "রক্ত চাপ পরিমাপের উপায়ঃ",
                    "রক্তচাপ নির্ণয় করার অপরিহার্য অংশ রক্তচাপমান যন্ত্র বা (বিপি মেশিন)। ইংরেজিতে বলা  হয়  স্ফিগমোম্যানোমিটার (sphygmomanometer)। বেশির ভাগ ওষুধের দোকানেই রক্তচাপ মাপার এ  যন্ত্রটি পাওয়া যায়। রক্তচাপ মাপার জন্য রক্তচাপমান যন্ত্র ছাড়া একটি স্টেথোস্কোপ দরকার হয়। অনেকে ডিজিটাল যন্ত্রও ব্যবহার করেন। তবে ডিজিটাল যন্ত্রের দাম বেশি এবং ঠিকমতো ব্যবহার না করলে রিডিং-এ গড়মিল হতে পারে।\n" +
                            "একজন মানুষের রক্তচাপ প্রতি মুহূর্তেই পরিবর্তিত হয়। শ্বাস-প্রশ্বাস, মানসিক উত্তেজনা, ব্যায়াম,সিগারেট, অ্যালকোহল, উষ্ণতা, খাবার-দাবার এসব নানা কারণে রক্তচাপ ওঠানামা করে। এজন্য কারও রক্তচাপ মাপার আগে তাকে স্বাভাবিক থাকা উচিত।\n" +
                            "রক্তচাপ মাপার জন্য চাপবিহীন অবস্থায়  রক্তচাপ মাপার যন্ত্রের কাফ-এর নিচের প্রান্ত কনুইয়ের সামনের ভাঁজের ২.৫ সেঃ মিঃ উপরে ভালোভাবে আটকাতে হয়। কনুইয়ের সামনে হাত দিয়ে ব্রাকিয়াল ধমনীর অবস্থান স্থির করে তার উপর স্টেথো স্কোপের ডায়াফ্রাম বসানো হয়। ডায়াফ্রাম  এমনভাবে চাপ দেওয়া উচিত যেন ডায়াফ্রাম এবং ত্বকের মাঝখানে কোন ফাঁক না থাকে। চাপ মাপার সময় স্টেথোস্কোপ কাপড় কিংবা কাফের ওপরে রাখা যাবে না। রক্ত চাপমান যন্ত্রের  ঘড়ি হৃদপিণ্ডের একই তলে অবস্থান করতে হবে। এরপর রেডিয়াল ধমনী অনুভব  করা হয় এবং ধীরে ধীরে চাপমান যন্ত্রের চাপ বাড়ানো হয়। রেডিয়াল পালস বন্ধ হওয়ার পর চাপ ৩০ মিঃ মিঃ উপরে নেওয়া হয়। তারপর আস্তে আস্তে চাপ কমানো হয়। প্রতি বিটে সাধারণত ২ মিঃ মিঃ চাপ কমানো হয়। তাড়াতাড়ি চাপ কমালে ভুল হওয়ার  সম্ভাবনা থাকে। এবার চাপ কমানোর সময় স্টেথোস্কোপ দিয়ে ব্রাকিয়াল ধমনীতে সৃষ্ট শব্দ মনোযোগের সঙ্গে শোনা হয়। চাপ কমতে শুরু করলে রক্ত চলাচলের ফলে এক ধরনের শব্দ সৃষ্টি হয়। একে করটকফ শব্দ (Korotkoff sound) বলা হয়। করটকফ শব্দ  ধাপে ধাপে পরিবর্তন হয়। এই শব্দের ধরন অনুসারে পাঁচটি পর্যায় রয়েছেঃ\n" +
                            "পর্যায়-১  প্রথমে এক ধরনের  তীক্ষ্ণ শব্দের সৃষ্টি হয়। এটা  সিস্টোলিক রক্তচাপ নির্দেশ করে।\n" +
                            "পর্যায়-২ উঁচু ঝির ঝির (Swishing) শব্দ।\n" +
                            "পর্যায়-৩ নিচু পরিষ্কার শব্দের সঙ্গে সামান্য ঝির ঝির শব্দ।\n" +
                            "পর্যায়-৪ এ পর্যায়ে শব্দের তীক্ষ্ণতা কমে আসে (Muffling) ।\n" +
                            "পর্যায় -৫ এ সময়ে করটকফ শব্দ থেমে যায়।\n" +
                            "করটকফ  শব্দের প্রথম পর্যায়ে যে শব্দ শোনা যায় সেটাই সিস্টোলিক রক্তচাপ। সিস্টোলিক রক্তচাপ সম্পর্কে একমত হলেও ডায়াস্টোলিক রক্তচাপের ব্যাপারে মতভেদ রয়েছে। কেউ বলেন চতুর্থ ধাপে যেখানে শব্দের তীক্ষ্ণতা কমে যায় (Muffling) সেটাই ডায়াস্টোলিক রক্তচাপ। আবার অনেকের মতে পর্যায়-৫ অর্থাৎ যে চাপে শব্দ বন্ধ হয়ে যায় সেটাই ডায়াস্টোলিক রক্তচাপ। তবে আজকাল অধিকাংশ বিশেষজ্ঞ শেষের পরিমাপটিকে ডায়াস্টোলিক রক্তচাপ হিসেবে গ্রহণ করে থাকেন। এক কথায় শব্দ যখন শুরু হবে সেটা সিস্টোলিক এবং শব্দ যখন শেষ হবে সেটা ডায়াস্টোলিক।\n" +
                            "রক্তচাপের পর্যায় –  সিস্টোলিক রক্তচাপ /ডায়াস্টোলিক রক্তচাপ\n" +
                            "(মিঃ মিঃ পারদচাপ)\n",
                    "রক্তচাপের প্রকারভেদ:-",
                    "স্বাভাবিক < ১২০ এবং  < ৮০ (মিঃ মিঃ পারদচাপ)\n" +
                            "প্রাক-উচ্চ রক্তচাপ ১২০-১৩৯ অথবা ৮০-৮৯ (মিঃ মিঃ পারদচাপ)\n" +
                            "উচ্চ রক্তচাপ (পর্যায়-১) ১৪০-১৫৯ অথবা ৯০-৯৯ (মিঃ মিঃ পারদচাপ)\n" +
                            "উচ্চ রক্তচাপ (পর্যায়-২ )> ১৬০ অথবা  > ১০০(মিঃ মিঃ পারদচাপ)\n" +
                            "সিস্টোলিক এবং ডায়াস্টোলিক রক্তচাপের পর্যায় ভিন্ন হলে সর্বোচ্চ পর্যায়কেই গণনায় নিতে হবে। যেমন কারও রক্তচাপ ১৭০ / ৯৫ মিঃ মিঃ পারদ চাপ হলে তাকে পর্যায় – ২ হিসেবে গণনা করতে হবে এবং সেই মোতাবেক চিকিৎসা দিতে হবে। রক্তচাপ যাই হোক না কেন,  হৃদপিন্ডের অবস্থা কিংবা অন্যান্য  টার্গেট অর্গানের পরিস্থিতি বুঝে নির্ধারিত সময়ের আগেও চিকিৎসা শুরু করতে হতে পারে। বয়স ভেদেও রক্ত চাপের ভিন্নতা রয়েছে।\n" +
                            "ধন্যবাদ। এখন আপনি নিজেই বাসায় রক্তচাপ মাপুন।\n ")
    };

    private DataImergencyInfo(String info,String descriptionMain,String description2name,String description2,String description3name,String description3)
    {
        this.info=info;
        this.descriptionMain=descriptionMain;
        this.description2name=description2name;
        this.description2=description2;
        this.description3name=description3name;
        this.description3=description3;
    }
    public String getInfo() {
        return info;
    }

    public String getMainDescription(){
        return descriptionMain;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public boolean description2available()
    {
        if (description2name== null)
        {
            return false;
        }
        return true;
    }
    public String getDescription2name(){
        return description2name;
    }
    public String getDescription2(){
        return description2;
    }
    public boolean description3available()
    {
        if (description3name== null)
        {
            return false;
        }
        return true;
    }
    public String getDescription3name(){
        return description3name;
    }
    public String getDescription3(){
        return description3;
    }
    public String toString() {
        return this.info;
    }

}