package carenbb.com.hackathon.emotion.joton;

/**
 * Created by HP on 28-Mar-16.
 */
public class DataDeasesInfo {
    private String info;
    private String description;
    private int imageResourceId;

    public static final DataDeasesInfo[] infos = {
            new DataDeasesInfo("গর্ভপাত",
                    "গর্ভপাত \n" +
                            "যদি কোনো কারণে গর্ভস্থ ভ্রূণ আটাশ সপ্তাহ বা সাত মাসের পূর্বে মাতৃজঠর বা জরায়ু থেকে বের হয়ে যায় তবে তাকে গর্ভপাত বা এ্যাবরশন বলে৷\n" +
                            "\n" +
                            "কারণ\n" +
                            "গর্ভপাতের কারণগুলোকে মোটামুটি দুভাগে ভাগ করা যায়-\n" +
                            "১. ভ্রুণের অস্বাভাবিকতা বা ক্রমোজমের ত্রুটি\n" +
                            "২. গর্ভবতী মায়ের শরীরের নানা ত্রুটির জন্য গর্ভপাতের আশংকা থাকে৷ যেমন-\n" +
                            "\n" +
                            "* গর্ভবতীর যদি গর্ভাবস্থায় খুব জ্বর হয় এবং তাপমাত্রা ১০২ ডিগ্রি ফারেনহাইটের ওপরে উঠে যায়৷\n" +
                            "* গর্ভবতীর যদি গর্ভাবস্থায় রক্তচাপ বেড়ে যায়৷\n" +
                            "* গর্ভবতীর যদি ডায়াবেটিস থাকে এবং তা যদি পূর্বে শনাক্ত করা না হয়ে থাকে এবং অনিয়ন্ত্রিত থাকে৷\n" +
                            "* গর্ভবতীর যদি কিডনীর অসুখ (নেফ্রোটিক সিনড্রোম) থাকে৷\n" +
                            "* গর্ভবতী যদি গর্ভাবস্থায় হাম রোগে আক্রান্ত হয়৷\n" +
                            "* গর্ভবতী যদি গর্ভাবস্থায় কলেরা রোগে আক্রান্ত হয়৷\n" +
                            "* থাইরয়েডের সমস্যা থাকলে৷\n" +
                            "* জরায়ুর টিউমার বা জরায়ুর গঠনগত কোনও ত্রুটি থাকলে৷\n" +
                            "* জরায়ুতে গর্ভফুল বা প্ল্যাসেন্টা যদি খুব নিচে নেমে আসে তাহলেও বাচ্চা নষ্ট হয়ে যাবার সম্ভাবনা আছে৷\n" +
                            "* আগের গর্ভাবস্থা যদি ইচ্ছাকৃতভাবে গর্ভপাত করানো হয়৷\n" +
                            "* মায়ের শরীরে প্রোজেস্টেরোন হরমোন কম থাকার কারণে গর্ভপাত হতে পারে৷\n" +
                            "* গর্ভবতী যদি অত্যধিক মদ্যপান বা ধূমপানে আসক্ত হন তবে গর্ভপাত হতে পারে৷\n" +
                            "* গর্ভবতী যদি প্রবল মানসিক পীড়ণে থাকেন বা চরম শোক দুঃখ পান তাহলে গর্ভপাত হতে পারে৷\n" +
                            "* গর্ভাবস্থায় পেটে আঘাত পেলে, অত্যধিক পরিশ্রম, বাস বা ট্রেনে অনেক দূরে যাতায়াত করলে গর্ভপাত হতে পারে৷\n" +
                            "\n" +
                            "গর্ভপাতের শ্রেণীবিভাগ নিচে দেওয়া হলো-\n" +
                            "থ্রেটেন্ড গর্ভপাত (Threatened Abortion) : যে গর্ভপাত অল্পের জন্য হলো না কিন্তু হবার ভয় থাকে৷ এতে তলপেটে অল্প ব্যথা এবং সামান্য রক্তস্রাব হয়৷ তাড়াতাড়ি উপযুক্ত চিকিত্\u200Cসা করালে গর্ভপাত বন্ধ করা যেতে পারে৷\n" +
                            "\n" +
                            "অসম্পূর্ণ গর্ভপাত (Incomplete Abortion) : ভ্রুণের কিছু অংশ যদি জরায়ুর ভেতরে রয়ে যায় তবে তাকে অসম্পূর্ণ গর্ভপাত বলে৷\n" +
                            "জীবাণুদুষ্ট গর্ভপাত (Septic Abortion) : অনেক সময় জীবাণু সংক্রমণের ফলে গর্ভপাত হয়, তলপেটে ব্যথা হয় সেই সাথে পেট ফুলে যেতে পারে৷ পায়খানা বন্ধ হয়ে যেতে পারে৷ রোগী মারাও যেতে পারে৷\n" +
                            "\n" +
                            "মিস্ড গর্ভপাত (Missed Abortion) : জরায়ুর ভেতরে ভ্রূণ নানা কারণে মরে যায় এবং ঐ অবস্থায় মমির মতো জমাট বেঁধে থাকে৷\n" +
                            "ইনএভিটেবল গর্ভপাত (Inevitable Abortion) : যে গর্ভপাত এড়ানোর কোনও ব্যবস্থা থাকে না তাকে ইনএভিটেবল গর্ভপাত বলে৷ যথাযথ সুচিকিত্\u200Cসার মাধ্যমে সারিয়ে না তুললে পরবর্তীকালে জরায়ুমুখ খুলে যায় এবং গর্ভপাত নিশ্চিত হয়ে দাড়ায়৷\n" +
                            "গর্ভপাতের উল্লেখিত প্রকার ভেদের মধ্যে সেপটিক অ্যাবরশন বা জীবাণুদুষ্ট গর্ভপাত সবচেয়ে মারাত্মক এবং আমাদের দেশে গর্ভবতী মায়েদের অকাল মৃতু্যর জন্য এর ভূমিকা অনেকখানি৷\n" +
                            "\n" +
                            "বিভিন্ন শ্রেণীর গর্ভপাতের লক্ষণ\n" +
                            "থ্রেটেন্ড গর্ভপাত\n" +
                            "\n" +
                            "* কয়েকমাস মাসিক (পিরিয়ড) বন্ধ থাকবে৷\n" +
                            "* রক্তস্রাব অল্প সামান্য হতে পারে৷\n" +
                            "\n" +
                            "* পেটের ব্যথা নাও থাকতে পারে, থাকলেও খুব অল্প, কোমর বা তলপেটে সামান্য ব্যথা থাকতে পারে৷\n" +
                            "* প্রসবদ্বার দিয়ে ভ্রুণ, তার আস্তরণ ও ফুল বেরিয়ে আসবে না৷\n" +
                            "* জরায়ুর মুখ বন্ধ থাকবে (ডাক্তার পরীক্ষা করে বুঝবেন)৷\n" +
                            "\n" +
                            "অসম্পূর্ণ গর্ভপাত\n" +
                            "\n" +
                            "* কয়েকমাস মাসিক (পিরিয়ড) বন্ধ থাকবে৷\n" +
                            "* রক্তস্রাব অনেকদিন একইভাবে হতে পারে৷\n" +
                            "* পেটে ব্যথা থাকতে পারে নাও পারে৷\n" +
                            "* প্রসবদ্বার দিয়ে ভ্রূণ, তার আস্তরণ ও ফুল বেরিয়ে আসবে৷\n" +
                            "* জরায়ুর মুখ খোলা থাকবে (ডাক্তার পরীক্ষা করে বুঝবেন)৷\n" +
                            "\n" +
                            "জীবাণুদুষ্ট গর্ভপাত\n" +
                            "\n" +
                            "* কয়েকমাস মাসিক (পিরিয়ড) বন্ধ থাকবে৷\n" +
                            "* কট গন্ধযুক্ত রক্ত স্রাব হতে পারে৷\n" +
                            "* প্রথমদিকে পেটে ব্যথা না হলেও পরে তলপেটে খুব ব্যথা হবে৷\n" +
                            "\n" +
                            "* প্রসবদ্বার দিয়ে ভ্রূণ, তার আস্তরণ ও ফুল বেরিয়ে আসতেও পারে নাও পারে৷\n" +
                            "* জরায়ুর মুখ খোলা বা বন্ধ থাকতে পারে (ডাক্তার পরীক্ষা করে বুঝবেন)৷\n" +
                            "* শীত করে এবং কঁাপিয়ে জ্বর আসতে পারে৷\n" +
                            "* রক্ত চাপ কমে যায়৷\n" +
                            "* অত্যধিক রক্ত ক্ষরণের কারণে রক্তস্বল্পতা দেখা দিতে পারে৷ রোগী ফ্যাকাশে হয়ে পড়ে৷\n" +
                            "\n" +
                            "মিস্ড গর্ভপাত\n" +
                            "\n" +
                            "* কয়েকমাস মাসিক (পিরিয়ড) বন্ধ থাকবে৷\n" +
                            "* প্রসবদ্বার দিয়ে ভ্রূণ, তার আস্তরণ ও ফুল বেরিয়ে আসবে না৷\n" +
                            "* পেটে ব্যথা থাকবে না৷\n" +
                            "* জরায়ুর মুখ সাধারণত বন্ধ থাকবে (ডাক্তার পরীক্ষা করে বুঝবেন)৷\n" +
                            "* রক্তস্রাব হবে না, সামান্য বাদামি দাগ লাগতে পারে৷\n" +
                            "\n" +
                            "ইনএভিটেবল গর্ভপাত\n" +
                            "\n" +
                            "* কয়েকমাস মাসিক (পিরিয়ড) বন্ধ থাকবে৷\n" +
                            "* খুব বেশি পরিমাণে রক্তস্রাব হবে৷\n" +
                            "\n" +
                            "* তলপেটে প্রচণ্ড ব্যথা৷\n" +
                            "* প্রসবদ্বার দিয়ে ভ্রুণ, তার আস্তরণ ও ফুল বেরিয়ে আসবে না৷\n" +
                            "* জরায়ুর মুখ খোলা থাকবে (ডাক্তার পরীক্ষা করে বুঝবেন)৷\n" +
                            "\n" +
                            "চিকিত্\u200Cসা\n" +
                            "\n" +
                            "* গর্ভপাত শনাক্ত করা সম্ভব হলে রোগীকে দ্রুত হাসপাতালে পাঠাতে হবে৷\n" +
                            "\n" +
                            "পরামর্শ\n" +
                            "\n" +
                            "* কমপক্ষে একমাস বিশ্রাম এবং পর্যাপ্ত পুষ্টিকর খাবার খাওয়া উচিত৷\n" +
                            "* বাড়ির হালকা কাজকর্ম করা যেতে পারে৷\n" +
                            "* একমাস স্বামী-সহবাস করা যাবে না৷\n" +
                            "* পরবর্তী বাচ্চা নেওয়ার আগে চিকিত্\u200Cসকের পরামর্শ নিতে হবে৷\n" +
                            "\n" +
                            "প্রতিরোধ\n" +
                            "\n" +
                            "* সন্তান সম্ভাব হলেই চিকিত্\u200Cসককেরকাছে পূর্বের সকল ইতিহাস খুলে বলতে হবে৷\n" +
                            "* নিয়মিত চেকআপ জরুরি৷\n" +
                            "* সন্তান সম্ভাব হওয়ার প্রথম দিকে রিকশা, বাস, ট্রাম, ট্রেন ইত্যাদির ঝঁাকুনি যথাসম্ভব এড়িয়ে চলা উচিত৷\n" +
                            "* টিউবয়েল পাম্প করা, পানি ভর্তি ভারী বালতি তোলা, বাচ্চা কোলে নেওয়া ঠিক নয়৷\n" +
                            "* ছোঁয়াচে অসুখ থেকে গর্ভবতী মাকে দূরে রাখতে হবে৷\n" +
                            "* দোকান বা হোটেলের খাবার না খাওয়াই ভালো৷\n" +
                            "* প্রচুর পরিমাণে পানি পান করতে হবে৷ |\n " ,
                    R.drawable.cheese_1),
            new DataDeasesInfo("গর্ভাবস্থায় রক্তক্ষরণ",
                    "বাংলাEnglish\n" +
                            "নানা কারণে গর্ভাবস্থায় রক্তক্ষরণ হতে পারে। পুরো গর্ভাবস্থাকে তিন ভাগে ভাগ করলে প্রথম তিন মাস, মাঝের তিন মাস ও শেষের তিন মাসের যে কোনো সময় রক্তক্ষরণ হতে পারে।\n" +
                            "\n" +
                            "প্রথম তিন মাসে রক্তক্ষরণের কারণ\n" +
                            "\n" +
                            "*শতকরা ২০-৩০ ভাগ গর্ভবতীর প্রথম তিন মাসে রক্তক্ষরণ হতে পারে। এর মধ্যে অর্ধেক বাচ্চার কোনো সমস্যা হয় না।\n" +
                            "*বাচ্চা নষ্ট হয়ে যাওয়ার আশঙ্কাই প্রথম তিন মাসে রক্তক্ষরণের প্রধান কারণ। অনেক সময় অল্প অল্প রক্তক্ষরণ হয়; চিকিৎসা ও ডাক্তারের পরামর্শ অনুযায়ী থাকলে শেষ পর্যন্ত সন্তান প্রসব করা সম্ভব।\n" +
                            "\n" +
                            "একটোপিক প্রেগনেন্সি : জরায়ু ছাড়া পেটের ভেতরে অন্য কোনো জায়গায় (যেমন টিউব, ডিম্বাশয়) যদি ভ্রুণ স্থাপিত হয় তবে তাকে একটোপিক প্রেগনেন্সি বলে। মাসিক বন্ধ হওয়ার পর পেটে ব্যথার সঙ্গে অল্প রক্তপাত এর প্রধান লক্ষণ। ডাক্তারের পরামর্শ অনুযায়ী কিছু পরীক্ষা-নিরীক্ষার মাধ্যমে একটোপিক প্রেগনেন্সি শনাক্ত করা যায়।\n" +
                            "\n" +
                            "ইমপ্লেনটেশন রক্তপাত : বাচ্চা নষ্ট হওয়ার আশঙ্কা ছাড়াই কোনো কোনো রোগীর জরায়ুতে ভ্রুণ স্থাপিত বা ইমপ্লেনটেশনের সময় রক্তপাত হতে পারে। সাধারণত কনসেপশনের ছয় থেকে ১২ দিন পর এরকম হতে পারে। অনেকে এটাকে মাসিক মনে করতে পারেন কিন্তু কিছু দিন পর পরীক্ষা-নিরীক্ষার মাধ্যমে কনসেপশন হয়েছে কিনা তা নিশ্চিত হওয়া যায়।\n" +
                            "\n" +
                            "মোলার প্রেগনেন্সি : যেখানে জরায়ুতে ভ্রুণের পরিবর্তে টিউমার জাতীয় সমস্যা হয় এবং এ অবস্থায় রক্তক্ষরণের সঙ্গে সঙ্গে আঙ্গুরের থোকার মতো বের হয়। জেনে রাখা ভালো, যে ভ্রুণের জন্মগত কোনো ত্র“টি থাকে সাধারণত সে সব বাচ্চাই নষ্ট বা এবরশন হয়ে যায়।\n" +
                            "\n" +
                            "গর্ভাবস্থার শেষের দিকে রক্তক্ষরণের কারণ\n" +
                            "\n" +
                            "*প্রধান দুটি কারণের একটি হল গর্ভফুল বা প্লাসেন্টা নিচে জরায়ুর মুখের কাছাকাছি থাকা যাকে বলা হয় প্লাসেন্টা প্রিভিয়া, যাদের আগে জরায়ুতে কোনো ধরনের অপারেশনযেমন- ডিএন্ডসি, সিজারিয়ান অপারেশন বা যাদের যমজ বাচ্চা হয় তাদের হওয়ার আশঙ্কা বেশি থাকে।\n" +
                            "*অন্যটি হল গর্ভফুল জরায়ুর স্বাভাবিক অবস্থা থেকে একটু আলগা হয়ে যাওয়া। প্রেসার বেশি থাকা বা পেটে কোনো কারণে আঘাত পেলে এরকম হতে পারে।\n" +
                            "*সময়ের আগেই যদি ডেলিভারির ব্যথা উঠে যায়। জরায়ুর মুখের কোনো সমস্যার জন্যও গর্ভাবস্থায় রক্ত যেতে পারে\n" +
                            "\n" +
                            "করণীয় : প্রথম দিকে অল্প রক্ত গেলে চিকিৎসকের পরামর্শ অনুযায়ী বিশ্রাম ও চিকিৎসা নিলে ভ্রুণের অনেক সময় কোনো ক্ষতি হয় না। কিছু ক্ষেত্রে রক্ত যাওয়ার সঙ্গে পেটে বেশি ব্যথা থাকলে বাচ্চা নষ্ট হয়ে যাওয়ার আশঙ্কা থাকে।\n" +
                            "\n" +
                            "রক্ত বেশি গেলে সঙ্গে সঙ্গে রোগীকে হাসপাতালে নিয়ে যেতে হবে। এ অবস্থায় রোগীর রক্তের প্রয়োজন হতে পারে। এ জন্য গর্ভবতীকে নিজের রক্তের গ্র“প জানা থাকতে হবে এবং তাকে রক্ত দিতে পারে এমন একজন রক্তদাতার ঠিকানা ও ফোন নম্বর কাছে রাখতে হবে। \n" +
                            "\n" +
                            "\n" +
                            "\n"
                    ,
                    R.drawable.cheese_2),
            new DataDeasesInfo("পেরিনিয়াম ছিঁড়ে যাওয়া",
                    "পেরিনিয়াম ছিঁড়ে যাওয়া\n" +
                            "\n" +
                            "যৌনি মুখ ও পায়ুপথের মাঝখানের জায়গাটিকে পেরিনিয়াম বলে৷ পেরিনিয়ামে কোনও আঘাতের ফলে ক্ষত বা ছিঁড়ে যাওয়াকে পেরিনিয়াম ছিঁড়ে যাওয়া বলে৷\n" +
                            "\n" +
                            "কারণ\n" +
                            "\n" +
                            "* মহিলাদের পেরিনিয়াম ছিড়ে যাওয়ার একটি প্রধান কারণ অদক্ষ লোকের সহায়তায় প্রসব করানো৷\n" +
                            "* প্রসবের সময় বিভিন্ন কারণে পেরিনিয়াম ছিঁড়ে যেতে পারে -\n" +
                            "* যোনিপথের তুলনায় শিশুর মাথা বড় থাকলে৷\n" +
                            "* প্রথমবার প্রসবের সময় যোনিপথের মাংসপেশী শক্ত থাকলে৷\n" +
                            "* প্রসব ব্যথা না থাকার কারণে যোনিপথে শিশুর মাথা অনেকক্ষণ আটকে থাকলে৷\n" +
                            "* জরায়ুর মুখ পুরো খোলার আগেই মা যদি জোরে চাপ (কেঁাথ) দেয়৷\n" +
                            "* অদক্ষ দাই দিয়ে প্রসব করালে৷\n" +
                            "* ফরসেপ দিয়ে প্রসব করালে৷\n" +
                            "\n" +
                            "লক্ষণ\n" +
                            "প্রসবের পর প্রসবপথ পরিষ্কার করে যোনিপথ মলদ্বার পর্যন্ত পরীক্ষা করলে পেরিনিয়াম ছিঁড়েছে কিনা বোঝা যাবে৷ যদি পেরিনিয়াম ছেঁড়া থাকে তবে -\n" +
                            "\n" +
                            "* পেরিনিয়ামের চামড়া দেখা যাবে ফেটে গেছে\n" +
                            "* ক্ষতস্থান থেকে রক্ত ঝরতে দেখা যাবে\n" +
                            "* রোগী পেরিনিয়ামে ব্যথা অনুভব করবে৷\n" +
                            "\n" +
                            "পরামর্শ\n" +
                            "সবসময় ডাক্তার অথবা প্রশিক্ষণপ্রাপ্ত দাইকে দিয়ে প্রসব করানো উচিত৷ প্রসবের সময় কোনও ধরনের অসুবিধা দেখা দিলে দ্রুত হাসপাতালে নিয়ে যাওয়া উচিত৷\n" +
                            "\n" +
                            "চিকিত্\u200Cসা\n" +
                            "পেরিনিয়াম ছিঁড়ে গেছে বোঝা গেলে সঙ্গে সঙ্গে ডাক্তারের কাছে অথবা হাসপাতালে নিয়ে যেতে হবে৷ হবে৷ না হলে পরে বিভিন্ন জটিলতা দেখো দেবে৷\n" +
                            "\n" +
                            "\n" +
                            "প্রসবপূর্ব সেবা\n" +
                            "\n" +
                            "একজন নারী যখন গর্ভধারন করেন তখন তার দেহে বেশ কিছু পরিবর্তন ঘটে৷ এ সময় অনাগত শিশু ও মায়ের বিশেষ যত্ন প্রয়োজন হয়৷ একজন গর্ভবতী মায়ের গর্ভধারণ থেকে শুরু করে সন্তান জণ্ম দেওয়া পর্যন্ত কী কী বিশেষ সেবা প্রযোজন সে সম্পর্কে নিম্নে আলোচনা করা হলো-\n" +
                            "১. কখন মা হবেন\n" +
                            "\n" +
                            "বিয়ের পর স্বাভাবিক নিয়মেই সবাই মা হতে চান৷ তবে সবার মনে রাখতে হবে একজন সুস্থ মা-ই জণ্ম দিতে পারেন একটি সুস্থ সুন্দর শিশু৷ শিশু সবার কাছেই অনেক আশা আকা•ক্ষার ধন৷ সেই আশা যেন নষ্ট না হয়ে যায় সেজন্য বাচ্চা নেওয়ার পূর্বে কিছু বিষয় বিবেচনা করা উচিত৷\n" +
                            "\n" +
                            "গর্ভধারণের পূর্বে যে বিষয় বিবেচনা কার উচিত\n" +
                            "\n" +
                            "* গর্ভধারণে ইচ্ছুক মহিলার বয়স অবশ্যই ১৮ বছরের বেশি হওয়া উচিত৷\n" +
                            "* বর্তমানে মহিলার কয়টি শিশু আছে৷ অধিক বাচ্চার মাকে পরিবার পরিকল্পনায় উদ্বুদ্ধ করুন৷\n" +
                            "* ছোট বাচ্চার বয়স যেন কমপক্ষে ২ বছরের বেশি হয়৷\n" +
                            "* পূর্বের গর্ভকালীন সময়ের ইতিহাস৷\n" +
                            "* পূর্বের প্রসবকালীন সময়ের বিস্তারিত ইতিহাস (বিশেষ করে কোনও জটিলতা হয়ে থাকলে)\n" +
                            "* পূর্বে গর্ভপাতের কোনও ঘটনা আছে কিনা\n" +
                            "* পূর্বে মৃত বাচ্চা প্রসব হয়েছিল কিনা\n" +
                            "* পূর্বে জমজ বাচ্চা প্রসব হয়েছিল কিনা\n" +
                            "* পূর্বে অপারেশনের মাধ্যমে বাচ্চা জণ্ম হয়েছিল কিনা\n" +
                            "* আগের বাচ্চা জণ্মের সময় ওজন কত ছিল\n" +
                            "* গর্ভধারণে ইচ্ছুক মহিলার শারীরিক উচ্চতা ও ওজন\n" +
                            "* তার শারীরিক কোনও অক্ষমতা আছে কিনা পরীক্ষা করে দেখতে হবে\n" +
                            "* তার দীর্ঘস্থায়ী কোনও রোগ আছে কিনা (ডায়াবেটিস, যক্ষা, ম্যালেরিয়া, হৃদরোগ, কিডনি রোগ, জটিল ধরনের জন্ডিস ইতাদি)\n" +
                            "* তার রক্তের গ্রুপ, রক্তশূন্যতা পরীক্ষা করা প্রয়োজন৷\n ",
                    R.drawable.cheese_2),
            new DataDeasesInfo("প্রি এক্লামসিয়া",
                    " প্রি-একলাম্পশিয়া\n" +
                            "প্রি-একলাম্পশিয়া গর্ভধারণের ২০ সপ্তাহ অর্থাত্\u200C ৫ মাস পর থেকে দেখা দেয়৷\n" +
                            "\n" +
                            "কারণ\n" +
                            "\n" +
                            "* একবার প্রি-একলাম্পশিয়া হলে\n" +
                            "* প্রি-একলাম্পশিয়া পরিবারে কারো হলে\n" +
                            "* পরিবারে কারো উচ্চ রক্তচাপ থাকলে\n" +
                            "* যাঁরা বেশি বয়সে মা হন তাদের হওয়ার সম্ভাবনা থাকে\n" +
                            "* উচ্চ রক্তচাপ, ডায়াবেটিস এবং নেফ্রাইটিস রোগীদের\n" +
                            "\n" +
                            "লক্ষণ\n" +
                            "\n" +
                            "* রক্তচাপ বেড়ে যাওয়া৷ রক্তচাপ সাধারণত ১৪০/ঌ০ (মিলিমিটার) এর বেশি থাকে\n" +
                            "* প্রস্রাবের সাথে প্রোটিন (আমিষ) জাতীয় পদার্থ শরীর থেকে বের হয়ে যাওয়া\n" +
                            "* হাত-পায়ে পানি আসা\n" +
                            "* মাথা ব্যথা\n" +
                            "* অনিদ্রা\n" +
                            "* চোখে ঝাপসা দেখা\n" +
                            "\n" +
                            "* প্রস্রাবের পরিমাণ কমে যাওয়া\n" +
                            "* বমি\n" +
                            "* পেটে ব্যথা\n" +
                            "* প্রি-একলাম্পসিয়া হওয়ার শুরুতেই শরীরে ওজন বাড়তে থাকে\n" +
                            "* সপ্তাহে আধা কেজি ওজন বৃদ্ধি পায়\n" +
                            "\n" +
                            "চিকিত্\u200Cসা\n" +
                            "\n" +
                            "* প্রি-একলাম্পশিয়া আক্রান্ত রোগীকে নিয়মিত চেকআপ করানো দরকার\n" +
                            "* খাবারের সঙ্গে আলাদা লবণ খাওয়া বন্ধ করতে হবে\n" +
                            "* প্রোটিন এবং ক্যালোরি যুক্ত খাবার খেতে হবে\n" +
                            "* পুষ্টিকর নরম খাবার খেতে হবে\n" +
                            "* রাতে গড়ে ৮ ঘণ্টা এবং দিনে ২ ঘণ্টা ঘুমাতে হবে\n" +
                            "* পা ফুলে গেলে পা দুটো বালিশের উপর উঁচু করে রেখে ঘুমাতে হবে\n" +
                            "* ডাক্তারের পরামর্শ অনুযায়ী ঘুমের ওষুধ এবং প্রেসারের ওষুধ খেতে হবে\n" +
                            "* রক্তচাপ, ওজনের চার্ট তৈরি করতে হবে\n" +
                            "\n" +
                            "* প্রস্রাবের সঙ্গে প্রোটিন যাচ্ছে কি না তার চার্ট করতে হবে\n" +
                            "* বাচ্চার অবস্থাও বারবার দেখতে হবে\n" +
                            "* প্রয়োজনে ডাক্তারের সঙ্গে যোগাযোগ করতে হবে\n" +
                            "\n" +
                            "সঠিক সময়ে চিকিত্\u200Cসা না করালে নিম্নলিখিত সমস্যা হতে পারে\n" +
                            "\n" +
                            "মায়ের সমস্যা\n" +
                            "\n" +
                            "* প্রস্রাব না হওয়া অথবা অল্প হওয়া\n" +
                            "* চোখে কম দেখা এমনকি অন্ধ হয়ে যাওয়া\n" +
                            "* বাচ্চা প্রসবের পর অতিরিক্ত রক্তপাত হওয়া\n" +
                            "* একলাম্পশিয়া বা খিঁচুনি হওয়া\n" +
                            "\n" +
                            "শিশুর সমস্যা\n" +
                            "\n" +
                            "* বাচ্চা মাতৃগর্ভে মারা যেতে পারে\n" +
                            "* বাচ্চার বৃদ্ধি ঠিকমত হবে না\n" +
                            "* জণ্মের সময় শ্বাসকষ্ট হবে\n" +
                            "\n" +
                            "প্রতিরোধ\n" +
                            "\n" +
                            "* গর্ভবতী মায়েদের নিয়মিত প্রসবপূর্ব চেক-আপের ব্যবস্থা করা\n" +
                            "* গর্ভবতী মায়েদের পুষ্টিকর খাবার ও বিশ্রাম নিশ্চিত করা\n" +
                            "\n" +
                            "প্রসবপূর্ব চেক-আপের সময় শারীরিক ওজন ও রক্তচাপ, পায়ে পানি আসে কিনা, প্রস্রাবে এলবুমিন যায় কিনা এগুলো পরীক্ষা করা উচিত৷\n" +
                            "\n" +
                            "ল্যাব পরীক্ষা\n" +
                            "\n" +
                            "* প্রস্রাবের রুটিন পরীক্ষা\n" +
                            "* ২৪ ঘণ্টায় প্রস্রাবের প্রোটিন পরীক্ষা\n" +
                            "* রক্তে ইউরিয়া, ইউরিক এ্যাসিড এবং ক্রিয়েটিনিনের পরিমাণ দেখা\n" +
                            "* এসজিপিটি পরীক্ষা\n" +
                            "* পেটের আল্ট্রাসনোগ্রাফি করে বাচ্চার অবস্থা দেখা৷\n" +
                            "\n" +
                            "\n" +
                            "এক্লাম্পশিয়া বা গর্ভাবস্থায় খিঁচুনি\n" +
                            "\n" +
                            "এক্লাম্পশিয়া\n" +
                            "এক্লাম্পশিয়া মূলত প্রি-এক্লাম্পশিয়ার গুরুতর অবস্থা৷ সাধারণত গর্ভধারণের ৬ মাস পর অথবা প্রসবের সময় অথবা প্রসবের কিছু সময় পর এটি হয়ে থাকে৷ তবে সহজভাবে বলা যায় যে প্রি-এক্লাম্পশিয়া রোগীদের যখন খিঁচুনি দেখা যায় তখন তাকে এক্লাম্পশিয়া বলে৷\n" +
                            "\n" +
                            "কারণ\n" +
                            "\n" +
                            "* প্রি-এক্লাম্পশিয়া রোগীর চিকিত্\u200Cসা না হলে\n" +
                            "* গর্ভবতী মায়ের সঠিক পরিচর্যা ও নিয়মিত স্বাস্থ্য পরীক্ষা না করলে\n" +
                            "\n" +
                            "লক্ষণ\n" +
                            "\n" +
                            "* রক্তচাপ বেড়ে যাওয়া৷ রক্তচাপ সাধারণত ১৪০/ঌ০ (মিলিমিটার পারদ চাপ) এর বেশি থাকে৷\n" +
                            "* হাত পায়ে পানি আসা\n" +
                            "* অসহ্য মাথা ব্যথা\n" +
                            "* অনিদ্রা\n" +
                            "* খিঁচুনি\n" +
                            "*চোখ ঝাপসা দেখা\n" +
                            "*অজ্ঞান হয়ে যেতে পারে (প্রসবের সময়, আগে এবং পরে)\n" +
                            "*প্রস্রাবের পরিমাণ কমে যাওয়া\n" +
                            "*বার বার বমি\n" +
                            "*পেটের উপর দিকে অসহ্য ব্যথা\n" +
                            "*শরীরে ওজন বাড়তে থাকে\n" +
                            "\n" +
                            "চিকিত্\u200Cসা\n" +
                            "\n" +
                            "* রোগীকে একটি আলাদা ঘরে বাম কাত হয়ে পূর্ণ বিশ্রাম নিতে হবে৷\n" +
                            "* রোগীকে অবশ্যই হাসপাতালে পাঠাতে হবে, না হলে গর্ভবর্তী মা ও শিশু উভয়ের মৃতু্য অনিবার্য৷\n" +
                            "\n" +
                            "প্রতিরোধ\n" +
                            "\n" +
                            "*গর্ভবতী মায়েদের নিয়মিত প্রসবপূর্ব চেক-আপের ব্যবস্থা করা\n" +
                            "*গর্ভবতী মায়েদের পুষ্টিকর খাবার ও বিশ্রাম নিশ্চিত করা\n" +
                            "*প্রসবপূর্ব চেক-আপের সময় শারীরিক ওজন ও রক্তচাপ, পায়ে পানি আসে কিনা, প্রস্রাবে এলবুমিন যায় কিনা এগুলো পরীক্ষা করা উচিত৷\n" +
                            "গর্ভাবস্থায় প্রি-এক্লাম্পশিয়ার লক্ষণ দেখা দিলে দ্রুত চিকিত্\u200Cসা করা৷ প্রি-এক্লাম্পশিয়া প্রতিরোধ করা সহজ৷ কিন্তু এক্লাম্পশিয়া হলে রোগীর ও বাচ্চার জীবন রক্ষা করা অত্যন্ত কঠিন হয়ে পড়ে৷\n",
                    R.drawable.cheese_2),
            new DataDeasesInfo("ফিস্টুলাা",
                    " ফিস্টুলা\n" +
                            "\n" +
                            "ফিস্টুলা হচ্ছে এক ধরনের অস্বাভাবিক নালী যার গায়ে কোষকলা থাকে এবং যা আবরণী কলা দিয়ে আবৃত শরীরের যে কোন দুটো অংশের মধ্যে সংযোগ ঘটায়৷ মানুষের দেহে নানা ধরনের রোগ-ব্যাধির পরিণতিতে বিভিন্ন রকম ফিস্টুলা হতে পারে৷ তবে সচরাচর যে সব ফিস্টুলা দেখা দেয় তা হচ্ছে -\n" +
                            "\n" +
                            "১.এনাল ফিস্টুলা বা পায়খানার রাস্তার ফিস্টুলা\n" +
                            "\n" +
                            "২.ভেসিকে ভ্যাজাইনাল ফিস্টুলা\n" +
                            "\n" +
                            "৩.রেকটো ভ্যাজাইনাল ফিস্টুলা\n" +
                            "\n" +
                            "এনাল ফিস্টুলা (Anal Fistula)\n" +
                            "এনাল ফিস্টুলা বা পায়খানার রাস্তায় ফিস্টুলা হলে একটা নালী সৃষ্টি হয় যা পায়খানার রাস্তার ভেতরের কোনো অংশের সঙ্গে বাইরে সংযোগ স্থাপন করে দেয়৷ পায়খানার রাস্তায় দীর্ঘদিনের সংক্রমণ ও প্রদাহের ফলে এ রোগ দেখা দেয়৷\n" +
                            "\n" +
                            "লক্ষণ\n" +
                            "\n" +
                            "* পায়খানার রাস্তার পাশ দিয়ে পুঁজ পড়ে, আক্রান্ত স্থানে ঘা হয়৷\n" +
                            "* জ্বর হয়\n" +
                            "* পায়খানার রাস্তার পাশে ছিদ্র পাওয়া যায় (চিকিত্\u200Cসক পরীক্ষা করলে)\n" +
                            "* পায়খানার রাস্তার পাশের ছিদ্রে চাপ দিলে পুঁজ বের হয়ে আসে৷\n" +
                            "\n" +
                            "চিকিত্\u200Cসা\n" +
                            "এ রোগের একমাত্র চিকিত্\u200Cসা হচ্ছে শল্য চিকিত্\u200Cসা বা অপারেশন৷ তাই রোগীকে যত দ্রুত সম্ভব হাসপাতাল বা বিশেষজ্ঞ সার্জনের কাছে পাঠাতে হবে৷ না হলে পরবর্তী সময়ে নানাজটিলতা দেখা দিতে পারে৷\n" +
                            "ভেসিকো ভ্যাজাইনাল ফিস্টুলা (Vesico Vaginal Fistula-VVF)\n" +
                            "৪ ফুট ১০ ইঞ্চির কম উচ্চতাসম্পন্ন গর্ভবতীদের অনেক সময় প্রসবের পথ সরু থাকে এবং অনেক সময় প্রসবের সময় বাচ্চার মাথা প্রসব পথে আটকে যায়৷ আর এই প্রসব পথের চাপ যদি মূত্রথলির দিকে থাকে৷ তবে যোনিপথ ও মূত্রথলির মাঝখানের দেয়াল ছিদ্র হয়ে সব সময় মূত্র যোনিপথ দিয়ে বের হয়ে আসে৷ ইহাকে ভেসিকো ভ্যাজাইনাল ফিস্টুলা বা ভিভিএফ বলে৷\n" +
                            "রেকটো ভ্যাজাইনাল ফিস্টুলা (Recto Vaginal Fistula-RVF)\n" +
                            "যোনি ও মলদ্বারের দেয়াল ছিদ্র হয়ে মল যোনি পথ দিয়ে বের হওয়াকে রেকটো ভ্যাজাইনাল ফিস্টুলা বলে৷\n" +
                            "\n" +
                            "কারণ\n" +
                            "\n" +
                            "*জণ্মগত\n" +
                            "*বাইরের কোনও বস্তু যদি যোনিপথে ও মলদ্বারে আঘাত করে পথ সৃষ্টি করে৷\n" +
                            "*প্রসবকালে যদি দীর্ঘ সময় ধরে শিশুর মাথা যোনিপথে আটকে থাকার ফলে যোনিপথের দেয়ালের কোষকলাগুলিতে রক্ত চলাচল কমে গিয়ে কোষকলা নষ্ট হয়ে যায় এবং তার ফলে দেয়াল ছিদ্র হয়ে মল যৌনিপথে চলে আসে৷\n" +
                            "*বাধাপ্রাপ্ত প্রসবের কারণে ফরসেপ ব্যবহার করার সময় ফরসেপ সঠিকভাবে ব্যবহার করা না হলে৷\n" +
                            "*শিশুর মাথা তাড়াতাড়ি প্রসব করানোর জন্য ধাত্রী হাত দিয়ে বার বার প্রসবের রাস্তা প্রশস্ত করার চেষ্টা করলে বা টানা হেঁচড়া করে প্রসবের চেষ্টা করলে৷\n" +
                            "*জরায়ুর মুখ পুরোপুরি খোলার আগেই এবং হঠাত্\u200C করে প্রসবের ব্যথা আসার কারণে মা কেঁাথ দিয়ে প্রসব করার ফলে যোনিপথের দেয়াল ছিঁড়ে গিয়ে এই দুর্ঘটনা ঘটতে পারে৷\n" +
                            "\n" +
                            "লক্ষণ\n" +
                            "\n" +
                            "* যোনিপথে ব্যথা অনুভব হবে\n" +
                            "* যোনিপথের দেয়াল ঢিলে হয়ে যাওয়ার ফলে সহবাসে অসুবিধা হয়\n" +
                            "* সব সময় মল যোনিপথ দিয়ে বের হয়ে আসে\n" +
                            "\n" +
                            "চিকিত্\u200Cসা\n" +
                            "যদি কোনও রোগীর উপরোক্ত লক্ষণগুলো ধরা পড়ে তবে তাকে সঙ্গে সঙ্গে হাসপাতালে পাঠাতে হবে৷\n" +
                            "\n" +
                            "পরামর্শ\n" +
                            "\n" +
                            "* প্রথবার প্রসবের সময় ১২ ঘণ্টার বেশি হলে এবং দ্বিতীয়বার বা পরবর্তী প্রসবের সময় ৬ ঘণ্টার বেশি হলে দ্রুত ডাক্তারের কাছে অথবা হাসপাতালে নিয়ে যেতে হবে৷\n" +
                            "* জরায়ুর মুখ ছোট হলে বাচ্চা প্রসবের জন্য টানা হিঁচড়া না করে দ্রুত হাসপাতালে বা ডাক্তারের কাছে নিয়ে যাওয়া উচিত৷\n" +
                            "\n" +
                            "প্রতিরোধ\n" +
                            "\n" +
                            "* গর্ভবতীর গর্ভকালীন স্বাস্থ্য পরীক্ষা করানো উচিত৷\n" +
                            "* ৪ ফুট ১০ ইঞ্চির কম উচ্চতা সম্পন্ন গর্ভবতীদের হাসপাতালে প্রসব করানো উচিত৷\n" +
                            "* ডাক্তার বা দক্ষ ও প্রশিক্ষণপ্রাপ্ত দাইয়ের হাতে প্রসব করানো উচিত৷\n" +
                            "* প্রসবের পর স্বাস্থ্য পরীক্ষা করানো উচিত৷\n",
                    R.drawable.cheese_2),
            new DataDeasesInfo("সদাস্রাব",
                    "কেন সাদা স্রাব হয়\n" +
                            "সাদাস্রাব হওয়ার পিছনে অনেক গুলো কারন জড়িত।\n" +
                            "কেন সাদা স্রাব হয়\n" +
                            "০১। প্রধান কারন হল ইনফেকশন। মহিলাদের জরায়ু “ওপেন অরগ্যান” উন্মুক্ত অংগ গুলোর মধ্যে একটি। যেহেতু জরায়ু উন্মুক্ত থাকে, তাই যে কোন ভাবে এইখানে ইনফেকশন হওয়ার সম্ভাবনা থেকেই যায়।\n" +
                            "২। মলদ্বার বা পায়ুদেশ থেকে জীবানু আসিয়া খুব সহজেই জরায়ুতে ইনফেকশন হতে পারে।\n" +
                            "৩। পুরুষের মাধ্যমেও এই রোগ হতে পারে। ট্রাইকোমানো এবং মোনালিয়া এই দু’টি ইনফেকশন যৌন রোগের জীবানু বহনকারী পুরুষের মাধ্যমে স্ত্রীলোকদের মধ্যে সংক্রমিত হয়।\n" +
                            "৪। মোনালিয়া জীবানু দ্বারা আক্রান্ত জরায়ুতে চুলকানি হয় এবং ব্যথা করে। ঘন হলুদের মত স্রাব হয়।\n" +
                            "৫। ট্রাইকোমানো জীবানু দ্বরা আক্রান্ত জরায়ুতে জ্বালাভাব থাকে, চুলকানি হয়, জরায়ু একটু ফুলিয়া যায়, লালচে হয়ে যায়। ফেনাটে দুর্গন্ধযুক্ত স্রাব হয়।\n" +
                            "৬। পরিষ্কার পরিচ্ছন্নতার অভাব ও উপযুক্ত পরিবেশের অভাবের কারনে এই রোগ হতে পারে।\n" +
                            "৭। জম্ম নিরোধক বড়ি হতেও এই রোগ হতে পারে।\n" +
                            "৮। ঋতুস্রাবের পরবর্তী প্রযায়ে গর্ভপাত করালে, ইত্যাদি কারনে হতে পারে।\n" +
                            "৯। মেয়েদের বা মহিলাদের মাসিক বা ঋতুচক্র আরম্ভ হলে অনেকে ময়লা অপরিষ্কার নেকরা বা কাপড় কিংবা অপরিষ্কার পেন্টি ব্যবহার করেন। যার কারনে জরায়ুতে ইনফেকশান হয়ে এই রোগ হয়।\n" +
                            "১০। মানসিক রোগ হতেও লিকোরিয়া বা সাদা স্রাব হতে পারে।\n" +
                            "১১। শরীরের যক্ষ্মা, রক্তহীনতা, ভিটামিনের অভাবে এই রোগ হতে পারে\n" +
                            "১২। বৃদ্ধ বয়সে শরীরের চামড়া শুকাইয়া যায়, কুচকাইয়া যায়। সে সময় জরায়ু শুকাইয়া গেলে এই রোগ হতে পারে।\n" +
                            "সাদা স্রাব রোধে পরামর্শঃ\n" +
                            "সাদা স্রাব\n" +
                            "১। সহবাসের পর যেসব মহিলাদের লালচে বা গোলাপি স্রাব হয়, তাহাদের খুব শীগ্রি ডাক্তারের নিকট যাওয়া উচিৎ। এমনকি যদি দু’টি পিরিয়ডের মাঝখনে পিংক ডিসচার্জ হয় তাহলেও ডাক্তার দেখাতে হবে। যদি পিরিয়ডের মাঝামাঝি সময়ে পানির মত পাতলা স্রাব হয়, তাহলে ভয়ের কিছু নাই।\n" +
                            "২। এই রোগের চিকিৎসা (বিবাহিত হলে) স্বামী স্ত্রী দু’জনকে একসাথে করতে হবে। কেননা স্বামীর নিকট থেকে প্রবত্তীতে আবার স্ত্রী ইনফেকশন হতে পারে।\n" +
                            "৩। সংক্রমণ এড়াইতে হইলে একটাই উপায়- তা হল পরিষ্কার পরিচ্ছন্ন থাকতে হবে।\n" +
                            "৪। মাসিক বা ঋতুচক্রে পরিষ্কার জীবানুমুক্ত (ডেটল বা সেবলন) দিয়ে কিংবা ভালভাবে সাবান দিয়ে পেন্টি বা কাপড় জীবানুমুক্ত করে তা ব্যবহার করতে হবে।\n" +
                            "৬। প্রদর বা সাদাস্রাব যাওয়া অবস্থায় কোন প্রকার মিলন বা সহবাস করা যাবেনা।\n" +
                            "৭। পুষ্টিকর বা বল বৃদ্ধিকারক খাবার খাইতে হইবে।\n",
                    R.drawable.cheese_3),
            new DataDeasesInfo("গর্ভবতী ম্যলেরিয়ার প্রতিরোধ ও প্রতিকার",
                    "কিভাবে ম্যালেরিয়া প্রতিরোধ করা যাবেঃ\n" +
                            "ম্যালেরিয়া মশার কামড়ের মাধ্যমে ছড়ায় ।ম্যালেরিয়া প্রতিরোধ করতে হলে মশার কামড় এড়াতে হবে ।\n" +
                            "মশা বংশবিস্তার করে এমন জমে থাকা পানি পরিষ্কার করতে হবে ।\n" +
                            "স্থানীয় ভাবে প্রতিরোধ করা যেতে পারে , যেমন কিছু মানুষ চামড়ায় সিটিরনিলা তেল ব্যাবহার করেন ।\n" +
                            "লম্বা কাপড় পরিধান করতে হবে যাতে হাত পা  ঢেকে রাখা যায় ।\n" +
                            "মশারী টেনে ঘুমাতে হবে এবং সম্ভব হলে দরজা ও জানালায় নেট লাগানো যেতে পারে ।\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "কিভাবে ম্যালেরিয়ার চিকিৎসা করা যায়ঃ\n" +
                            "        গর্ভবতী মা ম্যালেরিয়া আক্রান্ত হলে তাৎক্ষণিক চিকিৎসা নেওয়া প্রয়োজন ।\n" +
                            "ম্যালেরিয়া চিকিৎসা সাধারণত আরটিমেসিন বেসড কম্বিনেশন থেরাপির (এ সি টি) মাধ্যমে করা হয় ।\n" +
                            "তোমার এলাকার স্বাস্থ্যকর্মীর কাছে খোঁজ নাও কোন এ সি টি ওই এলাকার জন্য সবচেয়ে ভাল \n" +
                            "যদি তোমার জানা না থাকে তাহলে আরটিমিথার প্লাস লুমিওফ্রেন্টিন দিতে পার এক্ষেত্রে  ৪ টা করে পিল দিনে ২ বার ৭ দিন দিতে হবে  ।\n" +
                            "যদি প্রেগ্নেন্সির সময়কাল প্রথম ৩ মাস হয় তাহলে কুইনিন প্লাস অথবা সিলিন্ডাসাইমিন দিতে পার ।\n" +
                            "এক্ষেত্রে ৬০০ মি গ্রা কুইনিন দিনে ৩ বার ৭ দিন অথবা ৩০০ মি গ্রা সিলিন্ডাসাইমিন দিনে ৪ বার করে ৭ দিন দিতে হবে ।\n ",
                    R.drawable.cheese_4),

    };
    //Each Drink has a name, description, and an image resource
    private DataDeasesInfo(String info,String description,int imageResourceId) {
        this.info = info;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getInfo() {
        return info;
    }
    public String getDescription(){
        return description;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.info;
    }
}
