package com.programming.seekho.textblock;

public class TextBlockDemo {
    public static void main(String[] args) {

        String str = "Programming";
        System.out.println(str);

        String str1 = "Hello" + "World";
        System.out.println("String 1 : "+str1);

        String str2 = "I" +
                "Love" +
                "Programming";
        System.out.println("String 2 : "+str2);

        String str3 = "I\nLove\nMy\nIndia";
        System.out.println("String 3 : "+str3);

        String str4 = """
                You
                Love
                Your
                Country
                """;
        System.out.println("String 4 : "+str4);

        String str5 = """
                <html>
                    <body>
                        <h1>Welcome to Java Text Block</h1>
                    </body>
                </html>
                """;

        System.out.println("String 5 : "+str5);

        String str6 = """
                [
                    {
                        'username':'programming',
                        'email':'prog@gmail.com'
                    }
                ]
                """;

        System.out.println("String 6 : "+str6);

        String str7 = """
                Hey Bro!, What's Up?
                """;

        System.out.println("String 7 : "+str7);
    }
}