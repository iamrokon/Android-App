package carenbb.com.hackathon.emotion.joton;

/**
 * Created by HP on 28-Mar-16.
 */
public class DataChildCareInfo {

    private String info;
    private String descriptionMain;
    private String description2name;
    private String description2;
    private String description3name;
    private String description3;
    private int imageResourceId;

    public static final DataChildCareInfo[] infos = {
            new DataChildCareInfo("জন্মের সময় সাধারন কিছু সমস্যা এবং প্রাথমিক সমাধান",
                    "যে সব সমস্যা হতে পারে\n" +
                            "* জন্মের পরপর শ্বাস না নেওয়া\n" +
                            "* জন্মের পর না কাঁদা\n" +
                            "* খিঁচুনি হওয়া\n" +
                            "* অজ্ঞান হয়ে যাওয়া\n" +
                            "* শ্বাস নিতে বা ছাড়তে কষ্ট হওয়া\n" +
                            "* শরীরের তাপ বেড়ে যাওয়া\n" +
                            "* শরীর ঠাণ্ডা হয়ে যাওয়া\n" +
                            "* শরীর হলুদ রঙের হয়ে যাওয়া\n" +
                            "* নাভি লাল, নাভিতে দুর্গন্ধ বা পুঁজ থাকা\n" +
                            "* চামড়ায় ঘা, ফোসকা বা পুঁজসহ বড় দানা-লাল ও ফোলা থাকলে\n" +
                            "* অনবরত বমি\n" +
                            "* নেতিয়ে পড়লে বা স্বাভাবিকের চেয়ে কম নড়াচড়া করলে\n" +
                            "* দুর্বল, অনিয়মিত কাঁদা বা কাঁদতে না পারলে।\n",
                    "শ্বাস না নিলে যা করবেনঃ",
                    "* পরিষ্কার নরম কাপড় বা তোয়ালে দিয়ে শিশুর সম্পূর্ণ শরীর আরো ভালো করে মুছুন।\n" +
                            "* নাকে ও মুখে কালচে সবুজ পায়খানা লেগে থাকলে তা আঙুলে কাপড় পেঁচিয়ে পরিষ্কার করুন।\n" +
                            "* শিশুকে কাত করে পিঠে শিরদাঁড়া বরাবর নিচ থেকে ওপর দিকে বারবার হাতের তালুর নিচের অংশ দিয়ে ঘষুন।\n" +
                            "* শিশুর রং এবং শ্বাসের দিকে লক্ষ করুন। যদি ঠোঁট, জিহবা ও মুখের রং গোলাপি হয় এবং নিয়মিত শ্বাস নিতে থাকে, তাহলে শিশুকে মায়ের বুকের দুধ দিতে হবে।\n ",
                    "শিশু জন্মের পর নিশ্বাস না নিলে যা কখনো করবেন নাঃ ",
                    "* পা ওপরে ধরে উল্টো করে নবজাতককে ঝোলানো\n" +
                            "* থাপড় দেওয়া\n" +
                            "* শরীরে ঠাণ্ডা পানি ছিটানো\n" +
                            "* কানে অথবা নাকে ফুঁ বা বাতাস দেওয়া\n" +
                            "* পানিতে চুবানো\n" +
                            "* বুকের খাঁচায় চাপ দেওয়া\n" +
                            "* বাচ্চাকে পর্যায়ক্রমে গরম ও ঠাণ্ডা পানিতে চুবানো\n" +
                            "* গর্ভফুলকে গরম করা\n" +
                            "* গর্ভফুলের অপেক্ষায় নবজাতককে ফেলে রাখা\n" +
                            "* মুখে ফুঁ দেওয়া\n" +
                            "* কানে ফুঁ দেওয়া\n" +
                            "* মধু ও চিনির পানি খাওয়ানো।\n "),
            new DataChildCareInfo("নবজাতক শিশুর যত্ন",
                    "জন্মের পরপরই বাচ্চার গায়ের লেগে থাকা সাদা মতো অংশগুলো পরিষ্কার করে ফেলতে হবে। তার পায়খানা ও প্রস্রাবের রাস্তা ঠিক আছে কি না, বা চোখের সমস্যা আছে কি না খেয়াল করতে হবে।\n" +
                            "অনেক সময় শিশুর খাদ্যনালী ঠিকমতো তৈরি হয় না। ফলে মুখ থেকে ফেনা বের হয়। তখন শিশুকে দ্রুত ডাক্তারের কাছে নিয়ে যেতে হবে। এ ব্যাপারগুলো সাধারণত ডাক্তাররাই খেয়াল করে থাকেন।\n" +
                            "নবজাতককে কাপড় দিয়ে ভালো করে মুড়িয়ে রাখা উচিত। তবে গরমের সময় হালকা কাপড় পরিয়ে রাখা ভালো। খেয়াল রাখতে হবে ঘাম যাতে না হয়। অনেক সময় ঘামের কারণে বাচ্চার ঠান্ডা লেগে যায়।\n",
                    "বুকের দুধ খাওয়ানোঃ",
                    "বাচ্চাকে সবসময় বুকের দুধ খাওয়াতে হবে। অনেক সময় দেখা যায়, প্রথমদিকে শিশু দুধ পায় না। এ জন্য তিনদিন অপেক্ষা করতে হবে। তবে বারবার টানতে দিতে হবে। আর দুদিক দিয়েই দুধ খেতে দিতে হবে। টানা একদিকে খেতে থাকলে অন্যপাশের বুকটা ভারী হয়ে যাবে।\n" +
                            "কোনো কারণে যদি দুধ একপাশে জমতে থাকে তাহলে সেটা টিপে টিপে বের করে একটা বাটিতে করে নিয়ে ফ্রিজে রেখে দিতে হবে। এরপর বাচ্চাটিকে ছোট চামচ দিয়ে খাওয়াতে হবে।\n" +
                            "ফিডার বা বোতলে দুধ খাওয়ার অভ্যাস একদম করা যাবে না। এই অভ্যাস হলে শিশু আর বুকের দুধ খেতে চাইবে না।\n" +
                            "এভাবে টানা ছয়মাস শিশুকে শুধু বুকের দুধ খাওয়াতে হবে। আর কিছু খাওয়ানো যাবে না। এমনকি পানিও না। ছয়মাস পর থেকে বুকের দুধের পাশাপাশি শিশুকে ধীরে ধীরে অন্যান্য খাবার যেমন-- ভাত, ডাল, সবজি, ডিম, মাংস, মাছ এসব খাওয়ানোর অভ্যাস করতে হবে।\n ",
                    "শারীরিক ও মানসিক বিষয়াদিঃ",
                    "সবসময় খেয়াল করতে হবে বাচ্চার মানসিক পরিবর্তনগুলো ঠিকমতো হচ্ছে কি না। যেমন পাঁচ থেকে ছয়মাস বয়সে বাচ্চা হাঁটার চেষ্টা করে। দেড় দুই বছর বয়সে কথা বলার চেষ্টা করে।\n" +
                            "অনেক বাচ্চা আছে, যারা দেরিতে কথা বলে। তখন ডাক্তারের কাছে যাওয়া উচিত।\n" +
                            "বাচ্চার ওজন ঠিকঠাক আছে কি না সেদিকে খেয়াল রাখতে হবে। জন্মের সময় একটি সুস্থ বাচ্চার যে ওজন থাকে, ছয়মাস পরে তার ওজন হয় দ্বিগুণ। এক থেকে দেড় বছর বয়সে ওজন তিনগুণ বেড়ে যায়।\n" +
                            "এছাড়া শিশুর টিকাগুলো সময়মতো দেওয়া হচ্ছে কি না সেদিকও নজর রাখতে হবে। ছোটখাটো অসুখ যেমন বমি, পায়খানা, জ্বর-- এগুলো হলে ডাক্তারকে জানাতে হবে কিংবা নিয়ে যেতে হবে। এরপর ডাক্তার শারীরিক অবস্থার উপর নির্ভর করে যে উপদেশগুলো দেবেন সেগুলো মেনে চলতে হবে।\n" +
                            "শিশুর জন্মের আগে ও পরে যদি এইসব দিকগুলো ঠিকমতো খেয়াল করা হয় তাহলে আপনার শিশুটি অবশ্যই সুস্থ ও সবল থাকবে।\n "),
            new DataChildCareInfo("দেড় মাস থেকে ছয় মাসের শিশুর যত্ন ",
                    "শিশু মায়ের পেটে উষ্ণ তাপমাত্রায় অবস্থান করে। তাই পৃথিবীর তাপমাত্রায় সে শীত অনুভব করে। তা ছাড়া শিশুর শরীরে তাপ নিয়ন্ত্রণব্যবস্থা তৈরি হতেও সময় লাগে। তাই শিশুকে উষ্ণ তাপমাত্রায় রাখুন। যদি ঘরের তাপমাত্রা ২৫° হয়, তবে সুতির কাপড় পরিয়ে কাঁথা দিয়ে মুড়ে রাখুন। এই মাত্রার নিচে হলে সোয়েটার ব্যবহার করতে পারেন। বাচ্চা বুকের দুধ খাওয়ার সময় ঘেমে যায়। তাই ওই সময় সোয়েটার আলগা করে দিন। লক্ষ করুন, বাচ্চা ঘামছে কি না।\n" +
                            "- বাচ্চাকে ঘন ঘন বুকের দুধ খাওয়ান। বুকের দুধে রোগ প্রতিরোধ শক্তি থাকে। ফলে শিশু সহজে ঠাণ্ডা, কাশি ইত্যাদিতে আক্রান্ত হয় না। যেসব বাচ্চা কোনো কারণে বুকের দুধ খায় না বা পায় না, তাদের ক্ষেত্রে বিশেষ সতর্কতা অবলম্বন প্রয়োজন।\n" +
                            "- দিনের বেলা জানালা খুলে রোদ ও (ঠাণ্ডা বাতাস এলেও) নির্মল বাতাস ঘরে ঢুকতে দিন।\n" +
                            "- ঘরের মধ্যে কাপড় না শুকিয়ে অবশ্যই রোদে শুকান।\n",
                    " খাবার ও চিকিৎসাঃ",
                    "- বাচ্চাকে দোলনায় বা আলাদা মশারির নিচে না রেখে মায়ের কোলঘেঁষে শোয়াবেন। এতে বাচ্চা উষ্ণ থাকবে, মায়ের সঙ্গে আন্তরিকতা বাড়বে ও বুকের দুধ খাওয়াতে সুবিধা হবে।\n" +
                            "- যদি পরিবারের কোনো সদস্যের বা কোনো আত্মীয়ের সর্দি, কাশি, ভাইরাল জ্বর ইত্যাদি থাকে, তবে তাঁরা মা ও শিশুর কাছে আসা থেকে বিরত থাকুন।\n" +
                            "- শিশুকে শীতকালে ঘরের বাইরে নেওয়া থেকে বিরত থাকুন। রোদে দিতে হলে জানালার পাশে বা ঘরের বারান্দা থেকে রোদ লাগান।\n ",
                    "অন্যান্য বিষয়াদিঃ",
                    "- নবজাতক শিশুকে জন্মের সঙ্গে সঙ্গে গোসল করানোর দরকার নেই। বাচ্চার নাভি না শুকানো পর্যন্ত তাকে গোসল করাবেন না। সপ্তাহে দুদিন গোসল করানোই যথেষ্ট। গোসলের আগে ঘরের দরজা-জানালা লাগিয়ে নিন। গোসলের জন্য প্রয়োজনীয় উষ্ণ পানি (৪৫°), নরম কাপড় বা স্পঞ্জ, তোয়ালে, ভ্যাসলিন, ডায়াপার ইত্যাদি সব হাতের কাছে গুছিয়ে নিয়ে গোসল করাতে বসুন।\n" +
                            "- নবজাতক শিশুর সামান্য কাশি বা হাঁচিও কিন্তু সন্দেহজনক। তাই কাশি, শব্দ করে শ্বাস টানা, দুধ টেনে খেতে না পারা, শ্বাস নিতে কষ্ট বা পাঁজর নিঃশ্বাসের সঙ্গে বেঁকে যেতে থাকলে অতি দ্রুত চিকিৎসকের শরণাপন্ন হোনশিশুকে প্রয়োজন অনুযায়ী উষ্ণ রাখুন। ঠাণ্ডা পরিবেশে রাখা যাবে না। স্যাঁতসেঁতে ঘরেও তাকে রাখা ঠিক হবে না।\n" +
                            "- বাচ্চাকে বুকের দুধ নিয়মিত খাওয়ান। ফিডারে খাওয়ালে অল্প গরম দুধ দিন। ঘুমের মধ্যেও ঠাণ্ডা দুধ দেবেন না।\n" +
                            "- ছয় মাসের বেশি হলে বাচ্চাকে বুকের দুধের পাশাপাশি অন্য খাবার দিন। খিচুড়িতে ডিমের সাদা অংশ, লাল শাক, পালং শাক অল্প করে দিতে পারেন। লেবুর রস দেবেন, কমলার রস খাওয়াবেন। এতে বাচ্চার রোগ প্রতিরোধক ক্ষমতা বাড়বে।\n" +
                            "- যেসব বাচ্চা হামাগুড়ি দেয়, দেখবেন তারা যেন ঠাণ্ডা মেঝেতে হামাগুড়ি না দেয়। তবে কার্পেট ব্যবহার না করাই ভালো। কারণ কার্পেটের রোয়া থেকে বা ধুলো থেকে অ্যালার্জি হয়। তাই মাদুর বা ম্যাট ব্যবহার করা ভালো।\n" +
                            "- এক দিন অন্তর গোসল করান ঈষৎ উষ্ণ পানি দিয়ে। গোসলের পর বেবি লোশন লাগাবেন। তেলজাতীয় কিছু লাগাবেন না।\n" +
                            "- বাচ্চাকে নরম কাপড়ের জুতা পরানোর অভ্যাস করুন ও শোয়ানোর সময় মোজা পরিয়ে শোয়ান, তবে উলের মোজা পরানোর প্রয়োজন নেই।\n" +
                            "- এ বয়সী বাচ্চার রোগ প্রতিরোধ ক্ষমতা কম থাকে। তাই সর্দি, কাশি সহজেই লেগে যায়। বাচ্চাকে খুব জনবহুল স্থানে (মেলা, পিকনিক) না নিয়ে যাওয়াই ভালো।\n"),
            new DataChildCareInfo("১ থেকে ৬ বছর বয়সের শিশুর যত্ন ",
                    "* এই বয়সে শিশুরা অনেক খেলাধুলা ও দৌড়াদৌড়ি করে থাকে। তাই খুব বেশি গরম ও ভারী কাপড় পরার প্রয়োজন হয় না। তবে সকালে স্কুলে যাওয়ার সময় ও বিকেলে খেলতে যাওয়ার সময় পর্যন্ত উষ্ণতা নিশ্চিত করুন।\n" +
                            "* বাচ্চাকে স্কুলে পাঠালে পরস্পরের মাধ্যমে শীতকালে কিছু ছোঁয়াচে চর্মরোগ হতে পারে। তাই বাচ্চার ত্বকের প্রতি খেয়াল রাখুন। নিয়মিত লোশন লাগান যেন ত্বক শুষ্ক হয়ে না যায়।\n" +
                            "* শীতকালীন শাকসবজি ও ফল-কমলা, বরই বেশি করে খেতে দিন।\n" +
                            "* আপনার সন্তানকে নিয়মিত হাত ধোয়ায় অভ্যাস করান।\n" +
                            "* আপনার শিশুকে যত্ন নেওয়া কাজের মেয়েকে পরিষ্কার পরিচ্ছন্ন ও নিয়মিত হাত ধোয়ায় অভ্যাস করান। \n" +
                            "* শিশুকে শেখাতে হবে যে সে যেন তার চোখ ও নাকে হাত না দেয়। বাচ্চা যখন চোখ ও নাকে হাত দেয় তখন তার হাত\n" +
                            "শিশুর সুস্থতা নিশ্চিত করে শীতের আবহকে উপভোগ করুন পরিপূর্ণভাবে।\n",
                    "কাপড় ও পরিধেয় বস্ত্রঃ",
                    "আগের বছরে ব্যবহৃত শিশুর শীতের পোশাকের যথাযথ যত্ন নিন। শীত এলে সেগুলো ব্যবহারের সময় আসে। ফলে সেগুলোর যথাযথ যত্ন এখনই নিতে হবে। সে ক্ষেত্রে যেসব বিষয়ের দিকে নজর দিতে হবে তা হলো-\n" +
                            "শিশুর লেপ, তোশক, কম্বল, চাদর ইত্যাদি রোদে দিতে হবে। রোদ থেকে তোলার পর তা ঝেড়ে ঘরে রাখতে হবে। আর ধুলাবালি থেকে রক্ষা পাওয়ার জন্য এসবের ওপর কাপড়ের কভার ব্যবহার করা সবচেয়ে ভালো।\n" +
                            "নবজাতকের মায়েরা ছোট্ট শিশুটিকে সামলাতেই ব্যস্ত সময় পার করেন। তাই নিজের প্রতি খেয়াল করে ত্বকের যত্ন নেওয়া সম্ভব হয়ে ওঠে না। এ জন্য বাইরে না গিয়ে ঘরে বসেই প্রয়োজনীয় ত্বকচর্চার অনুষঙ্গগুলো আনিয়ে নিয়ে ত্বকের যত্ন নিতে পারেন।\n ",
                    "ত্বকের যত্নঃ",
                    "সদ্য নবজাতকের যত্নে বেছে নিতে পারেন ভালো কোনো ব্র্যান্ডের বেবি লোশন, বেবি অয়েল, যা আপনার পারিবারিক ডাক্তারের সঙ্গে পরামর্শ নিয়ে ব্যবহার করতে পারলে ভালো হয়।\n" +
                            "শীতে মেয়েদের একটু বেশি যত্ন নিতে হয়। কেননা মেয়েরা ঘরে ও বাইরে উভয় ক্ষেত্রে কাজ করে। এ ছাড়া ঘরে সন্তানের লালনপালনের কারণে নিজের ত্বকের যত্ন নেওয়া অনেক মা-ই ভুলে যান। তাই এ সময় মেয়েদের একটু বাড়তি যত্ন নেওয়া উচিত।\n"),
            new DataChildCareInfo("বিভিন্ন আবহাওয়ায় শিশুর যত্ন",
                    "গরমে যত্ন\n" +
                            "অনেক অভিভাবকই প্রচুর পরিমাণে পাউডার বা তেল শিশুর ত্বকে ব্যবহার করেন, যা ত্বকের জন্য ক্ষতিকর। অতিরিক্ত পাউডার ব্যবহারে শিশুদের ত্বকের রোমকূপগুলো বন্ধ হয়ে যায় বলে সাধারণ শারীরিক প্রক্রিয়া বাধাগ্রস্ত হয়। এতে শিশুর ঘামাচি ও ন্যাপি র্যা শও হতে পারে। অতিরিক্ত রোদে ছোট বাচ্চা নিয়ে বের হওয়া উচিত নয়। নবজাতকের সামনে হাঁচি-কাশি দেওয়া থেকে বিরত থাকতে হবে। শিশুকে ঠাণ্ডা ও স্বস্তিদায়ক পরিবেশে রাখা উচিত। ঘেমে গেলে বারবার শুকনো নরম কাপড় দিয়ে গা মুছে দিন। অবশ্যই শিশুকে সুতির নরম ও আরামদায়ক পোশাক পরানো উচিত। নবজাতকের মাকে প্রচুর পরিমাণে তরলজাতীয় খাবার ও পানি খেতে হবে। এতে মায়ের বুকের দুধ থেকে শিশু উপকৃত হবে।\n",
                    "শীতে যত্ন",
                    "অন্য মৌসুমের চেয়ে শীত ঋতুর বিষয় আলাদা। এ সময়ে শিশুর প্রতি রাখতে হবে বাড়তি সতর্কতা। শিশু মায়ের পেটে উষ্ণ তাপমাত্রায় থাকে। তাই পৃথিবীর তাপমাত্রায় সে শীত অনুভব করে। তা ছাড়া শিশুর শরীরে তাপ নিয়ন্ত্রণ ব্যবস্থা তৈরি হতেও সময় লাগে। তাই যে শিশু কিছুদিন হল পৃথিবীতে এসেছে তাকে উষ্ণ তাপমাত্রায় রাখুন।\n" +
                            "সুতি কাপড় পরিয়ে কাঁথা দিয়ে মুড়ে রাখুন। সোয়েটার ব্যবহার করতে পারেন। শিশুর গায়ে বেবি অয়েল বা ভ্যাসলিন ব্যবহার করুন। দিনের বেলা জানালা খুলে রোদ ও (ঠাণ্ডা বাতাস এলেও) নির্মল বাতাস ঘরে ঢুকতে দিন।\n" +
                            "ঘরের মধ্যে কাপড় না শুকিয়ে অবশ্যই রোদে শুকান। শিশুকে রাতে ডায়াপার পরিয়ে শোয়ান। বাচ্চাকে দোলনায় বা আলাদা মশারির নিচে না রেখে মায়ের কোলঘেঁষে শোয়ান। এতে বাচ্চা উষ্ণ থাকবে, মায়ের সঙ্গে আন্তরিকতা বাড়বে এবং বুকের দুধ খাওয়াতে সুবিধা হবে। ঘরের বাইরে নেওয়া থেকে বিরত থাকুন। রোদে দিতে হলে জানালার পাশে বা ঘরের বারান্দা থেকে রোদ লাগান। কাশি, শব্দ করে শ্বাস টানা, দুধ টেনে খেতে না পারা, শ্বাস নিতে কষ্ট বা পাঁজর নিঃশ্বাসের সঙ্গে বেঁকে যেতে থাকলে অতিদ্রুত চিকিৎসকের কাছে যান।\n ",
                    "অন্যান্য আবহাওয়ায়ঃ",
                    "- দিনের বেলা জানালা খুলে রোদ ও (ঠাণ্ডা বাতাস এলেও) নির্মল বাতাস ঘরে ঢুকতে দিন।\n" +
                            "- ঘরের মধ্যে কাপড় না শুকিয়ে অবশ্যই রোদে শুকান।\n" +
                            "- বাচ্চাকে দোলনায় বা আলাদা মশারির নিচে না রেখে মায়ের কোলঘেঁষে শোয়াবেন। এতে বাচ্চা উষ্ণ থাকবে, মায়ের সঙ্গে আন্তরিকতা বাড়বে ও বুকের দুধ খাওয়াতে সুবিধা হবে।\n" +
                            "- যদি পরিবারের কোনো সদস্যের বা কোনো আত্মীয়ের সর্দি, কাশি, ভাইরাল জ্বর ইত্যাদি থাকে, তবে তাঁরা মা ও শিশুর কাছে আসা থেকে বিরত থাকুন।\n" +
                            "- শিশুকে শীতকালে ঘরের বাইরে নেওয়া থেকে বিরত থাকুন। রোদে দিতে হলে জানালার পাশে বা ঘরের বারান্দা থেকে রোদ লাগান।\n" +
                            "- নবজাতক শিশুকে জন্মের সঙ্গে সঙ্গে গোসল করানোর দরকার নেই। বাচ্চার নাভি না শুকানো পর্যন্ত তাকে গোসল করাবেন না। সপ্তাহে দুদিন গোসল করানোই যথেষ্ট। গোসলের আগে ঘরের দরজা-জানালা লাগিয়ে নিন। গোসলের জন্য প্রয়োজনীয় উষ্ণ পানি (৪৫°), নরম কাপড় বা স্পঞ্জ, তোয়ালে, ভ্যাসলিন, ডায়াপার ইত্যাদি সব হাতের কাছে গুছিয়ে নিয়ে গোসল করাতে বসুন।\n" +
                            "- নবজাতক শিশুর সামান্য কাশি বা হাঁচিও কিন্তু সন্দেহজনক। তাই কাশি, শব্দ করে শ্বাস টানা, দুধ টেনে খেতে না পারা, শ্বাস নিতে কষ্ট বা পাঁজর নিঃশ্বাসের সঙ্গে বেঁকে যেতে থাকলে অতি দ্রুত চিকিৎসকের শরণাপন্ন হোনশিশুকে প্রয়োজন অনুযায়ী উষ্ণ রাখুন। ঠাণ্ডা পরিবেশে রাখা যাবে না। স্যাঁতসেঁতে ঘরেও তাকে রাখা ঠিক হবে না।\n" +
                            "- বাচ্চাকে বুকের দুধ নিয়মিত খাওয়ান। ফিডারে খাওয়ালে অল্প গরম দুধ দিন। ঘুমের মধ্যেও ঠাণ্ডা দুধ দেবেন না।\n"),

            new DataChildCareInfo("কিছু লক্ষণীয় বিষয় সমূহ",
                    "শিশুর যত্নের সময় কিছু জিনিস অবশ্যই লক্ষ রাখতে হবে। আমরা অনেক সময় না বুঝে অনেক কিছু করে ফেলি।কিছু জিনিস আছে যা কখনোই  করা যাবে না। ",
                    "যা করা কখনো উচিত নয়ঃ",
                    "* শিশুকে অতিরিক্ত সোয়েটার পরিয়ে রাখবেন না। এতে ঘাম জমে সেই ঘাম শীতকালীন ঠাণ্ডা বাতাসে শুকিয়ে শিশুর সমস্যা তৈরি করতে পারে।\n" +
                            "* শিশুর গায়ে বেবি-অয়েল বা ভ্যাসলিন ব্যবহার করুন।\n" +
                            "* শিশুকে রাতের বেলা ডায়াপার পরিয়ে শোয়ান।\n" +
                            "* শীতকালে নবজাতকের মাথা কামানো যাবে না।\n" +
                            "* শিশুর নাক বা মুখের ওপর কাপড়, লেপ, কম্বল ইত্যাদি দেবেন না।\n",
                    "শিশু জন্মের পর নিশ্বাস না নিলে যা কখনো করবেন নাঃ ",
                    "\n" +
                            "অনেক সময় জন্মের পর শিশু নিশ্বাস না নিলে আমরা কিছু ভুল পদক্ষেপ নেই, যা শিশুর জন্য মারাত্মক ক্ষতিকারক। \n" +
                            "* পা ওপরে ধরে উল্টো করে নবজাতককে ঝোলানো\n" +
                            "* থাপড় দেওয়া\n" +
                            "* শরীরে ঠাণ্ডা পানি ছিটানো\n" +
                            "* কানে অথবা নাকে ফুঁ বা বাতাস দেওয়া\n" +
                            "* পানিতে চুবানো\n" +
                            "* বুকের খাঁচায় চাপ দেওয়া\n" +
                            "* বাচ্চাকে পর্যায়ক্রমে গরম ও ঠাণ্ডা পানিতে চুবানো\n" +
                            "* গর্ভফুলকে গরম করা\n" +
                            "* গর্ভফুলের অপেক্ষায় নবজাতককে ফেলে রাখা\n" +
                            "* মুখে ফুঁ দেওয়া\n" +
                            "* কানে ফুঁ দেওয়া\n" +
                            "* মধু ও চিনির পানি খাওয়ানো।\n ")
    };

    private DataChildCareInfo(String info,String descriptionMain,String description2name,String description2,String description3name,String description3)
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
        if (description2name== null)
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
