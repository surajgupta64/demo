package com.company;

public class UpperLowerString {
        /*static void convertOpposite(StringBuffer str)
        {
            int ln = str.length();

            for (int i = 0; i < ln; i++) {
                Character c = str.charAt(i);
                if (Character.isLowerCase(c))
                    str.replace(i, i + 1,
                            Character.toUpperCase(c) + "");
                else
                    str.replace(i, i + 1,
                            Character.toLowerCase(c) + "");
            }
        }

        public static void main(String[] args)
        {
            StringBuffer str = new StringBuffer("GeEkSfOrGeEkS");

            convertOpposite(str);

            System.out.println(str);
        }*/


        public static void main(String[] args) {
            String txt = "Hello World";
            System.out.println(txt.toUpperCase());
            System.out.println(txt.toLowerCase());
        }



}
